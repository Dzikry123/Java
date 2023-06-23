package pboInheritance;

import java.awt.FlowLayout;

import javax.swing.*;

public class GUIExample {
    public static void main(String[] args) {
        // Membuat frame (jendela) utama
        JFrame frame = new JFrame("Contoh GUI Swing");

        // Mengatur ukuran frame
        frame.setSize(400, 300);

        // Mengatur tata letak frame menggunakan layout manager
        frame.setLayout(new FlowLayout());

        // Membuat label
        JLabel label = new JLabel("Halo, Selamat Datang!");

        // Menambahkan label ke dalam frame
        frame.add(label);

        // Membuat tombol
        JButton button = new JButton("Klik Disini");

        // Menambahkan aksi (event listener) pada tombol
        button.addActionListener(e -> {
            // Ketika tombol diklik, akan muncul dialog pesan
            JOptionPane.showMessageDialog(frame, "Tombol telah diklik!");
        });

        // Menambahkan tombol ke dalam frame
        frame.add(button);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
