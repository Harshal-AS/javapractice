package properties;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {

	public static void main(String[] args) throws IOException {
		// five steps follow properties file reads
		// step-1= file name & location
		String filePath1 = ".//TestAppData//harshal.properties";
		// or
		String filePath2 = System.getProperty("user.dir") + ".//TestAppData//harshal.properties";
		// step-2= create instance of fileinputstream and by passing the parameter
		// location
		// cons
		FileInputStream v = new FileInputStream(filePath1);
		// import // checked exception occured
		// step-3=creted instance of properties
		Properties n = new Properties();
		// import
		// step-4= ref of the propeties the use load method parameter pass the
		// fileinputstream (v)
		n.load(v);
		// checked exception occured
		// step5= last read the data of the properties files by using ref of the
		// properties use the getProperty(string key) properties class
		//n.getProperty(string key=properties);
		System.out.println("username: "+n.getProperty("username"));
		System.out.println("password: "+n.getProperty("password"));
		System.out.println("village: "+n.getProperty("username"));
		System.out.println("tal: "+n.getProperty("tal"));
		System.out.println("dist: "+n.getProperty("dist"));
		System.out.println("adress: "+n.getProperty("adress"));
		System.out.println("mobile: "+n.getProperty("mobile"));
		System.out.println("cuurentadress: "+n.getProperty("cuurentadress"));
		
	}

}
