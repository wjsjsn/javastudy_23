package day07.com.ict.edu;

import java.util.Iterator;

public class Test02 {
	public static void main(String[] args) {
      
/* 6.    *
         * *
         * * *
         * * * *        별짓기 */
		
   for (int i = 1; i < 5; i++) {
	   for (int j = 0; j < i; j++) {
		System.out.print("* ");
	             }
	System.out.println();
       }
		System.out.println("========================================");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("* ");
				if(i==j) break;
			}
			System.out.println();
		}
		  
/* 7.      *
         * * 
       * * *
     * * * *        별짓기 */
		System.out.println("========================================");
		
		for (int i = 1; i < 5; i++) {
		  for (int j = 4; j >0 ; j--) {
		 if(i<j) {
		   System.out.print("  ");
		 }else {
			 System.out.print("* ");
		 }
		}
		  System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
