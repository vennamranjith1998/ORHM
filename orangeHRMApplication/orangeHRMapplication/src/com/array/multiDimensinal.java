package com.array;

public class multiDimensinal {

	public static void main(String[] args) {
		String array1[][]=new String[2][2];
		array1[0][0]="vishinu";
		array1[0][1]="mannual Testing";
		array1[1][0]="srinu";
		array1[1][1]="automation";
		//	
		System.out.println(array1[1][0]);
		System.out.println(array1[1][1]);
		System.out.println(array1[0][0]);
       System.out.println(array1[0][1]);
       //
       for(int rowindex=0;rowindex<2;rowindex++)
       {
    	   for(int rowcelllndex=0;rowcelllndex<2;rowcelllndex++)
    	  
    		   System.out.println(array1[rowindex][rowcelllndex]);
    	   
    	   }
       
       }

	}


