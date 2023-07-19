package kniznica.frames;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class SelectPanel  extends JFrame implements ActionListener {

      JPanel select_object_Panel = new JPanel();
      Border select_object_Panel_border = new LineBorder(Color.BLUE,2);
      JButton persons_Button;
      JButton books_Button;
      final int PANEL_WIDTH=300;
      final int PANEL_HEIGHT=300;

      public SelectPanel(){
           
                  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  this.setSize(310,310);
                  this.setLayout(null);
                  //this.pack();
                  this.setLocationRelativeTo(null);
                  this.setVisible(true);
                 
                 select_object_Panel.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
                 select_object_Panel.setBorder(select_object_Panel_border);
                 select_object_Panel.setBounds(2,2,300,300);
                 select_object_Panel.setLayout(new GridLayout(2,1));

                 persons_Button= new JButton("PERSONS");
                 persons_Button.setSize(298,149);
                 persons_Button.setBounds(10,10,298,149);
                 persons_Button.setBackground(new Color(176, 224 ,230));
                 persons_Button.addActionListener(this);
                 
                 books_Button= new JButton("BOOKS");
                 books_Button.setSize(298,149);
                 books_Button.setBounds(10,149,298,149);
                 books_Button.setBackground(new Color(123 ,104 ,238));
                 books_Button.addActionListener(this);
                
                 select_object_Panel.add(persons_Button);
                 select_object_Panel.add(books_Button);

                 this.add(select_object_Panel);
      }

      @Override
      public void actionPerformed(ActionEvent e) {
            if(e.getSource()== persons_Button){
              new PersonDatabase();    
              System.out.println("persons_button work");    
            }
          if(e.getSource()== books_Button){
            new BookDatabase();  
            System.out.println("book_button work");    
          }
            
      }
}
