import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Choice;
import java.net.URL;

public class Calculator implements ItemListener, ActionListener {

        JFrame f = new JFrame("AWT Calculator");
        Label l1 = new Label("Enter first number:");
        Label l2 = new Label("Enter second number:");
        Label l3 = new Label("Choose operation:");
        Label l4 = new Label("Result is:");
        Label l5 = new Label("Welcome to my little calculator :)");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();




        Button b1 = new Button("Calculate");
        Choice c = new Choice();






    Calculator() {

        URL url = getClass().getResource("firstImage.jfif");
        ImageIcon imgicon = new ImageIcon(url);
        f.setIconImage(imgicon.getImage());

        f.getContentPane().setBackground( Color.gray );
        l1.setBounds(50, 100, 110, 20);
        l1.setBackground(Color.CYAN);
        l2.setBounds(50, 140, 110, 20);
        l2.setBackground(Color.CYAN);
        l3.setBounds(50, 180, 110, 20);
        l3.setBackground(Color.CYAN);
        l4.setBounds(50, 250, 110, 20);
        l4.setBackground(Color.CYAN);
        l5.setBounds(100,50, 200, 30);
        l5.setBackground(Color.CYAN);

        t1.setBounds(200, 100, 150, 20);
        t2.setBounds(200, 140, 150, 20);
        t3.setBounds(200, 250, 150, 20);

        c.setBounds(200, 180, 150, 20);

        b1.setBounds(100, 220, 200, 20);
        b1.setBackground(Color.CYAN);


        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);

        c.add("");
        c.add("+");
        c.add("-");
        c.add("*");
        c.add("/");



        f.add(t1);
        f.add(t2);
        f.add(t3);

        f.add(b1);

        f.add(c);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                int rez = JOptionPane.showConfirmDialog(f,
                        "Do you wanna exit?", "Confirm exit: ",
                        JOptionPane.YES_NO_OPTION);
                if (rez == JOptionPane.YES_OPTION)
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                else if (rez == JOptionPane.NO_OPTION)
                    f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        });


        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400, 400);
        f.setLocation(450, 150);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        c.addItemListener(this);
        b1.addActionListener(this);

    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String s1 = (t1.getText());
            String s2 = (t2.getText());
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            if(c.getSelectedItem().equals("+")){
                t3.setText("" + (a + b));
            }
            if(c.getSelectedItem().equals("-")){
                t3.setText("" + (a - b));
            }
            if(c.getSelectedItem().equals("*")){
                t3.setText("" + (a*b));
            }
            if(c.getSelectedItem().equals("/")){
                t3.setText("" + (a / b));
            }
    }
}

