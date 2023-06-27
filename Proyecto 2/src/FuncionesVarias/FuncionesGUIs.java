/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FuncionesVarias;

/**
 *
 * @author Anabella Jaua
 */
public class FuncionesGUIs {
    
    public boolean containsNumbers (String word){
        for (int i = 0; i < word.length(); i++) {
        if (Character.isDigit(word.charAt(i))) {
            return true;
        }
    }
    return false;
    }
    
}
