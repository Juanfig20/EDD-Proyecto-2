/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaproyecto2;

import java.time.LocalTime;

/**
 *
 * @author User
 */
public class Document {
    private String nameDoc;
    private String type; 
    private int size;
    private int time;
    private boolean inLine;
    

    public Document(String nameDoc, String type, int size) {
        this.nameDoc = nameDoc;
        this.type = type;
        this.size = size;
        this.time = time;
        this.inLine = false;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isInLine() {
        return inLine;
    }

    public void setInLine(boolean inLine) {
        this.inLine = inLine;
    }

    public String getNameDoc() {
        return nameDoc;
    }

    public void setNameDoc(String nameDoc) {
        this.nameDoc = nameDoc;
    }


    
    public String getType() {
        return type;
    }

    /**
    * Descripción: Este método interpreta el parámetro inLine y lo traduce en un String que facilita su lectura.
    * @author Andrés
    * @version 26/11/2023
    * Tipo de retorno: Un String llamado inLineString.
    */
    public String getInLineString(){
        String inLineString = "En cola de impresión.";
        if(!this.inLine){
            inLineString = "No ha sido enviado a imprimir.";
        }
        return inLineString;
    }

    
}
