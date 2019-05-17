/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityTodo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Connectis
 */
@Entity
@Table(name = "BEBESTIBLES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bebestibles.findAll", query = "SELECT b FROM Bebestibles b")
    , @NamedQuery(name = "Bebestibles.findByIdBebestibles", query = "SELECT b FROM Bebestibles b WHERE b.idBebestibles = :idBebestibles")
    , @NamedQuery(name = "Bebestibles.findByDescripcion", query = "SELECT b FROM Bebestibles b WHERE b.descripcion = :descripcion")
    , @NamedQuery(name = "Bebestibles.findByNombre", query = "SELECT b FROM Bebestibles b WHERE b.nombre = :nombre")
    , @NamedQuery(name = "Bebestibles.findByPrecio", query = "SELECT b FROM Bebestibles b WHERE b.precio = :precio")})
public class Bebestibles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_BEBESTIBLES")
    private Integer idBebestibles;
    @Size(max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "PRECIO")
    private Integer precio;

    public Bebestibles() {
    }

    public Bebestibles(Integer idBebestibles) {
        this.idBebestibles = idBebestibles;
    }

    public Integer getIdBebestibles() {
        return idBebestibles;
    }

    public void setIdBebestibles(Integer idBebestibles) {
        this.idBebestibles = idBebestibles;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBebestibles != null ? idBebestibles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bebestibles)) {
            return false;
        }
        Bebestibles other = (Bebestibles) object;
        if ((this.idBebestibles == null && other.idBebestibles != null) || (this.idBebestibles != null && !this.idBebestibles.equals(other.idBebestibles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityTodo.Bebestibles[ idBebestibles=" + idBebestibles + " ]";
    }
    
}
