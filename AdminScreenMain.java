
package com.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
import javax.swing.*;

public class AdminScreenMain extends JFrame{
    //copying from jframe i.e AdminScreen.java sorce code
 // Variables declaration - do not modify                     
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration                   

    public AdminScreenMain() {
        addComponents();//method used to initialige the instatnce vaiable and code copied frm AdminScreen.java sorce code
        setVisible(true);
        setSize(800, 600);
    }

    private void addComponents() {
        /*jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();*/
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenuItem3 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem4 = new JMenuItem();
        jMenuItem5 = new JMenuItem();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       /* setVisible(true);
        not good practice to do here 
        do in cnstructor
        */
         jMenu1.setText("File");

        jMenuItem1.setText("Book Patient Appointment");
        jMenu1.add(jMenuItem1);

        jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                BookApptMain bam=new BookApptMain();
                bam=null;
            }
        });
        jMenuItem2.setText("Cancel Appointment");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Check Patient info");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem4.setText("View All Today's Appointment");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("View All Tommorrow's Appointment");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

       /* pack();
        in pack method we dont need to give size for frame 
        it assume by default size which is created by frme
        
        insteed of pack --see we do in Admn contructor as above
        
        */
    }
    
}
