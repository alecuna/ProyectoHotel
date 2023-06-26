/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FuncionesVarias;

import BinarySearchTrees.TreeReservas;
import Hashtable.Client;
import Hashtable.Hashtable;
import Hashtable.Lista;

/**
 *
 * @author alexandralecuna
 */
public class Funciones {
    
    Lista habitaciones;
    TreeReservas reservas;
    TreeReservas historial;
    Hashtable hospedados;
    
    
    public void checkIn(Client cliente){
        
        if (reservas.checkClient(reservas.getRoot(), cliente)){
//            asignarHab(cliente);
            reservas.deleteNodo(reservas.getRoot(), cliente);
            hospedados.insertInHashtable(cliente);
        } else {
            System.out.println("El cliente no posee una reservacion");
        }
    }
    
    public void checkOut(Client cliente){
        
        if (hospedados.checkClient(cliente)){
            freeRoom(cliente);
            hospedados.removeHospedado(cliente.getName(), cliente.getLastName());
            historial.insertNodo(historial.getRoot(), cliente);
        }
    }
    
//    public int asignarHab(Client cliente){
//        
//    }
    
    public void freeRoom(Client cliente){
        habitaciones.insertFinal(cliente.getRoomNum());
        cliente.setRoomNum(-1);
    }
    
//    public Lista historialHab(int habitacion){
//        
//    }
    
}
