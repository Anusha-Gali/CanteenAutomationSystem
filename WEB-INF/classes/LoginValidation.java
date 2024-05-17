import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.Scanner;
public class LoginValidation extends HttpServlet 
{
    public void service(ServletRequest request,
ServletResponse response)throws ServletException,IOException{

   PrintWriter out=response.getWriter();
   response.setContentType("text/html");
   

   //R.g.p.logic 
  String username= request.getParameter("username");
  String pword=  request.getParameter("upassword");

	   //DBlogic
		Connection con=null;
		Statement st=null;
		try
		{
	    Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","system");
		st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Login_DB");
		out.print(""+username+""+pword);
		if(username.equalsIgnoreCase("admin")&&pword.equals("canteen"))
			{RequestDispatcher rdc=request.getRequestDispatcher("/canteen.com"); 
         rdc.forward(request,response);}
	
		while(rs.next())
			{
			if(rs.getString(1).equalsIgnoreCase(username) && rs.getString(2).equals(pword))
				{
				 RequestDispatcher rdf=request.getRequestDispatcher("/food.html"); 
         rdf.forward(request,response);
				}
				else
				{}

		}
		RequestDispatcher rdl=request.getRequestDispatcher("/login.html"); 
         rdl.forward(request,response);}
		catch (Exception e)
			{
			e.printStackTrace();
		    }

			finally
			{
				try
				{
					if(st!=null)
						st.close();
				}
				catch (SQLException s)
				{
					s.printStackTrace();
				}
		        try
		        {
					if(con!=null)
						con.close();
		        }
		        catch (SQLException e)
		        {
					e.printStackTrace();
		        }
			}
			out.close();
}
}