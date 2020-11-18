/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Jurusan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import quizpbo_gui.Controller;

/**
 *
 * @author User
 */
public class InsertJurusanBaru extends JFrame implements ActionListener{
    JFrame frame;
    JTextField tambahNamaJurusan,tambahKodeJurusan;
    JButton submit;
    public InsertJurusanBaru() {
        frame = new JFrame("Insert Data Jurusan Baru");
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        tambahNamaJurusan = new JTextField("Menambah Nama Jurusan");
        tambahNamaJurusan.setBounds(30, 100, 100, 30);
        
        tambahKodeJurusan = new JTextField("Menambah Kode Jurusan");
        tambahKodeJurusan.setBounds(30, 130, 100, 30);
        
        submit = new JButton("Submit");
        submit.setBounds(100, 160, 100, 30);
        submit.addActionListener(this);
        
        frame.add(submit);
        frame.add(tambahNamaJurusan);
        frame.add(tambahKodeJurusan);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Jurusan jurusan = new Jurusan();
        String command = ae.getActionCommand();
        switch(command){
            case "Submit":
                jurusan.setNama(tambahNamaJurusan.getText());
                jurusan.setKode(tambahKodeJurusan.getText());
                Controller.insertDataJurusanBaru(jurusan);
                new MainMenu();
            default:
                break;
        }

    }
    
}
