package com.bhagavan.interview.debugging;

public class UsuageOfStepsIN {
	
	public static void main(String[] args) {
		int value= callForStepin(10,20);
		System.out.println(value);
	}

	private static int callForStepin(int i, int j) {
		// TODO Auto-generated method stub
	boolean value= checkNUmber(i,j);
	int result=0;
	if(value)
	{
		 result= doOperation(i,j);
	}
	return result;
		
	}

	private static int doOperation(int i, int j) {
		// TODO Auto-generated method stub
		int k = i+j;
		return k;
	}

	private static boolean checkNUmber(int i, int j) {
		// TODO Auto-generated method stub
		boolean check=false;
		if(i>5 && j>5)
		{
			check=true;
		}
		
		return check;
		
	}

}
