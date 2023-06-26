/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchTrees;

import Hashtable.Client;

/**
 *
 * @author alexandralecuna
 */
public class TreeHistorial {
    
    private NodoHistorial root;

    public TreeHistorial() {
        this.root = null;
    }

    public NodoHistorial getRoot() {
        return root;
    }

    public void setRoot(NodoHistorial root) {
        this.root = root;
    }
    
    public void insertNodo(NodoHistorial raiz, Client cliente) {
        
        NodoHistorial node = new NodoHistorial(cliente.getRoomNum());
        if (isEmpty()) {
            setRoot(node);
        } else {
            if (raiz.getRoom() <= cliente.getRoomNum()) {
                if(raiz.getLeftSon() == null) {
                    raiz.setLeftSon(node);
                    node.setFather(raiz);
                } else {
                    insertNodo(raiz.getLeftSon(),cliente);
                }
            } else {
                if(raiz.getRightSon() == null) {
                    raiz.setRightSon(node);
                    node.setFather(raiz);
                } else {
                    insertNodo(raiz.getRightSon(),cliente);
                }
            }
        }
    }
    
    public boolean isEmpty() {
        return getRoot() == null;
    }
    
    public void preOrden(NodoReservas root) {
        if (root != null) {
            System.out.println("{ "+root.getElement()+" }");
            preOrden(root.getLeftSon());
            preOrden(root.getRightSon());
        }
    }
    
    public void inOrden(NodoReservas root) {
        if (root != null) {
            preOrden(root.getLeftSon());
            System.out.println("{ "+root.getElement()+" }");
            preOrden(root.getRightSon());
        }
    }
    
    public void postOrden(NodoReservas root) {
        if (root != null) {
            preOrden(root.getLeftSon());
            preOrden(root.getRightSon());
            System.out.println("{ "+root.getElement()+" }");
        }
    }
    
    public void deleteNodo(NodoReservas raiz, Client element) {
        if (!isEmpty()) {
            if (raiz == null) {
                System.out.println("No se consiguio el nodo");
            } else {
                if (element.getCedula() == raiz.getElement().getCedula()) {
                    if (raiz.getLeftSon() == null && raiz.getRightSon() == null) {
                        // Es una Hoja
                        if (element.getCedula() < raiz.getFather().getElement().getCedula()) {
                            raiz.getFather().setLeftSon(null);
                        } else {
                            raiz.getFather().setRightSon(null);
                        }
                        raiz.setFather(null);
                    } else if(raiz.getLeftSon() == null) {
                        // Tiene solo hijo derecho
                        if (element.getCedula() < raiz.getFather().getElement().getCedula()) {
                            raiz.getFather().setLeftSon(raiz.getRightSon());
                        } else {
                            raiz.getFather().setRightSon(raiz.getRightSon());
                        }
                        raiz.getRightSon().setFather(raiz.getFather());
                        raiz.setRightSon(null);
                        raiz.setFather(null);
                    } else if(raiz.getRightSon() == null) {
                        // Tiene solo hijo izquierdo
                        if (element.getCedula() < raiz.getFather().getElement().getCedula()) {
                            raiz.getFather().setLeftSon(raiz.getLeftSon());
                        } else {
                            raiz.getFather().setRightSon(raiz.getLeftSon());
                        }
                        raiz.getLeftSon().setFather(raiz.getFather());
                        raiz.setLeftSon(null);
                        raiz.setFather(null);
                    }
                } else if(element.getCedula() < raiz.getElement().getCedula()){
                    deleteNodo(raiz.getLeftSon(), element);
                } else {
                    deleteNodo(raiz.getRightSon(), element);
                }
            }
        } else {
            System.out.println("No hay elementos para eliminar");
        }
    }
    
    public boolean checkClient(Client cliente){
        return true;
    }
    
//    public Client reservationDetails(int Cedula){
//    }
    
    
}
