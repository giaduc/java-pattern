package pattern.singleton;

public class SingleObject {

	private SingleObject() {
	}
	
	private static class SingleObjectHolder {
		public static final SingleObject instance = new SingleObject();
	}
	
	public static SingleObject getInstance() {
		return SingleObjectHolder.instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}

}
