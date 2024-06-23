package com.core;

import com.coreJava.IProcessImp;

public class ClientCodeForIProcess {
	
	public static void main(String[] args) {
		IProcessImp iProcessImp = new IProcessImp();
		iProcessImp.processData();
		iProcessImp.messageData();
		iProcessImp.simpleData();
	}

}
