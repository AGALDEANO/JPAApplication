package service;

import javax.ejb.Remote;
import javax.naming.NamingException;


import dao.Client;

import java.util.*;

@Remote
public interface CerisaieBeanRemote {

    public void ajouter(Client c) throws NamingException, Exception;
    public Client rechercherClient(String id) throws NamingException, Exception;
    public List<Client> listerTousLesClients() throws NamingException,Exception;
    public List<Object>  listerTousLesSportsClient () throws NamingException,Exception;

}
