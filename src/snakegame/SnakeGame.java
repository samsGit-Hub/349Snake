package snakegame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import app.JApplication;
public class SnakeGame extends JApplication
{
  
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
    JPanel mainPanel = (JPanel) super.getContentPane();
    mainPanel.setLayout(null);
  }

}
