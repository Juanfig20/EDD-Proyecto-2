/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaproyecto2;

/**
 *
 * @author Juan
 */
public class List <T> {
    private Node<T> pfirst;
    private Node<T> plast;
    private int size;

    public List() {
        this.pfirst = pfirst;
        this.plast = plast;
        this.size = size;
    }

    
    /**
     * Inserta al final de una lista
     * @param data valor del nodo
     */
    public void addEnd(T data){
        Node<T> nuevo = new Node(data) ;
        
        if(IsEmpty()){
            pfirst = nuevo;
            plast = nuevo;
        }else{
            Node<T> aux = plast ;
            aux.setPnext(nuevo);
            plast = nuevo; 
        }size ++ ;
        
    }
    
  // ¡¡ESTO HAY QUE REVISARLO!!
    public void delete(Object user) {
        Node<T> aux = this.getPfirst();
        for (int i = 0; i < this.getSize() -1 ; i++) {
            if(aux.getPnext().getElement() == user){
                aux.setPnext(aux.getPnext().getPnext());
                size --;       
            }else{
                aux = aux.getPnext();
            }
        }
    }
    
    
    /**
     * Indica si una lista esta vacia
     */
    public boolean IsEmpty(){
        return pfirst == null ;
        
    }
        
    /**
     * Imprime los elementos de la lista 
     */
    public void print(){
        if (!IsEmpty()){
            Node aux = pfirst;
            for (int i = 0; i < size; i++) {
                System.out.print(  aux.getElement() + " ");
                aux = aux.getPnext();
                
            }
        }else{
            System.out.println("La lista esta vacia");
        }
    }

    public Node<T> getPfirst() {
        return pfirst;
    }

    public void setPfirst(Node<T> pfirst) {
        this.pfirst = pfirst;
    }

    public Node<T> getPlast() {
        return plast;
    }

    public void setPlast(Node<T> plast) {
        this.plast = plast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    


    
}
