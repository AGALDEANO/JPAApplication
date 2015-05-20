package service;

import dao.Client;

import javax.ejb.Remote;
import javax.naming.NamingException;
import java.util.List;

@Remote
public interface CerisaieBeanRemote {

    public void ajouter(Client c) throws NamingException, Exception;

    public Client rechercherClient(String id) throws NamingException, Exception;

    public List<Client> listerTousLesClients() throws NamingException, Exception;

    public List<Object> listerTousLesSportsClient() throws NamingException, Exception;

}
