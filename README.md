

# PA Laborator 12

[![Version](https://badge.fury.io/gh/tterb%2FHyde.svg)](https://badge.fury.io/gh/tterb%2FHyde)

## Students

  - Cojocariu Alexandru, II A2

## Description

This project implements support for creating a simple GUI by dynamically loading classes. It also has a module for saving as XML format.
I attached 4 pictures showing how the app works.

## Features

  - (Compulsory) Desired structure of project, 'applicationFrame' is the main JFrame and 'GeneralOptionsPanel', 'SideOptions' classes for different options to draw on the GUI.
  - (Compulsory) When drawing on screen a component, a class is also loaded
```
if (componentType.compareTo("javax.swing.JLabel") == 0) {  
    try {  
        Class instanceLoader = Class.forName(componentType);  
		JLabel drawLabel = (JLabel) instanceLoader.getConstructor().newInstance();  
		drawLabel = new JLabel(generalOptionsPanel.getTextComponent());  
		drawLabel.setBounds(e.getX() + offsetX, e.getY() + offsetY, 100, 100);  
		drawLabel.setVisible(true);  
		applicationFrame.add(drawLabel);  
		applicationFrame.repaint();  
  } catch (ClassNotFoundException | InstantiationException |  
            IllegalAccessException | NoSuchMethodException | InvocationTargetException E) {  
        System.err.println(E);  
  }  
}
```
 
 - (Compulsory) Components can be put anywhere on the canvas where the mouse is pressed like shown in the pictures
 - (Optional) 'DrawingSaverLoader' implements XML exporting with JavaBeans serialization 
 - (Optional) The user can modify the text of the component how he wants
## Not resolved

  - Bonus and the Introspector from optional 
  
