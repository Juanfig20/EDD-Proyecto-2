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
    }
    
    /**
    * Descripción: Este método crea un nuevo objeto de tipo User para agregarlo a la lista de usuarios.
    * @author Andrés
    * @version 21/11/2023
    */
    public void NewUser(){
        String user_name = JOptionPane.showInputDialog(null, "Indique el nombre del nuevo usuario: ");
        String user_priority = JOptionPane.showInputDialog(null, "Indique su valor de prioridad (1; 2 o 3): ").trim();
        while (!"1".equals(user_priority) && !"2".equals(user_priority) && !"3".equals(user_priority)){
            user_priority = JOptionPane.showInputDialog(null, "Por favor, ingrese un valor numérico entero entre 1 y 3: ").trim();
        }
        int user_priorityNumeric = Integer.parseInt(user_priority);
        User user = new User(user_name,user_priorityNumeric);
        this.user_list.addEnd(user);
        JOptionPane.showMessageDialog(null, "¡Usuario creado exitosamente!");
        this.user_list.print();
        System.out.println("\n");
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
            if(pAux.getElement().getName().equalsIgnoreCase(nombre)){
                i = user_list.getSize();
            }else{
                pAux = pAux.getPnext();
            }
                
        }
        return pAux.getElement();
    }
    
    /**
    * Descripción: Solicita un nombre de usuario existente, llama al método delete() de la lista de usuarios del sistema
    * y le pasa por parámetro el método BuscarUsuario() con el nombre inicialmente solicitado como parámetro
    * @author Andrés
    * @version 25/11/2023
    */
    public void DeleteUser(){
        String user_name = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario que desea eliminar: ");
        this.user_list.delete(BuscarUsuario(user_name));
    }
    /**
    * Descripción: Solicita un nombre de usuario existente, llama al método BuscarUsuario() con ese parámetro y a través de su retorno
    * llama al método createDocument()
    * @author Andrés
    * @version 25/11/2023
    */
    public void NewDocument(){
        String user_name = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario que desea crear el documento: ");
        BuscarUsuario(user_name).createDocument();
    }
    
    /**
    * Descripción: Solicita un nombre de usuario existente, llama al método BuscarUsuario() con ese parámetro y a través de su retorno
    * llama al método BorrarDocumento()
    * @author Andrés
    * @version 25/11/2023
    */
    public void DeleteDocument(){
        String user_name = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario que desea eliminar el documento: ");
        BuscarUsuario(user_name).BorrarDocumento();
    }
    
    public void AddDocument_Printer(){
        //¡¡AQUÍ VA LA FUNCIÓN INSERTAR AL MONTÍCULO!!
    }
}
