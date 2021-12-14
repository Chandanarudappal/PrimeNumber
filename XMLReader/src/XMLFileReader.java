import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLFileReader {

	public static void main(String[] args) throws ParserConfigurationException {
		// TODO Auto-generated method stub
		
		DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
		try {		
		     DocumentBuilder builder= factory.newDocumentBuilder();
		     
		     
			Document document = builder.parse(new File("mobiles.xml"));
		    document.getDocumentElement().normalize();
		    
		    NodeList mobileList = document.getElementsByTagName("mobile");
		    for(int i=0;i<mobileList.getLength();i++)
		    {
		     Node mobile= mobileList.item(i);
		     if(mobile.getNodeType()==Node.ELEMENT_NODE) {
		    	 Element mobileElement = (Element) mobile;
		    	 System.out.println("Mobile Company:"+ mobileElement.getAttribute("Company"));
		    	 
		    	 NodeList mobileSpecifications=mobile.getChildNodes();
		    	 for(int j=0;j<mobileSpecifications.getLength();j++) 
		    	 {
		    		 Node specification = mobileSpecifications.item(j);
		    		 if(specification.getNodeType()==Node.ELEMENT_NODE) 
		    		 {
		    		    Element specificationElement = (Element) specification;
		    		    System.out.println("   "+specificationElement.getTagName()+ ":"+ specificationElement.getAttribute("value")+ ":"+specificationElement.getAttribute("name"));
		    		    
		    		 }
		    	 }
		    	 
		     }
		    }
		}catch(ParserConfigurationException e) {
			e.printStackTrace();
		}catch(SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

