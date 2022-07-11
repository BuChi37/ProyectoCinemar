package clasesPrincipalesCinemar;

import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;

import conexionBDD.Coneccion;

public class CalculosDimensionales{
	
	public CalculosDimensionales(){
		
	}
	
	public int tamañoYPanel() throws SQLException{
		
			Coneccion cantPelicula = new Coneccion();
			
			int panelY = cantPelicula.getCantPeliculas();
			panelY*=200;
			
		return panelY;
	}
	
}



