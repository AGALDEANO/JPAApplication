package dao;

import javax.persistence.*;

/**
 * @author Alexandre
 *         20/05/2015
 */
@Entity
@Table(name = "emplacement", schema = "", catalog = "cerisaie")
public class Emplacement {
    private int numEmpl;
    private float surfaceEmpl;
    private int nbPersMaxEmpl;

    @Id
    @Column(name = "NumEmpl")
    public int getNumEmpl() {
        return numEmpl;
    }

    public void setNumEmpl(int numEmpl) {
        this.numEmpl = numEmpl;
    }

    @Basic
    @Column(name = "SurfaceEmpl")
    public float getSurfaceEmpl() {
        return surfaceEmpl;
    }

    public void setSurfaceEmpl(float surfaceEmpl) {
        this.surfaceEmpl = surfaceEmpl;
    }

    @Basic
    @Column(name = "NbPersMaxEmpl")
    public int getNbPersMaxEmpl() {
        return nbPersMaxEmpl;
    }

    public void setNbPersMaxEmpl(int nbPersMaxEmpl) {
        this.nbPersMaxEmpl = nbPersMaxEmpl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emplacement that = (Emplacement) o;

        if (numEmpl != that.numEmpl) return false;
        if (Float.compare(that.surfaceEmpl, surfaceEmpl) != 0) return false;
        if (nbPersMaxEmpl != that.nbPersMaxEmpl) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numEmpl;
        result = 31 * result + (surfaceEmpl != +0.0f ? Float.floatToIntBits(surfaceEmpl) : 0);
        result = 31 * result + nbPersMaxEmpl;
        return result;
    }
}
