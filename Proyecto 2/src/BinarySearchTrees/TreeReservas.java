/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchTrees;

import Hashtable.Client;

/**
 *
 * @author Anabella Jaua
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
            System.out.println("{ " + root.getElement() + " }");
            preOrden(root.getLeftSon());
            preOrden(root.getRightSon());
        }
    }

    public void inOrden(NodoReservas root) {
        if (root != null) {
            preOrden(root.getLeftSon());
            System.out.println("{ " + root.getElement() + " }");
            preOrden(root.getRightSon());
        }
    }

    public void postOrden(NodoReservas root) {
        if (root != null) {
            preOrden(root.getLeftSon());
            preOrden(root.getRightSon());
            System.out.println("{ " + root.getElement() + " }");
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
                    } else if (raiz.getLeftSon() == null) {
                        // Tiene solo hijo derecho
                        if (element.getCedula() < raiz.getFather().getElement().getCedula()) {
                            raiz.getFather().setLeftSon(raiz.getRightSon());
                        } else {
                            raiz.getFather().setRightSon(raiz.getRightSon());
                        }
                        raiz.getRightSon().setFather(raiz.getFather());
                        raiz.setRightSon(null);
                        raiz.setFather(null);
                    } else if (raiz.getRightSon() == null) {
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
                } else if (element.getCedula() < raiz.getElement().getCedula()) {
                    deleteNodo(raiz.getLeftSon(), element);
                } else {
                    deleteNodo(raiz.getRightSon(), element);
                }
            }
        } else {
            System.out.println("No hay elementos para eliminar");
        }
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
