package EricQuintal.Practica1;
//Importar librerias
    import javax.swing.*;
    import java.awt.event.*;
    import java.awt.*;
// si uso La libreria Java swing La unica diferencia de java awt event es que puedo cerrar la ventana directamente 
//que se genera al ejercutar y mostrar la interfaz grafica ya que al ejercutarlo con la herencia de Jframe 
//puedo cerrar directamente la ventana.
public class Practica1_CalculadoraSimple extends JFrame {

     //En esta parte fue a creacion de la receta que nos proporciono en clase 
     //en este caso usamos texfield aunque tambien se pudo usar JTexfield usando la libreria java awt para
     //espacio de texto 
     //Jbutton para creacion de botones 

     private TextField text;
     private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
     private JButton btnSuma, btnResta, btnMultiplicar, btnElevar, btnDividir, btnIgual;
     private Panel p1;
 
     private int num1;
     private int num2;
     private String operador;
     public Practica1_CalculadoraSimple(){

        text = new TextField("0123456789");
        text.setForeground(Color.lightGray);
        text.setEditable(true);
        text.setFont(new Font("Open Sans", 1, 18));
        
        btn0 = new JButton("0");
        btn0.setBackground (Color.GRAY);
        btn0.setFocusable(false);
        btn0.setFont(new Font ("open Sans", 1, 16));
        btn0.addActionListener(evt ->btn0ActionPerformed(evt));
        
        btn1 = new JButton("1");
        btn1.setFocusable(false);
        btn1.setBackground (Color.WHITE);
        btn1.setFont(new Font ("open Sans", 1, 16));
        btn1.addActionListener(evt ->btn1ActionPerformed(evt));
        
        btn2 = new JButton("2");
        btn2.setBackground (Color.WHITE);
        btn2.setFocusable(false);
        btn2.setFont(new Font ("open Sans", 1, 16));
        btn2.addActionListener(evt ->btn2ActionPerformed(evt));
        
        btn3 = new JButton("3");
        btn3.setBackground (Color.WHITE);
        btn3.setFocusable(false);
        btn3.setFont(new Font ("open Sans", 1, 16));
        btn3.addActionListener(evt ->btn3ActionPerformed(evt));
        
        btn4 = new JButton("4");
        btn4.setBackground (Color.GRAY);
        btn4.setFocusable(false);
        btn4.setFont(new Font ("open Sans", 1, 16));
        btn4.addActionListener(evt ->btn4ActionPerformed(evt));
        
        btn5 = new JButton("5");
        btn5.setBackground (Color.GRAY);
        btn5.setFocusable(false);
        btn5.setFont(new Font ("open Sans", 1, 16));
        btn5.addActionListener(evt ->btn5ActionPerformed(evt));
        
        btn6 = new JButton("6");
        btn6.setBackground (Color.GRAY);
        btn6.setFocusable(false);
        btn6.setFont(new Font ("open Sans", 1, 16));
        btn6.addActionListener(evt ->btn6ActionPerformed(evt));

        btn7 = new JButton("7");
        btn7.setBackground (Color.WHITE);
        btn7.setFocusable(false);
        btn7.setFont(new Font ("open Sans", 1, 16));
        btn7.addActionListener(evt ->btn7ActionPerformed(evt));

        btn8 = new JButton("8");
        btn8.setBackground (Color.WHITE);
        btn8.setFocusable(false);
        btn8.setFont(new Font ("open Sans", 1, 16));
        btn8.addActionListener(evt ->btn8ActionPerformed(evt));

        btn9 = new JButton("9");
        btn9.setBackground (Color.WHITE);
        btn9.setFocusable(false);
        btn9.setFont(new Font ("open Sans", 1, 16));
        btn9.addActionListener(evt ->btn9ActionPerformed(evt));

        btnSuma = new JButton("+");
        btnSuma.setBackground (Color.WHITE);
        btnSuma.setFocusable(false);
        btnSuma.setFont(new Font ("open Sans", 1, 16));
        btnSuma.addActionListener(evt ->btnSumaActionPerformed(evt));

        btnResta = new JButton("-");
        btnResta.setBackground (Color.GRAY);
        btnResta.setFocusable(false);
        btnResta.setFont(new Font ("open Sans", 1, 16));
        btnResta.addActionListener(evt ->btnRestaActionPerformed(evt));

        btnMultiplicar = new JButton("*");
        btnMultiplicar.setBackground (Color.GRAY);
        btnMultiplicar.setFocusable(false);
        btnMultiplicar.setFont(new Font ("open Sans", 1, 16));
        btnMultiplicar.addActionListener(evt ->btnMultiplicarActionPerformed(evt));

        btnDividir = new JButton("/");
        btnDividir.setBackground (Color.WHITE);
        btnDividir.setFocusable(false);
        btnDividir.setFont(new Font ("open Sans", 1, 16));
        btnDividir.addActionListener(evt ->btnDivisionActionPerformed(evt));

        btnElevar = new JButton("^");
        btnElevar.setBackground (Color.GRAY);
        btnElevar.setFocusable(false);
        btnElevar.setFont(new Font ("open Sans", 1, 16));
        btnElevar.addActionListener(evt ->btnElevarActionPerformed(evt));

        btnIgual = new JButton("=");
        btnIgual.setBackground (Color.GRAY);
        btnIgual.setFocusable(false);
        btnIgual.setFont(new Font ("open Sans", 1, 16));
        btnIgual.addActionListener(evt ->btnIgualActionPerformed(evt));
        
        //Creacion del panel e intanciamos Ahora pasamos a realizar la ubicacion en la cual se encontrara
        //el panel ya instanciado Agregamos el area de texto que se encontrara al norte de la ubicacion del
        // panel y el nuevo panel dodne se ubiracran los botones que creamos en la parte de las variables.
        //este nuevo panel se ubicara en la parte de centro del la ventana interfaz.
        p1 = new Panel();
    
        p1.setLayout(new GridLayout(5,4));
        this.setLayout(new BorderLayout());
        this.add(text, BorderLayout.NORTH);
        this.add(p1, BorderLayout.CENTER);

        //Agregamos los elementos al panel que se encontran ubicados en su interior.
        p1.add(btn1);
        p1.add(btn2);
        p1.add(btn3);
        p1.add(btnSuma);
        p1.add(btn4);
        p1.add(btn5);
        p1.add(btn6);
        p1.add(btnResta);
        p1.add(btn7);
        p1.add(btn8);
        p1.add(btn9);
        p1.add(btnDividir);
        p1.add(btnMultiplicar);
        p1.add(btn0);
        p1.add(btnElevar);
        p1.add(btnIgual);
        p1.setBounds(10,10,10,10);

        //Tamaño de la ventana principal asignado segun correponde el apartado de la practica 
        this.setSize(500,400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Calculadora Simple");
        
    }

    private void btn1ActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        text.setText(text.getText()+btn1.getText());
        
        if(text.getText().length()>20)
        {
            JOptionPane.showMessageDialog(null,"Desbordamiento");
        }
    }
    
