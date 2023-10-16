package com.UDID.project;
import java.util.Scanner;
public class ScanUdid
{
public static String scanUdid(String Udid) throws Exception
{
String message = "";
DbudidDao dbUd = new DbudidDao();
dbUd. getAll(Udid);
dbUd. getcolorForudid (Udid);
dbUd. getFeaturesForcolor();
if (dbUd.ud.getid() != null) 
{
message = "The Entered UDID No:" + Udid + " is Valid";
} 
else
message = "The Entered UDID No:" + Udid + " is not Valid";
if (dbUd.udcolor. getcolor() != null) 
{
message = message + " and the color of the card is " + dbUd.udcolor.getcolor();
}
if (dbUd.f1.getFeatures() != null && dbUd.f1.getFeatures(). size()>0) 
{
message = message + "\n"+"And the Available Features are: "+"\n";
for (int i=0;i<dbUd. f1.getFeatures().size();i++)
{
message=message+"\n"+dbUd.f1.getFeatures().get(i);
}
}
return message;
}
public static void main(String[] args) throws Exception 
{
try (Scanner myObj = new Scanner(System.in)) {
    System.out.println("Enter UDID Number!!!");
    String userName = myObj. nextLine();
    String ValidationMsg = scanUdid (userName);
    System. out. println (ValidationMsg);
} 
}
}