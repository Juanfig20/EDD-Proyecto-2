/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaproyecto2;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *Plantilla de Monticulo Binario/Cola de impresion 
 * @author Juan 
 */
public class MonticuloBinario {
    private Document[] line;
    private int size;

    /**
     * Constructor del Monticulo Binario
     * @param maxSize tamano del arreglo
     */
    public MonticuloBinario(int maxSize) {
        this.line = new Document[maxSize];
        this.size = -1;
    }

    /**
     * Conseguir los elementos que tiene el arreglo
     */
    public int getSize() {
        return size;
    }

    /**
     * Define la cantidad de elementos del arreglo
     * @param size cantidad de elementos del arreglo
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    /**
     * Devuelve el primer elemento del arreglo, lo que seria la raiz del monticulo
     */
    public Document getMin(){
        return line[0];
    }
    
    
    /**
     * Devuelve la posicion del padre de un nodo dado su posicion
     * @param x posicion de un nodo
     */
    public int father(int x){
        return ((x - 1)/2);
    }
    
   
    /**
     * Devuelve la posicion del hijo izquierdo de un nodo dado su posicion
     * @param x posicion de un nodo
     */
    public int lChild(int x){
        return ((2*x)+1);
    }
    
    
    /**
     * Devuelve la posicion del hijo derecho de un nodo dado su posicion
     * @param x posicion de un nodo
     */
    public int rChild(int x){
        return ((2*x)+2);
    }
    
    /**
     * Imprime el arreglo
     */
    public void verArreglo(){
        System.out.println("--Arreglo--");
        for (int i = 0; i < this.getSize(); i++) {
            System.out.println(line[i] + "|");
        }
        System.out.println("");
    }
    
    /**
     * Inserta un nuevo documento al arreglo
     * @param prioridad indica si el documento es prioritario o no
     * @param documento documento que se va a insertar
     * @param tipoUsuario prioridad del usuario
     */
    public void insertar(boolean prioridad, Document documento, String tipoUsuario){
        documento.setInLine(true);
        documento.setTime((int)ChronoUnit.MINUTES.between(LocalTime.MIN, LocalTime.now()));
        if(prioridad == false){
            if(this.getSize() == line.length){
                System.out.println("La cola esta llena");
            }else{
                int libre = this.getSize();
                line[libre] = documento;
                size ++;
                
                while(line[libre].getTime() < line[father(libre)].getTime()){
                    move(libre , father(libre));
                    libre = father(libre);
                }
                    
            }
                
        }else{
            if(tipoUsuario.contains("alta")){
                documento.setTime(documento.getTime() - 300);
                int libre = this.getSize();
                line[libre] = documento;
                size ++;
                
                while(line[libre].getTime() < line[father(libre)].getTime()){
                    move(libre , father(libre));
                    libre = father(libre);
                }
            }else if (tipoUsuario.contains("media")){
                documento.setTime(documento.getTime() - 200);
                int libre = this.getSize();
                line[libre] = documento;
                size ++;
                
                while(line[libre].getTime() < line[father(libre)].getTime()){
                    move(libre , father(libre));
                    libre = father(libre);
                }
            }else{
                documento.setTime(documento.getTime() - 100);
                int libre = this.getSize();
                line[libre] = documento;
                size ++;
                
                while(line[libre].getTime() < line[father(libre)].getTime()){
                    move(libre , father(libre));
                    libre = father(libre);
                }
            }
            
        }
    }
    
    /**
     * Intercambia la posicion de un hijo con su padre 
     * @param x posicion del hijo
     * @param y posicion del padre 
     */
    public void move(int x, int y){
        Document aux = line[x];
        line[x] = line[y];
        line[y] = aux;
    }
    
    /**
     * Elimina el primer elemento de la cola de impresion
     */
    public void eliminarMin(){
        line[0] = line[this.getSize()];
        size --;
        hundir(0);
    }
    
    /**
     * Devuelve la posicion del hijo que tiene el menor valor
     * @param x posicion de un nodo
     */
    public int hijoMenor(int x){
        if(rChild(x)>this.getSize()){
            return lChild(x);
        }else{
            if(line[lChild(x)].getTime() < line[rChild(x)].getTime()){
                return lChild(x);
            }else{
                return rChild(x);
            }
        }
    }
    
    /**
     * Envia el documento que esta de primero hasta el final de la cola
     * @param x posicion de un nodo
     */
    public void hundir(int x){
        while(lChild(x)<this.getSize()){
            int menor = hijoMenor(x);
            if(line[x].getTime()>line[menor].getTime()){
                Document aux = line[x];
                line[x]=line[menor];
                line[menor]=aux;
            }
            x = menor;
        }
    }
    
    
    
    
    
}
