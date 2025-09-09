import java.awt.*;
import java.io.Serializable;
import javax.swing.*;
import javax.swing.border.Border;
//imports AWT and swing code libaries
//Description: AWT stands for Abstract window toolkit, contain classes to make graphical components. swing built on top on AWT, provides additional sophicated graphical interface components.

//let compiler know that app needs access to pre-built functionality coitained iwthin the AWT and Swing code libaries.
//this class is like covers of a book, shows compiler where to look for main applicaiton code.

public class TopLevelWindow {
    private static void MainWindow() {
        //code to create window goes here. Anytime this function is called, java will create and display a window using this code
        //creates a new instance of Jframe object called "Frame".
        JFrame frame = new JFrame("To Do List");
        //stops app when window closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //jlabel is a graphical component contains image or text.
        //calls from taskmanager
        TaskManager message = new TaskManager("");
        JLabel textLabel = new JLabel(message.toString(), SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));

        //add to jframe, create components and put in frame.
        frame.getContentPane().add(textLabel,BorderLayout.CENTER);

        JPanel top = new JPanel();
        top.setBackground(Color.blue);
        frame.getContentPane().add(top, BorderLayout.PAGE_START);

        JPanel left = new JPanel();
        left.setBackground(Color.yellow);
        frame.getContentPane().add(left, BorderLayout.LINE_START);

        JPanel right = new JPanel();
        right.setBackground(Color.cyan);
        frame.getContentPane().add(right, BorderLayout.CENTER);

        JPanel bottom = new JPanel();
        bottom.setBackground(Color.red);
        frame.getContentPane().add(bottom, BorderLayout.PAGE_END);

        //Ensures window appear in center of screen
        frame.setLocationRelativeTo(null);
        //Set window size to ensure window is big enuff to show jlabel
        frame.pack();
        frame.setSize(new Dimension(300, 300));
        //show window
        frame.setVisible(true);





        //add java app entry point, calls Window() function as soon as as app run.
        }
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow();
            }

        });

    }



}
