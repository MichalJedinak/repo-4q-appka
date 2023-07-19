package kniznica.frames.frame_componets;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Info_label_Panel extends JPanel {    
      
      public Info_label_Panel(){
            
             new JPanel();
            this.setSize(900,50 );
            this.setLayout(null);
            this.setBackground(Color.DARK_GRAY);

            JLabel book_id_Label = new JLabel("book_id");
            book_id_Label.setBounds(20,5,80,40);
            book_id_Label.setPreferredSize(new Dimension(80,40));
            book_id_Label.setForeground(Color.white);
            //book_id_Label.setOpaque(true);

            JLabel book_title_Label = new JLabel("book_title");
            book_title_Label.setBounds(102,5,100,40);
            book_title_Label.setPreferredSize(new Dimension(100,40));

            book_title_Label.setForeground(Color.white);

            JLabel book_autor_Label = new JLabel("book_autor");
            book_autor_Label.setBounds(204,5,100,40);
            book_autor_Label.setPreferredSize(new Dimension(100,40));
            book_autor_Label.setForeground(Color.white);

            JLabel book_genre_Label = new JLabel("book_genre" );
            book_genre_Label.setBounds(306,5, 100, 40);
            book_genre_Label.setPreferredSize(new Dimension(100,40));
            book_genre_Label.setForeground(Color.white);

            JLabel book_stock_Label = new JLabel("book_stock" );
            book_stock_Label.setBounds(408,5, 100, 40);
            book_stock_Label.setPreferredSize(new Dimension(100,40));
            book_stock_Label.setForeground(Color.white);

            this.add(book_id_Label);
            this.add(book_title_Label);
            this.add(book_autor_Label);
            this.add(book_genre_Label);
            this.add(book_stock_Label);
      }
      
}
