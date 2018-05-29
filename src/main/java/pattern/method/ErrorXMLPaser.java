package pattern.method;

public class ErrorXMLPaser implements XMLPaser {

	public String parse() {
		System.out.println("Pasing error XML...");
		return "Error XML message";
	}

}
