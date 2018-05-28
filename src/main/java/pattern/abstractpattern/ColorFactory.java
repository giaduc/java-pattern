package pattern.abstractpattern;

public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		return null;
	}

	@Override
	Color getColor(String color) {
		if (color.equals("red")) {
			return new Red();
		} else if (color.equals("blue")) {
			return new Blue();
		} else if (color.equals("green")) {
			return new Green();
		}
		return null;
	}

}
