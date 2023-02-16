package Filereader_helper;

import java.io.IOException;

import Configuration_Properties.configuration_Reader;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		
	}
	
	public configuration_Reader ConfigurationReader() throws IOException {
		
		configuration_Reader reader = new configuration_Reader();
		return reader;
	}

	public static File_Reader_Manager file_Manager() {
		
		File_Reader_Manager helper = new File_Reader_Manager();
		return helper;

	}
}
