package snakegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.JApplication;
public class SnakeGame extends JApplication
{
  
  public static final int WIDTH = 800;
  public static final int HEIGHT = 800;
  
  private static final Color UI_BAR_COLOR = new Color(0, 102, 52, 100);
  
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
    
    JPanel uiPanel = new JPanel();
    uiPanel.setBounds(0, (HEIGHT / 2) - 50, WIDTH, 100);
    uiPanel.setBackground(UI_BAR_COLOR);
    
    Font titleFont = new Font("Courier", Font.ITALIC, 24);
    JLabel titleLabel = new JLabel("Snake Game");
    titleLabel.setFont(titleFont);
    titleLabel.setBounds(325, -30, 400, 100); // NOT CENTERED YET
    
    Font buttonFont = new Font("Courier", Font.PLAIN, 12);
    JButton playButton = new JButton("Play!");
    playButton.setFont(buttonFont);
    playButton.setBounds((WIDTH / 2) - 50, 40, 100, 18);
    JButton quitButton = new JButton("Quit");
    quitButton.setFont(buttonFont);
    quitButton.setBounds((WIDTH / 2) - 50, 70, 100, 18);
    
    uiPanel.setLayout(null);
    uiPanel.add(titleLabel);
    uiPanel.add(playButton);
    uiPanel.add(quitButton);
    
    mainPanel.setLayout(null);
    mainPanel.add(uiPanel);
  }

}
