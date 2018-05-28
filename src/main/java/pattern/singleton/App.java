package pattern.singleton;

public class App {

	public static void main(String[] args) {
		SingleObject singleObject = SingleObject.getInstance();
		
		singleObject.showMessage();
		
		SingleObject singleObject1 = SingleObject.getInstance();
		
		System.out.println(singleObject == singleObject1);
		
		singleObject1.showMessage();
	}
}
