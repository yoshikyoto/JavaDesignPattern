package Adapter.FileProperty;

import java.io.*;

public interface FileIO {
	public void readFromFile(String filename) throws IOException;
	public void writeToFile(String filename) throws IOException;
	public void setValue(String key, String value) throws IOException;
	public String getValue(String key);
}
