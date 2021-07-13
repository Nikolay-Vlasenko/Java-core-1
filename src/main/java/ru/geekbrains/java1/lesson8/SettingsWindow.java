package ru.geekbrains.java1.lesson8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SettingsWindow extends JFrame {
    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 300;
    private static final int MIN_WIN_LENGTH = 3;
    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;
    private static final String FIELD_SIZE_PREFIX = "Размер поля ";
    private static final String WIN_LENGTH_PREFIX = "Длинна победы ";

    private JSlider sliderWinLength;
    private JSlider sliderFieldSize;
    private JRadioButton humanVsAI;
    private JRadioButton humanVsHuman;
    private GameWindow gameWindow;

    public SettingsWindow (GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setLocationRelativeTo(this.gameWindow);
        setResizable(false);
        setTitle("Настройки игры. Создание новой игры");
        setLayout(new GridLayout(10, 1));

        addChooseGameMode();
        addSetFieldSize();

        JButton buttonStart = new JButton("Начать играть");
        buttonStart.addActionListener(e -> {
            subminSettings(gameWindow);
        });
        add(buttonStart);
    }

    private void subminSettings(GameWindow gameWindow) {
        int gameMode;
        if(humanVsAI.isSelected()) {
            gameMode = GameMap.MODE_VS_AI;
        } else {
            gameMode = GameMap.MODE_VS_HUMAN;
        }
        int fieldSize = sliderFieldSize.getValue();
        int winLength = sliderWinLength.getValue();
        gameWindow.startGame(gameMode,fieldSize,winLength);
        setVisible(false);
    }

    private void addSetFieldSize() {
        JLabel labelFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE);
        JLabel labelWinLength = new JLabel(MIN_WIN_LENGTH + WIN_LENGTH_PREFIX);

        sliderFieldSize = new JSlider(MIN_FIELD_SIZE,MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        sliderWinLength = new JSlider(MIN_WIN_LENGTH,MAX_FIELD_SIZE, MIN_FIELD_SIZE);

        sliderFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentvalue = sliderFieldSize.getValue();
                labelFieldSize.setText(FIELD_SIZE_PREFIX + currentvalue);
                sliderWinLength.setMaximum(currentvalue);
            }
        });

        sliderWinLength.addChangeListener(e -> labelWinLength.setText(WIN_LENGTH_PREFIX + sliderWinLength.getValue()));
        add(new JLabel("Выберите длинну поля"));
        add(labelFieldSize);
        add(sliderFieldSize);
        add(new JLabel("Выберите длинну победы"));
        add(labelWinLength);
        add(sliderWinLength);
    }

    private void addChooseGameMode() {
        add(new JLabel("Выберите режим игры:"));
        humanVsAI = new JRadioButton("Человек против Компьютера", true);
        humanVsHuman = new JRadioButton("Человек против Человека");
        ButtonGroup gamemode = new ButtonGroup();
        gamemode.add(humanVsAI);
        gamemode.add(humanVsHuman);
        add(humanVsAI);
        add(humanVsHuman);
    }

}
