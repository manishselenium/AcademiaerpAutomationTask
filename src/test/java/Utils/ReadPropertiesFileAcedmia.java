package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileAcedmia {
	
	public Properties LoadPropertiess() throws IOException {

		String propfilepath = "AcedemiaConfig.properties";
		Properties p = new Properties();
		p.load(new FileInputStream(propfilepath));

		return p;
	}

	
	
}