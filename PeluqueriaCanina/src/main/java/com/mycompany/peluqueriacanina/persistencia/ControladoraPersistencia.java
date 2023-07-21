
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
       
        //crear en la DB el duenio
        duenioJpa.create(duenio);
        
        //crear en la DB la mascota
        mascoJpa.create(masco);
        
    }

    public List<Mascota> traerMascotas() {
        
        return mascoJpa.findMascotaEntities();
        
    }
    
    
    
}
