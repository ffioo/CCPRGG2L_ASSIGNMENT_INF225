import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class ColorMenu extends JFrame{

    // Color name array
    private String[] colorNameArray = {"GRAY", "LIGHT GRAY", "WHITE", "BLACK"};
    // Color list array
    private Color[] colorListArray = {Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK};

    JList colorList;
    
    ColorMenu(){

        // JLabel
        JLabel label = new JLabel();
        label.setText("Choose your color: ");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);

        // JList
        colorList = new JList(colorNameArray);
        colorList.setFont(new Font("Arial", Font.BOLD, 25));
        // Allows only one selection in the list
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // add event
        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);
        
        // Add list to frame
        this.add(colorList);
        
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

    private class EventHandler implements ListSelectionListener{
        
        public void valueChanged(ListSelectionEvent event){
            GamePanel gp = new GamePanel();
            gp.gameBGColor = colorListArray[colorList.getSelectedIndex()];

            // open game frame
            new GameFrame();
            // close game frame
            dispose();
        }
    }
}
