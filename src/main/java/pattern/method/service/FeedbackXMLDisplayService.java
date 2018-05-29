package pattern.method.service;

import pattern.method.FeedbackXMLPaser;
import pattern.method.XMLPaser;

public class FeedbackXMLDisplayService extends DisplayService {

	@Override
	protected XMLPaser getParser() {
		return new FeedbackXMLPaser();
	}

}
