package formulario;
import javax.swing.JFrame;
public class Formulario {

    public static void main(String[] args) {
        Ventana v=new Ventana();
        v.setTitle("formularios y cosas de Json");
        v.setSize(800, 800);
        v.setLocation(200,50);
        v.setVisible(true);
        
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
