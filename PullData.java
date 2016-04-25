/* This file will serve as the main import routine for the FG site */

import java.net.*;
import java.io.*;


public class PullData {
 public static int ParseScores(String endchar, String args[])throws Exception {
URL yahoo;
URLConnection yc;
BufferedReader in;

String pr2,pr3 ="";
String pr="";

try{
yahoo = new URL(args[0]);
        yc = yahoo.openConnection();
        in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
}
catch(IOException e ){
return 0;
}
        String inputLine;
	
	int llen, linelen, p3s, x, pf,j,fd; 
	llen = linelen = p3s = x = pf = j =fd=0;	

        String st = "<!-- START CONTENT SECTION -->";

        String inputLineU = "";
	int linecnt = 0;

	int linecnt2 = 0;
        String strHeader = "\nTOURNEY RESULTS - ";
        
	System.out.print(strHeader);



		
        while ((inputLine = in.readLine()) != null) {
linecnt++;             
	     if ( linecnt == 11 ) {
		
		
		

		System.out.println( pr = inputLine.substring(36,inputLine.length()-2));
		
             }		
if (j==1){
//System.out.print(" - Length of Line 2- ");
linelen=inputLine.length();
//System.out.println(Integer.toString(linelen));   
j=0;
}
inputLineU = inputLine.toUpperCase();
	      if ( inputLineU.endsWith(endchar) ){
	System.out.println("Found Line 1");	
		 llen = inputLine.length(); 	
		 linelen = inputLine.length()-4;
		 p3s = linelen-12;
System.out.println(Integer.toString(linelen));	   
  pr2 = inputLine.substring(0,25);
//	       pr2 = inputLine.substring(38,49);	
	       pr3 = inputLine.substring(p3s,linelen);
		                System.out.print(pr2);
System.out.print(" - ");
//System.out.print(pr2);
//System.out.print(" - ");
System.out.print(pr3);
System.out.print(" - Length of Line 1- ");
	      pf=inputLine.length(); 
System.out.println(Integer.toString(pf));     

		x=1;
		j=1;
		}

if ( ( inputLine.length() ==linelen ) && (x==1) ) {
               pr2 = inputLine.substring(0,25);
//	       pr2 = inputLine.substring(38,49);	
	       pr3 = inputLine.substring(p3s,linelen);
		                System.out.print(pr2);
System.out.print(" - ");
//System.out.print(pr2);
//System.out.print(" - ");
System.out.print(pr3);
System.out.print(" - Length - ");
	      pf=inputLine.length(); 
System.out.println(Integer.toString(pf));
fd =1;

}

		      	


        }
in.close();

return fd;
}
    public static void main(String[] args) throws Exception {
        String endchar = ".00</B>";
        String endchar2 = ".00";
    if (ParseScores ( endchar,args )==0){
       ParseScores ( endchar2,args );
    }
  }
    

}
