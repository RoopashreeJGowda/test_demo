package CoreJava1;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Choose the type of object to find area");
		System.out.println("\t1. Rectangle");
		 System.out.println("\t2. Square");
		  System.out.println("\t3. Triangle");
		   System.out.println("\t4. Circle");
		
	      int option=scan.nextInt();
	   if(option==1)
	   {
		   System.out.println("Enter the dimensions of the Rectangle");
		   int width=scan.nextInt();
		   int Length=scan .nextInt();
		   double area=width*Length;
		   System.out.println("The area of the Rectangle is "+area);
		   
	   }
	   else if(option==2)
	   {
		   System.out.println("Enter the dimensions of the Square");
		   int side1=scan.nextInt();
		   int side2=scan.nextInt();
		   double area=side1*side2;
		   System.out.println("The area of the Square is "+area);
		   
	   }
	   else if(option==3)
	   {
		   System.out.println("Enter the dimensions of the Triangle");
		   int Base=scan.nextInt();
		   int Height=scan.nextInt();
		   double area=0.5*Base*Height;
		   System.out.println("The area of the Triangle is "+area);
		   
	   }
	   else if(option==4)
	   {
		   System.out.println("Enter the dimensions of the Circle");
		  double PI=3.142;
		   int Radius=scan.nextInt();
		   double area=PI*Radius*Radius;
		   System.out.println("The area of the Circle is "+area);
		   
	   }
	}

}