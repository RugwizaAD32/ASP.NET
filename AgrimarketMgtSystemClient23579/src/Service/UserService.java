/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Product;
import Model.User;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface UserService extends Remote{
    public String newuser(User user) throws RemoteException;
    public String updateuser(User user) throws RemoteException;
    public String deleteuser(User user) throws RemoteException;
    public List<User> getUsers() throws RemoteException;
    public List<User> Login(String username, String password) throws RemoteException;
}
