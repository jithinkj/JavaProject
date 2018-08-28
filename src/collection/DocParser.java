package collection;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DocParser {
    public static void main(String[] args) {
        try{
            File inputFile =new File("SampleXml.txt"); // File object creation

            //
            DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();

            Document doc=dBuilder.parse(inputFile); // parse file into document

            NodeList nList=doc.getElementsByTagName("food"); // get content inside food tag
            System.out.println("-------------------------------------------------------");

            //list loop
            for (int temp=0; temp<nList.getLength();temp++ ){
                Node nNode=nList.item(temp);
                System.out.println("\n Current Element: "+nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement =(Element) nNode;
                    System.out.println("First Name: "+eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Price: "+eElement.getElementsByTagName("price").item(0).getTextContent());
                    System.out.println("description: "+eElement.getElementsByTagName("description").item(0).getTextContent());

                    System.out.println("calories: "+eElement.getElementsByTagName("calories").item(0).getTextContent());

                }
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
