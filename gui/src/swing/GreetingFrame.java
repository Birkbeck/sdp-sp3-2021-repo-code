package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreetingFrame extends JFrame implements ActionListener {

  private JLabel greetingLabel;

  public GreetingFrame() {
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    greetingLabel = new JLabel("Greeting will go here.");
    JButton button = new JButton("Greet!");
    button.addActionListener(this);

    add(greetingLabel, BorderLayout.CENTER);
    add(button, BorderLayout.SOUTH);
    pack();
  }

  public static void main(String[] args) {
    GreetingFrame gg = new GreetingFrame();
    gg.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    Greeter greeter = new Greeter("bob");
    String greeting = greeter.greet();
    greetingLabel.setText(greeting);
  }
}
