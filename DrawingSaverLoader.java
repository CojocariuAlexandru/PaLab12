//XML encoding tutorial:
//https://examples.javacodegeeks.com/core-java/beans/bean-xml-serialization/

package com.company;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
*   Call the XML encoder for the optional task
*/

public class DrawingSaverLoader {
    public void saveDrawing(){
        try{
            XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("gui.xml")));
            encoder.writeObject(ApplicationGUI.applicationFrame);
            encoder.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }

}
