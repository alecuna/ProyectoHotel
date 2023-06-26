/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hashtable;

/**
 *
 * @author alexandralecuna
 */
public class Nodo<T> {
    
    private T element;
    private Nodo next;
    private Nodo previous;

    public Nodo(T elemento) {
        this.element = elemento;
        this.next = null;
        this.previous = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T elemento) {
        this.element = elemento;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo siguiente) {
        this.next = siguiente;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }
    
    
}
