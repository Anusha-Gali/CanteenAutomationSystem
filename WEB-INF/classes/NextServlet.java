import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.io.*;
import java.util.*;
public class NextServlet extends HttpServlet{
	Random rmno=new Random();
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");

	//Req.p.Logic (Read Table name)
	String fvalues[]=
		request.getParameterValues("selected");
  String lfvalues[]=new String[5];
	int sum=0;

//Response On Browser
out.print("<body bgcolor=blue>");

try{
		Class.forName
			("oracle.jdbc.driver.OracleDriver");
		
Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","system");

Statement st=con.createStatement();
ResultSet rs=
st.executeQuery("SELECT * FROM Food_tDB");
ResultSetMetaData rsmd=
	                      rs.getMetaData();
int nc=rsmd.getColumnCount();

//Response On Browser
out.print("<body text=black background='LIB/image/peach.png' >");

out.print("<h1 align=center>ORDER</h1><hr><br><br>");
  out.print("<form action=next.com method=post><br><br>");
out.print("<table align=center width=100% border=0 cellspacing=0 cellpadding=5>");
out.print("<tr><th><h3>ITEMS SELECTED</th><th>COST IN RS:</h3></th></tr>");
 out.println("<style>");
  out.print("h1 {");
  out.print("font-size:13pt;");
  out.print("padding:2px;");
  out.print("border: 3px solid black;");
  out.print("}");
  out.print("</style>");

       int token=rmno.nextInt();
//out.print("@hii");
      while(rs.next())
		{ 
		  for(int i=0;i<fvalues.length;i++){
		  if(((rs.getString(1)).equals(fvalues[i]))){
		  out.print("<tr>");
		  if(rs.getString(3).equals("a"))
	          sum+=Integer.parseInt(rs.getString(2));
	       
 for(int c=1;c<nc;c++)
 { 	
	 out.print("<td align=center><h3>"+rs.getString(c)+"</h3></td>");
	 }
	       out.print("</tr>");
		  }
		  }
		  }

   out.print("<tr>");
   
out.print("</tr>");
out.print("<tr>");	   out.print("<center><td><h3>Amount to be paid:"+sum+"</h3></td><center>");
	   out.print("</tr>");
	  
   out.print("</table>");
   	   out.print("<center><h2>Token Id:"+token+"</h2></center>");
	      out.print("<p align=center><center><h2>Thank You!! Have A Nice Day</h2><center></p>");
		  	      out.print("<p align=center><center><h2>See You At The Canteen</h2></center></p>");


	   int i;
	   for(int j=0;j<fvalues.length;j++)
		   lfvalues[j]=fvalues[j];
	   for(i=fvalues.length;i<5;i++)
          lfvalues[i]="n";

	   CallableStatement cst=con.prepareCall("{call POinsert(?,?,?,?,?,?,?)}");
       cst.setInt(1,token);
	  /*for(i=1;i<=fvalues.length;i++)
       cst.setString(i+1,fvalues[i]);

	   for(int j=(i+1);j<=6;j++)
	     cst.setString(j,"nullss");*/
      cst.setString(2,lfvalues[0]);
	   cst.setString(3,lfvalues[1]);
	   cst.setString(4,lfvalues[2]);
	   cst.setString(5,lfvalues[3]);
	   cst.setString(6,lfvalues[4]);
	   cst.setInt(7,sum);
	   cst.execute();
	   //cst.commit();



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