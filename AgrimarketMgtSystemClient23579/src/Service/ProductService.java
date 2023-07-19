/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Product;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ProductService extends Remote{
    public String newpoduct(Product product) throws RemoteException;
    public String updateproduct(Product product) throws RemoteException;
    public String deleteproduct(Product product) throws RemoteException;
    public List<Product> getProducts() throws RemoteException;
    public Product getProduct (Product product) throws RemoteException;
}
