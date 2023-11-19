/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaproyecto2;


/**
 *
 * @author User
 */
public class User {
    private String name; 
    private int priority;
    private List <Document> documents;

    public User(String name, int priority) {
        this.name = name;
        this.priority = priority;
        this.documents = new List();
    }
    
    public void createDocument(String nameDoc, String type, int size){
        Document document = new Document(nameDoc,type,size);
        this.documents.addEnd(document);
    }
    
   
}
