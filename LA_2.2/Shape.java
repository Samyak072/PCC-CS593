	static Shape createShape (int type, Scanner sin) {  
		Shape obj;	
		switch(type) {
			case 1:		// Circle
                                System.out.println("Circle detected");
				obj = new Circle( sin.nextDouble() );
				obj.computeArea();
				break;
			case 2:		// Rectangle
                                   System.out.println("Rectangle detected");
				obj = new Rectangle( sin.nextDouble(),     sin.nextDouble() );
				obj.computeArea();
				break;
			case 3: 	// Triangle
                             System.out.println("Triangle detected");
				obj = new Triangle( sin.nextDouble(), sin.nextDouble() );
				obj.computeArea();
				break;
			default:
				System.out.printf("Ignoring wrong type: %d\n", type);
				obj = null;
				break;
    }
		return obj;
	}
