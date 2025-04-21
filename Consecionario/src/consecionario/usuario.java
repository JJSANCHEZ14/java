/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consecionario;

/**
 *
 * @author ZHAYDITH
 */
public class usuario extends Propietario {
    
  
    private String userName;
    private String userPassword;

    public usuario(String nombre) {
        super(nombre);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public usuario(String userName, String userPassword, String nombre) {
        super(nombre);
        this.userName = userName;
        this.userPassword = userPassword;
    }
    
    
}
