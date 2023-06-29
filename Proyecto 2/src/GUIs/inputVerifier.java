/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Anabella Jaua
 */
public class inputVerifier  {
    
    public boolean verifyCedula(String ci){
        
        /**
        * Metodo que valida que la cédula contenga unicamente números
        */
        try{
            if (!ci.isEmpty()){
                ci = ci.trim();
                ci = ci.replace(".", "");
                Integer.valueOf(ci);
                return true;
            } else{
                JOptionPane.showMessageDialog(null, "Por favor rellene todas las casillas");
                return false; 
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Por favor ingrese unicamente numeros en la cedula");
            return false;
        }
    }
    
    public boolean verifyTelf(String telf){
        
        /**
        * Metodo que valida que el telefono contenga unicamente números
        */
        try{
            if(!telf.isEmpty()){
                telf = telf.trim();
                telf = telf.replace(".", "");
                telf = telf.replace("(", "");
                telf = telf.replace(")", "");
                Integer.valueOf(telf);
                return true;
            } else{
                JOptionPane.showMessageDialog(null, "Por favor rellene todas las casillas");
                return false;
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Por favor ingrese unicamente digitos en el numero telefonico");
            return false;
        }
    }
    
    public boolean verifyNames (String nombre, String apellido){
        if (!nombre.isEmpty() || !apellido.isEmpty()){
            if (containsNumbers(nombre) || containsNumbers(apellido)){
                JOptionPane.showMessageDialog(null, "Por favor ingrese unicamente nombres en las casillas de nombre y apellido");
                return false;
            } else{
                return true;
            }
    } else{
            JOptionPane.showMessageDialog(null, "Por favor rellene todas las casillas");
            return false;
        }
    }
    
    public boolean containsNumbers (String word){
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                return true;
            }
    }
    return false;
    }
    
    public boolean emptyString (String word){
        return word.trim().equals("");
    }
    
    public boolean verifyEmail(String correo){
        
        /**
        * Metodo que valida que el texto ingresado por el usuario presente la estructura de un correo
        */
        if (!correo.isEmpty()){
            int containsAt = 0;
            for (int i = 0; i < correo.length(); i++) {
                if (correo.charAt(i) == '@'){
                    containsAt++;
                }}
            if (containsAt != 1){
                JOptionPane.showMessageDialog(null, "Recuerde colocar un '@' en su correo electronico");
                return false;
            } else{
                return true;
            }
        } else{
            JOptionPane.showMessageDialog(null, "Por favor rellene todas las casillas");
            return false;
        }
    } 
    
    public boolean validarFechas (Date llegada, Date salida){
        
        /**
        * Metodo que valida que las fechas sean válidas
        */
        
        if (llegada.after(salida)){
            JOptionPane.showMessageDialog(null, "Recuerde que su fecha de llegada debe ser antes que su fecha de salida");
            return false;
        } else if(llegada.equals(salida)){
            JOptionPane.showMessageDialog(null, "Recuerde que su fecha de llegada no puede ser igual a su fecha de salida");
            return false;
        } else{
            return true;
        }
    }
    
    
    
}
    

