package dao;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author Alexandre
 *         20/05/2015
 */
@Entity
@Table(name = "activite", schema = "", catalog = "cerisaie")
@IdClass(ActiviteEntityPK.class)
public class ActiviteEntity {
    private int codeSport;
    private Date dateJour;
    private int numSej;
    private Integer nbloc;

    @Id
    @Column(name = "CodeSport")
    public int getCodeSport() {
        return codeSport;
    }

    public void setCodeSport(int codeSport) {
        this.codeSport = codeSport;
    }

    @Id
    @Column(name = "DateJour")
    public Date getDateJour() {
        return dateJour;
    }

    public void setDateJour(Date dateJour) {
        this.dateJour = dateJour;
    }

    @Id
    @Column(name = "NumSej")
    public int getNumSej() {
        return numSej;
    }

    public void setNumSej(int numSej) {
        this.numSej = numSej;
    }

    @Basic
    @Column(name = "NBLOC")
    public Integer getNbloc() {
        return nbloc;
    }

    public void setNbloc(Integer nbloc) {
        this.nbloc = nbloc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActiviteEntity that = (ActiviteEntity) o;

        if (codeSport != that.codeSport) return false;
        if (numSej != that.numSej) return false;
        if (dateJour != null ? !dateJour.equals(that.dateJour) : that.dateJour != null) return false;
        if (nbloc != null ? !nbloc.equals(that.nbloc) : that.nbloc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeSport;
        result = 31 * result + (dateJour != null ? dateJour.hashCode() : 0);
        result = 31 * result + numSej;
        result = 31 * result + (nbloc != null ? nbloc.hashCode() : 0);
        return result;
    }
}
