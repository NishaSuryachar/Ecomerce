package com.amazon.genric.fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
public String getDataFromPropertiesFile(String key) throws IOException {
	FileInputStream fis =new FileInputStream("./Test data/commondata1.properties");
	 Properties pobj=new Properties(); 
	 pobj.load(fis); 
String data= pobj.getProperty(key); 

	return data;
	
}
}
