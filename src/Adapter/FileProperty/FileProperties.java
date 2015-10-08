package Adapter.FileProperty;

import java.io.*;
import java.util.Properties;

public class FileProperties implements FileIO {
	private Properties properties;
	
	public FileProperties() {
		properties = new Properties();
	}
	
	public void readFromFile(String filename) throws IOException {
		properties.load(new FileInputStream(filename));
	}
	
	public void writeToFile(String filename) throws IOException {
		properties.store(
				new FileOutputStream(filename), 
				"written by FileProperties");
	}
	
	public void setValue(String key, String value) throws IOException {
		properties.setProperty(key, value);
	}
	
	public String getValue(String key) {
		return properties.getProperty(key);
	}

}
