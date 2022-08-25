package variables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configProperties {
	
	public static Properties property;
	private static String configpath = "configs/configSettings.properties";
	
	public static void initializePropertyFile() {
		
		property = new Properties();
		
		try {
			InputStream iStream = new FileInputStream(configpath);
			property.load(iStream);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
	
}
  