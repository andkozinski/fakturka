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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andrzej
 */
@Entity
@Table(name = "Produkt")
@XmlRootElement
public class Produkt extends AbstractEntity implements Serializable {

      public Produkt() {
      }

      @Override
      protected Object getBusinessKey() {
            return indeks;
      }

      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      @Column(updatable = false)
      private Long id;

      @Enumerated(EnumType.STRING)
      @Column(name = "produktTyp")
      private ProduktTyp produktTyp;

      @ManyToOne
      @JoinColumn(name = "idKategori")
      private Kategoria kategoria;

      @Column(name = "indeks", length = 32, nullable = false, unique = true)
      private String indeks;
      private String nazwaProduktu;
      private Integer nrDlaKasyFiskalnej;

      @Size(max = 200, message = "{constraint.string.length.toolong}")
      @Column(name = "opis", length = 1800)
      private String opis;

      public ProduktTyp getProduktTyp() {
            return produktTyp;
      }

      public void setProduktTyp(ProduktTyp produktTyp) {
            this.produktTyp = produktTyp;
      }

      public Kategoria getKategoria() {
            return kategoria;
      }

      public void setKategoria(Kategoria kategoria) {
            this.kategoria = kategoria;
      }

      public String getOpis() {
            return opis;
      }

      public void setOpis(String opis) {
            this.opis = opis;
      }

      public Integer getNrDlaKasyFiskalnej() {
            return nrDlaKasyFiskalnej;
      }

      public void setNrDlaKasyFiskalnej(Integer nrDlaKasyFiskalnej) {
            this.nrDlaKasyFiskalnej = nrDlaKasyFiskalnej;
      }

      public String getNazwaProduktu() {
            return nazwaProduktu;
      }

      public void setNazwaProduktu(String nazwaProduktu) {
            this.nazwaProduktu = nazwaProduktu;
      }

      public String getIndeks() {
            return indeks;
      }

      public void setIndeks(String indeks) {
            this.indeks = indeks;
      }

      @Override
      public Long getId() {
            return id;
      }
}
