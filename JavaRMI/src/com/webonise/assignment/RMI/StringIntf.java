package com.webonise.assignment.RMI;

import java.rmi.*;

/**
 * @author Anvay The StringIntf interface extends the Remote and interface
 *         declare one method that is check() and this interface is then
 *         implemented by StringImpl class
 */

public interface StringIntf extends Remote {

	int check(String str) throws RemoteException;
}
