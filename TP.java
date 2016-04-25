// FetchEarnings.java

import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TP extends HttpServlet { 

 public void doPost (HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        ServletOutputStream out = res.getOutputStream();
        res.setContentType("text/html");

out.println("Entered");
//String strname = req.getParameter("txtUrl");
	
//        out.println(strname);
	

out.println("Retrieved Paramter");
        out.println("<HEAD><TITLE>Fetching Results</TITLE></HEAD><BODY>");
   /*   
        URL yahoo = new URL(strname);
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                               new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;
	int pf = 0;
        String pr ="";
        String pr2 ="";
        String pr3 ="";
        int x=0;

        String st = "<!-- START CONTENT SECTION -->";

	int linecnt = 0;
	int linecnt2 = 0;
        String strHeader = "\nTOURNEY RESULTS - ";
        
	out.print(strHeader);

        while ((inputLine = in.readLine()) != null) {
linecnt++;             
	     if ( linecnt == 11 ) {
		out.println( pr = inputLine.substring(36,inputLine.length()-2));
             }		

	      if ( inputLine.startsWith(st) ){
		x=1;
		}
if ( ( inputLine.length() >74 ) && (x==1) && ( inputLine.length() <100 ) ) {
               pr = inputLine.substring(32,36);
	       pr2 = inputLine.substring(38,49);	
	       pr3 = inputLine.substring(64,75);
		                System.out.print(pr);
out.print(" - ");
out.print(pr2);
out.print(" - ");
out.print(pr3);
out.print(" - Length - ");
	      pf=inputLine.length(); 
out.println(Integer.toString(pf));
}
 
		      	

        }
in.close();*/
        	out.println("</BODY>");
    }
    	

    	public String getServletInfo() {
        	return "This servlet is useful for learning purposes only.";
    	}
}