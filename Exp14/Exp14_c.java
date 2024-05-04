import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
class MyForm extends JFrame implements ActionListener { 
JLabel nameLabel, genderLabel, interestLabel, placeLabel, detailsLabel; 
JTextField nameField; 
JRadioButton maleRadioButton, femaleRadioButton; 
JComboBox<String> placeComboBox; 
JCheckBox musicCheckBox, swimCheckBox; 
ButtonGroup genderGroup; 
JButton submitButton, resetButton; 
JTextArea detailsTextArea; 
public MyForm() { 
        setTitle("Form"); 
        setBounds(200, 80, 800, 800); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
        setLayout(null); 
 
        nameLabel = new JLabel("Name"); 
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 15)); 
        nameLabel.setSize(100, 20); 
        nameLabel.setLocation(100, 100); 
        add(nameLabel); 
 
        nameField = new JTextField(); 
        nameField.setFont(new Font("Arial", Font.PLAIN, 15)); 
        nameField.setSize(190, 20); 
        nameField.setLocation(200, 100); 
        add(nameField); 
 
        genderLabel = new JLabel("Gender"); 
        genderLabel.setFont(new Font("Arial", Font.PLAIN, 15)); 
        genderLabel.setSize(100, 20); 
        genderLabel.setLocation(100, 150); 
        add(genderLabel); 
 
        maleRadioButton = new JRadioButton("Male"); 
        maleRadioButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        maleRadioButton.setSelected(true); 
        maleRadioButton.setSize(80, 20); 
        maleRadioButton.setLocation(200, 150); 
        add(maleRadioButton); 
 
        femaleRadioButton = new JRadioButton("Female"); 
        femaleRadioButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        femaleRadioButton.setSize(80, 20); 
        femaleRadioButton.setLocation(350, 150); 
        add(femaleRadioButton); 
 
        genderGroup = new ButtonGroup(); 
        genderGroup.add(maleRadioButton); 
        genderGroup.add(femaleRadioButton); 
 
        interestLabel = new JLabel("Interest"); 
        interestLabel.setFont(new Font("Arial", Font.PLAIN, 15)); 
        interestLabel.setSize(100, 20); 
        interestLabel.setLocation(100, 200); 
        add(interestLabel); 
 
        musicCheckBox = new JCheckBox("Music"); 
        musicCheckBox.setFont(new Font("Arial", Font.PLAIN, 15)); 
        musicCheckBox.setSize(100, 20); 
        musicCheckBox.setLocation(200, 200); 
        add(musicCheckBox); 
 
        swimCheckBox = new JCheckBox("Swim"); 
        swimCheckBox.setFont(new Font("Arial", Font.PLAIN, 15)); 
        swimCheckBox.setSize(100, 20); 
        swimCheckBox.setLocation(350, 200); 
        add(swimCheckBox); 
 
        placeLabel = new JLabel("Favorite Place"); 
        placeLabel.setFont(new Font("Arial", Font.PLAIN, 15)); 
        placeLabel.setSize(100, 20); 
        placeLabel.setLocation(100, 250); 
        add(placeLabel); 
 
        placeComboBox = new JComboBox<>(); 
        placeComboBox.setFont(new Font("Arial", Font.PLAIN, 15)); 
        placeComboBox.setSize(150, 20); 
        placeComboBox.setLocation(200, 250); 
        placeComboBox.addItem("India"); 
        placeComboBox.addItem("USA"); 
        placeComboBox.addItem("Bhutan"); 
        placeComboBox.addItem("Sri Lanka"); 
        placeComboBox.addItem("Maldives"); 
        add(placeComboBox); 
 
        detailsLabel = new JLabel("Details"); 
        detailsLabel.setFont(new Font("Arial", Font.PLAIN, 15)); 
        detailsLabel.setSize(100, 20); 
        detailsLabel.setLocation(100, 300); 
        add(detailsLabel); 
 
        detailsTextArea = new JTextArea(); 
        detailsTextArea.setFont(new Font("Arial", Font.PLAIN, 15)); 
        detailsTextArea.setSize(200, 200); 
        detailsTextArea.setLocation(200, 300); 
        detailsTextArea.setLineWrap(true); 
        detailsTextArea.setEditable(false); 
        add(detailsTextArea); 
 
        submitButton = new JButton("Submit"); 
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submitButton.setSize(100, 20); 
        submitButton.setLocation(150, 550); 
        submitButton.addActionListener(this); 
        add(submitButton); 
 
        resetButton = new JButton("Reset"); 
        resetButton.setFont(new Font("Arial", Font.PLAIN, 15)); 
        resetButton.setSize(100, 20); 
        resetButton.setLocation(270, 550); 
        resetButton.addActionListener(this); 
        add(resetButton); 
 
        setVisible(true); 
    } 
 
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == submitButton) { 
            String data = "Name : " + nameField.getText() + "\n" + 
                          "Gender : " + (maleRadioButton.isSelected() ? "Male" : "Female") + "\n" + 
                          "Interests : " + (musicCheckBox.isSelected() ? "Music " : "") + 
                                         (swimCheckBox.isSelected() ? "Swimming" : "") + "\n" + 
                          "Favorite Place : " + placeComboBox.getItemAt(placeComboBox.getSelectedIndex()); 
            detailsTextArea.setVisible(true); 
            detailsTextArea.setText(data); 
            detailsTextArea.setEditable(false); 
        } else if (e.getSource() == resetButton) { 
            detailsTextArea.setText(""); 
        } 
    } 
} 
 
public class Exp14_c { 
public static void main(String[] args) { 
MyForm form = new MyForm(); 
} 
} 