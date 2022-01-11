package de.pantopix.demo;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

public class Transformator {

    public void transform (String sourceFile , String xsltFile, String resultFile){

        TransformerFactory tFactory = TransformerFactory.newInstance("net.sf.saxon.TransformerFactoryImpl", null);

        try{
            Transformer transformer = tFactory.newTransformer(new StreamSource(new File(xsltFile)));
            transformer.transform(new StreamSource(new File(sourceFile)), new StreamResult(new File(resultFile)));
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
