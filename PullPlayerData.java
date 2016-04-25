import java.net.*;
import java.io.*;
import java.util.regex.*;

public class PullPlayerData {
 public static int ParseScores(String endchar, String args[])throws Exception {
 URL yahoo;
 URLConnection yc;
 BufferedReader in;

 String PlayerRank,PlayerName ="";
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
	
	int llen, linelen, p3s, x, pf,j,fd,PlayerHeader,RankHeader; 
	llen = linelen = p3s = x = pf = j = fd = PlayerHeader = RankHeader = 0;	

        String st = "<!-- START CONTENT SECTION -->";
 
        String inputLineU = "";
	int linecnt = 0;

	int linecnt2 = 0;
        String strHeader = "\nTOURNEY RESULTS\n";
        
	System.out.print(strHeader);
	 	
        while ((inputLine = in.readLine()) != null){ 	            

	      inputLineU = inputLine.toUpperCase();

	      if ( inputLineU.endsWith( endchar) ){

		 inputLine = in.readLine();
		 inputLineU = inputLine.toUpperCase();

		 String REGEX = "[<TD>*</TD>]";
		 String REPLACE = "";
		 Pattern p = Pattern.compile(REGEX);
		 Matcher m = p.matcher(inputLineU); // get a matcher object
	         PlayerRank = m.replaceAll(REPLACE);
                 PlayerHeader = 0;
	
		 RankHeader = 1;

		 inputLine = in.readLine();

		 inputLineU = inputLine.toUpperCase();

		 String REGEX2 ="<TD>|</TD>";
		 String REPLACE2 = "";
		 Pattern pp = Pattern.compile(REGEX2);
		 Matcher mm = pp.matcher(inputLineU); // get a matcher object
	         PlayerName = mm.replaceAll(REPLACE2);
	
                 String xx = PlayerName.trim();
		 String yy = PlayerRank.trim();
	
		 System.out.println( yy + " - " + xx );

               }
	                     
        }
        in.close();
	return fd;
  }

 public static void main(String[] args) throws Exception {
    String endchar = "<TR BGCOLOR=\"#F2F2F2\">";
    String endchar2 = ".00";
    ParseScores ( endchar,args );
 }
    

}
