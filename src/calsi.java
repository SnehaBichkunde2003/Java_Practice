import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Dimension;


class Calsi extends JFrame {
    
    JLabel num1Label, num2Label, resultLabel;
    JTextField num1Tfeild, num2Tfeild, resultFeild;
    JButton operation;
    
    // Constructor 
    Calsi() {
        num1Label = new JLabel("Num1");
        num2Label = new JLabel("Num2");
        resultLabel = new JLabel("Result");
        num1Tfeild = new JTextField();
        num2Tfeild = new JTextField();
        operation = new JButton("Addition");
        resultFeild = new JTextField();
        num1Tfeild.setPreferredSize(new Dimension(100, 30));
        num2Tfeild.setPreferredSize(new Dimension(100, 30));
        resultFeild.setPreferredSize(new Dimension(200, 30));


        setLayout(new FlowLayout(FlowLayout.LEFT, 40, 40));
        add(num1Label); 
        add(num1Tfeild);
        add(num2Label); 
        add(num2Tfeild);
        add(operation);
        add(resultLabel);
        add(resultFeild);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String args[]) {
        Calsi myCalsi = new Calsi();
    }
}
