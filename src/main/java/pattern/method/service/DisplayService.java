package pattern.method.service;

import pattern.method.XMLPaser;

public abstract class DisplayService {

	public void display() {
		XMLPaser xmlPaser = getParser();
		System.out.println(xmlPaser.parse());
	}
	
	protected abstract XMLPaser getParser();
}
