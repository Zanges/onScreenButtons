package com.zanges.onScreenButtons.template;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Zanges on 29.03.2016.
 */
public class BLessWindow {

    private JFrame frame = new JFrame();
    private Label label = new Label();

    public BLessWindow(String name, int w, int h) {
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setName(name);
        frame.setSize(w, h);
        label.setName(name);
        label.setText(name);
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return this.frame;
    }

    public Label getLabel() {
        return this.label;
    }

    public void rename(String name){
        this.label.setText(name);
        this.label.setName(name);
        this.frame.setName(name);
    }
}
