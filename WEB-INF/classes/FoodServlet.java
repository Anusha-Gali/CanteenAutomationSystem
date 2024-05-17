import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;

public class FoodServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");

	//Req.p.Logic (Read Table name)
	
	//DBLogic
	try{
		Class.forName
			("oracle.jdbc.driver.OracleDriver");
		
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","system");

Statement st=con.createStatement();
ResultSet rs=
st.executeQuery("SELECT * FROM Food_TDB");
ResultSetMetaData rsmd=
	                      rs.getMetaData();
int nc=rsmd.getColumnCount();

//Response On Browser
out.print("<body background='LIB/image/peach.png'>");
out.print("<h1 align=center>MENU</h1><hr><br><br>");
 out.print("<form action=next.com method=post><br><br>");
out.print("<table align=center width=100% border=0 cellspacing=0 cellpadding=5>");
out.print("<tr><th>SELECT</th><th>ITEM</th><th>COST IN RS.</th></tr>");
 out.println("<style>");
  out.print("h1 {");
  out.print("font-size:13pt;");
  out.print("padding:2px;");
  out.print("border: 3px solid black;");
  out.print("}");
  out.print("</style>");


      while(rs.next())
		{ out.print("<tr>");
	  if(rs.getString(3).equals("a"))
	      out.print("<td align=center><input type=checkbox name=selected value="+rs.getString(1)+">");
	       
 for(int c=1;c<nc;c++)
 { if(rs.getString(3).equals("a"))
	 out.print("<td align=center><b>"+rs.getString(c)+"</b></td>"); }

	       out.print("</tr>");
		}
   out.print("<tr>");
out.print("<td></td>");
   out.print("<td align=center><input type=submit value=NEXT></td>");
out.print("<td></td>");
   out.print("</tr>");
   out.print("</table>");
   out.print("</form>");
   


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

