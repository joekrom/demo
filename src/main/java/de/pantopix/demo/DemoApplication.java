package de.pantopix.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.net.URLDecoder;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		String classLoc=null;
		String jarLoc = null;


		String path = DemoApplication.class.getProtectionDomain().getCodeSource().getLocation().toString();
		classLoc = DemoApplication.class.getProtectionDomain().getCodeSource().getLocation().toString();
		String decodedPath="";
		try {
			decodedPath = URLDecoder.decode(path, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx:" + path);

		if (classLoc.endsWith(".jar")) {
			jarLoc = "jar:" + classLoc + "!";

		} else {
			// This is only supposed to happen on a dev box; if you're integrating this into some bigger
			// application, well, sorry, it's all a bit of a hack if it's not in the jar.
			if (classLoc.indexOf("/target/") > 0) {
				jarLoc = classLoc + "../../../resources/main";
			} else if (classLoc.indexOf("/out/production/") > 0) { // IntelliJ
				jarLoc = classLoc + "../resources";
			} else {
				throw new RuntimeException("org.docbook.XslTNG cannot find root from " + classLoc);
			}
		}

		System.out.println("#################################### jarLoc" + jarLoc);


		/*******************************************  read from jar file *************************************/

		InputStream is = DemoApplication.class.getResourceAsStream("/tmp/book.xml");
		String pathName = DemoApplication.class.getResourceAsStream("/tmp/book.xml").toString();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader reader = new BufferedReader(isr);
		String line = null;

		while((line = reader.readLine()) != null){
			System.out.println(line);
		}

		System.out.println(pathName);
	}

}
