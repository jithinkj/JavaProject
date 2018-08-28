package collection;

import jdk.internal.util.xml.impl.Parser;
import org.w3c.dom.UserDataHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SaxUserHandler extends DefaultHandler {
    boolean Name= false;
    boolean price= false;
    boolean description= false;
    boolean calories= false;


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("food")){
            String label =attributes.getValue("label");
            System.out.println("label:" + label);
//            System.out.println(qName);
        }
        else if (qName.equalsIgnoreCase("name")){
            Name=true;
        }
        else if (qName.equalsIgnoreCase("price")){
            price=true;
        }
        else if (qName.equalsIgnoreCase("description")){
            description=true;
        }
        else if (qName.equalsIgnoreCase("calories")){
            calories=true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equalsIgnoreCase("food")){
            System.out.println("End element "+qName);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if(Name){
            String s=new String(ch,start,length);
            System.out.println("name : "+s);
            Name=false;
        }
        else if(price){
            System.out.println("price : "+new String(ch,start,length));
            price=false;
        }
        else if(description){
            System.out.println("description : "+new String(ch,start,length));
            description=false;
        }
        else if(calories){
            System.out.println("calories : "+new String(ch,start,length));
            calories=false;
        }
    }

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        File inputFile = new File("SampleXml.txt");
        SAXParserFactory factory=SAXParserFactory.newInstance();
        SAXParser saxParser=factory.newSAXParser();
        SaxUserHandler userHandler= new SaxUserHandler();
        saxParser.parse(inputFile,userHandler);
    }
}
