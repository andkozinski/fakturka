/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakturka.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import sample.jee.shop.model.AbstractEntity;

/**
 *
 * @author andrzej
 */
@Entity
@Table(name = "Produkt")
public class Produkt extends AbstractEntity implements Serializable {

      @Override
      protected Object getBusinessKey() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id;
      private Integer produkt_rodzaj;
      private Long idGrupy;
      private String indeks;
      private String nazwaProduktu;
            private Integer nrDlaKasyFiskalnej;

      /**
       * Get the value of nrDlaKasyFiskalnej
       *
       * @return the value of nrDlaKasyFiskalnej
       */
      public Integer getNrDlaKasyFiskalnej() {
            return nrDlaKasyFiskalnej;
      }

      /**
       * Set the value of nrDlaKasyFiskalnej
       *
       * @param nrDlaKasyFiskalnej new value of nrDlaKasyFiskalnej
       */
      public void setNrDlaKasyFiskalnej(Integer nrDlaKasyFiskalnej) {
            this.nrDlaKasyFiskalnej = nrDlaKasyFiskalnej;
      }


      /**
       * Get the value of nazwaProduktu
       *
       * @return the value of nazwaProduktu
       */
      public String getNazwaProduktu() {
            return nazwaProduktu;
      }

      /**
       * Set the value of nazwaProduktu
       *
       * @param nazwaProduktu new value of nazwaProduktu
       */
      public void setNazwaProduktu(String nazwaProduktu) {
            this.nazwaProduktu = nazwaProduktu;
      }

      /**
       * Get the value of indeks
       *
       * @return the value of indeks
       */
      public String getIndeks() {
            return indeks;
      }

      /**
       * Set the value of indeks
       *
       * @param indeks new value of indeks
       */
      public void setIndeks(String indeks) {
            this.indeks = indeks;
      }

      /**
       * Get the value of idGrupy
       *
       * @return the value of IdGrupy
       */
      public Long getidGrupy() {
            return idGrupy;
      }

      /**
       * Set the value of idGrupy
       *
       * @param idGrupy new value of IdGrupy
       */
      public void setidGrupy(Long idGrupy) {
            this.idGrupy = idGrupy;
      }

      /**
       * Get the value of produkt_rodzaj
       *
       * @return the value of produkt_rodzaj
       */
      public Integer getProdukt_rodzaj() {
            return produkt_rodzaj;
      }

      /**
       * Set the value of produkt_rodzaj
       *
       * @param produkt_rodzaj new value of produkt_rodzaj
       */
      public void setProdukt_rodzaj(Integer produkt_rodzaj) {
            this.produkt_rodzaj = produkt_rodzaj;
      }

      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

}
