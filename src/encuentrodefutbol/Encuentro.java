/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentrodefutbol;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
/**
 *
 * @author Rolando Ramos
 */
public class Encuentro {
   
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String NombreCampeonato;
    private String ronda;
    private String marcador;
    

    @ManyToOne private String Arbitro;
    @ManyToOne private String EquipoA;
    @ManyToOne private String EquipoB;
        
    public Encuentro() {
    }
    
    public Encuentro(String NombreCampeonato, String ronda, String Arbitro, String marcador ,String EquipoA,String EquipoB){
        this.NombreCampeonato = NombreCampeonato;
        this.ronda= ronda;
        this.Arbitro= Arbitro;
        this.marcador = marcador;
        this.EquipoA = EquipoA;
        this.EquipoB = EquipoB;
        
    }
     public int getId() {
        return id;
    }
  public String getArbitro() {
        return Arbitro;
    }
    public String getNombreCampeonato() {
        return NombreCampeonato;
    }

      public void setArbitro(String genero) {
        this.Arbitro = Arbitro;
    }
    public void setNombreCampeonato(String titulo) {
        this.NombreCampeonato = NombreCampeonato;
    }

    public String getmarcador() {
        return marcador;
    }

    public void setmarcador(String marcador) {
        this.marcador = marcador;
        
    }
    public String getronda() {
        return ronda;
    }

    public void setronda(String ronda) {
        this.ronda = ronda;
        
    }
   public String getEquipoA() {
        return EquipoA;
    }

    public void setEquipoA(String EquipoA) {
        this.EquipoA = EquipoA;
        
    }
    public String getEquipoB() {
        return EquipoB;
    }

    public void setEquipoB(String EquipoB) {
        this.EquipoB = EquipoB;
        
    }
  }
    
    
    

