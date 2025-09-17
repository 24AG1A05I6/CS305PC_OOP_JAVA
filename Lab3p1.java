//prime numbers by using while

import java.util.Scanner;
class Lab3p1{
	public static void main(String...args){
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the limit:");
		
		int n=s.nextInt();
		
		System.out.println("prime numbers are:");
		
		int i=2;
		while(i<n){
			int j=2,count = 0;
			if(i == 2)
				count++;
			while(j<i){
				if(i%j == 0){
					count = 0;
					break;
				}	
				else
					count++;
					j++;
				}
				if(count>0)
					System.out.println(i);
				i++;
					
			}
		}
	}
			
		

