package formulario;
 
import lect_escritur.Escritura;
import com.google.gson.Gson;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import json.jSon;


public class Ventana extends JFrame implements ActionListener, KeyListener{
   JLabel lblNombre, lblApellidos, lblEdad, lblSueldo, lblResultado, lblResultado2;
   JButton btnJson, btnBD, btnLimpiar;
   TextField txtNombre, txtApellidos, txtEdad, txtSueldo;
   
   public Ventana(){
       setLayout(null);
       lblNombre=new JLabel("ponga su Nombre:");
       
       lblNombre.setBounds(20,30,150,50);
       txtNombre=new TextField("");
       txtNombre.setBounds(200,30,180,25);
       txtNombre.setForeground(Color.blue);
       txtNombre.addKeyListener(this);
       
       
       
       lblApellidos= new JLabel("ponga su Apellido");
       lblApellidos.setBounds(20, 80, 150, 50);
       txtApellidos=new TextField("");
       txtApellidos.setBounds(200,80,180,25);
       txtApellidos.setForeground(Color.blue);
       txtApellidos.addKeyListener(this);
       
       lblEdad=new JLabel("ponga su edad");
       lblEdad.setBounds(20, 130, 150, 50);
       txtEdad=new TextField("");
       txtEdad.setBounds(200,130,180,25);
       txtEdad.setForeground(Color.blue);
       txtEdad.addKeyListener(this);
       
       
       lblSueldo=new JLabel("Sueldo: ");
       lblSueldo.setBounds(20, 180, 150, 50);
       txtSueldo=new TextField("");
       txtSueldo.setBounds(200,180,180,25);
       txtSueldo.setForeground(Color.blue);
       txtSueldo.addKeyListener(this);
       
       btnJson=new JButton("Guardar en JSon");
       btnJson.setBounds(60,250, 150,50);
       btnJson.addActionListener(this);
       
       btnBD=new JButton("Guardar en BD");
       btnBD.setBounds(300,250, 150,50);
       btnBD.addActionListener(this);
      
       btnLimpiar=new JButton("Limpipar");
       btnLimpiar.setBounds(540,250, 150,50);
       btnLimpiar.addActionListener(this);
       
       lblResultado=new JLabel( "");
       lblResultado.setBounds(20, 340, 200,50);
       lblResultado.setForeground(Color.red);
       lblResultado2=new JLabel( "");
       lblResultado2.setBounds(240, 340, 500,50);
       lblResultado2.setForeground(Color.red);
       
      
       add(lblNombre);
       add(txtNombre);
       add(lblApellidos);
       add(txtApellidos);
       add(lblEdad);
       add(txtEdad);
       add(lblSueldo);
       add(txtSueldo);
       add(btnJson);
       add(btnBD);
       add(btnLimpiar);
       add(lblResultado);
       add(lblResultado2);
}

   
    @Override //acciones de los botones
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==btnJson)
       {
         
       }
        if(ae.getSource()==btnBD)
       {
           
           
       }
       if(ae.getSource()==btnLimpiar)
       {
           
       }
    }

    @Override //acciones de los TXTField- control de formato de datos introducidos:
    public void keyTyped(KeyEvent ke) {
        
        if(ke.getSource()==txtNombre || ke.getSource()==txtApellidos){
            char validar=ke.getKeyChar();

            if(Character.isDigit(validar)){
                getToolkit().beep();
                ke.consume();
                JOptionPane.showMessageDialog(rootPane, "Solo texto, introduce los datos correctos");
            }
        }    
        if(ke.getSource()==txtEdad || ke.getSource()==txtSueldo){  
        char validar=ke.getKeyChar();
            
            if (Character.isLetter(validar)){
                getToolkit().beep();
                ke.consume();
                JOptionPane.showMessageDialog(rootPane, "Solo numeros, introduce los datos correctos");
            }
         }
    }

    @Override
    public void keyPressed(KeyEvent ke) {   
    }
    @Override
    public void keyReleased(KeyEvent ke) {  
    } 
}
