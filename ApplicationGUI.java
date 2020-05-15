package com.company;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;

public class ApplicationGUI {
    public static JFrame applicationFrame;
    private static TitleDisplayPanel titleDisplayPanel;
    private static GeneralOptionsPanel generalOptionsPanel;
    private static Canvas drawingCanvas;
    private static SideOptions sideOptions;

    /**
    *   Define components and call the methods below
    */
    public ApplicationGUI() {
        setUpApplicationFrame();
        generalOptionsPanel = new GeneralOptionsPanel();
        titleDisplayPanel = new TitleDisplayPanel();
        drawingCanvas = new Canvas();
        sideOptions = new SideOptions();

        addComponentsToFrame();
    }

    /**
    *   Start the application by making functional the mouse listener
    */
    public void startApplication() {
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String componentType = generalOptionsPanel.getComponentType();
                if (componentType.compareTo("javax.swing.JLabel") == 0) {
                    try {
                        Class instanceLoader = Class.forName(componentType);
                        JLabel drawLabel = (JLabel) instanceLoader.getConstructor().newInstance();
                        drawLabel = new JLabel(generalOptionsPanel.getTextComponent());
                        drawLabel.setBounds(e.getX() + 20, e.getY() + 150, 100, 100);
                        drawLabel.setVisible(true);
                        applicationFrame.add(drawLabel);
                        applicationFrame.repaint();
                    } catch (ClassNotFoundException | InstantiationException |
                            IllegalAccessException | NoSuchMethodException | InvocationTargetException E) {
                        System.err.println(E);
                    }
                }
                else if(componentType.compareTo("javax.swing.JButton") == 0){
                    try {
                        Class instanceLoader = Class.forName(componentType);
                        JButton drawLabel = (JButton) instanceLoader.getConstructor().newInstance();
                        drawLabel = new JButton(generalOptionsPanel.getTextComponent());
                        drawLabel.setBounds(e.getX() + 20, e.getY() + 150, 100, 100);
                        drawLabel.setVisible(true);
                        applicationFrame.add(drawLabel);
                        applicationFrame.repaint();
                    } catch (ClassNotFoundException | InstantiationException |
                            IllegalAccessException | NoSuchMethodException | InvocationTargetException E) {
                        System.err.println(E);
                    }
                }
            }

            public void mouseDragged(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mouseMoved(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseWheelMoved(MouseWheelEvent e) {
            }
        };
        drawingCanvas.addMouseListener(mouseListener);
    }

    /**
    *   Set up general settings about the application window
    */
    private static void setUpApplicationFrame() {
        applicationFrame = new JFrame();
        applicationFrame.setResizable(false);
        applicationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        applicationFrame.setSize(1200, 1000);
        applicationFrame.setTitle("Drawing tool");
        applicationFrame.setLayout(null);
        applicationFrame.setVisible(true);
    }

    /**
    *   Add to the screen all the components
    */
    private static void addComponentsToFrame() {
        titleDisplayPanel.drawOnScreen(applicationFrame);
        generalOptionsPanel.drawOnScreen(applicationFrame);
        sideOptions.drawOnScreen(applicationFrame);

        drawingCanvas.setBounds(20, 200, 755, 755);
        applicationFrame.add(drawingCanvas);
    }

}
