/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

import Hashtable.Client;
import Hashtable.Hashtable;
import Hashtable.Lista;
import Hashtable.Nodo;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anabella Jaua
 */
public class BasicFunctions {
    
    /**
     * Metodo que Guarda las Reservas del Archivo CSV
     */
    public Lista<Client> Reservas(){
        Lista<Client> reservas = new Lista<>(); // Lista donde guardaremos los datos del archivo
        
        try{
            
            CsvReader leerUsuarios = new CsvReader("test\\Reservas.csv");
            leerUsuarios.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerUsuarios.readRecord()) {
                String ci = leerUsuarios.get(0);
                ci = ci.replace(".","");
                int cedula = Integer.parseInt(ci);
                
                String f_name = leerUsuarios.get(1);
                String l_name = leerUsuarios.get(2);
                String email = leerUsuarios.get(3);
                String genero = leerUsuarios.get(4);
                String tipo_hab = leerUsuarios.get(5);
                String celular = leerUsuarios.get(6);
                String llegada = leerUsuarios.get(7);
                String salida = leerUsuarios.get(8);
                
                Client cliente = new Client(cedula,f_name,l_name,email,genero,tipo_hab,celular,llegada,salida,-1);
                reservas.insertFinal(cliente); // Añade la informacion a la lista
            }
            
            } catch(FileNotFoundException e) {
                e.printStackTrace();
            } catch(IOException e) {
                e.printStackTrace();
            }
        return reservas;
        
    }
    
    /**
     * Metodo que Guarda las Reservas del Archivo CSV
     */
    public Lista<Client> Estado(){
        Lista<Client> guests = new Lista<>(); // Lista donde guardaremos los datos del archivo
        
        try{
            
            CsvReader leerUsuarios = new CsvReader("test\\Estado.csv");
            leerUsuarios.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerUsuarios.readRecord()) {
                if (!leerUsuarios.get(0).equals("")){
                    String hab = leerUsuarios.get(0);
                    int num_hab = Integer.parseInt(hab);
                    
                    String f_name = leerUsuarios.get(1);
                    String l_name = leerUsuarios.get(2);
                    String email = leerUsuarios.get(3);
                    String gender = leerUsuarios.get(4);
                    String celular = leerUsuarios.get(5);
                    String llegada = leerUsuarios.get(6);
                    
                    Client cliente = new Client(-1, f_name, l_name, email, gender, null, celular, llegada, null, num_hab);
                    guests.insertFinal(cliente);
                }
            }
            
            } catch(FileNotFoundException e) {
                e.printStackTrace();
            } catch(IOException e) {
                e.printStackTrace();
            }
        return guests;
        
    }
    
    /**
     * Metodo que Guarda las Habitacion del Archivo CSV
     */
    public Lista<Habitacion> Habitaciones(){
        try{
            Lista<Habitacion> rooms = new Lista<>(); // Lista donde guardaremos los datos del archivo
            
            CsvReader leerHab = new CsvReader("test\\Habitaciones.csv");
            leerHab.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerHab.readRecord()) {
                String hab = leerHab.get(0);
                int num_hab = Integer.parseInt(hab);
                
                String tipo_hab = leerHab.get(1);
                
                String piso = leerHab.get(2);
                int num_piso = Integer.parseInt(piso);
                
                Habitacion room = new Habitacion(num_hab, tipo_hab, num_piso);
                rooms.insertFinal(room); // Añade la informacion a la lista

                rooms.insertFinal(new Habitacion(num_hab, tipo_hab, num_piso)); // Añade la informacion a la lista
            }
            
            return rooms;
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } 
        return null; 
    } 
    
    public Lista<Habitacion> setFreeRooms (Lista<Habitacion> rooms, Lista <Client> guests){
        Nodo pointer = guests.getHead();
        while (pointer.getNext()!= null){
            Client current = (Client) pointer.getElement();
            int num_hab = current.getRoomNum();
            Habitacion room = (Habitacion) rooms.getDato(num_hab-1).getElement();
            room.setFree(false);
            pointer = pointer.getNext();
        }
        return rooms;
        
    }
    
    /**
     * Metodo que Guarda las Reservas del Archivo CSV
     */
    public Lista<Client> Historial(){
        Lista<Client> historial = new Lista<>(); // Lista donde guardaremos los datos del archivo
        
        try{
            
            CsvReader leerUsuarios = new CsvReader("test\\Historico.csv");
            leerUsuarios.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerUsuarios.readRecord()) {
                String ci = leerUsuarios.get(0);
                ci = ci.replace(".","");
                int cedula = Integer.parseInt(ci);

                String f_name = leerUsuarios.get(1);
                String l_name = leerUsuarios.get(2);
                String email = leerUsuarios.get(3);
                String gender = leerUsuarios.get(4);
                String llegada = leerUsuarios.get(5);
                String hab = leerUsuarios.get(6);
                int num_hab = Integer.parseInt(hab);

                Client cliente = new Client(cedula, f_name, l_name, email, gender, null, null, llegada, null, num_hab);
                historial.insertFinal(cliente);
                
            }
           
            } catch(FileNotFoundException e) {
                e.printStackTrace();
            } catch(IOException e) {
                e.printStackTrace();
            }
        return historial;   
    }

    public Hashtable createHashtable(Lista<Client> guests){
        Hashtable hash = new Hashtable(600);
        Nodo pointer = guests.getHead();
        while(pointer.getNext() != null){
            Client current = (Client) pointer.getElement();
            hash.insertInHashtable(current);
            pointer = pointer.getNext();
        }
        return hash;
    }
}
