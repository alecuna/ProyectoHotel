/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg2;

import GUIs.MainMenu;
import BinarySearchTrees.TreeHistorial;
import BinarySearchTrees.TreeReservas;
import FuncionesVarias.Funciones;
import Functions.BasicFunctions;
import Functions.Habitacion;
import Hashtable.Client;
import Hashtable.Hashtable;
import Hashtable.Lista;



/**
 *
 * @author Anabella Jaua
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static Hashtable hash;
    public static TreeReservas reservas;
    public static Lista rooms;
    public static TreeHistorial historial;
    
    public static void main(String[] args) {
        // TODO code application logic here
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        menu.setResizable(false);


       BasicFunctions func = new BasicFunctions();
       Funciones funciones = new Funciones();
       
       //Reservaciones
       reservas = func.Reservas();

               
       //Estado Actual
       Lista<Client> guests = func.Estado();
       hash = func.createHashtable(guests);
       
       //Habitaciones
       rooms = func.Habitaciones();
       rooms = func.setFreeRooms(rooms, guests);
       
        
       //Historial de Habitaciones 
       Lista<Client> history = func.Historial();
       historial = func.crearHistorial(history);
       
       
    }
    
}
