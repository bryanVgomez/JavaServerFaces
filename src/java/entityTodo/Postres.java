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
@Table(name = "POSTRES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Postres.findAll", query = "SELECT p FROM Postres p")
    , @NamedQuery(name = "Postres.findByIdPostre", query = "SELECT p FROM Postres p WHERE p.idPostre = :idPostre")
    , @NamedQuery(name = "Postres.findByNombre", query = "SELECT p FROM Postres p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Postres.findByDescripcion", query = "SELECT p FROM Postres p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Postres.findByPrecio", query = "SELECT p FROM Postres p WHERE p.precio = :precio")})
public class Postres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_POSTRE")
    private Integer idPostre;
    @Size(max = 45)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 45)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "PRECIO")
    private Integer precio;

    public Postres() {
    }

    public Postres(Integer idPostre) {
        this.idPostre = idPostre;
    }

    public Integer getIdPostre() {
        return idPostre;
    }

    public void setIdPostre(Integer idPostre) {
        this.idPostre = idPostre;
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
        hash += (idPostre != null ? idPostre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Postres)) {
            return false;
        }
        Postres other = (Postres) object;
        if ((this.idPostre == null && other.idPostre != null) || (this.idPostre != null && !this.idPostre.equals(other.idPostre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityTodo.Postres[ idPostre=" + idPostre + " ]";
    }
    
}
