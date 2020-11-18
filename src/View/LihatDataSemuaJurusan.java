/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Jurusan;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import quizpbo_gui.Controller;

/**
 *
 * @author User
 */
public class LihatDataSemuaJurusan {
    JFrame frame;
    JTextField tf;
    ArrayList<Jurusan> listJurusan = Controller.getAllDataJurusan();
    JTable tabelJurusan;
    public LihatDataSemuaJurusan() {
        frame = new JFrame("");
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        

        DefaultTableModel model = new DefaultTableModel();
        //DefaultTableModel model = (DefaultTableModel) tabelJurusan.getModel();
        Object rowData[] = new Object[listJurusan.size()];
        

        String data[][]={{}};
        String Column[]={"Jurusan"};
        
        for(int i=0; i<listJurusan.size();i++){
            
        }
        
        tabelJurusan = new JTable(model);
        tabelJurusan.setBounds(30,40,200,300);
        
        frame.add(tabelJurusan);
        frame.setLayout(null);
        frame.setVisible(true);        
    }
    
}
