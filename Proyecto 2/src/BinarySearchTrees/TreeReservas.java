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
public class TreeReservas {

    private NodoReservas root;

    public TreeReservas() {
        this.root = null;
    }

    public NodoReservas getRoot() {
        return root;
    }

    public void setRoot(NodoReservas root) {
        this.root = root;
    }

    public void insertNodo(NodoReservas raiz, Client element) {
        NodoReservas node = new NodoReservas(element);
        if (isEmpty()) {
            setRoot(node);
        } else {
            if (element.getCedula() <= raiz.getElement().getCedula()) {
                if (raiz.getLeftSon() == null) {
                    raiz.setLeftSon(node);
                    node.setFather(raiz);
                } else {
                    insertNodo(raiz.getLeftSon(), element);
                }
            } else {
                if (raiz.getRightSon() == null) {
                    raiz.setRightSon(node);
                    node.setFather(raiz);
                } else {
                    insertNodo(raiz.getRightSon(), element);
                }
            }
        }
    }

    public boolean isEmpty() {
        return getRoot() == null;
    }

    public void preOrden(NodoReservas root) {
        if (root != null) {
            System.out.println("{ " + root.getElement().getName() + " }");
            preOrden(root.getLeftSon());
            preOrden(root.getRightSon());
        }
    }

    public void inOrden(NodoReservas root) {
        if (root != null) {
            preOrden(root.getLeftSon());
            System.out.println("{ " + root.getElement().getName() + " }");
            preOrden(root.getRightSon());
        }
    }

    public void postOrden(NodoReservas root) {
        if (root != null) {
            preOrden(root.getLeftSon());
            preOrden(root.getRightSon());
            System.out.println("{ " + root.getElement().getName() + " }");
        }
    }

    public void deleteNodo(Client element, NodoReservas raiz, NodoReservas previousNode) {
        if (isEmpty()) {
            System.out.println("There are no elements to delete");
        } else {
            if (element == raiz.getElement()) {
                if (raiz.isLeaf()) {
                    // Cuando es una hoja
                    if (previousNode == null) {
                        setRoot(null);
                    } else {
                        if (element.getCedula() < previousNode.getElement().getCedula()) {
                            previousNode.setLeftSon(null);
                        } else {
                            previousNode.setRightSon(null);
                        }
                    }
                } else if (raiz.hasOnlyRightSon()) {
                    // Cuando tiene hijo derecho
                    if (previousNode == null) {
                        setRoot(raiz.getRightSon());
                    } else {
                        if (element.getCedula() < previousNode.getElement().getCedula()) {
                            previousNode.setLeftSon(raiz.getRightSon());
                        } else {
                            previousNode.setRightSon(raiz.getRightSon());
                        }
                    }
                } else if (raiz.hasOnlyLeftSon()) {
                    // Cuando tiene hijo izquierdo
                    if (previousNode == null) {
                        setRoot(raiz.getLeftSon());
                    } else {
                        if (element.getCedula() < previousNode.getElement().getCedula()) {
                            previousNode.setLeftSon(raiz.getLeftSon());
                        } else {
                            previousNode.setRightSon(raiz.getLeftSon());
                        }
                    }
                } else {
                    // Tiene ambos hijos
                    boolean haveRightSons = validateLeftSon(raiz.getLeftSon());
                    if (haveRightSons) {
                        NodoReservas nodo = searchNodoToReplace(raiz.getLeftSon());
                        nodo.setLeftSon(raiz.getLeftSon());
                        nodo.setRightSon(raiz.getRightSon());
                        if (element.getCedula() < previousNode.getElement().getCedula()) {
                            previousNode.setLeftSon(nodo);
                        } else {
                            previousNode.setRightSon(nodo);
                        }
                    } else {
                        NodoReservas nodo = raiz.getLeftSon();
                        nodo.setRightSon(raiz.getRightSon());
                        if (element.getCedula() < previousNode.getElement().getCedula()) {
                            previousNode.setLeftSon(nodo);
                        } else {
                            previousNode.setRightSon(nodo);
                        }
                    }
                }
            } else if(element.getCedula() < raiz.getElement().getCedula()) {
                deleteNodo(element, raiz.getLeftSon(), raiz);
            } else {
                deleteNodo(element, raiz.getRightSon(), raiz);
            }
        }
    }
    
    public boolean validateLeftSon(NodoReservas raiz) {
        return raiz.getRightSon() != null;
    }
    
    public NodoReservas searchNodoToReplace(NodoReservas raiz){
        while(raiz.getRightSon() != null) {
            raiz = raiz.getRightSon();
        }
        return raiz;
    }

    public boolean checkClient(NodoReservas root, Client element) {
        boolean found = false;
        if (!isEmpty()) {
            if (root == null) {
                System.out.println("No se consiguio el nodo");
            } else {
                if (element.getCedula() == root.getElement().getCedula()) {
                    found = true;
                } else if (element.getCedula() < root.getElement().getCedula()) {
                    return checkClient(root.getLeftSon(), element);
                } else {
                    return checkClient(root.getRightSon(), element);
                }
            }
        }
        return found;
    }

    public Client reservationDetails(NodoReservas root, int cedula) {
        if (!isEmpty()) {
            if (root == null) {
                System.out.println("El cliente no posee reservacion");
            } else {
                if (cedula == root.getElement().getCedula()) {
                    return root.getElement();
                } else if (cedula < root.getElement().getCedula()) {
                    return reservationDetails(root.getLeftSon(), cedula);
                } else {
                    return reservationDetails(root.getRightSon(), cedula);
                }
            }
        }return null;
    }
}
