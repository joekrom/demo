package de.pantopix.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.CodeSource;
import java.util.Properties;

import net.sf.saxon.s9api.Processor;
import org.xmlresolver.Resolver;

public class XslTNG {

    protected static String catalogFile = null;
    protected static Properties configProperties = null;
    protected static String version = null;
    protected static String resourcesVersion = null;
    protected String resolverVersion = null;
    protected String classLoc = null;
    protected String jarLoc = null;

    public XslTNG(){
        CodeSource src = XslTNG.class.getProtectionDomain().getCodeSource();
        classLoc = src.getLocation().toString();

        try {
            Method version = Resolver.class.getMethod("version");
            resolverVersion = (String) version.invoke(null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
