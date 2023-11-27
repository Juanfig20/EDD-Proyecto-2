/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaproyecto2;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Descripción: En esta clase se llevará a cabo la lectura del archivo .csv para la extracción de la información
 * sobre los usuarios y sus respectivos valores de prioridad, convertirlos en objetos de clase User que almacenen
 * dicha información y retornarlos dentro de una lista que contenga los objetos mencionados.
 * @author Andrés
 * @version 16/11/2023
 */
public class CSV {
    
    public static Component areaTexto;

    /**
    * Descripción: La única función de este constructor es la de permitirnos crear un objeto tipo CSV.
    * @author Andrés
    * @version 18/11/2023
    */
    public CSV() {
    }
    
   /**
    * Descripción: Este método permite escoger el archivo desde el almacenamiento interno desde el dispositivo.
    * @author Andrés
    * @version 16/11/2023
    * Tipo de retorno: Un objeto de tipo Lista que contiene objetos de tipo User si el cliente ha introducido un archivo.
    * De lo contrario retorna una lista vacía.
    */
    public List FileChooser() {
        
        List<User> usersList = new List<>();
        
        JFileChooser fileChooser = new JFileChooser();
        File csv_file = null;
        
        int seleccion = fileChooser.showOpenDialog(areaTexto);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try{   
                csv_file = fileChooser.getSelectedFile();
            }catch(Exception err){
                err.printStackTrace();
            }
        }
        usersList = ReadCSV(csv_file);
        
        return usersList;
    }

    /**
    * Descripción: Este método lee un objeto de tipo File proveniente del método FileChooser
    * y lo traduce en un array que contiene la información que se encontraba en el obeto tipo File.
    * @author Andrés
    * @version 18/11/2023
    * Tipo de retorno: Un objeto de tipo Lista que contiene objetos de tipo User.
    * Nombres y tipos de parámetros: El método requiere que se le introduzca un objeto de tipo File como parámetro, llamado csv_file.
    * Según la lógica de programación utilizada, dicho objeto proviene de la función FileChooser.
    */
    public List ReadCSV(File csv_file){
        
        List<User> usersList = new List<>();
        
        if  (csv_file == null){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún archivo.");
        }else{
            try{
                FileReader fr = new FileReader(csv_file);
                BufferedReader br = new BufferedReader(fr);
                String line;
                String users_string = "";
                while ((line = br.readLine()) != null) {
                    users_string += line + "\n";
                }
                String[] users_array = users_string.split("\n");
                br.close();
                usersList = GetUsersList(users_array);
            }catch(Exception err){
                err.printStackTrace();
            }
        }
        return usersList;
    }
    
    /**
    * Descripción: Este método interpreta un arreglo proveniente del método ReadCSV y
    * traduce la información que contiene en objetos de tipo User para agregarlos a una
    * lista que contendrá todos los objetos obtenidos a partir de dicho arreglo.
    * @author Andrés
    * @version 18/11/2023
    * Tipo de retorno: Un objeto de tipo Lista que contiene objetos de tipo User.
    */
    public List GetUsersList(String[] users_array){
        List<User> usersList = new List<>();
        for (int i = 1; i < users_array.length; i++) {
            String[] user_data = users_array[i].split(";");
            String user_name = user_data[0];
            int user_priority = 0;
            if(user_data[1] == "prioridad_alta"){
                user_priority = 1;
            }else if(user_data[1] == "prioridad_baja"){
                user_priority = 2;
            }else{
                user_priority = 3;
            }
            User user = new User(user_name,user_priority);
            usersList.addEnd(user);
        }
    JOptionPane.showMessageDialog(null, "¡Lista de usuarios cargada exitosamente!");
    return usersList;
    }
}