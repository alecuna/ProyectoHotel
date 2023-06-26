/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg2;

import Functions.BasicFunctions;
import Functions.Habitacion;
import Hashtable.Client;
import Hashtable.Hashtable;
import Hashtable.Lista;
import Hashtable.Nodo;


/**
 *
 * @author Anabella Jaua
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static Hashtable hash;
    
    public static void main(String[] args) {

       BasicFunctions func = new BasicFunctions();
       
       //Reservaciones
       Lista<Client> reservas = func.Reservas();
    
       //Estado Actual
       Lista<Client> guests = func.Estado();
       Hashtable hash = func.createHashtable(guests);
       
       
       //Habitaciones
       Lista<Habitacion> rooms = func.Habitaciones();
       String name = "Tobiah";
       String l_name = "Sneaker";
       int room = hash.searchClient(name, l_name);
        System.out.println(room);
       
       //Historial de Habitaciones 
       Lista<Client> historial = func.Historial();
       
       
       
    }
    
}
