import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Shape {
    double area;
    
    void computeArea() {
        System.out.println("Override in compute area");
    }
    
    void display() {
        System.out.println("Override in display area");
    }
}

class Circle extends Shape {
    double r;
    
    Circle(double r) {
        this.r = r;
    }
    
    @Override
    void computeArea() {
        super.area = Math.PI * r * r;
    }
    
    @Override
    void display() {
        System.out.printf("Circle(%.2f) Area: %.2f\n", r, super.area);
    }
}

class Rectangle extends Shape {
    double l, b;
    
    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    
    @Override
    void computeArea() {
        super.area = l * b;
    }
    
    @Override
    void display() {
        System.out.printf("Rectangle(%.2f, %.2f) Area: %.2f\n", l, b, super.area);
    }
}

class Triangle extends Shape {
    double h, b;
    
    Triangle(double h, double b) {
        this.h = h;
        this.b = b;
    }
    
    @Override
    void computeArea() {
        super.area = 0.5 * h * b;
    }
    
    @Override
    void display() {
        System.out.printf("Triangle(%.2f, %.2f) Area: %.2f\n", h, b, super.area);
    }
}

public class Sheets {
    /* createShape method */
    static Shape createShape(int type, Scanner sin) {
        Shape obj;
        double a, b;
        switch (type) {
            case 1: // Circle
                obj = new Circle(sin.nextDouble());
                obj.computeArea();
                break;
            case 2: // Rectangle
                obj = new Rectangle(sin.nextDouble(), sin.nextDouble());
                obj.computeArea();
                break;
            case 3: // Triangle
                obj = new Triangle(sin.nextDouble(), sin.nextDouble());
                obj.computeArea();
                break;
            default:
                System.out.println("Ignored wrong type");
                obj = null;
                break;
        }
        return obj;
    }

    public static void main(String args[]) {
        Shape shapes[] = new Shape[50];
        int n, i = 0, sheetType;
        Shape s;
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            sheetType = sc.nextInt();
            s = createShape(sheetType, sc);
            if (s != null)
                shapes[i++] = s;
        }
        
        n = i - 1; // No. of sheets
        
        Arrays.sort(shapes, 0, i, new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return Double.compare(s1.area, s2.area);
            }
        });
        
        for (int j = 0; j <= n; j++) {
            System.out.print(j + ":");
            shapes[j].display();
        }
    }
}
