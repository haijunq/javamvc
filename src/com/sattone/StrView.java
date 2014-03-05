package com.sattone;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class StrView extends JFrame {
    private StrModel strModel;
    private JTextField textFieldInput;
    private JTextField textFieldOutput;
    private JButton revButton;
    private JButton clrButton;
    
    public StrView(StrModel strModel) {
        super("Reverse String");
        this.strModel = strModel;
        setLayout(new FlowLayout());
        
        textFieldInput = new JTextField("", 20);
        add(textFieldInput);
        
        textFieldOutput = new JTextField("", 20);
        textFieldOutput.setEditable(false);
        add(textFieldOutput);
        
        revButton = new JButton("Reverse");
        add(revButton);
        
        clrButton = new JButton("Clear");
        add(clrButton);
        
        StrController strController = new StrController(StrView.this, strModel);
        revButton.addActionListener(strController);
        clrButton.addActionListener(strController);
    }

    public StrModel getStrModel() {
        return strModel;
    }

    public void setStrModel(StrModel strModel) {
        this.strModel = strModel;
    }

    public JTextField getTextFieldInput() {
        return textFieldInput;
    }

    public void setTextFieldInput(JTextField textFieldInput) {
        this.textFieldInput = textFieldInput;
    }

    public JTextField getTextFieldOutput() {
        return textFieldOutput;
    }

    public void setTextFieldOutput(JTextField textFieldOutput) {
        this.textFieldOutput = textFieldOutput;
    }

    public JButton getRevButton() {
        return revButton;
    }

    public JButton getClrButton() {
        return clrButton;
    }
    
    
}
