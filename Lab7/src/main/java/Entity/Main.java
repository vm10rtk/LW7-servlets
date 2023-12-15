package Entity;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File("src/main/java/Entity/Pigs.xml"));

        NodeList pigiElements = document.getDocumentElement().getElementsByTagName("pig");

        for (int i = 0; i < pigiElements.getLength(); i++) {
            Node pigi = pigiElements.item(i);

            NamedNodeMap attributes = pigi.getAttributes();
            PigList pigList = PigList.getInstance();
            pigList.addPig(PigFactory.createPig(attributes.getNamedItem("name").getNodeValue(), attributes.getNamedItem("type").getNodeValue(), attributes.getNamedItem("image").getNodeValue()));

        }

        for (Pig pig : PigList.getInstance().getPigs() ) {

            System.out.println(String.format("Информации о Тестировщике: имя - %s, Должность - %s.", pig.getName(), pig.getType()));
            System.out.println("Ссылка на изображение: " + pig.getImageURL());
        }
    }
}
