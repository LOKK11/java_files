import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class AnonymousHelloWorld
{
    public static void main(String[] args)
    {
        HelloWorldFrame hwf = new HelloWorldFrame();
        hwf.CreateFrame();
    }
}
 
class HelloWorldFrame
{
    private JFrame frame;
    private JPanel messagePanel;
    private JPanel buttonPanel;
    private JPanel container;
    private JLabel messageLabel;
    private JButton greetButton;
    private JButton clearButton;
 
    public HelloWorldFrame ()
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
 
        frame = new JFrame("Hello World");
        messagePanel = new JPanel(); // Viestin tulostukseen
        buttonPanel = new JPanel(); // Nappuloiden sijoittamiseen
        container = new JPanel(); // Viestin ja nappuloiden sijoittamiseen
        messageLabel = new JLabel(" "); // Tulostettava viesti
        greetButton = new JButton("Tervehdys"); // Painallus tulostaa viestin
        clearButton = new JButton("Tyhjennä"); // Painallus tyjentää viestin
    }
 
    public void CreateFrame ()
    {        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        messagePanel.add(messageLabel);
        buttonPanel.add(greetButton);
        buttonPanel.add(clearButton);
 
        /* Uusi, anonyymisti luotu AcionListener luokka luodaan ja 
         * liitetään greetButton olion addActionListener metodiin
         */
        greetButton.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e)
            {
                messageLabel.setText("Hei! Hauskaa päivän jatkoa! :)");
            }
        });
 
        /* Uusi, anonyymisti luotu AcionListener luokka luodaan ja 
         * liitetään clearButton olion addActionListener metodiin
         */
        clearButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                messageLabel.setText(" ");
            }
         });
 
         container.add(Box.createRigidArea(new Dimension(0, 50)));
         container.add(messagePanel, BorderLayout.CENTER);
         container.add(buttonPanel);
         frame.getContentPane().add(container);
         
         // Tulostetaan ikkuna
         frame.setSize(300, 200);
         frame.setLocationByPlatform(true);
         frame.setVisible(true);
    }
}