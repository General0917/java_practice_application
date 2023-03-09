package list10_6;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.*;

public class list10_6 {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        InputStream is = new FileInputStream("C:\\Users\\General\\Documents\\Practice\\Java\\application\\chapter10\\src\\main\\java\\list10_6\\list10_6.xml");
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);

        Element hero = doc.getDocumentElement();
        Element weapon = findChildByTag(hero, "weapon");
        Element power = findChildByTag(weapon, "attack");
        String power_value = power.getTextContent();
        String weapon_value = weapon.getTextContent();
        String hero_value = hero.getTextContent();


        System.out.println(power_value);
        System.out.println(weapon_value);
        System.out.println(hero_value);
    }

    // 指定された名前を持つタグの最初の子タグを返す
    static Element findChildByTag (Element self, String name) throws IOException {
        NodeList children = self.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            if (children.item(i) instanceof Element) {
                Element e = (Element) children.item(i);
                if (e.getTagName().equals(name)) {
                    return e;
                }
            }
        }
        return null;
    }
}
