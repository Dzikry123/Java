//package PBO2;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class SumCalculator extends JFrame {
//    private JTextField textField1;
//    private JTextField textField2;
//    private JButton calculateButton;
//
//    public SumCalculator() {
//        setTitle("Penjumlahan");
//        setSize(300, 150);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new FlowLayout());
//
//        textField1 = new JTextField(10);
//        textField2 = new JTextField(10);
//        calculateButton = new JButton("Jumlahkan");
//
//        calculateButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    int num1 = Integer.parseInt(textField1.getText());
//                    int num2 = Integer.parseInt(textField2.getText());
//                    int sum = num1 + num2;
//
//                    JOptionPane.showMessageDialog(null, "Jumlah: " + sum);
//                } catch (NumberFormatException ex) {
//                    JOptionPane.showMessageDialog(null, "Input salah!");
//                }
//            }
//        });
//
//        add(new JLabel("Number 1: "));
//        add(textField1);
//        add(new JLabel("Number 2: "));
//        add(textField2);
//        add(calculateButton);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new SumCalculator().setVisible(true);
//            }
//        });
//    }
//    }