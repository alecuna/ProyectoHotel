/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchTrees;
import Hashtable.Client;

/**
 *
 * @author alecuna
 */
public class NodoReservas {
    
    private Client element;
    private NodoReservas rightSon,leftSon,father;

    public NodoReservas(Client element) {
        this.element = element;
        this.rightSon = this.leftSon = this.father = null;
    }

    public Client getElement() {
        return element;
    }

    public void setElement(Client element) {
        this.element = element;
    }

    public NodoReservas getRightSon() {
        return rightSon;
    }

    public void setRightSon(NodoReservas rightSon) {
        this.rightSon = rightSon;
    }

    public NodoReservas getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(NodoReservas leftSon) {
        this.leftSon = leftSon;
    }

    public NodoReservas getFather() {
        return father;
    }

    public void setFather(NodoReservas father) {
        this.father = father;
    }
    
    public boolean isLeaf(){
        return (leftSon == null && rightSon == null);
    }
    
    public boolean hasOnlyRightSon(){
        return (leftSon == null && rightSon != null);
    }
    
    public boolean hasOnlyLeftSon(){
        return (leftSon != null && rightSon == null);
    }

}
