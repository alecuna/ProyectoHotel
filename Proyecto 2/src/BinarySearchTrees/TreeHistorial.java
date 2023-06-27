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
    
   public void insertNodo(int room, NodoHistorial raiz) {
        NodoHistorial node = new NodoHistorial(room);
        if (isEmpty()) {
            setRoot(node);
        } else {
            if (room < raiz.getRoom()) {
                if (raiz.getLeftSon() == null) {
                    raiz.setLeftSon(node);
                } else {
                    insertNodo(room, raiz.getLeftSon());
                }
            } else {
                if (raiz.getRightSon() == null) {
                    raiz.setRightSon(node);
                } else {
                    insertNodo(room, raiz.getRightSon());
                }
            }
        }
    }
    
    public void insertarCliente(NodoHistorial raiz, Client cliente) {
        
        if (!isEmpty()) {
            if (raiz == null) {
                System.out.println("No se consiguio el nodo");
            } else {
                if (cliente.getRoomNum() == raiz.getRoom()) {
                    raiz.getElement().insertFinal(cliente);
                } else if (cliente.getRoomNum() < raiz.getRoom()) {
                    insertarCliente(raiz.getLeftSon(), cliente);
                } else {
                    insertarCliente(raiz.getRightSon(), cliente);
                }
            }
        }
    }
    
    public boolean isEmpty() {
        return getRoot() == null;
    }
    
    public void preOrden(NodoHistorial root) {
        if (root != null) {
            System.out.println(root.getRoom() + ": ");
            for (int i = 0; i < root.getElement().getSize(); i++) {
                Client currentClient = (Client) root.getElement().getDato(i).getElement();
                System.out.println("--> " + currentClient.getLastName());
            }
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
    
    public void deleteNodo(NodoHistorial raiz, int room) {
        if (!isEmpty()) {
            if (raiz == null) {
                System.out.println("No se consiguio el nodo");
            } else {
                if (room == raiz.getRoom()) {
                    if (raiz.getLeftSon() == null && raiz.getRightSon() == null) {
                        // Es una Hoja
                        if (room < raiz.getFather().getRoom()) {
                            raiz.getFather().setLeftSon(null);
                        } else {
                            raiz.getFather().setRightSon(null);
                        }
                        raiz.setFather(null);
                    } else if (raiz.getLeftSon() == null) {
                        // Tiene solo hijo derecho
                        if (room < raiz.getFather().getRoom()) {
                            raiz.getFather().setLeftSon(raiz.getRightSon());
                        } else {
                            raiz.getFather().setRightSon(raiz.getRightSon());
                        }
                        raiz.getRightSon().setFather(raiz.getFather());
                        raiz.setRightSon(null);
                        raiz.setFather(null);
                    } else if (raiz.getRightSon() == null) {
                        // Tiene solo hijo izquierdo
                        if (room < raiz.getFather().getRoom()) {
                            raiz.getFather().setLeftSon(raiz.getLeftSon());
                        } else {
                            raiz.getFather().setRightSon(raiz.getLeftSon());
                        }
                        raiz.getLeftSon().setFather(raiz.getFather());
                        raiz.setLeftSon(null);
                        raiz.setFather(null);
                    }
                } else if (room < raiz.getRoom()) {
                    deleteNodo(raiz.getLeftSon(), room);
                } else {
                    deleteNodo(raiz.getRightSon(), room);
                }
            }
        } else {
            System.out.println("No hay elementos para eliminar");
        }
    }
    
}
