package pattern.method.service;

import pattern.method.ResponseXMLPaser;
import pattern.method.XMLPaser;

public class ResponseXMLDisplayService extends DisplayService{

	@Override
	protected XMLPaser getParser() {
		return new ResponseXMLPaser();
	}

}
