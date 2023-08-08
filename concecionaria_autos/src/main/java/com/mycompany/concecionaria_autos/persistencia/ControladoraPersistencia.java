
package com.mycompany.concecionaria_autos.persistencia;

import com.mycompany.concecionaria_autos.logica.Automovil;
import java.util.List;


public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {  
        autoJpa.create(auto); 
    }

    public List<Automovil> traerAutos() {     
        return autoJpa.findAutomovilEntities();
    }
    
    
    
}
