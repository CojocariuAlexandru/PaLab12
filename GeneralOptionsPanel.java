package com.company;
import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.*;

/**
*   Defines components attributes and add them on the main screen
*/

public class GeneralOptionsPanel{
    private int swingComponentX;
    private int swingComponentY;
    private int swingComponentWidth;
    private int swingComponentHeigth;

    private int swingComponentFormX;
    private int swingComponentFormY;
    private int swingComponentFormWidth;
    private int swingComponentFormHeigth;
    private String[] swingComponentOptions = {"javax.swing.JButton", "javax.swing.JLabel"};

    private int textX;
    private int textY;
    private int textWidth;
    private int textHeigth;

    private int textFormX;
    private int textFormY;
    private int textFormWidth;
    private int textFormHeigth;


    private JLabel swingComponentForm;
    private JComboBox swingComponentNumber;

    private JLabel textForm;
    private JTextField textInput;


    public GeneralOptionsPanel(){
        swingComponentX = 20;
        swingComponentY = 130;
        swingComponentWidth = 200;
        swingComponentHeigth = 30;

        swingComponentFormX = 180;
        swingComponentFormY = 130;
        swingComponentFormWidth = 500;
        swingComponentFormHeigth = 36;

        textX = 700;
        textY = 130;
        textWidth = 200;
        textHeigth = 36;

        textFormX = 900;
        textFormY = 130;
        textFormWidth = 200;
        textFormHeigth = 36;


        swingComponentForm = new JLabel("Component:");
        swingComponentNumber = new JComboBox(swingComponentOptions);

        textForm = new JLabel("Text componenta:");
        textInput = new JTextField();

    }

    /**
    *   Sets the bounds for buttons with the variables defined above and puts them on screen
    */
    public void drawOnScreen(JFrame mainFrame){
        swingComponentForm.setBounds(swingComponentX, swingComponentY, swingComponentWidth, swingComponentHeigth);
        swingComponentNumber.setBounds(swingComponentFormX, swingComponentFormY, swingComponentFormWidth, swingComponentFormHeigth);
        textForm.setBounds(textX, textY, textWidth, textHeigth);
        textInput.setBounds(textFormX, textFormY, textFormWidth, textFormHeigth);

        swingComponentForm.setFont(new Font("Serif", Font.BOLD, 30));
        swingComponentNumber.setFont(new Font("Serif", Font.BOLD, 30));
        textForm.setFont(new Font("Serif", Font.BOLD, 20));
        textInput.setFont(new Font("Serif", Font.BOLD, 30));

        swingComponentForm.setVisible(true);
        swingComponentNumber.setVisible(true);
        textForm.setVisible(true);
        textInput.setVisible(true);


        mainFrame.add(swingComponentForm);
        mainFrame.add(swingComponentNumber);
        mainFrame.add(textForm);
        mainFrame.add(textInput);
        mainFrame.repaint();
    }

    public String getComponentType(){
        return (String)swingComponentNumber.getSelectedItem();
    }

    public String getTextComponent(){
        return (String)textInput.getText();
    }


}
