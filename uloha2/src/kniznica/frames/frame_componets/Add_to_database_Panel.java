package kniznica.frames.frame_componets;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Add_to_database_Panel extends JPanel{

      Border addBorder= new LineBorder(Color.black, 2);

      public Add_to_database_Panel(){
            this.setSize(900, 60);
            this.setBackground(Color.lightGray);
            this.setForeground(Color.white);
            this.setBorder(addBorder);
            this.setLayout(null);
      }
}
