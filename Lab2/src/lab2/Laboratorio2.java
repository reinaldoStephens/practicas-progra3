/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Estudiante
 */
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
/**
 *
 * @author Estudiante
 */
public class Laboratorio2 extends JFrame{
    private JButton guardar = new JButton("Guardar");
    private JButton clear = new JButton("Clear");
    private JTextArea informacion = new JTextArea(4,15);
    private JTextField usuario = new JTextField(15);
    private JTextField telefono = new JTextField(15);
    JRadioButton[] sexos = new JRadioButton[2];

    /**
     * @param args the command line arguments
     */
    public Laboratorio2(){
        super("Laboratorio 2");
        setSize(300,300);
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        setLayout(lm);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sexos[0] = new JRadioButton("Femenino");
        sexos[1] = new JRadioButton("Masculino");
        
        JPanel panel = new JPanel();
        JLabel usuarioLabel = new JLabel("Usuario: ");
        JLabel telefonoLabel = new JLabel("Num Telefono: ");
        JLabel sexoLabel = new JLabel("Sexo: ");
        JLabel informacionLabel = new JLabel("Informacion: ");
        
        //set the name to components
        usuarioLabel.setName("lblUsername");
        telefonoLabel.setName("lblTelefono");
        sexoLabel.setName("lblSexo");
        informacionLabel.setName("lblInformacion");
        usuario.setName("usuario");
        telefono.setName("telefono");
        informacion.setName("informacion");
        guardar.setName("guardar");
        clear.setName("clear");
        informacion.setLineWrap(true);
        informacion.setWrapStyleWord(true);
        
        panel.setName("Form");
        panel.add(usuarioLabel);
        panel.add(usuario);
        panel.add(telefonoLabel);
        panel.add(telefono);
        panel.add(sexoLabel);
        ButtonGroup group = new ButtonGroup();
        for (JRadioButton sexo : sexos) {
            group.add(sexo);
            panel.add(sexo);
        }
        panel.add(informacionLabel);
        panel.add(informacion);
        panel.add(guardar);
        panel.add(clear);
        add(panel);
        setVisible(true);
        
    }
    
     private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
     
    public static void main(String[] args) {
        Laboratorio2.setLookAndFeel();
        Laboratorio2 application = new Laboratorio2();
    }
    
}
