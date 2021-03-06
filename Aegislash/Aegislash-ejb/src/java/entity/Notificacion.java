/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jange
 */
@Entity
@Table(name = "NOTIFICACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notificacion.findAll", query = "SELECT n FROM Notificacion n")
    , @NamedQuery(name = "Notificacion.findByIdnotificacion", query = "SELECT n FROM Notificacion n WHERE n.idnotificacion = :idnotificacion")
    , @NamedQuery(name = "Notificacion.findByLeido", query = "SELECT n FROM Notificacion n WHERE n.leido = :leido")})
public class Notificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNOTIFICACION")
    private Integer idnotificacion;
    @Column(name = "LEIDO")
    private Boolean leido;
    @JoinColumn(name = "EMISOR", referencedColumnName = "CORREO")
    @ManyToOne
    private Usuarios emisor;
    @JoinColumn(name = "RECEPTOR", referencedColumnName = "CORREO")
    @ManyToOne
    private Usuarios receptor;

    public Notificacion() {
    }

    public Notificacion(Integer idnotificacion) {
        this.idnotificacion = idnotificacion;
    }

    public Integer getIdnotificacion() {
        return idnotificacion;
    }

    public void setIdnotificacion(Integer idnotificacion) {
        this.idnotificacion = idnotificacion;
    }

    public Boolean getLeido() {
        return leido;
    }

    public void setLeido(Boolean leido) {
        this.leido = leido;
    }

    public Usuarios getEmisor() {
        return emisor;
    }

    public void setEmisor(Usuarios emisor) {
        this.emisor = emisor;
    }

    public Usuarios getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuarios receptor) {
        this.receptor = receptor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnotificacion != null ? idnotificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notificacion)) {
            return false;
        }
        Notificacion other = (Notificacion) object;
        if ((this.idnotificacion == null && other.idnotificacion != null) || (this.idnotificacion != null && !this.idnotificacion.equals(other.idnotificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Notificacion[ idnotificacion=" + idnotificacion + " ]";
    }
    
}
