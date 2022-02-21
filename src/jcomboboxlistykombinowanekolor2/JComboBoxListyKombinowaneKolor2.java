
package jcomboboxlistykombinowanekolor2;

/**
 *
 * @author pawelstradomski
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;

public class JComboBoxListyKombinowaneKolor2 extends JFrame
{

    public JComboBoxListyKombinowaneKolor2() 
    {
        this.setTitle("Listy rozwijane 2");
        this.setBounds(500, 300, 200, 200);
        this.setDefaultCloseOperation(3);
        initComponent();
    }
    public void initComponent()
    {
        lista.addItem("Niebieski");
        lista.addItem("Czerwony");
        this.getContentPane().add(panel);
        panel.add(lista);
        
    }
    JPanel panel = new JPanel();
    JComboBox lista = new JComboBox();
   

    
    public static void main(String[] args) {
        new JComboBoxListyKombinowaneKolor2().setVisible(true);
    }
    
}
