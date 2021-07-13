package ru.geekbrains.java1.lesson8;

import javax.swing.*;
import java.awt.*;

public class Sample {
    static int screenwidth = 800;
    static int screenheight = 600;

    public static void main(String[] args) {
        new SampleWindow();

    }

    static class SampleWindow extends JFrame {
        int counter;

        SampleWindow() {
            setVisible(true);
            setSize(screenwidth,screenheight);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setTitle("Наша игра");

            JButton button = new JButton("BUTTON");
            JButton button1 = new JButton("BUTTON1");
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            panel.add(button);
            panel.add(button1);
            add(panel, BorderLayout.SOUTH);
            JLabel jLabel = new JLabel("Нажите на кнопку");
            jLabel.setFont(new Font("Arial", Font.BOLD,50));
            jLabel.setHorizontalAlignment(SwingConstants.CENTER);
            add(jLabel);

        }
    }
}
