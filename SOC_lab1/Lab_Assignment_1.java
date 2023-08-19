import javax.xml.parsers.*; 
import org.w3c.dom.*;
import java.io.File;  


public class Lab_Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try   
		{  
		File file = new File("E-Ticketing XML.xml");  
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
		
		DocumentBuilder db = dbf.newDocumentBuilder();  
		Document doc = db.parse(file);  
		doc.getDocumentElement().normalize();  
		
		NodeList nodeList = doc.getElementsByTagName("ticket");  
		
		for (int i = 0; i < nodeList.getLength(); i++)   
		{  
		Node node = nodeList.item(i);  
		System.out.println("\nNode Name :" + node.getNodeName());  
		if (node.getNodeType() == Node.ELEMENT_NODE)   
		{  
		Element eElement = (Element) node;  
		System.out.println("Movie Name: "+ eElement.getElementsByTagName("movie").item(0).getTextContent());
		System.out.println("Theatre: "+ eElement.getElementsByTagName("theatre").item(0).getTextContent());  
		System.out.println("Date: "+ eElement.getElementsByTagName("date").item(0).getTextContent());  
		System.out.println("Time: "+ eElement.getElementsByTagName("time").item(0).getTextContent());  
		System.out.println("Seats: "+ eElement.getElementsByTagName("seats").item(0).getTextContent());  
		
		}  
		}  
		}   
		catch (Exception e)   
		{  
		e.printStackTrace();  
		}  

	}

}
