package LayoutText;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrontPage  extends  Frame   {
    public FrontPage() {
        this.setLayout(null);
        this.setSize(400, 300);
        this.setVisible(true);
        this.add(T1);
        this.add(T2);
        this.add(L1);
        this.add(B1);
        this.add(B2);
        this.add(B3);
        this.add(B4);
        this.add(B5);
        this.add(B6);
        this.add(B7);

       T1.setText(" ");
       T2.setText(" ");
       T1.setBounds(50,50,50,20);
       T2.setBounds(150,50,50,20);
       L1.setBounds(50,70,250,30);
       B1.setBounds(50,100,50,40);
       B2.setBounds(110,100,50,40);
       B3.setBounds(170,100,50,40);
       B4.setBounds(230,100,50,40);
       B5.setBounds(50,160,50,40);
       B6.setBounds(110,160,50,40);
       B7.setBounds(170,160,50,40);





        B1.addActionListener(_ -> {
            double a = Double.parseDouble(T1.getText());
            double b = Double.parseDouble(T2.getText());
            L1.setText(Double.toString(MethodOperation.add(a,b)));

        });

        B2.addActionListener(_ -> {
            double a = Double.parseDouble(T1.getText());
            double b = Double.parseDouble(T2.getText());
            L1.setText(Double.toString(MethodOperation.subs(a,b)));

        });

        B3.addActionListener(_ -> {
            double a = Double.parseDouble(T1.getText());
            double b = Double.parseDouble(T2.getText());
            L1.setText(Long.toString(MethodOperation.multi(a,b)));

        });

         B4.addActionListener(_ -> {
             double a = Double.parseDouble(T1.getText());
             double b = Double.parseDouble(T2.getText());
             if(b==0){   L1.setText("Can't Divided by Zero");}
             else {
                 L1.setText(Double.toString(MethodOperation.divi(a, b)));
             }
         });

         B5.addActionListener(_ -> {
             double a = Double.parseDouble(T1.getText());
             double b = Double.parseDouble(T2.getText());
             L1.setText(Double.toString(MethodOperation.module(a,b)));

         });

         B6.addActionListener(_ -> {
             double a = Double.parseDouble(T1.getText());
             double b = Double.parseDouble(T2.getText());
             if(a==0){  L1.setText("0");}
             else if(b==0){
                 L1.setText("1");
             }
             else {
                 L1.setText(Double.toString(MethodOperation.sqr(a, b)));
             }
         });

         B7.addActionListener(_ -> {
             double a = Double.parseDouble(T1.getText());
             double b = Double.parseDouble(T2.getText());

             L1.setText(Double.toString(MethodOperation.sqrt(a,b)));

         });





        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(
                        null, "Are you sure you want to close?",
                        "Confirmation", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    dispose(); // Close the current window
                    System.exit(0); // Exit the application
                }
            }
        });



    }
    TextField T1 = new TextField();
     TextField T2= new TextField();
     Label L1 = new Label("ANS Shown here:");
     Button B1 = new Button("+");
    Button B2 = new Button("-");
    Button B3 = new Button("*");
    Button B4 = new Button("/");
    Button B5 = new Button("%");
    Button B6 = new Button("SQR");
    Button B7 = new Button("SQRT");





    }




