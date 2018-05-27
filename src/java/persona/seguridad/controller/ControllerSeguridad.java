/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona.seguridad.controller;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import practica.model.entities.Practicasoa;
import practica.seguridad.model.ManagerPractica;

/**
 *
 * @author Saul
 */
@ManagedBean
@SessionScoped
public class ControllerSeguridad {
    private String cedula;
    private String nombres;
    private Integer anionac;
    private String correo;
    private String lenguage;
    private List<Practicasoa> listaPersonas;
    @EJB
    private ManagerPractica managerPractica;

    public void insertarPersona() {
        managerPractica.crearPersona(cedula, nombres, anionac, correo, lenguage);
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

    public List<Practicasoa> getListaPersonas() {
        listaPersonas = managerPractica.findAllPersonas();
        return listaPersonas;
    }

    public void setListaPersonas(List<Practicasoa> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
    
}
