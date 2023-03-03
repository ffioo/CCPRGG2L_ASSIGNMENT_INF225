import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;;

public class MainMenu extends JFrame {
    MainMenu(){

        // JLabel
        JLabel imageLabel = new JLabel();
        // Snake image download from internet
        ImageIcon snakeImage = new ImageIcon("snake animation.gif");
        // Set image to label
        imageLabel.setIcon(snakeImage);
        
        // JButton
        JButton startButton = new JButton();
        startButton.setText("Start Game");
        startButton.setFont(new Font("Kristen ITC", Font.BOLD, 25));

        // Add event to start button
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);
        // Add Label and image to frame
        this.add(imageLabel);
        this.add(startButton);


        // Frame layout
        this.setLayout(new FlowLayout());
        // Frame Title
        this.setTitle("Snake Game");
        // Terminates java programs on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Fame size
        this.setSize(1300, 750);
        // Puts frame in the middle
        this.setLocationRelativeTo(null);
        // Make frame appear
        this.setVisible(true);
        // Disable resize
        this.setResizable(false);
        // Set backround color 
        this.getContentPane().setBackground(Color.BLUE);

    }

    // Event handler
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            // Goes to color menu
            new ColorMenu();

            // Closes frame
            dispose();
        }
    }
}
