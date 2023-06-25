/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

/**
 *
 * @author Maria Daniela
 */
public class Estado {
    private String num_hab; 
    private String f_name; 
    private String l_name; 
    private String email;
    private String genero; 
    private String celular; 
    private String llegada; 

    public Estado(String num_hab, String f_name, String l_name, String email, String genero, String celular, String llegada) {
        this.num_hab = num_hab;
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.genero = genero;
        this.celular = celular;
        this.llegada = llegada;
    }

    public String getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(String num_hab) {
        this.num_hab = num_hab;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }
    
    
}
