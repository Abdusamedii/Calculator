import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static java.awt.ComponentOrientation.RIGHT_TO_LEFT;

public class Calculator {
    private JPanel Calculator;
    private JTextField Display;
    private JButton nr_3;
    private JButton nr_4;
    private JButton nr_7;
    private JButton nr_9;
    private JButton nr_6;
    private JButton nr_0;
    private JButton nr_5;
    private JButton nr_8;
    private JButton nr_2;
    private JButton nr_1;
    private JButton minus;
    private JButton plus;
    private JButton shumzim;
    private JButton pjestim;
    private JButton Clear;
    private JButton barazim;
    private JTextField DisplayFake;

    public String numri1, numri2, operatori, zgjidhja;

    public Calculator() {
        Display.setComponentOrientation(RIGHT_TO_LEFT);
        Display.setEditable(false);
        DisplayFake.setEditable(false);

        Display.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int Keyboard = e.getKeyChar();
                if(Keyboard == 46){
                    DisplayFake.setText(DisplayFake.getText() + ".");
                    Display.setText(Display.getText() + ".");
                }
                if(Keyboard == KeyEvent.VK_0){
                    DisplayFake.setText(DisplayFake.getText() + "0");
                    Display.setText(Display.getText() + "0");
                }
                else if(Keyboard == KeyEvent.VK_1){
                    DisplayFake.setText(DisplayFake.getText() + "1");
                    Display.setText(Display.getText() + "1");
                }
                else if(Keyboard == KeyEvent.VK_2){
                    DisplayFake.setText(DisplayFake.getText() + "2");
                    Display.setText(Display.getText() + "2");
                }
                else if(Keyboard == KeyEvent.VK_3){
                    DisplayFake.setText(DisplayFake.getText() + "3");
                    Display.setText(Display.getText() + "3");
                }
                else if(Keyboard == KeyEvent.VK_4){
                    DisplayFake.setText(DisplayFake.getText() + "4");
                    Display.setText(Display.getText() + "4");
                }
                else if(Keyboard == KeyEvent.VK_5){
                    DisplayFake.setText(DisplayFake.getText() + "5");
                    Display.setText(Display.getText() + "5");
                }
                else if(Keyboard == KeyEvent.VK_6){
                    DisplayFake.setText(DisplayFake.getText() + "6");
                    Display.setText(Display.getText() + "6");
                }
                else if(Keyboard == KeyEvent.VK_7){
                    DisplayFake.setText(DisplayFake.getText() + "7");
                    Display.setText(Display.getText() + "7");
                }
                else if(Keyboard == KeyEvent.VK_8){
                    DisplayFake.setText(DisplayFake.getText() + "8");
                    Display.setText(Display.getText() + "8");
                }
                else if(Keyboard == KeyEvent.VK_9){
                    DisplayFake.setText(DisplayFake.getText() + "9");
                    Display.setText(Display.getText() + "9");
                }
                else if(Keyboard == KeyEvent.VK_ENTER){
                    B barazimi = new B();
                    barazimi.Barazimi();
                }
                else if(Keyboard == 43){
                    numri1 = Display.getText();
                    Display.setText("");
                    operatori = "+";
                    DisplayFake.setText(DisplayFake.getText() + "+");
                }
                else if(Keyboard == KeyEvent.VK_MINUS){
                    numri1 = Display.getText();
                    Display.setText("");
                    operatori = "-";
                    DisplayFake.setText(DisplayFake.getText() + "-");
                }
                else if(Keyboard == 42){
                    numri1 = Display.getText();
                    Display.setText("");
                    operatori = "*";
                    DisplayFake.setText(DisplayFake.getText() + "*");
                }
                else if(Keyboard == 47){
                    numri1 = Display.getText();
                    Display.setText("");
                    operatori = "/";
                    DisplayFake.setText(DisplayFake.getText() + "/");
                }
                else if (Keyboard == 99)
                {
                    Display.setText("");
                    DisplayFake.setText("");

                }


                if (Keyboard == KeyEvent.VK_BACK_SPACE){
                    Display.setText(Display.getText().substring(0,Display.getText().length() - 1));
                    DisplayFake.setText(DisplayFake.getText().substring(0,DisplayFake.getText().length() - 1));
                }



            }
        });

        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText("");
                DisplayFake.setText("");
            }
        });
        nr_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DisplayFake.setText(DisplayFake.getText() + "0");
                Display.setText(Display.getText() + "0");
            }
        });
        nr_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DisplayFake.setText(DisplayFake.getText() + "1");
                Display.setText(Display.getText() + "1");
            }
        });
        nr_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DisplayFake.setText(DisplayFake.getText() + "2");
                Display.setText(Display.getText() + "2");
            }
        });
        nr_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DisplayFake.setText(DisplayFake.getText() + "3");
                Display.setText(Display.getText() + "3");
            }
        });
        nr_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DisplayFake.setText(DisplayFake.getText() + "4");
                Display.setText(Display.getText() + "4");
            }
        });
        nr_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DisplayFake.setText(DisplayFake.getText() + "5");
                Display.setText(Display.getText() + "5");
            }
        });
        nr_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DisplayFake.setText(DisplayFake.getText() + "6");
                Display.setText(Display.getText() + "6");
            }
        });
        nr_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DisplayFake.setText(DisplayFake.getText() + "7");
                Display.setText(Display.getText() + "7");
            }
        });
        nr_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + "8");
                DisplayFake.setText(DisplayFake.getText() + "8");

            }
        });
        nr_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + "9");
                DisplayFake.setText(DisplayFake.getText() + "9");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numri1 = Display.getText();
                Display.setText("");
                operatori = "-";
                DisplayFake.setText(DisplayFake.getText() + "-");

            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numri1 = Display.getText();
                Display.setText("");
                operatori = "+";
                DisplayFake.setText(DisplayFake.getText() + "+");

            }
        });
        shumzim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numri1 = Display.getText();
                Display.setText("");
                operatori = "*";
                DisplayFake.setText(DisplayFake.getText() + "*");

            }
        });
        pjestim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numri1 = Display.getText();
                Display.setText("");
                operatori = "/";
                DisplayFake.setText(DisplayFake.getText() + "/");

            }
        });
        barazim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                B barazimi = new B();
                barazimi.Barazimi();
                }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        String numri1;
        frame.pack();
        frame.setLocationRelativeTo(null);



    }

    public class B {
        public void Barazimi() {
            DisplayFake.setText(DisplayFake.getText().replaceAll("[+]|[-]|[*]|[/]", " "));
            String nummri2[] = DisplayFake.getText().split("\\s+");



            numri2 = nummri2[nummri2.length - 1];
            double nr1 = Float.valueOf(numri1);
            double nr2 = Float.valueOf(numri2);
            if (operatori.contains("-")) {
                double zgjidhja1 = (nr1 - nr2);
                nr1 = zgjidhja1;
                numri1 = (zgjidhja1 + "");
                zgjidhja = (zgjidhja1 + "");
                Display.setText(zgjidhja);
            }
            if (operatori.contains("+")) {
                double zgjidhja1 = (nr1 + nr2);
                nr1 = zgjidhja1;
                numri1 = (zgjidhja1 + "");
                zgjidhja = (zgjidhja1 + "");
                Display.setText(zgjidhja);
            }
            if (operatori.contains("*")) {
                double zgjidhja1 = (nr1 * nr2);
                nr1 = zgjidhja1;
                numri1 = (zgjidhja1 + "");
                zgjidhja = (zgjidhja1 + "");
                Display.setText(zgjidhja);
            }
            if (operatori.contains("/")) {
                double zgjidhja1 = (nr1 / nr2);
                nr1 = zgjidhja1;
                numri1 = (zgjidhja1 + "");
                zgjidhja = (zgjidhja1 + "");
                Display.setText(zgjidhja);
            }

        }
    }

}
