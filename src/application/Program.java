package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {
	
	public static void main(String[] Args){
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Circle circle = new Circle();
		Rectangle rectangle;
		
		System.out.println("-----------------------");
		System.out.printf("[1] - circle\n[2] - rectangle\n");
		System.out.println("-----------------------");
		
		System.out.print("Choose options : ");
		int number = sc.nextInt();
		
		System.out.print("Enter color of shape : ");
		String color = sc.next();
		
		if(number == 1) {
			System.out.print("Enter radious : ");
			double radious = sc.nextDouble();
			circle = new Circle(radious, color);
			
			Write(circle);
			
		} else {
			System.out.print("Enter width : ");
			double width = sc.nextDouble();
			System.out.print("Enter height : ");
			double height = sc.nextDouble();
			rectangle = new Rectangle(width, height, color);
			
			Write(rectangle);
			
		}
		
	}
	
	public static void Write(Shape shape) {
		System.out.printf("\nW---------------------W\n");
		System.out.println("Selected option : "+ shape.getName());
		System.out.println("Color of "+shape.getName()+" : "+ shape.getColor());
		System.out.println("Area of "+shape.getName()+" : "+ shape.area());
	}
	
}
