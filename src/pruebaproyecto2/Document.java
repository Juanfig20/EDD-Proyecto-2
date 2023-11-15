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
    private LocalTime time;
    private boolean inLine;
    private boolean priority;

    public Document(String nameDoc, String type, int size) {
        this.nameDoc = nameDoc;
        this.type = type;
        this.size = size;
        this.time = time;
        this.inLine = false;
        this.priority = false;
    }
    
    
    
}
