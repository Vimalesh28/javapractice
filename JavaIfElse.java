package java;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			if(n>=2 || n<=5) {
				if(n<=20) {
					System.out.print("not wired");
				}
			}
		}
		else{
			System.out.print("wired");

		}
		
		

	}

}
