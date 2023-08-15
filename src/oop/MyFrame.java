package oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label; //This is the square in the frame

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setLayout(null);
        this.addKeyListener(this);


        label = new JLabel();
        label.setBounds(0, 0, 200, 200);
        label.setBackground(Color.GRAY);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }

    //each one of these prints a value in the terminal
    @Override
    public void keyTyped(KeyEvent e) {
        // KeyTyped = Invoked when a key is typed. Uses KeyChar, char output
        //The value after each axis is the velocity in which the label moves
        switch(e.getKeyChar()) {
            case 'a' : label.setLocation(label.getX()-10, label.getY());
                break;
            case 'w' : label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's' : label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd' : label.setLocation(label.getX()+10, label.getY());
                break;
            }

        }


            @Override
            public void keyPressed (KeyEvent e){
                //KeyPressed = invoked when a physical key is pressed down. Uses KeyCode, int output
                switch(e.getKeyCode()) {
                    case 37 : label.setLocation(label.getX()-10, label.getY());
                        break;
                    case 38 : label.setLocation(label.getX(), label.getY()-10);
                        break;
                    case 39 : label.setLocation(label.getX()+10, label.getY());
                        break;
                    case 40 : label.setLocation(label.getX(), label.getY()+10);
                        break;
                }
            }

            @Override
            public void keyReleased (KeyEvent e){
                //KeyReleased
                System.out.println("You released key char: " + e.getKeyChar());
                System.out.println("You released key code: " + e.getKeyCode());
            }
        }
