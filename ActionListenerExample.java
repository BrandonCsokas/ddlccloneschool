// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 */
public class ActionListenerExample
{
    private JTextField inputField =  new  JTextField(10);
    private JButton appendButton =  new  JButton("Brandon");
    private JTextArea logArea =  new  JTextArea(10, 30);
    /* Unsupported feature in Stride : anonymous class*/
    private ActionListener listener =  new  ActionListener();

    /**
     * 
     */
    public ActionListenerExample()
    {
        inputField.addActionListener(listener);
        appendButton.addActionListener(listener);
        logArea.setEditable(false);
    }

    /**
     * 
     */
    public void launchGUI()
    {
        JPanel p =  new  JPanel();
        p.add( new  JLabel("Enter text:"));
        p.add(inputField);
        p.add(appendButton);
        JFrame f =  new  JFrame("ActionListenerExample");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getRootPane().setDefaultButton(appendButton);
        Container cp = f.getContentPane();
        cp.add( new  JScrollPane(logArea), BorderLayout.CENTER);
        cp.add(p, BorderLayout.SOUTH);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    /**
     * 
     */
    static public void main(String[] args)
    {
        /* Unsupported feature in Stride : anonymous class*/
        EventQueue.invokeLater( new  Runnable());
    }
}
