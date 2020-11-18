/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Jurusan;
import Model.Mahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import quizpbo_gui.Controller;

/**
 *
 * @author User
 */
public class InsertDataMahasiswaBaru extends JFrame implements ActionListener{
    JFrame frame;
    JTextField nim,nama,angkatan;
    JComboBox kode_Jurusan;
    ArrayList<Jurusan> listJurusan = Controller.getAllDataJurusan();
    String[] jurusanKode;
    JButton submit;
    public InsertDataMahasiswaBaru() {      
        
        frame = new JFrame("");
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        nim = new JTextField("NIM");
        nim.setBounds(30, 50, 100, 30);
        
        nama = new JTextField("Nama");
        nama.setBounds(30,80,100,30);
        
        angkatan = new JTextField("Angkatan");
        angkatan.setBounds(30, 110, 100, 30);
        
        jurusanKode = new String[listJurusan.size()];
        
        for(int i=0; i<listJurusan.size();i++){
            jurusanKode[i] = listJurusan.get(i).getKode();
        }
        
        
        kode_Jurusan = new JComboBox(jurusanKode);
        kode_Jurusan.setBounds(30, 140, 100, 30);

        submit = new JButton("Submit");
        submit.setBounds(100,170,100,30);
        submit.addActionListener(this);

        frame.add(nim);
        frame.add(nama);
        frame.add(angkatan);
        frame.add(submit);
        frame.add(kode_Jurusan);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        Mahasiswa student = new Mahasiswa();
        switch(command){
            case "Submit":
                student.setNama(nama.getText());
                student.setNim(nim.getText());
                student.setAngkatan(Integer.parseInt(angkatan.getText()));
                student.setKode_jurusan(kode_Jurusan.getItemAt(kode_Jurusan.getSelectedIndex()).toString());
                Controller.insertDataMahasiswaBaru(student);
                new MainMenu();
        }
    }
    
}
