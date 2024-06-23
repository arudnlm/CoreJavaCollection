package com.test.map.propdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Properties;

public class PropertizDemo {
	
	
	private static PropertizDemo propertizDemo =new PropertizDemo();
	private Properties ps=null;
	
	private PropertizDemo(){
		try {
		
		File file=new File("./src/com/test/map/propdemo/message.txt");
		
		InputStreamReader iSR = new InputStreamReader(new FileInputStream(file));
		ps =new Properties();
		ps.load(iSR);
		System.out.println("Size of properties:>>>"+ps.size());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static PropertizDemo getInstance() {
		//System.out.println("Hello client");
		return propertizDemo;
		
	}
	public String getMessageData(String key) {
		return (String)ps.get(key);
		}

}

