import java.util.Scanner;

interface Shape {
    double computeArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius=radius;
        }
    

    @Override
    public double computeArea() {
        return Math.PI*radius*radius;
        }
}

class Rectangle implements Shape {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
       this.length=length;
       this.breadth=breadth;
        
    }

    @Override
    public double computeArea() {
        return length*breadth;
        }
}

public class ShapeDemo {
    public static void main(String[] args) {
		int type;
		Shape s;
		
		Scanner sc = new Scanner(System.in);

		/* Collect shape dimensions */
		LoopTypes:
		while (sc.hasNextInt()) {	
 			type = sc.nextInt(); 
			
			/* Input sheet type (1: Circle, 2: Rectangle) */
			switch(type) {
				case 1:
                                        s = new Circle(sc.nextDouble());
					System.out.printf("Circle: %.2f\n", s.computeArea());
					break;
					
				case 2:
					// Display "Rectangle detected"
					s = new Rectangle(sc.nextDouble(), sc.nextDouble());
                                        System.out.printf("Rectangle: %.2f\n",s.computeArea());
					break;				
				
				default:
                                        break;

			}			
		} /* end of while */
    } /* end of main */
} /* end of Main class */
