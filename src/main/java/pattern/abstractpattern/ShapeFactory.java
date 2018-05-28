package pattern.abstractpattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		if (shape.equals("circle")) {
			return new Circle();
		} else if (shape.equals("rectangle")) {
			return new Rectangle();
		} else if (shape.equals("square")) {
			return new Square();
		}
		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}

}
