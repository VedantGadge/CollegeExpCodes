import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 
class Exp14_b extends JFrame implements ActionListener { 
double num1 = 0, num2 = 0, result = 0; 
JTextField textField; 
JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, 
button9, buttonAdd, buttonSubtract, buttonDivide, buttonMultiply, buttonDecimal, 
buttonClear, buttonEquals; 
int operator = 0; 
Exp14_b() { 
button0 = new JButton("0"); 
button1 = new JButton("1"); 
button2 = new JButton("2"); 
button3 = new JButton("3"); 
button4 = new JButton("4"); 
button5 = new JButton("5"); 
button6 = new JButton("6"); 
button7 = new JButton("7"); 
button8 = new JButton("8"); 
button9 = new JButton("9"); 
buttonAdd = new JButton("+"); 
        buttonSubtract = new JButton("-"); 
        buttonDivide = new JButton("/"); 
        buttonMultiply = new JButton("*"); 
        buttonEquals = new JButton("="); 
        buttonDecimal = new JButton("."); 
        buttonClear = new JButton("C"); 
 
        textField = new JTextField(20); 
        textField.setSize(10, 10); 
 
        JPanel panel = new JPanel(); 
 
        buttonMultiply.addActionListener(this); 
        buttonDivide.addActionListener(this); 
        buttonSubtract.addActionListener(this); 
        buttonAdd.addActionListener(this); 
        button9.addActionListener(this); 
        button8.addActionListener(this); 
        button7.addActionListener(this); 
        button6.addActionListener(this); 
        button5.addActionListener(this); 
        button4.addActionListener(this); 
        button3.addActionListener(this); 
        button2.addActionListener(this); 
        button1.addActionListener(this); 
        button0.addActionListener(this); 
        buttonDecimal.addActionListener(this); 
        buttonClear.addActionListener(this); 
        buttonEquals.addActionListener(this); 
 
        panel.add(textField); 
        panel.add(buttonAdd); 
        panel.add(button1); 
        panel.add(button2); 
        panel.add(button3); 
        panel.add(buttonSubtract); 
        panel.add(button4); 
        panel.add(button5); 
        panel.add(button6); 
        panel.add(buttonMultiply); 
        panel.add(button7); 
        panel.add(button8); 
        panel.add(button9); 
        panel.add(buttonDivide); 
        panel.add(buttonDecimal); 
        panel.add(button0); 
        panel.add(buttonClear); 
        panel.add(buttonEquals); 
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        panel.setBackground(Color.blue); 
        add(panel); 
        setSize(235, 235); 
        setVisible(true); 
    } 
 
    public void actionPerformed(ActionEvent e) { 
        String command = e.getActionCommand(); 
 
        if (command.matches("[0-9]")) { 
            textField.setText(textField.getText().concat(command)); 
        } else if (command.equals(".")) { 
            textField.setText(textField.getText().concat(".")); 
        } else if (command.equals("+")) { 
            num1 = Double.parseDouble(textField.getText()); 
            operator = 1; 
            textField.setText(""); 
        } else if (command.equals("-")) { 
            num1 = Double.parseDouble(textField.getText()); 
            operator = 2; 
            textField.setText(""); 
        } else if (command.equals("*")) { 
            num1 = Double.parseDouble(textField.getText()); 
            operator = 3; 
            textField.setText(""); 
        } else if (command.equals("/")) { 
            num1 = Double.parseDouble(textField.getText()); 
            operator = 4; 
            textField.setText(""); 
        } else if (command.equals("=")) { 
            num2 = Double.parseDouble(textField.getText()); 
            switch (operator) { 
                case 1: 
                    result = num1 + num2; 
                    break; 
                case 2: 
                    result = num1 - num2; 
                    break; 
                case 3: 
                    result = num1 * num2; 
                    break; 
                case 4: 
                    result = num1 / num2; 
                    break; 
                default: 
                    result = 0; 
            } 
            textField.setText("" + result); 
        } else if (command.equals("C")) { 
            textField.setText(""); 
        } 
    } 
 
    public static void main(String args[]) { 
        Exp14_b calculator = new Exp14_b(); 
    } 
}
