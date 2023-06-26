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
    
//    public void insertNodo(NodoHistorial raiz, Client cliente) {
//        
//        NodoHistorial node = new NodoHistorial(cliente.getRoomNum());
//        if (isEmpty()) {
//            setRoot(node);
//        } else {
//            if (raiz.getRoom() <= cliente.getRoomNum()) {
//                if(raiz.getLeftSon() == null) {
//                    raiz.setLeftSon(node);
//                    node.setFather(raiz);
//                } else {
//                    insertNodo(raiz.getLeftSon(),cliente);
//                }
//            } else {
//                if(raiz.getRightSon() == null) {
//                    raiz.setRightSon(node);
//                    node.setFather(raiz);
//                } else {
//                    insertNodo(raiz.getRightSon(),cliente);
//                }
//            }
//        }
//    }
    
    public void insertarNodo(NodoHistorial raiz, int room) {
        
        NodoHistorial node = new NodoHistorial(room);
        if (isEmpty()) {
            setRoot(node);
        } else {
            if (raiz.getRoom() <= room) {
                if(raiz.getLeftSon() == null) {
                    raiz.setLeftSon(node);
                    node.setFather(raiz);
                } else {
                    insertarNodo(raiz.getLeftSon(),room);
                }
            } else {
                if(raiz.getRightSon() == null) {
                    raiz.setRightSon(node);
                    node.setFather(raiz);
                } else {
                    insertarNodo(raiz.getRightSon(),room);
                }
            }
        }
    }
    
    public void insertarCliente(NodoHistorial raiz, Client cliente) {
        
            if (root != null) {
                if (root.getRoom() == cliente.getRoomNum()){
                    root.getElement().insertFinal(cliente);
                } else if (root.getRoom() > cliente.getRoomNum()){
                    insertarCliente(root.getRightSon(), cliente);
                } else{
                    insertarCliente(root.getLeftSon(),cliente);
                }
        }
        
    }
    
    public boolean isEmpty() {
        return getRoot() == null;
    }
    
    public void preOrden(NodoHistorial root) {
        if (root != null) {
            System.out.println("{ "+root.getElement()+" }");
            preOrden(root.getLeftSon());
            preOrden(root.getRightSon());
        }
    }
    
    public void inOrden(NodoHistorial root) {
        if (root != null) {
            preOrden(root.getLeftSon());
            System.out.println("{ "+root.getElement()+" }");
            preOrden(root.getRightSon());
        }
    }
    
    public void postOrden(NodoHistorial root) {
        if (root != null) {
            preOrden(root.getLeftSon());
            preOrden(root.getRightSon());
            System.out.println("{ "+root.getElement()+" }");
        }
    }
    
//    public void deleteNodo(NodoHistorial raiz, Client element) {
//        if (!isEmpty()) {
//            if (raiz == null) {
//                System.out.println("No se consiguio el nodo");
//            } else {
//                if (element.getCedula() == raiz.getElement().getCedula()) {
//                    if (raiz.getLeftSon() == null && raiz.getRightSon() == null) {
//                        // Es una Hoja
//                        if (element.getCedula() < raiz.getFather().getElement().getCedula()) {
//                            raiz.getFather().setLeftSon(null);
//                        } else {
//                            raiz.getFather().setRightSon(null);
//                        }
//                        raiz.setFather(null);
//                    } else if(raiz.getLeftSon() == null) {
//                        // Tiene solo hijo derecho
//                        if (element.getCedula() < raiz.getFather().getElement().getCedula()) {
//                            raiz.getFather().setLeftSon(raiz.getRightSon());
//                        } else {
//                            raiz.getFather().setRightSon(raiz.getRightSon());
//                        }
//                        raiz.getRightSon().setFather(raiz.getFather());
//                        raiz.setRightSon(null);
//                        raiz.setFather(null);
//                    } else if(raiz.getRightSon() == null) {
//                        // Tiene solo hijo izquierdo
//                        if (element.getCedula() < raiz.getFather().getElement().getCedula()) {
//                            raiz.getFather().setLeftSon(raiz.getLeftSon());
//                        } else {
//                            raiz.getFather().setRightSon(raiz.getLeftSon());
//                        }
//                        raiz.getLeftSon().setFather(raiz.getFather());
//                        raiz.setLeftSon(null);
//                        raiz.setFather(null);
//                    }
//                } else if(element.getCedula() < raiz.getElement().getCedula()){
//                    deleteNodo(raiz.getLeftSon(), element);
//                } else {
//                    deleteNodo(raiz.getRightSon(), element);
//                }
//            }
//        } else {
//            System.out.println("No hay elementos para eliminar");
//        }
//    }
    
//    public boolean checkClient(Client cliente){
//        
//    }
    
//    public Client reservationDetails(int Cedula){
//    }
    
    
}
