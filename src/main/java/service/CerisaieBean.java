package service;

import dao.Client;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Session Bean implementation class CerisaieBean
 */
@Stateless(mappedName = "GestCerisaie")
@Remote(CerisaieBeanRemote.class)
public class CerisaieBean implements CerisaieBeanRemote {

    @PersistenceContext(unitName = "JPACerisaie")
    private EntityManager em;

    public void ajouter(Client unclient) throws Exception {

        try {

            em.persist(unclient);
        } catch (Exception ne) {
            System.out.println(ne.getMessage());
            throw ne;
        }
    }

    public Client rechercherClient(String id) throws Exception {

        try {

            return em.find(Client.class, id);
        } catch (Exception ne) {
            System.out.println(ne.getMessage());
            throw ne;
        }
    }

    @SuppressWarnings("unchecked")
    public List<Client> listerTousLesClients() throws Exception {

        try {

            return em.createQuery("SELECT c FROM Client c ORDER BY c.nomCli").getResultList();

        } catch (Exception ne) {
            System.out.println(ne.getMessage());
            throw ne;
        }
    }


    @SuppressWarnings("unchecked")
    public List<Object> listerTousLesSportsClient() throws Exception {
        /*Select  j.numsej , c.nomCli, s.libelleSport, a.datejour
		From Client c, activite a, Sport s, Sejour j
		where c.numcli = j.numcli 
		and a.numsej  = j.numsej
		and a.codeSport = s.codeSport
		order by j.numsej*/


        String hql = " SELECT  j.numSej, c.nomCli, s.libelleSport, a.id.dateJour ";
        hql += " from Client c, Activite a, Sejour j, Sport s ";
        hql += " where c.numCli = j.client.numCli  ";
        hql += " and a.sejour.numSej  = j.numSej ";
        hql += " and a.sport.codeSport = s.codeSport ";
        hql += " order by j.numSej";

        try {
            return em.createQuery(hql).getResultList();

        } catch (Exception ne) {
            System.out.println(ne.getMessage());
            throw ne;
        }
    }


    /**
     * Default constructor.
     */
    public CerisaieBean() {
        // TODO Auto-generated constructor stub
    }

}
