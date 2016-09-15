/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;
import java.util.LinkedList;
import org.w3c.dom.*;
/**
 *
 * @author Steven
 */
public class SerializadorHelper {
    
    public static Element createNode(Document doc, Element padre, String label){
        Element objetoNodo = doc.createElement(label);
        padre.appendChild(objetoNodo);
        return objetoNodo;
    }
    
    public static void createTextNode(Document doc, Element e, String label, Object value){
        Element objetoNodo = doc.createElement(label);
        objetoNodo.appendChild(doc.createTextNode(value.toString())); 
        e.appendChild(objetoNodo);
    }
    
    public static Node getNode(String tagName, NodeList nodes) {
        for (int x = 0; x < nodes.getLength(); x++) {
            Node node = nodes.item(x);
            if (node.getNodeName().equalsIgnoreCase(tagName)) {
                return node;
            }
        }
        return null;
    }
    
    public static LinkedList<Node> iterator(String tagName, Node nodoRoot){        
        NodeList hijosLista = getNode(tagName, nodoRoot).getChildNodes();
        LinkedList<Node> salida = new LinkedList<>();
        for (int i = 0; i < hijosLista.getLength(); i++) {
            Node actual = hijosLista.item(i);
            if (actual.getNodeType() == Node.ELEMENT_NODE) {
                salida.add(actual);
            }
        }
        return salida;
    }
    
    
     public static Node getNode(String tagName, Node padre) {
        NodeList nodes = padre.getChildNodes();
        for (int x = 0; x < nodes.getLength(); x++) {
            Node node = nodes.item(x);
            if (node.getNodeName().equalsIgnoreCase(tagName)) {
                return node;
            }
        }
        return null;
    }

    public static String getNodeValue(Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int x = 0; x < childNodes.getLength(); x++) {
            Node data = childNodes.item(x);
            if (data.getNodeType() == Node.TEXT_NODE) {
                return data.getNodeValue();
            }
        }
        return "";
    }

    public static String getNodeValue(String tagName, NodeList nodes) {
        for (int x = 0; x < nodes.getLength(); x++) {
            Node node = nodes.item(x);
            if (node.getNodeName().equalsIgnoreCase(tagName)) {
                NodeList childNodes = node.getChildNodes();
                for (int y = 0; y < childNodes.getLength(); y++) {
                    Node data = childNodes.item(y);
                    if (data.getNodeType() == Node.TEXT_NODE) {
                        return data.getNodeValue();
                    }
                }
            }
        }
        return "";
    }

    public static String getNodeAttr(String attrName, Node node) {
        NamedNodeMap attrs = node.getAttributes();
        for (int y = 0; y < attrs.getLength(); y++) {
            Node attr = attrs.item(y);
            if (attr.getNodeName().equalsIgnoreCase(attrName)) {
                return attr.getNodeValue();
            }
        }
        return "";
    }

    public static String getNodeAttr(String tagName, String attrName, NodeList nodes) {
        for (int x = 0; x < nodes.getLength(); x++) {
            Node node = nodes.item(x);
            if (node.getNodeName().equalsIgnoreCase(tagName)) {
                NodeList childNodes = node.getChildNodes();
                for (int y = 0; y < childNodes.getLength(); y++) {
                    Node data = childNodes.item(y);
                    if (data.getNodeType() == Node.ATTRIBUTE_NODE) {
                        if (data.getNodeName().equalsIgnoreCase(attrName)) {
                            return data.getNodeValue();
                        }
                    }
                }
            }
        }
        return "";
    }
}
