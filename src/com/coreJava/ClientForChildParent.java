package com.coreJava;

public class ClientForChildParent {
	
	public static void main(String[] args) {
		
		//case 1
		ProcessParent processParent = new ProcessParent();
		processParent.parrentProcess();
		
		//case 2
		
		ProcessChild processChild = new ProcessChild();
		processChild.childPrcess();
		processChild.parrentProcess();
		
		//case3 
		ProcessParent parrent= new ProcessChild();
		parrent.parrentProcess();
		
		//case 4
		//ProcessChild child=	new ProcessParent();
		//child.childPrcess();
		//child.parrentProcess();
		
	   
		
	}
	
	
	


}
