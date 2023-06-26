/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hashtable;

import javax.swing.JOptionPane;

/**
 *
 * @author alexandralecuna
 */
public class Lista<T> {
    
    private Nodo head;
    private Nodo tail;
    private int size;

    public Lista() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public Nodo insertBegin(T element) {
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            node.setNext(getHead());
            getHead().setPrevious(node);
            setHead(node);
            Nodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            setTail(pointer);
        }
        size++;
        return node;
    }
    
    public Nodo insertFinal(T element){
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
            node.setPrevious(pointer);
            setTail(node);
        }
        size++;
        return node;
    }
    
    public Nodo insertInIndex(int index, T element) {
        Nodo node = new Nodo(element);
        if (isEmpty()) {
            setHead(node);
        } else {
            if (index > getSize()) {
                System.out.println("The index is bigger than the size");
                return insertFinal(element);
            } else {
                if (index > getSize() / 2) {
                    Nodo pointer = getTail();
                    int cont = 0;
                    while (cont < (getSize() - index) && pointer.getPrevious()!= null) {
                        pointer = pointer.getPrevious();
                        cont++;
                    }
  
                    node.setNext(pointer.getNext());
                    node.setPrevious(pointer);
                    pointer.getNext().setPrevious(node);
                    pointer.setNext(node);
                } else {
                    Nodo pointer = getHead();
                    int cont = 0;
                    while (cont < (index-1) && pointer.getNext()!= null) {
                        pointer = pointer.getNext();
                        cont++;
                    }
                    node.setNext(pointer.getNext());
                    node.setPrevious(pointer);
                    pointer.getNext().setPrevious(pointer);
                    pointer.setNext(node);
                }
            }
        }
        size++;
        return node;
    }
    
    public void deleteFirst() {

        if (!isEmpty()) {
            Nodo<T> pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            size--;

        } else {
            JOptionPane.showMessageDialog(null, "Error. Cannot delete node because the list is empty.");

        }
    }
    
    public Nodo deleteFinal(){
        if (!isEmpty()){
            Nodo pointer = getHead();
            if (getSize() == 1) {
                setHead(null);
                size--;
            } else {
                while (pointer.getNext() != null && pointer.getNext().getNext() != null){
                    pointer = pointer.getNext();
                }
                pointer.getNext().setPrevious(null);
                Nodo nodeReturn = pointer.getNext();
                pointer.setNext(null);
                setTail(pointer);
                size--;
                return nodeReturn;
            }
        }
        return null;
    }
    
    public Nodo<T> deleteInIndex(int index) {
        if (!isEmpty()) {
            Nodo<T> pointer = getHead();
            if (index > getSize()) {
                System.out.println("The index is bigger than the size");
                return deleteFinal();
                
            } else if (index == 0){
                deleteFirst();
                
            } else {
                if (index > getSize() / 2) {
                    pointer = getTail();
                    int cont = 0;
                    while (cont <= (getSize() - index - 1) && pointer.getPrevious() != getTail()) {
                        pointer = pointer.getPrevious();
                        cont++;
                    }
                    Nodo<T> temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.getNext().setPrevious(pointer);
                    temp.setNext(null);
                    temp.setPrevious(null);
                    size--;
                    return temp;

                } else {
                    pointer = getHead();
                    int cont = 0;
                    while (cont < (index - 1) && pointer.getNext() != getHead()) {
                        pointer = pointer.getNext();
                        cont++;
                    }
                    Nodo<T> temp = pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.getNext().setPrevious(pointer);
                    temp.setNext(null);
                    temp.setPrevious(null);
                    size--;
                    return temp;
                }
            }
        }
        return null;
    }
    
   public Nodo<T> getDato(int index) {
        if (isEmpty()) {
            return null;

        } else {
            Nodo<T> pointer = getHead();
            int counter = 0;
            while (counter < index && pointer.getNext() != null) {
                pointer = pointer.getNext();
                counter++;
            }
            return pointer;
        }
    }
   
    public int len(){
        return getSize();
    }
   
   public int find(T data){
        if(head.getElement() == data){
            return 0;
        }
        else if(tail.getElement() == data){
            return size-1;
        }
        else{
            Nodo pointer = head;
            for(int x = 0; x < len(); x++){
                if(pointer.getElement() == data){
                    return x;
                }
                pointer = pointer.getNext();
            }
        }
        return 0;
    }
    
    public void printList(){
        for (int i = 0; i < getSize(); i++) {
            Nodo objeto = getDato(i);
            Client currentClient = (Client) objeto.getElement();
            System.out.println(i + ": "+ currentClient.getName());
        }
    }
    
}
