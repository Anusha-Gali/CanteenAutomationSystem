import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;

public class DoneServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
   ResultSet rs=null;
   String dvalues[]=request.getParameterValues("checked");
   //int dvalues[]= Integer.parseInt(request.getParameterValues("checked"));
	//DBLogics

	try{
		Class.forName
			("oracle.jdbc.driver.OracleDriver");
		
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","system");

		                          Statement st=con.createStatement();
rs=
st.executeQuery("SELECT * FROM order_db");
ResultSetMetaData rsmd=
	                      rs.getMetaData();
int nc=rsmd.getColumnCount();

for(int i=0;i<dvalues.length;i++){
	CallableStatement cst=con.prepareCall("{call ldelete(?)}");
	cst.setInt(1,Integer.parseInt(dvalues[i]));
	cst.execute();
	out.print("done");
	}	


//Response On Browser
/*out.print("<body bgcolor=blue text=white>");
   while(rs.next())
		{
	   if(rs.getString(1).equalsIgnoreCase(Itemname))
			  { cst.setString(1,tokenid);
		         cst.execute();
	   	   	}
}*/
RequestDispatcher rdc=request.getRequestDispatcher("/canteen.com"); 
         rdc.forward(request,response);

   st.close();
   con.close();
	}//try
	catch(ClassNotFoundException cnfe)
		{ out.print
		  ("<h2>Unable to process...</h2>");}

    catch(SQLException se)
		{out.print("<h2>Unable to process.."+se+"</h2>");}

      out.print("</body>");
	 out.close();
	}//doPost

   public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	     doPost(request,response);

   }//doGet


}//class