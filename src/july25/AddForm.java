package july25;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddForm implements ActionListener {
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    JLabel label1;

    public AddForm() {
        JFrame frame=new JFrame("Calculator");
        button1=new JButton("+");
        button2=new JButton("-");
        label1=new JLabel("Answer");
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(button1);
        frame.add(button2);
        //frame.add(label1);
        textField1.setBounds(100,100,200,30);
        textField2.setBounds(100,150,200,30);
        //label1.setBounds(100,300,400,30);
        button1.setBounds(100,200,70,30);
        button1.addActionListener(this);
        button2.setBounds(200,200,70,30);
        button2.addActionListener(this);

        textField3.setBounds(100,300,200,30);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float j;
        if(e.getSource()==button1) {

            j=Float.parseFloat(textField1.getText())+Float.parseFloat(textField2.getText());

            textField3.setText(Float.toString(j));
        }
        if(e.getSource()==button2) {

            j=Float.parseFloat(textField1.getText())-Float.parseFloat(textField2.getText());

            textField3.setText(Float.toString(j));
        }
    }


    public static void main(String[] args) {
        new AddForm();
    }
}

