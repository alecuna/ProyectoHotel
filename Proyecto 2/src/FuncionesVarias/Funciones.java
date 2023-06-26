/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FuncionesVarias;

import BinarySearchTrees.TreeReservas;
import Functions.Habitacion;
import Hashtable.Client;
import Hashtable.Hashtable;
import Hashtable.Lista;
import static proyecto.pkg2.Main.rooms;
import static proyecto.pkg2.Main.reservas;

/**
 *
 * @author alexandralecuna
 */
public class Funciones {
    
    
    TreeReservas historial;
    Hashtable hospedados;
    
    
    public void checkIn(Client cliente){
        
        if (reservas.checkClient(reservas.getRoot(), cliente)){
          int hab =  asignarHab(cliente, rooms);
          cliente.setRoomNum(hab);
            reservas.deleteNodo(cliente, reservas.getRoot(),null);
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
    
    public int asignarHab(Client cliente, Lista rooms){
        String roomType = cliente.getTipoHab();
        for (int i = 0; i < rooms.getSize(); i++) {
            Habitacion room = (Habitacion) rooms.getDato(i).getElement();
            if (room.isFree()){
                if (roomType.equals(room.getTipo_hab())){
                    room.setFree(false);
                    return room.getNum_hab();
                }
                
            }
        }
        return -1;
    }

    public int asignarHab(Client cliente){
        return -1;
    }
    
    public void freeRoom(Client cliente){
        rooms.insertFinal(cliente.getRoomNum());
        cliente.setRoomNum(-1);
    }
    
//    public Lista historialHab(int habitacion){
//        
//    }
    
}
