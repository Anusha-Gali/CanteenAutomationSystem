import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;

public class CanteenServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");

	//Req.p.Logic (Read Table name)
//	String table=request.getParameter("TABLE");

	//DBLogic
	try{
		Class.forName
			("oracle.jdbc.driver.OracleDriver");
		
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","system");

Statement st=con.createStatement();
ResultSet rs=st.executeQuery("SELECT * FROM Food_TDB");
ResultSetMetaData rsmd=rs.getMetaData();
int nc=rsmd.getColumnCount();

//Response On Browser
out.print("<body text=black background='LIB/image/peach.png' >");

out.print("<h1 align=center>ORDER</h1><hr><br><br>");
out.print("<table align=center width=100% border=0 cellspacing=0 cellpadding=5>");
out.print("<tr><th>ITEMS</th><th>COST IN RS:</th><th>AVAILABILITY</th></tr>");
 out.println("<style>");
  out.print("h1 {");
  out.print("font-size:13pt;");
  out.print("padding:2px;");
  out.print("border: 3px solid black;");
  out.print("}");
  out.print("</style>");

     while(rs.next())
		{ out.print("<tr>");
	       
 for(int c=1;c<=nc;c++)
 { out.print("<td align=center>"+rs.getString(c)+"</td>"); }

	       out.print("</tr>");
		}
		out.print("<tr>");
		// out.print("<a href=remove.html>remove </a>");
         out.print("<td align=center><form action=remove.html>");

		out.print("<input type=submit value=Remove size=25></form></td>");
				// out.print("<a href=update.html>update</a>");
out.print("<td align=center><form action=update.html>");
		out.print(" <input type=submit value=Update></form></td>");
		out.print("<td align=center><form action=orders.com>");
		out.print(" <input type=submit value=ShowOrders></form></td>");

		
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