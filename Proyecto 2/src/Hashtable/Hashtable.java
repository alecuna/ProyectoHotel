/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hashtable;

/**
 *
 * @author alecuna
 */
public class Hashtable {
    

    private Lista[] array;
    private int hashSize;

    public Hashtable(int hashSize) {
        this.array = new Lista[hashSize];
        this.hashSize = hashSize;
    }

    public Lista[] getArray() {
        return array;
    }

    public void setArray(Lista[] array) {
        this.array = array;
    }

    public int getHashSize() {
        return hashSize;
    }

    public void setHashSize(int hashSize) {
        this.hashSize = hashSize;
    }

    public int getAsciiValue(String palabra) {
        int suma = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char character = palabra.charAt(i);
            int ascii = (int) character;
            suma += ascii;
        }

        return suma;
    }

    public int hashCode(String name, String lastName) {
        int clave;
        name = name.toLowerCase();
        lastName = lastName.toLowerCase();
        String junto = name + lastName;
        clave = getAsciiValue(junto) % getHashSize();
        return clave;
    }

    public void insertInHashtable(int key, Client value) {

        Lista subLista = new Lista();
        subLista.insertFinal(value);
        Lista valorArreglo = getArray()[key];
        if (valorArreglo != null) {
            valorArreglo.insertFinal(value);
        } else {
            getArray()[key] = subLista;
        }
    }

    public void printTable() {
        for (int i = 0; i < hashSize; i++) {
            if (array[i] != null) {
                System.out.println("key: " + i);
                    array[i].printList();
            }

        }
    }
    
    public void removeHospedado(String name, String lastName){
        int clave = hashCode(name, lastName);
        if (array[clave] != null) {
            for (int i = 0; i < array[clave].getSize(); i++) {
                Client currentClient = (Client) array[clave].getDato(i).getElement();
                if (currentClient.getLastName().equals(lastName)) {
                    if (currentClient.getRoomNum() != -1){
                        array[clave].deleteInIndex(i);
                    } else {
                        System.out.println("El cliente aun no ha realizado el check-in y por lo tanto no se le ha asignado una habitacion");
                    }
                }
            }
        } else {
            System.out.println("No se ha encontrado ningun cliente alojado bajo ese nombre");
        }
    }
    
    public int searchClient(String name, String lastName) {
        int clave = hashCode(name, lastName);
        if (array[clave] != null) {
            for (int i = 0; i < array[clave].getSize(); i++) {
                Client currentClient = (Client) array[clave].getDato(i).getElement();
                if (currentClient.getLastName().equals(lastName)) {
                    if (currentClient.getRoomNum() != -1){
                        return currentClient.getRoomNum();
                    } else {
                        System.out.println("El cliente aun no ha realizado el check-in y por lo tanto no se le ha asignado una habitacion");
                    }
                }
            }
        } else {
            System.out.println("No se ha encontrado ningun cliente alojado bajo ese nombre");
        }
        return -1;
    }
   
}
