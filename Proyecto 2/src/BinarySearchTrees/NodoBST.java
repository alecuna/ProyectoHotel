/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchTrees;

/**
 *
 * @author Maria Daniela
 */
public class NodoBST {
     private int element;
    private NodoBST leftSon, rightSon;

    public NodoBST(int element) {
        this.element = element;
        this.leftSon = null;
        this.rightSon = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public NodoBST getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(NodoBST leftSon) {
        this.leftSon = leftSon;
    }

    public NodoBST getRightSon() {
        return rightSon;
    }

    public void setRightSon(NodoBST rightSon) {
        this.rightSon = rightSon;
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
