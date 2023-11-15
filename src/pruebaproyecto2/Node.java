/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaproyecto2;

/**
 *
 * @author User
 */
public class Node<T> {
    private T element;
    private Node<T> pnext;

    public Node(T element, Node<T> pnext) {
        this.element = element;
        this.pnext = pnext;
    }

    public Node(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getPnext() {
        return pnext;
    }

    public void setPnext(Node<T> pnext) {
        this.pnext = pnext;
    }
   

    
    
    
    
    
    
}
