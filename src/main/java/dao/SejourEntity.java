package dao;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author Alexandre
 *         20/05/2015
 */
@Entity
@Table(name = "sejour", schema = "", catalog = "cerisaie")
public class SejourEntity {
    private int numSej;
    private Date datedebSej;
    private Date dateFinSej;
    private Integer nbPersonnes;

    @Id
    @Column(name = "NumSej")
    public int getNumSej() {
        return numSej;
    }

    public void setNumSej(int numSej) {
        this.numSej = numSej;
    }

    @Basic
    @Column(name = "DatedebSej")
    public Date getDatedebSej() {
        return datedebSej;
    }

    public void setDatedebSej(Date datedebSej) {
        this.datedebSej = datedebSej;
    }

    @Basic
    @Column(name = "DateFinSej")
    public Date getDateFinSej() {
        return dateFinSej;
    }

    public void setDateFinSej(Date dateFinSej) {
        this.dateFinSej = dateFinSej;
    }

    @Basic
    @Column(name = "NbPersonnes")
    public Integer getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(Integer nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SejourEntity that = (SejourEntity) o;

        if (numSej != that.numSej) return false;
        if (datedebSej != null ? !datedebSej.equals(that.datedebSej) : that.datedebSej != null) return false;
        if (dateFinSej != null ? !dateFinSej.equals(that.dateFinSej) : that.dateFinSej != null) return false;
        if (nbPersonnes != null ? !nbPersonnes.equals(that.nbPersonnes) : that.nbPersonnes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numSej;
        result = 31 * result + (datedebSej != null ? datedebSej.hashCode() : 0);
        result = 31 * result + (dateFinSej != null ? dateFinSej.hashCode() : 0);
        result = 31 * result + (nbPersonnes != null ? nbPersonnes.hashCode() : 0);
        return result;
    }
}
