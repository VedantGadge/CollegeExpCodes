import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
class Exp14_a extends JFrame implements ActionListener { 
JFrame frame; 
JLabel label1, label2; 
JTextField textField1, outputTextField; 
JPasswordField passwordField; 
JButton okButton, resetButton; 
Exp14_a() { 
frame = new JFrame("Login Test"); 
textField1 = new JTextField(10); 
label1 = new JLabel("Username"); 
outputTextField = new JTextField(20); 
label2 = new JLabel("Password"); 
passwordField = new JPasswordField(10); 
okButton = new JButton("OK"); 
resetButton = new JButton("Reset"); 
frame.setLayout(new FlowLayout()); 
frame.add(label1); 
frame.add(textField1); 
frame.add(label2); 
frame.add(passwordField); 
frame.add(okButton); 
frame.add(resetButton); 
frame.add(outputTextField); 
okButton.addActionListener(this); 
resetButton.addActionListener(this); 
frame.setSize(500, 100); 
frame.setVisible(true); 
} 
public void actionPerformed(ActionEvent e) { 
if (e.getSource() == okButton) { 
String username = textField1.getText(); 
String password = String.valueOf(passwordField.getPassword()); 
if (username.equals("VG") && password.equals("VG10")) { 
outputTextField.setText("Welcome, Vedant Gadge!"); 
} else { 
outputTextField.setText("Invalid username or password!"); 
} 
} else if (e.getSource() == resetButton) { 
textField1.setText(""); 
passwordField.setText(""); 
outputTextField.setText(""); 
} 
} 
public static void main(String args[]) { 
Exp14_a loginEvent = new Exp14_a(); 
} 
}