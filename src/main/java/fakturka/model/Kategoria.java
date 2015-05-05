/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakturka.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author andrew
 */
@Entity
@Table(name = "kategoria")
@XmlRootElement
public class Kategoria extends AbstractEntity implements Serializable {

      public Kategoria() {
      }

      @Override
      protected Object getBusinessKey() {
            return nazwa;
      }

      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id;

      @Column(nullable = false, unique = true)
      private Long idParent;

      @OneToMany(mappedBy = "kategoria")
      List<Produkt> listaProduktow = new ArrayList<>();

      @XmlTransient
      public List<Produkt> getListaProduktow() {
            return listaProduktow;
      }

      public Long getIdParent() {
            return idParent;
      }

      public void setIdParent(Long idParent) {
            this.idParent = idParent;
      }

      @NotNull
      @Size(min = 3, max = 64, message = "{constraint.string.length.notinrange}")
      @Column(name = "nazwa", length = 64, nullable = false)
      private String nazwa;

      @JoinColumn(nullable = false)
      @ManyToOne
      private Produkt produkt;

      public String getNazwa() {
            return nazwa;
      }

      public void setNazwa(String nazwa) {
            this.nazwa = nazwa;
      }

      @Override
      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

}
