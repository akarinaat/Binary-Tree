import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BTreeGUI extends JFrame implements ActionListener
{
    private JTextField tfValor;
    private JButton    bInsert, bDesplegar, bBuscar, bSalir;
    private JPanel     panel1, panel2;
    private JTextArea  taDatos;
    
    //private QueueAD queStack = new QueueAD();
    //private StackAD queStack = new StackAD();
    private TreeAD tree = new TreeAD();
    private NodoDP nodo;
    
    public BTreeGUI()
    {
        super("Binary Tree GUI");
        
        // 1. Crear o inicializar atributos
        tfValor = new JTextField();
        bInsert    = new JButton("Insert Nodo");
        
        bDesplegar = new JButton("Desplegar");
        bBuscar    = new JButton("Buscar Numero");
        bSalir   = new JButton("Salir");
        panel1   = new JPanel();
        panel2   = new JPanel();
        taDatos  = new JTextArea(8,20);
        
        // Adicionar addActionListener a los botones
        bInsert.addActionListener(this);
        bDesplegar.addActionListener(this);
        bBuscar.addActionListener(this);
        bSalir.addActionListener(this);
        
        // 2. Establecer Layout a panels y Adicionar objetos a los panels
        panel1.setLayout(new GridLayout(3,2));
        panel2.setLayout(new FlowLayout());
        
        panel1.add(new JLabel("Numero: "));
        panel1.add(tfValor);
        panel1.add(bInsert);
        panel1.add(bBuscar);
        panel1.add(bDesplegar);
        panel1.add(bSalir);
        
        panel2.add(panel1);
        panel2.add(new JScrollPane(taDatos));
        
        // 3. Adicionar panels al JFrame
        add(panel2);
        setSize(300,300);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String respuesta="", datos;
        int valor,numero;
        
        if(e.getSource() == bInsert)
        {
            valor = Integer.parseInt(tfValor.getText());
            
            respuesta = tree.insertNode(valor);
            
            taDatos.setText(respuesta);
        }
        
        if(e.getSource() == bDesplegar)
        {
            datos = tree.obtenerDatos();
            
            taDatos.setText(datos);
        }
        if(e.getSource() == bBuscar)
        {
           
            numero = Integer.parseInt(tfValor.getText());
            respuesta = tree.buscarNumero(numero);
            taDatos.setText(respuesta);
        }
        
        if(e.getSource() == bSalir)
            System.exit(0);
    }
    
    public static void main(String args[])
    {
        BTreeGUI objeto = new BTreeGUI();
        
    }
}
