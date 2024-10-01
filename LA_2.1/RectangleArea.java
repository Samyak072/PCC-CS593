class RectangleArea {
    double length; 
    double breadth;
    Rectangle(double length, double breadth){     // Constructor
            this.length=length;
            this.breadth=breadth;
    }
    public double computeArea() {             // Copute Area Method
        return( length * breadth);
    }
}
