package com.company;
import jdk.management.resource.internal.inst.AbstractPlainDatagramSocketImplRMHooks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.WindowEvent;

public class SideOptions {
    private int saveButtonX;
    private int saveButtonY;
    private int saveButtonWidth;
    private int saveButtonHeigth;

    private int exitButtonX;
    private int exitButtonY;
    private int exitButtonWidth;
    private int exitButtonHeigth;

    private JButton saveButton;
    private JButton exitButton;
    private MouseListener mouseListenerSave;
    private MouseListener mouseListenerExit;

    private DrawingSaverLoader drawingSaverLoader;

    public SideOptions() {
        saveButtonX = 800;
        saveButtonY = 600;
        saveButtonWidth = 200;
        saveButtonHeigth = 36;


        exitButtonX = 800;
        exitButtonY = 912;
        exitButtonWidth = 200;
        exitButtonHeigth = 36;

        saveButton = new JButton("Save");
        exitButton = new JButton("Exit");
        drawingSaverLoader = new DrawingSaverLoader();

        setUpListenerSave();
        setUpListenerExit();
    }

    public void drawOnScreen(JFrame mainFrame) {
        saveButton.setBounds(saveButtonX, saveButtonY, saveButtonWidth, saveButtonHeigth);
        exitButton.setBounds(exitButtonX, exitButtonY, exitButtonWidth, exitButtonHeigth);

        saveButton.setFont(new Font("Serif", Font.ITALIC, 24));
        exitButton.setFont(new Font("Serif", Font.ITALIC, 24));

        saveButton.setVisible(true);
        exitButton.setVisible(true);

        mainFrame.add(saveButton);
        mainFrame.add(exitButton);
    }

    private void setUpListenerSave(){
        mouseListenerSave = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                drawingSaverLoader.saveDrawing();
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
        saveButton.addMouseListener(mouseListenerSave);
    }

    private void setUpListenerExit(){
        mouseListenerExit = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                https://stackoverflow.com/questions/1234912/how-to-programmatically-close-a-jframe
                ApplicationGUI.applicationFrame.dispatchEvent(new WindowEvent(ApplicationGUI.applicationFrame, WindowEvent.WINDOW_CLOSING));
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
        exitButton.addMouseListener(mouseListenerExit);
    }
}