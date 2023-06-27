/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchTrees;

import Hashtable.Client;
import Hashtable.Lista;

/**
 *
 * @author alexandralecuna
 */
public class NodoHistorial {
    private Lista element;
    private int room;
    private NodoHistorial rightSon,leftSon,father;

    public NodoHistorial(int room) {
        this.element = new Lista();
        this.rightSon = this.leftSon = this.father = null;
        this.room = room;
    }

    public Lista getElement() {
        return element;
    }

    public void setElement(Lista element) {
        this.element = element;
    }

    public NodoHistorial getRightSon() {
        return rightSon;
    }

    public void setRightSon(NodoHistorial rightSon) {
        this.rightSon = rightSon;
    }

    public NodoHistorial getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(NodoHistorial leftSon) {
        this.leftSon = leftSon;
    }

    public NodoHistorial getFather() {
        return father;
    }

    public void setFather(NodoHistorial father) {
        this.father = father;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
    
    
}