package com.sattone;

import javax.swing.JFrame;

public class MVCDriver {

    public static void main(String[] args) {
        StrModel model = new StrModel("");
        StrView view = new StrView(model);
        StrController controller = new StrController(view, model);
        
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(300, 150);
        view.setVisible(true);
    }

}
