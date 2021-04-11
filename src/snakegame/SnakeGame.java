package snakegame;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.JApplication;

public class SnakeGame extends JApplication implements ActionListener
{
  private JPanel mainPanel, display;
  private JComboBox<String> snakeOp, landOp;
  private JButton start;
  private JLabel title;
  private static final String[] snakeCo = { "Snake", "Red", "Blue", "Yellow", "Purple", "Green" };
  private static final String[] landCo = { "Background", "Black", "White" , "Pink", "Checker Board" } ;
  public static final int WIDTH = 700;
  public static final int HEIGHT = 800;
  
  
  public SnakeGame(String[] args) {
    super(args, WIDTH, HEIGHT);
  }
  
  public static void main(String[] args)
  {
    JApplication app = new SnakeGame(args);
    invokeInEventDispatchThread(app);
  }

  @Override
  public void init()
  {
    mainPanel = (JPanel) super.getContentPane();
    display = new JPanel();
    display.setBounds(0, 0, WIDTH, 100);
    display.setBackground(new Color(135, 206, 235));
    title = new JLabel("  SnakeTopia   ");
    title.setFont(new Font("Jokerman", Font.PLAIN, 55));
    snakeOp = new JComboBox<String>(snakeCo);
    snakeOp.addActionListener(this);
    landOp = new JComboBox<String>(landCo);
    landOp.addActionListener(this);
    start = new JButton("START");
    start.addActionListener(this);
    display.add(snakeOp);
    display.add(landOp);
    display.add(title);
    display.add(start);
    mainPanel.add(display);
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    // TODO Auto-generated method stub
    
  }

}