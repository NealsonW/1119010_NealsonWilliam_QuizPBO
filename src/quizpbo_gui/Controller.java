/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizpbo_gui;

import Model.Jurusan;
import Model.Mahasiswa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Controller {
    static DatabaseHandler conn = new DatabaseHandler();

    public static ArrayList<Mahasiswa> getAllDataMahasiswaJurusan(String kodeJurusan) {
        ArrayList<Mahasiswa> students = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM mahasiswa WHERE jurusan='" + kodeJurusan + "'";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Mahasiswa student = new Mahasiswa();
                student.setAngkatan(rs.getInt("angkatan"));
                student.setNama(rs.getString("nama"));
                student.setNim(rs.getString("nim"));
                student.setKode_jurusan(rs.getString("kode_jurusan"));
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (students);
    }
    public static ArrayList<Jurusan> getAllDataJurusan() {
        ArrayList<Jurusan> jurusans = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM jurusan";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Jurusan jurusan = new Jurusan();
                jurusan.setKode(rs.getString("kode"));
                jurusan.setNama(rs.getString("nama"));
                jurusans.add(jurusan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (jurusans);
    }
    
    public static boolean insertDataJurusanBaru(Jurusan jurusan) {
        conn.connect();
        String query = "INSERT INTO jurusan VALUES(?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, jurusan.getKode());
            stmt.setString(2, jurusan.getNama());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    public static boolean insertDataMahasiswaBaru(Mahasiswa mahasiswa) {
        conn.connect();
        String query = "INSERT INTO mahasiswa VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, mahasiswa.getNim());
            stmt.setString(2, mahasiswa.getNama());
            stmt.setInt(3, mahasiswa.getAngkatan());
            stmt.setString(4, mahasiswa.getKode_jurusan());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    
}
