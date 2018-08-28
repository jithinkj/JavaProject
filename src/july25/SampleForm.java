package july25;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SampleForm implements ActionListener {
    private JPanel panel1;
    private JButton button1;
    JTextField textField;
    JTextField textField1;
    JLabel label;
    SampleForm(){
        JFrame frame=new JFrame("First App");
        button1=new JButton("click");
        textField=new JTextField();
        label=new JLabel("First Name");

        frame.setLayout(null);
        frame.setSize(500,500);

        frame.add(button1);
        frame.add(label);
        frame.add(textField);

        button1.setBounds(300,75,70,30);
        button1.addActionListener(this);
        textField.setBounds(200,75,90,30);
        label.setBounds(70,75,90,30);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1)
        textField.setText("hello java");
        JOptionPane.showMessageDialog(null,"hello");//messagebox
    }

    public static void main(String[] args) {
        new SampleForm();
    }
}
