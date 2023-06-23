/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anabella Jaua
 */
public class BasicFunctions {
    public void Reservas(){
         List<Reservas> usuarios = new ArrayList<Reservas>(); // Lista donde guardaremos los datos del archivo
        
        try{
            
            
            CsvReader leerUsuarios = new CsvReader("C:\\Users\\hp\\Documents\\CSV\\Booking_hotel - reservas.csv");
            leerUsuarios.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerUsuarios.readRecord()) {
                String ci = leerUsuarios.get(0);
                String f_name = leerUsuarios.get(1);
                String l_name = leerUsuarios.get(2);
                String email = leerUsuarios.get(3);
                String genero = leerUsuarios.get(4);
                String tipo_hab = leerUsuarios.get(4);
                String celular = leerUsuarios.get(6);
                
                usuarios.add(new Reservas(ci, f_name, l_name, email, genero, tipo_hab, celular)); // Añade la informacion a la lista
            }
            
            leerUsuarios.close(); // Cierra el archivo
            
            System.out.println("Datos de la reserva: ");
            // Recorremos la lista y la mostramos en la pantalla
            for(Reservas user : usuarios) {
                System.out.println(user.getCi() + " , "
                    + user.getF_name() + " , "
                    + user.getL_name() + " , "
                    + user.getEmail() + " , "
                    + user.getGenero() + " , "
                    + user.getTipo_hab() + " , "
                    +user.getCelular());
            }
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public void Habitaciones(){
        try{
            List<Habitaciones> hab = new ArrayList<Habitaciones>(); // Lista donde guardaremos los datos del archivo
            
            CsvReader leerhabitaciones = new CsvReader("C:\\Users\\hp\\Documents\\CSV\\Booking_hotel - habitaciones.csv");
            leerhabitaciones.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerhabitaciones.readRecord()) {
                String num_hab = leerhabitaciones.get(0);
                String tipo_hab = leerhabitaciones.get(1);
                String piso = leerhabitaciones.get(2);
                
                hab.add(new Habitaciones(num_hab, tipo_hab, piso)); // Añade la informacion a la lista
            }
            
            leerhabitaciones.close(); // Cierra el archivo
            
            System.out.println("Datos de las habitaciones: ");
            // Recorremos la lista y la mostramos en la pantalla
            for(Habitaciones user : hab) {
                System.out.println(user.getNum_hab() + " , "
                    + user.getTipo_hab() + " , "
                    +user.getPiso());
            }
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
