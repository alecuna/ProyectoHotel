/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functions;

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
                String tipo_hab = leerUsuarios.get(5);
                String celular = leerUsuarios.get(6);
                
                usuarios.add(new Reservas(ci, f_name, l_name, email, genero, tipo_hab, celular)); // Añade la informacion a la lista
            }
            
            // Guardar los datos en el Test Package Reservas.csv 
            
             String salidaArchivo = "test\\Reservas.csv"; // Nombre del archivo
      
            try {
                // Crea el archivo
                CsvWriter salidaCSV = new CsvWriter(salidaArchivo);

                // Datos para identificar las columnas
                salidaCSV.write("Ci");
                salidaCSV.write("primer_nombre");
                salidaCSV.write("segundo_nombre");
                salidaCSV.write("email");
                salidaCSV.write("genero");
                salidaCSV.write("tipo_hab");
                salidaCSV.write("celular");

                salidaCSV.endRecord(); // Deja de escribir en el archivo

                // Recorremos la lista y lo insertamos en el archivo
                for(Reservas user : usuarios) {
                    salidaCSV.write(user.getCi());
                    salidaCSV.write(user.getF_name());
                    salidaCSV.write(user.getL_name());
                     salidaCSV.write(user.getEmail());
                    salidaCSV.write(user.getGenero());
                    salidaCSV.write(user.getTipo_hab());

                    salidaCSV.endRecord(); // Deja de escribir en el archivo
                }

                salidaCSV.close(); // Cierra el archivo

                } catch(IOException e) {
                    e.printStackTrace();
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
            
            String cedula = "19.504.241";
            for (Reservas user : usuarios){
                if (user.getCi().equals(cedula)){
                    System.out.println(user.getL_name());
                    break; 
                }else{
                    System.out.println("Cliente no aparece");
                    break;
                }   
            }

            } catch(FileNotFoundException e) {
                e.printStackTrace();
            } catch(IOException e) {
                e.printStackTrace();
            }
        
    }
    
    /**
     * Metodo que Guarda las Habitaciones del Archivo CSV
     */
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
            
            //Guardar datos en el Test Package de Habitaciones.csv
            
            String hab_archivo= "test\\Habitaciones.csv"; // Nombre del archivo
      
            try {
                // Crea el archivo
                CsvWriter salidaCSV = new CsvWriter(hab_archivo);

                // Datos para identificar las columnas
                salidaCSV.write("Num_hab");
                salidaCSV.write("Tipo_hab");
                salidaCSV.write("Piso");

                salidaCSV.endRecord(); // Deja de escribir en el archivo

                // Recorremos la lista y lo insertamos en el archivo
                for(Habitaciones user : hab) {
                    salidaCSV.write(user.getNum_hab());
                    salidaCSV.write(user.getTipo_hab());
                    salidaCSV.write(user.getPiso());

                    salidaCSV.endRecord(); // Deja de escribir en el archivo
                }

                salidaCSV.close(); // Cierra el archivo

                } catch(IOException e) {
                    e.printStackTrace();
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
    
    public void Estado(){
        try{
            List<Estado> est = new ArrayList<Estado>(); // Lista donde guardaremos los datos del archivo
            
            CsvReader leerEstado = new CsvReader("C:\\Users\\hp\\Documents\\CSV\\Booking_hotel - estado.csv");
            leerEstado.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerEstado.readRecord()) {
                String num_hab = leerEstado.get(0);
                String f_name = leerEstado.get(1);
                String l_name = leerEstado.get(2);
                String email = leerEstado.get(3);
                String genero = leerEstado.get(4);
                String celular = leerEstado.get(5);
                String llegada = leerEstado.get(6);
                
                est.add(new Estado(num_hab, f_name, l_name, email, genero, celular, llegada)); // Añade la informacion a la lista
            }
            
            //Guardar datos en el Test Package de Habitaciones.csv
            
            String est_archivo= "test\\Estado.csv"; // Nombre del archivo
      
            try {
                // Crea el archivo
                CsvWriter salidaEst = new CsvWriter(est_archivo);

                // Datos para identificar las columnas
                salidaEst.write("Num_hab");
                salidaEst.write("f_name");
                salidaEst.write("l_name");
                salidaEst.write("email");
                salidaEst.write("genero");
                salidaEst.write("celular");
                salidaEst.write("llegada");

                salidaEst.endRecord(); // Deja de escribir en el archivo

                // Recorremos la lista y lo insertamos en el archivo
                for(Estado user : est) {
                    salidaEst.write(user.getNum_hab());
                    salidaEst.write(user.getF_name());
                    salidaEst.write(user.getL_name());
                    salidaEst.write(user.getEmail());
                    salidaEst.write(user.getGenero());
                    salidaEst.write(user.getCelular());
                    salidaEst.write(user.getLlegada());

                    salidaEst.endRecord(); // Deja de escribir en el archivo
                }

                salidaEst.close(); // Cierra el archivo

                } catch(IOException e) {
                    e.printStackTrace();
                }    
            
            leerEstado.close(); // Cierra el archivo
            
            System.out.println("Estado Reservas: ");
            // Recorremos la lista y la mostramos en la pantalla
            for(Estado user : est) {
                System.out.println(user.getNum_hab() + " , "
                    + user.getF_name() + " , "
                    + user.getL_name() + " , "
                    + user.getEmail() + " , "
                    + user.getGenero() + " , "
                    + user.getCelular() + " , "
                    + user.getLlegada());
            }
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
