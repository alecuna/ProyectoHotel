/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Clase que define las distintas validaciones necesarias para el buen funcionamiento de las interfaces graficas 
 * @author Anabella Jaua
 */
public class inputVerifier  {
    
    /**
     * Metodo que permite verificar si la cedula ingresada es valida
     * @param ci, cedula ingresada
     * @return valor logico de si la cedula es valida 
     */
    public boolean verifyCedula(String ci){
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
    
    /**
     * Metodo que permite verificar si la el numero telefonico ingresado es valido
     * @param telf, numero telefonico ingresado
     * @return valor logico de si el numero telefonico es valido
     */
    public boolean verifyTelf(String telf){
        try{
            if(!telf.isEmpty()){
                telf = telf.trim();
                telf = telf.replace(".", "");
                telf = telf.replace("(", "");
                telf = telf.replace(")", "");
                if (!isDigit(telf)){
                    JOptionPane.showMessageDialog(null, "Por favor ingrese unicamente digitos en el numero telefonico");
                    return false;
                }
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
    
    /**
     * Metodo que permite verificar si el nombre y apellido ingresados son validos
     * @param nombre ingresado
     * @param apellido ingresado
     * @return valor logico de si el nombre y el apellido son validos 
     */
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
    
    /**
     * Metodo que permite verificar si una palabra contiene algun numero
     * @param word, palabra a estudiar
     * @return valor logico de si la palabra contiene algun numero
     */
    public boolean containsNumbers (String word){
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                return true;
            }
    }
    return false;
    }
    
    /**
     * Metodo que permite verificar si una palabra contiene unicamente numeros
     * @param word, palabra a estudiar 
     * @return valor logico de si la palabra contiene unicamente numeros 
     */
    public boolean isDigit (String word){
        boolean allDigit = true;
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isDigit(word.charAt(i))) {
                allDigit = false;
            }} return allDigit;
    }
   
    /**
     * Metodo que permite si el correo electronico ingresado es valido
     * @param correo electronico ingresado
     * @return valor logico de si el correo electronico ingresado es valido 
     */
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
    
    /**
     * Metodo que valida que la fecha de llegada no sea despues ni igual que la fecha de salida
     * @param llegada, fecha de llegada
     * @param salida, fecha de salida
     * @return valor logico de si la fecha de llegada no es despues ni igual que la fecha de salida 
     */
    public boolean validarFechas (Date llegada, Date salida){
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
    

