package com.Finally;

public class Finally {
	
		   public static void main(String args[]) {
		      int a[] = {21, 32, 65, 78};
		      try {
		         System.out.println("Access element three :" + a[5]);
		      } catch (ArrayIndexOutOfBoundsException e) {
		         System.out.println("Exception thrown :" + e);
		         System.exit(0);
		      } finally {
		         a[0] = 6;
		         System.out.println("First element value: " + a[0]);
		         System.out.println("The finally statement is executed");
		      }
		   }
		}

