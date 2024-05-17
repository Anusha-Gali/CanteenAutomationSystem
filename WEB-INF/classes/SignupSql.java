import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.Scanner;
public class SignupSql extends HttpServlet 
{     public void service(ServletRequest request,
ServletResponse response)throws ServletException,IOException{
   PrintWriter out=response.getWriter();
   response.setContentType("text/html");
    Connection con=null;
CallableStatement cst=null;
		String userid=request.getParameter("uid");
		String name=request.getParameter("Name");
		String branch=request.getParameter("branch");
		String email=request.getParameter("email");
        int  phone=Integer.parseInt(request.getParameter("mobileno"));
		String suser=request.getParameter("signupusername");
		String spwd=request.getParameter("signuppwd");
		try
		{
	    Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","system");
		cst=con.prepareCall("{call Pinsert(?,?,?,?,?,?,?)}");
         cst.setInt(1,2);
		 cst.setString(2,userid);
		 cst.setString(3,name);
	     cst.setString(4,branch);
		 cst.setString(5,email);
         cst.setInt(6,phone);
         cst.setString(7,suser);
		 cst.execute();
		CallableStatement cst1=con.prepareCall("{call Pinsertldb(?,?)}");
         cst1.setString(1,suser);
		 cst1.setString(2,spwd);
		 cst1.execute();
		 RequestDispatcher rd=request.getRequestDispatcher("/login.html"); 
         rd.forward(request,response);
         }
		catch (Exception e)
			{
			e.printStackTrace();
		    }
			finally
			{
				try
				{
					if(cst!=null)
						cst.close();
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
}}