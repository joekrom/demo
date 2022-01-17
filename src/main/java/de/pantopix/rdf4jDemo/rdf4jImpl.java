package de.pantopix.rdf4jDemo;

import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;

public  class rdf4jImpl {
    private static String filePath = "/rdf-files/test.rdf";

    public rdf4jImpl() {
    }

    public void transform(){
       /* Model model = Rio.parse(rdf4jImpl.class.getResourceAsStream(filePath), "", RDF)*/
        RDFFormat format = Rio.getParserFormatForFileName(filePath).orElse(RDFFormat.RDFXML);
        System.out.println(format.getName());
    }
}
