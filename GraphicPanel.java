import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GraphicPanel extends JPanel{
	private Image image;
			public void PaintImage(Graphics g){
				String filename="Pictures/java";
				ImageIcon Picture= new ImageIcon(filename);
				image=Picture.getImage();
				
				super.paintComponent(g);
				g.drawImage(image,0,0, 859, 524, Color.black, this);
				
			}
			
		}
