package Configuration_Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configuration_Reader {
	
	public static Properties p;
	
	public configuration_Reader() throws IOException {
		
		File f = new File("C:\\Users\\rjaga\\eclipse-workspace\\Cucumber\\src\\test\\java\\Configuration_Properties\\configuration_Properties");
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();		//Load
		p.load(fis);
	}
	public String getBrowser() {
	
		String browser = p.getProperty("browser");
		return browser;

}
	public String getUrl() {
		
		String Url = p.getProperty("url");
		return Url;
	}
	
}
