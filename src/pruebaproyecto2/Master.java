/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaproyecto2;

import javax.swing.JOptionPane;

/**
 * Descripción: En esta clase se llevará a cabo gestión de la información del proyecto entero, como el registro del tiempo
 * y el almacenamiento de la lista de usuarios
 * @author Andrés
 * @version 20/11/2023
 */

public class Master {
    
    private long startTime = (System.currentTimeMillis())/1000;
    private List<User> user_list = new List<>();
    private MonticuloBinario lista_impresion = new MonticuloBinario(1000);

    public Master() {
    }
    
    /**
    * Descripción: Este getter retorna la hora en que se creó un objeto de clase Master expresado en segundos.
    * @author Andrés
    * @version 21/11/2023
    * Tipo de retorno: Lo anterior en tipo long.
    */
    public long getStartTime() {
        return startTime;
    }

    /**
    * Descripción: Este setter almacena dentro del objeto de tipo UsersMenu el objeto de tipo Master.
    * @author Andrés
    * @version 23/11/2023
    * Nombre y tipo de parámetro: Un objeto de clase Master llamado master que contiene la información de la base de datos.
    */
    public List<User> getUser_list() {
        return user_list;
    }
    
    
    
    /**
    * Descripción: Este método crea un objeto de tipo CSV para poder acceder a sus métodos y así cargar una nueva lista de usuarios.
    * @author Andrés
    * @version 21/11/2023
    */
    public void LoadUsers(){
        CSV csv = new CSV();
        List<User> new_users_list = csv.FileChooser();
        this.user_list = new_users_list;
        JOptionPane.showMessageDialog(null, "¡Lista de usuarios cargada exitosamente!");
    }
    
    /**
    * Descripción: Este método crea un nuevo objeto de tipo User para agregarlo a la lista de usuarios.
    * @author Andrés
    * @version 21/11/2023
    */
    public void NewUser(){
        String user_name = JOptionPane.showInputDialog(null, "Indique el nombre del nuevo usuario: ");
        String user_priority = JOptionPane.showInputDialog(null, "Indique su valor de prioridad (1; 2 o 3): ");
        System.out.println(user_priority);
        while (user_priority != "1" && user_priority != "2" && user_priority != "3"){
            user_priority = JOptionPane.showInputDialog(null, "Por favor, ingrese un valor numérico entero entre 1 y 3: ");
        }
        int user_priorityNumeric = Integer.parseInt(user_priority);
        User user = new User(user_name,user_priorityNumeric);
        this.user_list.addEnd(user);
        JOptionPane.showMessageDialog(null, "¡Usuario creado exitosamente!");
    }
    
    public void DeleteUser(){
        String user_name = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario que desea eliminar: ");
        this.user_list.delete(user_name); //¡¡ESTO HAY QUE CORREGIRLO!!
    }
    
    public void AddDocument_Printer(){
        //¡¡AQUÍ VA LA FUNCIÓN INSERTAR AL MONTÍCULO!!
    }
    
    
    /**
    * Descripción: Busca un usuario en la lista
    * @param nombre el nombre del usuario que se esta buscando 
    * @author Juan 
    * @version 23/11/2023
    */
    public User BuscarUsuario(String nombre){
        Node <User> pAux = user_list.getPfirst();
        for (int i = 0; i < user_list.getSize(); i++) {
            if(pAux.getElement().getName() == nombre){
                i = user_list.getSize();
            }else{
                pAux = pAux.getPnext();
            }
                
        }
        return pAux.getElement();
    }
    
    
}