    private void btn2ActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        text.setText(text.getText()+btn2.getText());
        
        if(text.getText().length()>20)
        {
            JOptionPane.showMessageDialog(null,"Desbordamiento");
        }
    }
    private void btn3ActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        text.setText(text.getText()+btn3.getText());
        
        if(text.getText().length()>20)
        {
            JOptionPane.showMessageDialog(null,"Desbordamiento");
        }
    }
    private void btn4ActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        text.setText(text.getText()+btn4.getText());
       
        if(text.getText().length()>20)
        {
            JOptionPane.showMessageDialog(null,"Desbordamiento");
        }
    }
    
    private void btn5ActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        text.setText(text.getText()+btn5.getText());
        if(text.getText().length()>20)
        {
            JOptionPane.showMessageDialog(null,"Desbordamiento");
        }
    }
    
    private void btn6ActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        text.setText(text.getText()+btn6.getText());
        if(text.getText().length()>20)
        {
            JOptionPane.showMessageDialog(null,"Desbordamiento");
        }
    }
    
    private void btn7ActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        text.setText(text.getText()+btn7.getText());
        if(text.getText().length()>20)
        {
            JOptionPane.showMessageDialog(null,"Desbordamiento");
        }
    }
    
    
    private void btn8ActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        text.setText(text.getText()+btn8.getText());
        if(text.getText().length()>20)
        {
            JOptionPane.showMessageDialog(null,"Desbordamiento");
        }
    }
    
    
    private void btn9ActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        text.setText(text.getText()+btn9.getText());
        if(text.getText().length()>20)
        {
            JOptionPane.showMessageDialog(null,"Desbordamiento");
        }
    }
    
    
    private void btn0ActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        text.setText(text.getText()+btn0.getText());
        if(text.getText().length()>20)
        {
            JOptionPane.showMessageDialog(null,"Desbordamiento");
        }
    }
    
    private void btnSumaActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        num1=Integer.parseInt(text.getText());
        operador="+";
        text.setText("");
    }
    private void btnRestaActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        num1=Integer.parseInt(text.getText());
        operador="-";
        text.setText("");
    }
    private void btnDivisionActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        num1=Integer.parseInt(text.getText());
        operador="/";
        text.setText("");
    }
    
    private void btnMultiplicarActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        num1=Integer.parseInt(text.getText());
        operador="*";
        text.setText("");
    }
    
    private void btnElevarActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        num1=Integer.parseInt(text.getText());
        operador="^";
        text.setText("");
    }
    
    private void btnIgualActionPerformed(ActionEvent e){
        text.setForeground(Color.BLACK);
        num2=Integer.parseInt(text.getText());
        text.setText(Operaciones(operador,num1, num2));
    }


    public String Operaciones(String operador, int n1, int n2){
        switch(operador){
        //Caso de suma, suma el valor de n1 con el valor de n2
        case"+":
        int suma = n1 + n2;
        return suma+"";
        //Caso de resta, resta el valor de n2 al valor de n1
        case "-":
        int resta = n1 - n2;
        return resta+"";
        //Caso de division, verifica primero que los numeros sean mayores a 0 y despues divide el valor de n1 entre el valor de n2
        case "/":
        if (n1 > 0 && n2 > 0){
            int division = n1 / n2;
            return division +"";
        }else {
            return "no se puede dividir entre 0";
            //("No se puede dividir entre 0");

        }
        //Caso de multiplicacion, multiplica el valor de n1 por el de n2
        case "*":
        int multiplicacion = n1 * n2;
        return multiplicacion+"";
        //Caso de elevacion, eleva el valor de n1 con el valor de n2
        case "^":
            if(n1 != 0){
                double elevar = Math.pow(n1, n2);
                return elevar + "";
            }
            break;
            default:
            return"";
        }
        return null;
    }

    public static void main(String[] args) {
        Practica1_CalculadoraSimple c = new Practica1_CalculadoraSimple();
    }
}
