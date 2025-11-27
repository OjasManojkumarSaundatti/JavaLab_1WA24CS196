import java.util.Scanner;

abstract class Shape
{
	double a,b;
	abstract void printArea();
}

class Rectangle extends Shape
{
	void printArea()
	{
		System.out.println("Area of rectangle is " + (a*b));
	}
}

class Triangle extends Shape
{
	void printArea()
	{
		System.out.println("Area of triangle is " + (0.5*a*b));
	}
}

class Circle extends Shape
{
	void printArea()
	{
		System.out.println("Area of Circle is " + (3.14*a*a));
	}
}

class ShapeArea
{
	public static void main(String args[])
	{
		int choice;
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
		
		while(true)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nMAIN MENU\nSelect Shape\n1.Rectangle\n2.Triangle\n3.Circle\n4.Exit\nEnter Choice");
			choice = scanner.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter Length");
					r.a=scanner.nextDouble();
					System.out.println("Enter Breadth");
					r.b=scanner.nextDouble();
					
					r.printArea();
					break;
				}
				
				case 2:
				{
					System.out.println("Enter Length");
					t.a=scanner.nextDouble();
					System.out.println("Enter Breadth");
					t.b=scanner.nextDouble();
					
					t.printArea();
					break;
				}
				
				case 3:
				{
					System.out.println("Enter Radius");
					c.a=scanner.nextDouble();
				
					c.printArea();
					break;
				}
				
				case 4:
				{
					System.exit(0);
				}
				default: System.out.println("Invalid Input!!");
			}
		}
	}
}