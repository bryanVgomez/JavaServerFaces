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
@Table(name = "FONDO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fondo.findAll", query = "SELECT f FROM Fondo f")
    , @NamedQuery(name = "Fondo.findByIdFondo", query = "SELECT f FROM Fondo f WHERE f.idFondo = :idFondo")
    , @NamedQuery(name = "Fondo.findByNombre", query = "SELECT f FROM Fondo f WHERE f.nombre = :nombre")
    , @NamedQuery(name = "Fondo.findByDescripcion", query = "SELECT f FROM Fondo f WHERE f.descripcion = :descripcion")
    , @NamedQuery(name = "Fondo.findByPrecio", query = "SELECT f FROM Fondo f WHERE f.precio = :precio")})
public class Fondo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FONDO")
    private Integer idFondo;
    @Size(max = 45)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "PRECIO")
    private Integer precio;

    public Fondo() {
    }

    public Fondo(Integer idFondo) {
        this.idFondo = idFondo;
    }

    public Integer getIdFondo() {
        return idFondo;
    }

    public void setIdFondo(Integer idFondo) {
        this.idFondo = idFondo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idFondo != null ? idFondo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fondo)) {
            return false;
        }
        Fondo other = (Fondo) object;
        if ((this.idFondo == null && other.idFondo != null) || (this.idFondo != null && !this.idFondo.equals(other.idFondo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityTodo.Fondo[ idFondo=" + idFondo + " ]";
    }
    
}
