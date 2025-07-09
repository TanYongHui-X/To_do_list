import java.awt.*;
import javax.swing.*;
//imports AWT and swing code libaries
//Description: AWT stands for Abstract window toolkit, contain classes to make graphical components. swing built on top on AWT, provides additional sophicated graphical interface components.

//let compiler know that app needs access to pre-built functionality coitained iwthin the AWT and Swing code libaries.
//this class is like covers of a book, shows compiler where to look for main applicaiton code.

public class TopLevelWindow {
    private static void TopLevelWindow() {
        //code to create window goes here. Anytime this function is called, java will create and display a window using this code
        //creates a new instance of Jframe object called "Frame".
        JFrame frame = new JFrame("To Do List");
        //stops app when window closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //jlabel is a graphical component contains image or text.
        //calls from taskmanager
        TaskManager message = new TaskManager("welcome!");
        JLabel textLabel = new JLabel(message.toString(), SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));

        //add to jframe, create components and put in frame.
        frame.getContentPane().add(textLabel,BorderLayout.CENTER);

        //Ensures window appear in center of screen
        frame.setLocationRelativeTo(null);
        //Set window size to ensure window is big enuff to show jlabel
        frame.pack();
        //show window
        frame.setVisible(true);

        //add java app entry point, calls TopLevelWindow() function as soon as as app run.

        }
    public static void main(String[] args) {
        TopLevelWindow();

    }

}
