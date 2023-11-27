/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaproyecto2;
/**
 *
 * @author Juan
 */
public class HashTable{
    private int size = 999;
    private HashNode[]table;
    private HashNode par;

    public HashTable() {
        this.table = new HashNode[size];
    }
    
    /**
     * Devuelve la posicion del usuario en la tabla
     * @param usuario un usuario
     */
    public int hashKey(User usuario){
        return Math.abs(usuario.hashCode()% getSize()) ;
    }
    
    
    /**
     * Inserta el par usuario,documento en la tabla
     * @param usuario un usuario
     * @param value documento que se encuantra en la cola de impresion
     */
    public void insertarHash(User usuario, Document value){
        int posicion = Math.abs(usuario.hashCode()% getSize()); 
        HashNode cajita = new HashNode(usuario,value);
        table[posicion] = cajita;
        
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Devuelve el documento que pertenece al usuario
     * @param usuario un usuario
     */
  public Document encontrarDocumento(User usuario){
      return table[hashKey(usuario)].getValue();
  }
    
    
    
}
