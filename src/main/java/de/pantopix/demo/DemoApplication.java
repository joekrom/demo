package de.pantopix.demo;

import de.pantopix.AnnotationDemo.NokiaSeries;
import de.pantopix.BuilderDemo.DeviceBuilder;
import de.pantopix.factoryDemo.Shape;
import de.pantopix.factoryDemo.ShapeFactory;
import de.pantopix.rdf4jDemo.rdf4jImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		ApplicationContext apc = SpringApplication.run(DemoApplication.class, args);
		for (String s : apc.getBeanDefinitionNames()){
			System.out.println(s);
		}

		// Instantiate an Object with the factory and check the created object
		ShapeFactory shapeFactory = new ShapeFactory();
		// get an object of type Circle
		Shape shape1 = ShapeFactory.getShape("rectangle");
		shape1.draw();


		// Intantiante an object with the builder
		Object device = new DeviceBuilder().setName("rapsberry pi").build();
		System.out.println(device);

		// use aanotation
		//Object nokia = new NokiaSeries("3310", 15);

		NokiaSeries nokia = new NokiaSeries("fire",8);
		Class c = nokia.getClass();


		// rfd test
		/*rdf4jImpl rdf = new rdf4jImpl();
		rdf.transform();*/

		/*System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
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

		InputStream is = DemoApplication.class.getResourceAsStream("/tmp/book.xml");
		String pathName = DemoApplication.class.getResourceAsStream("/tmp/book.xml").toString();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader reader = new BufferedReader(isr);
		String line = null;

		while((line = reader.readLine()) != null){
			System.out.println(line);
		}

		System.out.println(pathName);*/

		/*#################################################################################################*/

	}

	@Bean
	public String getName(){
		return "joekrom";
	}

}
