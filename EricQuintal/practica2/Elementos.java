package EricQuintal.practica2;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;


public class Elementos extends Canvas{

    public Elementos() {

	}

	public void paint(Graphics g) {

		//Contenedor recatangulo
		g.setColor(Color.red);
		g.fillRect(20, 20, 200, 200);
		
		//contenedor de tipo romboide
		g.setColor(Color.black);
		g.drawLine(650, 200, 750, 300);
		g.drawLine(650, 200, 750, 100);
		g.drawLine(850, 200, 750, 300);
		g.drawLine(850, 200, 750, 100);	
	}
}