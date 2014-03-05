package com.sattone;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class StrController implements ActionListener {
    private StrView strView;
    private StrModel strModel;
    
    public StrController(StrView strView, StrModel strModel) {
        this.strView = strView;
        this.strModel = strModel; 
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
//        JOptionPane.showMessageDialog(this.strView, "hehe");
        
        if (event.getSource() == strView.getRevButton()) {
            strModel.setStr(strView.getTextFieldInput().getText());
            strView.update(strModel);
        }
        
        if (event.getSource() == strView.getClrButton()) {
            strModel.setStr("");
            strView.update(strModel);
        }
    }
}
