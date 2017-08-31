import java.awt.*;
import javax.swing.*;

	public class GraphicPanel extends JPanel
			{
				private Image im1;
				
				//draws an image
				public void paintComponent(Graphics gr)
				{	
					String fname2 = "Picture.jpg";
					ImageIcon background = new ImageIcon(fname2);
					im1 = background.getImage();
						
					super.paintComponent(gr);
					gr.drawImage(im1,0,0, 300, 250, this);
				}
}
