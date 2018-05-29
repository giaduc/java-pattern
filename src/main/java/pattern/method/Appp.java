package pattern.method;

import pattern.method.service.DisplayService;
import pattern.method.service.ErrorXMLDisplayService;
import pattern.method.service.FeedbackXMLDisplayService;

public class Appp {

	public static void main(String[] args) {
		DisplayService displayService = new FeedbackXMLDisplayService();
		displayService.display();
		
		displayService = new ErrorXMLDisplayService();
		displayService.display();
	}
	
}
