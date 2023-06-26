/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg2;

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
    
    public static void main(String[] args) {

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
       Lista<Client> historial = func.Historial();
       TreeHistorial treeHistory = func.crearABB(historial);
       treeHistory.preOrden(treeHistory.getRoot());
       
//       funciones.checkIn(reservas.getRoot().getElement());
//        System.out.println(reservas.getRoot().getElement().getRoomNum() + "" + reservas.getRoot().getElement().getTipoHab());

       
    }
    
}
