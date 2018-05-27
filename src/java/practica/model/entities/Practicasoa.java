/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.model.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Saul
 */
@Entity
@Table(name = "practicasoa")
@NamedQueries({
    @NamedQuery(name = "Practicasoa.findAll", query = "SELECT p FROM Practicasoa p")
    , @NamedQuery(name = "Practicasoa.findByCedula", query = "SELECT p FROM Practicasoa p WHERE p.cedula = :cedula")
    , @NamedQuery(name = "Practicasoa.findByNombres", query = "SELECT p FROM Practicasoa p WHERE p.nombres = :nombres")
    , @NamedQuery(name = "Practicasoa.findByAnionac", query = "SELECT p FROM Practicasoa p WHERE p.anionac = :anionac")
    , @NamedQuery(name = "Practicasoa.findByCorreo", query = "SELECT p FROM Practicasoa p WHERE p.correo = :correo")
    , @NamedQuery(name = "Practicasoa.findByLenguage", query = "SELECT p FROM Practicasoa p WHERE p.lenguage = :lenguage")})
public class Practicasoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cedula", nullable = false, length = 10)
    private String cedula;
    @Column(name = "nombres", length = 100)
    private String nombres;
    @Column(name = "anionac")
    private Integer anionac;
    @Column(name = "correo", length = 100)
    private String correo;
    @Column(name = "lenguage", length = 100)
    private String lenguage;

    public Practicasoa() {
    }

    public Practicasoa(String cedula) {
        this.cedula = cedula;
    }

    public Practicasoa(String cedula, String nombres, Integer anionac, String correo, String lenguage) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.anionac = anionac;
        this.correo = correo;
        this.lenguage = lenguage;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Integer getAnionac() {
        return anionac;
    }

    public void setAnionac(Integer anionac) {
        this.anionac = anionac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLenguage() {
        return lenguage;
    }

    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Practicasoa)) {
            return false;
        }
        Practicasoa other = (Practicasoa) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "practica.model.entities.Practicasoa[ cedula=" + cedula + " ]";
    }
    
}
