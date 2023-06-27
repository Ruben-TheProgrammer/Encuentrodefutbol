/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Arbitro implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArbitro;
    private String nombre;
    
    
    @OneToMany(mappedBy = "Arbitro")private List<Arbitro> arbitro;
    
    public Arbitro() {
    }

    public Arbitro(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return idArbitro;
    }

    public String getNombre() {
        return nombre;
    }


     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
