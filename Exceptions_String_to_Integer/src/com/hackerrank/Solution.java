package com.hackerrank;

import java.util.Scanner;

public class Solution {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        parseInt(S);	        
	    }
	 
	 public static void parseInt(String S){

		    try{
		        int no= Integer.parseInt(S);
		        System.out.println(no);

		    }
		    catch(NumberFormatException e){
		        System.out.println("Bad String");

		    }
		}
}
