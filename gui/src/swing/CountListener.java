package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountListener implements ActionListener {

  private JLabel countLabel;
  private int count;

  public CountListener(JLabel countLabel) {
    this.countLabel = countLabel;
    count = 0;
  }

  public void actionPerformed(ActionEvent e) {
    count++;
    countLabel.setText("Count: " + count);
  }
}
