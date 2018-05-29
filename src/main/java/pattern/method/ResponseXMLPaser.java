package pattern.method;

public class ResponseXMLPaser implements XMLPaser {

	public String parse() {
		System.out.println("Pasing response XML...");
		return "Response XML message";
	}

}
