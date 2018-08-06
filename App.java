
package com.main;

import com.admin.AdminScreenMain;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
            new AdminScreenMain();//anonymous way of ceating object
            }
        
        });
    }
  
}
