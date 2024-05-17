import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;

public class OrderServlet extends HttpServlet{
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
st.executeQuery("SELECT * FROM Order_Db");
ResultSetMetaData rsmd=
	                      rs.getMetaData();
int nc=rsmd.getColumnCount();

//Response On Browser
out.print("<body text=black background='LIB/image/peach.png' >");

out.print("<h1 align=center>ORDERS</h1><hr><br><br>");
out.print("<table align=center width=100% border=0 cellspacing=0 cellpadding=5>");
out.print("<tr><th>SELECT</th><th>TOKEN</th><th>ITEM1</th><th>ITEM2</th><th>ITEM3</th><th>ITEM4</th><th>ITEM5</th><th>COST</th></tr>");
 out.println("<style>");
  out.print("h1 {");
  out.print("font-size:13pt;");
  out.print("padding:2px;");
  out.print("border: 3px solid black;");
  out.print("}");
  out.print("</style>");
out.print(" <form action=lastdelete.com method=post>");
      while(rs.next())
		{ out.print("<tr>");
	      out.print("<td align=center><b><input type=checkbox name=checked value="+rs.getInt(1)+"></b>");
 for(int c=1;c<=nc;c++)
 { out.print("<td align=center><b>"+rs.getString(c)+"</b></td>"); }

	       out.print("</tr>");
		}
		out.print("<tr>");
out.print("<td>");
out.print("<input type=submit value=Done!></td>");
   out.print("</tr>");
   out.print("</table>");
   //out.print("</form>");
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