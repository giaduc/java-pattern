package pattern.pattern;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
		
		Shape square = shapeFactory.getShape("square");
		square.draw();
		
	}
}
