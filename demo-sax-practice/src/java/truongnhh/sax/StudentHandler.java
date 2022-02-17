/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongnhh.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author ADMIN
 */
public class StudentHandler extends DefaultHandler {

    private String id, username, password, currentTagName, fullname;
    private boolean foundUsername, foundPassword, found;
    private boolean dropoutStatus;

    public StudentHandler(String username, String password) {
        this.username = username;
        this.password = password;
        foundUsername = false;
        foundPassword = false;
        found = false;
        dropoutStatus = false;
        currentTagName = "";
        fullname = "";
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes); //To change body of generated methods, choose Tools | Templates.
        if (!found) {
            currentTagName = qName;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length); //To change body of generated methods, choose Tools | Templates.
        if (!found) {
            String str = new String(ch, start, length);
            if (currentTagName.equals("username")) {
                foundUsername = str.trim().equals(username);
            }

            if (foundUsername) {
                if (currentTagName.equals("lastname")) {
                    fullname = str.trim();
                } else if (currentTagName.equals("middlename")) {
                    fullname = fullname + " " + str.trim();
                } else if (currentTagName.equals("firstname")) {
                    fullname = fullname + " " + str.trim();
                } else if (currentTagName.equals("password")) {
                    foundPassword = str.trim().equals(password);
                } else if (currentTagName.equals("status")) {
                    if (str.trim().equals("dropout")) {
                        dropoutStatus = true;
                    }else if (!str.trim().equals("dropout") && foundPassword) {
                        found = true;
                    }
                }
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName); //To change body of generated methods, choose Tools | Templates.
        if (!found) {
            currentTagName = "";
            if (qName.equals("student")) {
                foundUsername = false;
                foundPassword = false;
            }
        }
    }

    public boolean isFound() {
        return found;
    }
    
    public boolean isDropoutStatus() {
        return dropoutStatus;
    }

    public String getFullname() {
        return fullname;
    }

}
