/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaproyecto2;

import javax.swing.JOptionPane;


/**
 *
 * @author User, Andrés
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
    
    /**
     * Descripción: A continuación los getters and setters de la clase.
     * @author Andrés
     * @version 20/11/2023
     */
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    /**
     * Descripción: Este método permite crear un objeto de tipo Document a partir del usuario que desee crearlo para
     * agregarlo a su lista de documentos.
     * @author Andrés
     * @version 20/11/2023
     */
    public void createDocument() {
        String nameDoc = JOptionPane.showInputDialog(null, "Ingrese un nombre para su documento: ");
        String type = JOptionPane.showInputDialog(null, "Ingrese el tipo de documento: ");
        String size = JOptionPane.showInputDialog(null, "Ingrese el número de páginas de su documento: ");
        int sizeInt = 0;
        while(true){
            try{
                sizeInt = Integer.parseInt(size);
                break;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: Ingrese un valor numérico entero.");
                size = JOptionPane.showInputDialog(null, "Ingrese el número de páginas de su documento: ");
            }
        }
        Document document = new Document(nameDoc,type,sizeInt);
        this.documents.addEnd(document);
    }
    
}
