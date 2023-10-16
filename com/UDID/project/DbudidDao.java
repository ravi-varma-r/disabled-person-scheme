package com.UDID.project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class DbudidDao 
{
String[] array = { "4232332112","3452535456", "35454245859","3545355142", "6524532389"};
ArrayList<String> allUdid = new ArrayList<String>(Arrays.asList(array));
Map<String,String> map = new HashMap<String, String>();
Map<String, List<String>>featureMap = new HashMap<String, List<String>>();
Udid ud = new Udid();
udidcolor udcolor = new udidcolor();
Features f1 = new Features();
String color;
public Object fl;
public void getAll(String Udidval) throws Exception 
{
for (String udid : allUdid) 
{
if (udid. equals (Udidval))
{
ud.setId(udid);
}
}
}
public void getcolorForudid(String Udidval) throws Exception 
{
loadColors();
color = map.get(Udidval);
udcolor.setcolor(color);
}
public void getFeaturesForcolor() throws Exception 
{
loadFeatures();
List<String>Featureslist = featureMap.get(color);
f1.setFeatures(Featureslist);
}
public void loadColors ()
{
map.put("4232332112", "RED") ;
map.put("3452535456", "GREEN") ;
map.put("3545424589", "BLACK") ;
map.put("3545355142", "BLUE") ;
map.put("6524532389", "YELLOW") ;
}
public void loadFeatures() 
{
String[] featuresforRed = { "SSA-SARVA SHIKSHYA ABHIYAN(AGE 6-14)","NDWB-NATIONAL DISABILITY WELFARE BOARD(LESS THAN 2LPA)" };
ArrayList<String> featuresListforRed = new ArrayList<String>(Arrays.asList(featuresforRed));
String[] featuresforGreen = { "NCPWD-MENTAL RETARDATION AND MULTIPLE DISABILITIES SCHEME(PEOPLE WITH 40-80%)","NIDAR-NATONAL INSTITUTE FOR DISABILITY AND REHABILATION SCHEME","IIT-M-INDIAN INSTITUTE OF TECHNOLOGY,MADRAS SCHEME"};
ArrayList<String> featuresListforGreen = new ArrayList<String>(Arrays.asList (featuresforGreen));
String[] featuresforBlack = {"RSY-RASTRIYA SWALAMBAN YOJANA SCHEME(AGE 18-59)", "SSA-SARVA SHIKSHYA ABHIYAN SCHEME(AGE 6-14)","NDWB-NATIONAL DISABILITY WELFARE BOARD SCHEME(LESS THAN 2LPA)",};
ArrayList<String> featuresListforBlack = new ArrayList<String>(Arrays.asList(featuresforBlack));
String[] featuresforBlue = { "IGNDPS-INDIRA GANDHI NATIONAL DISABILITY PERSON SCHEME(AGE 18 OR ABOVE)", "NDWB-NATIONAL DISABILITY WELFARE BOARD(LESS THAN 2LPA)", "RSY-RASTRIYA SWALAMBAN YOJANA(AGE 18-59)","NCPWD-MENTAL RETARDATION AND MULTIPLE DISABILITIES SCHEME(PEOPLE WITH 40-80%)","NIDAR-NATONAL INSTITUTE FOR DISABILITY AND REHABILATION SCHEME","IIT-M-INDIAN INSTITUTE OF TECHNOLOGY,MADRAS SCHEME"};
ArrayList<String> featuresListforBlue = new ArrayList<String>(Arrays.asList(featuresforBlue));
String[] featuresforYellow = {"RSY-RASTRIYA SWALAMBAN YOJANA SCHEME(AGE 18-59)","NDWB-NATIONAL DISABILITY WELFARE BOARD SCHEME(LESS THAN 2LPA)","NCPWD-MENTAL RETARDATION AND MULTIPLE DISABILITIES SCHEME(PEOPLE WITH 40-80%)","NIDAR-NATONAL INSTITUTE FOR DISABILITY AND REHABILATION SCHEME","IIT-M-INDIAN INSTITUTE OF TECHNOLOGY,MADRAS SCHEME" };
ArrayList<String> featuresListforYellow = new ArrayList<String>(Arrays.asList(featuresforYellow));
{
featureMap.put ("RED", featuresListforRed); 
featureMap.put ("GREEN", featuresListforGreen); 
featureMap.put ("BLACk", featuresListforBlack); 
featureMap.put ("YELLOW", featuresListforYellow); 
featureMap.put ("BLUE", featuresListforBlue);
}
}
}