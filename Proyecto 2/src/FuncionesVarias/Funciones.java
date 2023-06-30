/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FuncionesVarias;

import Functions.Habitacion;
import Hashtable.Client;
import javax.swing.JOptionPane;
import static proyecto.pkg2.Main.hash;
import static proyecto.pkg2.Main.historial;
import static proyecto.pkg2.Main.rooms;
import static proyecto.pkg2.Main.reservas;

/**
 * Clase que define las funciones de Check-In y Check-Out y los distintos metodos necesarios para la ejecucion de las mismas
 * @author Maria Daniela
 */
public class Funciones {

    /**
     * Metodo que permite que un cliente con reservacion ingrese al hotel 
     * @param cliente que desea ingresar
     */
    public void checkIn(Client cliente) {

        if (reservas.checkClient(reservas.getRoot(), cliente)) {
            int hab = asignarHab(cliente);
            if (hab != -1) {
                cliente.setRoomNum(hab);
                reservas.deleteNodo(cliente, reservas.getRoot(), null);
                hash.insertInHashtable(cliente);
            } else {
                JOptionPane.showMessageDialog(null, "El hotel no tiene habitaciones " + cliente.getTipoHab() + " disponibles.");
            }
        } else {
            System.out.println("Error. El cliente no posee una reservacion en el Hotel Oasis.");
        }
    }

    /**
     * Metodo que permite que un huesped abandone el hotel y guarda sus datos en el historial
     * @param cliente que desea abandonar el hotal
     */
    public void checkOut(Client cliente) {
        
        if (hash.checkClient(cliente)) {
            hash.removeHospedado(cliente.getName(), cliente.getLastName());
            historial.insertarCliente(historial.getRoot(), cliente);
            freeRoom(cliente);

        } else {
            JOptionPane.showMessageDialog(null, "Error. El cliente"+cliente.getName()+" "+cliente.getLastName()+" no se encuentra hospedado en el Hotel Oasis.");
        }
    }

    /**
     * Metodo que le asigna una habitacion libre a un cliente, que corresponda con el tipo de habitacion que desea
     * @param cliente al cual se le asignara la habitacion
     * @return numero de habitacion asignado al cliente
     */
    public int asignarHab(Client cliente) {
        String roomType = cliente.getTipoHab();
        for (int i = 0; i < rooms.getSize(); i++) {
            Habitacion room = (Habitacion) rooms.getDato(i).getElement();
            if (room.isFree()) {
                if (roomType.equals(room.getTipo_hab())) {
                    room.setFree(false);
                    return room.getNum_hab();
                }
            }
        }
        return -1;
    }
    
    /**
     * Metodo que libera la habitacion de un cliente cuando el mismo abandona el hotel
     * @param cliente cuya habitacion se liberara
     */
    public void freeRoom(Client cliente){
        int roomNum = cliente.getRoomNum();
        Habitacion room = (Habitacion) rooms.getDato(roomNum-1).getElement();
        room.setFree(true);
        cliente.setRoomNum(-1);
    }

    /**
     * Metodo que verifica si una palabra contiene numeros
     * @param word, palabra a verificar
     * @return valor logico de si la palabra contiene numeros 
     */
     public boolean containsNumbers (String word){
        for (int i = 0; i < word.length(); i++) {
        if (Character.isDigit(word.charAt(i))) {
            return true;
        }
    }
    return false;
    }
     
     
//    public Lista historialHab(int habitacion){
//        
//    }
}
