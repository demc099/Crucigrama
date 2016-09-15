
package xml;

import org.w3c.dom.*;

public interface Serializable {
    void serializar(Document doc, Element nodo);
    // void deserializar(Node e);
    // static T deserializar(Node e);
}
