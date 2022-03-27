package EricQuintal.practica2; 
//Importacion de Librerias para poder crear los e implemmentar los labels, La ventana y Agregar Propiedades de color 
//Tambien para poder implementar acciones de mouse Eeventos del mouse y eventos de ventana
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// se crea Clase videojuego que hereda de Frame y tiene como interfaces MouseMotionListener y Mouse listener que estos seran los 
//de realizar las insercion de los metodos abstractos a nuestra clase 
public class Principal extends Frame implements MouseMotionListener, MouseListener{

    Label objeto1;
    Label objeto2;
    Label objeto3;
    Label objeto4;
    ElementoReinicio Reinicio;
    Elementos E;

    public Principal(){
    
       //Elemento encargado de realizar la funcion de reinicio de juego
        Reinicio = new ElementoReinicio("Reinicio");
        Reinicio.setBounds(100, 400, 90, 90);
        Reinicio.setForeground(Color.BLACK);
        Reinicio.addActionListener(evt ->btnRActionPerformed(evt));
        
        //Instanciamos 
        E = new Elementos();

        // Crean objetos los cuales tendran la funcion de arrastrar al contenedor y mantenerlos alli
        //Hasta el momento de reincio
        objeto1 = new Label("   w   ");
        objeto1.setBounds(725, 200, 30, 30);
        objeto1.setBackground(Color.WHITE);
        objeto1.addMouseMotionListener(this);
        objeto1.addMouseListener(this);

        objeto2 = new Label("   x   ");
        objeto2 .setBounds(775, 200, 30, 30);
        objeto2 .setBackground(Color.WHITE);
        objeto2 .addMouseMotionListener(this);
        objeto2 .addMouseListener(this);

        objeto3 = new Label("   y   ");
        objeto3 .setBounds(725, 235, 30, 30);
        objeto3 .setBackground(Color.WHITE);
        objeto3 .addMouseMotionListener(this);
        objeto3 .addMouseListener(this);

        objeto4 = new Label("   z  ");
        objeto4.setBounds(775, 235, 30, 30);
        objeto4.setBackground(Color.WHITE);
        objeto4.addMouseMotionListener(this);
        objeto4.addMouseListener(this);

        //Agregamos a la ventana cada uno de los elementos del programa
        this.add(objeto1);
        this.add(objeto2);
        this.add(objeto3);
        this.add(objeto4);
        this.add(Reinicio);
        this.add(E);
    
        //Propiedades de la ventana
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(900, 600);
        cerrar();

        
    }

    //Boton de creado de Rinicio
    private void btnRActionPerformed(ActionEvent e){
		reiniciar();
	}

    //metdo accion cerrrar ventana principal 
    public void cerrar() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
    // metodo encaragdo de Ejecutar accion del mause 
    public void mover(MouseEvent g, Label lbl) {
		lbl.setLocation(
		        lbl.getX() + g.getX() - lbl.getWidth() / 2,
		        lbl.getY() + g.getY() - lbl.getHeight() / 2  
		    );
	}

    //metodo para reiniciar los objetos en el contenedor de que los almacena 
    public void reiniciar(){
        objeto1.setBounds(725, 200, 30, 30);
        objeto2.setBounds(775, 200, 30, 30);
        objeto3.setBounds(725, 235, 30, 30);
        objeto4.setBounds(775, 235, 30, 30);
    }

    public void validar(Label lbl) {
		int x = lbl.getX();
		int y = lbl.getY();
		if(x>=30 & x<=200 & y>20 & y<200) {
		}else {
			reiniciar();
		}
		
	}

    public static void main(String[] args) {
        Principal v = new Principal();
    }
    // metdos abtractos generados por las interfaces de los eventos del mouse
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    // creacion metdodo que se encarag de validar el objeto de tipo label
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == objeto1) {
			validar(objeto1);
		}if(e.getSource() == objeto2) {
			validar(objeto2);
		}if(e.getSource() == objeto3) {
			validar(objeto3);
		}if(e.getSource() == objeto4) {
			validar(objeto4);
		}
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == objeto1) {
			mover(e, objeto1);
		}
		if(e.getSource() == objeto2) {
			mover(e, objeto2);
		}
		if(e.getSource() == objeto3) {
			mover(e, objeto3);
		}
		if(e.getSource() == objeto4) {
			mover(e, objeto4);
		}
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
