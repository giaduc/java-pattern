package pattern.pattern;

public class ShapeFactory {

	public Shape getShape(String type) {
		if (type.equals("circle")) {
			return new Circle();
		} else if (type.equals("rectangle")) {
			return new Rectangle();
		} else if (type.equals("square")) {
			return new Square();
		}
		return null;
	}

}
