/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Purchase;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PurchaseService extends Remote{
    
    public String newpurchase(Purchase purchase) throws RemoteException;
    public String updatepurchase(Purchase purchase) throws RemoteException;
    public String deletepurchase(Purchase purchase) throws RemoteException;
    public List<Purchase> getallPurchases() throws RemoteException;
    public Purchase getpurchase(Purchase purchase) throws RemoteException;
    public List<Purchase> retrieveTableData() throws RemoteException;
}
