package EricQuintal.practica2;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Graphics;
public class Reiniciar extends JButton{
    //Aplica herencia 
	public Reiniciar(String nombre) {
		super(nombre);
		setContentAreaFilled(false);
	}
// se gneran metodos abtractos intefaz Jbutton	
@Override
protected void paintComponent(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillOval(0, 0, getSize().width-1, getSize().height-1);
	super.paintComponent(g);
}
@Override
protected void paintBorder(Graphics g) {
	// TODO Auto-generated method stub
	g.setColor(Color.BLUE);
	g.drawOval(0, 0, getSize().width-1, getSize().height-1);
}

}