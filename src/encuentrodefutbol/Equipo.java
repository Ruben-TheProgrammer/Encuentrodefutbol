
package encuentrodefutbol;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Rolando Ramos
 */
    @Entity
public class Equipo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipo;
    private String nombre;
    
    
    @OneToMany(mappedBy = "Equipo") private List<Equipo> Equipo;
    
    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return idEquipo;
    }

    public String getNombre() {
        return nombre;
    }


     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    }