package day1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer number,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print multiplication table");
		number=sc.nextInt();
		for(i=1;i<=10;i++){
			System.out.println(number+"*"+i+"="+(number*i));
		}
	}

}
