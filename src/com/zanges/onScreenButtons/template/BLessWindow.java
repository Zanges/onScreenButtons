package com.zanges.onScreenButtons.template;

import javax.swing.*;

/**
 * Created by Zanges on 29.03.2016.
 */
public class BLessWindow {

    JFrame frame = new JFrame();

    public BLessWindow(String label, int w, int h) {
        frame.setUndecorated(true);
        frame.setName(label);
        frame.setSize(w, h);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return this.frame;
    }

}
