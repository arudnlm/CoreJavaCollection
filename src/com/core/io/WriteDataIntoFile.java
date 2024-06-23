package com.core.io;

import java.io.*;

public class WriteDataIntoFile {

	public static void main(String[] args) {
		try {
			File file = new File(
					"C:\\Users\\AARUSH\\Documents\\workspace-spring-tool-suite-4\\CoreJavaCollection\\src\\com\\core\\io\\message.txt");
			FileOutputStream fout = new FileOutputStream(file);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			DataOutputStream dout = new DataOutputStream(bout);
			ObjectOutputStream oot = new ObjectOutputStream(dout);
			dout.write(123);
			dout.writeUTF("This is the data store in txt file");
			//dout.flush();
			oot.writeObject("Welcome to IO pacakage");
			
			oot.flush();
			System.out.println("Data write successfully in the file");
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
