import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;;

public class TryAgain extends JFrame {
    TryAgain(){

        JButton tryAgainButton = new JButton();
        JButton exitButton = new JButton();

        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Kristen ITC", Font.BOLD, 25));

        exitButton.setText("Exit");
        exitButton.setFont(new Font("Kirten ITC", Font.BOLD, 25));

        tryAgainEventHandler handler = new tryAgainEventHandler();
        tryAgainButton.addActionListener(handler);
        this.setLayout(new FlowLayout());

        exitHandler handlers = new exitHandler();
        exitButton.addActionListener(handlers);
        this.setLayout(new FlowLayout());

        this.add(tryAgainButton);
        this.add(exitButton);

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
    private class tryAgainEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            // Goes to game frame
            new GameFrame();

            // Closes frame
            dispose();

        }
    }
        private class exitHandler implements ActionListener{
            public void actionPerformed(ActionEvent event){

            dispose();
        }
    }
}
