package pattern.method.service;

import pattern.method.ErrorXMLPaser;
import pattern.method.XMLPaser;

public class ErrorXMLDisplayService extends DisplayService {

	@Override
	protected XMLPaser getParser() {
		return new ErrorXMLPaser();
	}

}
