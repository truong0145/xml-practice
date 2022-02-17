/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongnhh.utils;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author ADMIN
 */
public class XMLUtil {
    
    public static void parseFileWithSAX(String filePath, DefaultHandler saxObj) throws Exception{
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser parser = spf.newSAXParser();
        File file = new File(filePath);
        parser.parse(file, saxObj);
    }
}
