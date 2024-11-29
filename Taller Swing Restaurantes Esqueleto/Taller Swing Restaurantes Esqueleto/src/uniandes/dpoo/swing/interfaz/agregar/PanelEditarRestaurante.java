package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
    	
    	JLabel nombre = new JLabel("Nombre: ");
    	txtNombre = new JTextField(20);    	
    	
        // Crea el selector para la calificación con una etiqueta al frente
    	JLabel calificacion = new JLabel("Calificacion: ");
    	cbbCalificacion = new JComboBox<>(new String[] {"1","2","3","4","5"});

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
    	JLabel visitado = new JLabel("Visitado: ");
    	cbbVisitado = new JComboBox<>(new String[] {"Si","No"});

        // Agregar todos los elementos al panel
    	add (nombre);
    	add (txtNombre);
    	add (calificacion);
    	add (cbbCalificacion);
    	add (visitado);
    	add (cbbVisitado);
    	
    	setLayout(new GridLayout(3, 2, 0, 0));

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
    	String visi = ( String )cbbVisitado.getSelectedItem( );
        return visi.equals("Si");
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String califStr = ( String )cbbCalificacion.getSelectedItem( );
	    int calificacion = Integer.parseInt(califStr);

        return calificacion;
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
    	String nom = txtNombre.getText( );
        return nom;
    }
}
