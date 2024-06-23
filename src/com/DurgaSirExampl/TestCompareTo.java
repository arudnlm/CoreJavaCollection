package com.DurgaSirExampl;
import java.util.*;

public class TestCompareTo {
	public static void main(String[] args) {
		System.out.println("A".compareTo("Z")); // -ve
		System.out.println("Z".compareTo("B")); //+ve
		System.out.println("A".compareTo("A")); //0
		System.out.println("A".compareTo(null)); //NPE
	}

}
