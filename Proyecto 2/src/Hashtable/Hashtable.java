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
                for (int j = 0; j < array[i].getSize(); j++) {
                    System.out.println("key: " + i);
                    array[i].printList();
                }
            }

        }
    }
    
    public Client searchClient(String name, String lastName){
        int clave = hashCode(name, lastName);
        for (int i = 0; i < array[clave].getSize(); i++) {
            if (array[clave].getDato(i).getElement().getLastName() == lastName){
                
            }
        }

    }
   
}
