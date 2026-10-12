package com.mycompany.openday;
import javax.swing.*;
import java.awt.*;
public class Openday extends JFrame {
public Openday() {
setTitle("CYBER_TERMINAL v1.0 - Open Day");
setSize(700, 500);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
JPanel panel = new JPanel();
panel.setBackground(Color.BLACK);
panel.setLayout(null); 
 add(panel);
JLabel lblPassword = new JLabel("PASSWORD:");
lblPassword.setForeground(new Color(0, 255, 102)); // Verde brillante stile Matrix
lblPassword.setFont(new Font("Courier New", Font.BOLD, 16));
lblPassword.setBounds(150, 180, 120, 25);
panel.add(lblPassword);
JTextField txtInput = new JTextField();
 txtInput.setBackground(Color.BLACK);
txtInput.setForeground(new Color(0, 255, 102));
txtInput.setCaretColor(new Color(0, 255, 102));
txtInput.setFont(new Font("Courier New", Font.PLAIN, 16));
txtInput.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 102)));
txtInput.setBounds(270, 180, 220, 25);
panel.add(txtInput);
JButton btnInvio = new JButton("INVIA");
btnInvio.setBackground(Color.BLACK);
btnInvio.setForeground(new Color(0, 255, 102));
btnInvio.setFont(new Font("Courier New", Font.BOLD, 14));
btnInvio.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 102)));
btnInvio.setBounds(290, 230, 100, 30);
 btnInvio.addActionListener(e -> {
 String passwordInserita = txtInput.getText();           
if (passwordInserita.isEmpty()) {
JOptionPane.showMessageDialog(this, "Inserisci prima una password!", "Errore", JOptionPane.ERROR_MESSAGE);
} else {
System.out.println("Password valida: " + passwordInserita);}
});
panel.add(btnInvio);
    }public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Openday().setVisible(true);
        });
    }
}