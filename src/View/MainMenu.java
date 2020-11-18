/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author User
 */
public class MainMenu extends JFrame implements ActionListener{
    JFrame frame;
    JButton insertData,semuaData,dataMhsBaru,dataPerJurusan;
    public MainMenu() {
        frame = new JFrame("");
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        insertData = new JButton("Insert Data Jurusan Baru");
        insertData.setBounds(30,50,300,30);
        insertData.addActionListener(this);
        
        semuaData = new JButton("Lihat Data Semua Jurusan");
        semuaData.setBounds(30, 80, 300, 30);
        semuaData.addActionListener(this);
        
        dataMhsBaru = new JButton("Insert Data Mahasiswa Baru");
        dataMhsBaru.setBounds(30, 130, 300, 30);
        dataMhsBaru.addActionListener(this);
        
        dataPerJurusan = new JButton("Lihat Data Mahasiswa Per Jurusan");
        dataPerJurusan.setBounds(30,150,300,30);
        dataPerJurusan.addActionListener(this);
        
        frame.add(insertData);
        frame.add(semuaData);
        frame.add(dataMhsBaru);
        frame.add(dataPerJurusan);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        
        switch(command){
            case "Insert Data Jurusan Baru":
                new InsertJurusanBaru();
                break;
            case "Lihat Data Semua Jurusan": 
                new LihatDataSemuaJurusan();
                break;
            case "Insert Data Mahasiswa Baru":
                new InsertDataMahasiswaBaru();
                break;
            case "Lihat Data Mahasiswa Per Jurusan":
                break;
            default:
                break;
        }
    }
    
}
