package snakegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import app.JApplication;
public class SnakeGame extends JApplication
{
  private JPanel mainPanel, display;
  public static final int WIDTH = 800;
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
    mainPanel.setLayout(null);
    display = new JPanel();
    display.setBounds(0, 0, WIDTH, 85);
    display.setBackground(new Color(135, 206, 235));
    JLabel title = new JLabel("SnakeTopia");
    title.setFont(new Font("Jokerman", Font.PLAIN, 50));
    display.add(title);
    mainPanel.add(display);
}
}