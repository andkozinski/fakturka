package fakturka.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Wraps all the information needed to paginate a table.
 *
 * @author Roberto Cortez
 */
@XmlRootElement
public class PaginatedListWrapper implements Serializable {

      private Integer currentPage;
      private Integer pageSize;
      private Integer totalResults;

      private String sortFields;
      private String sortDirections;
      @XmlElement
      private List<Produkt> listProdukt;
      @XmlElement
      private List<Kategoria> listKategoria;

      public Integer getCurrentPage() {
            return currentPage;
      }

      public void setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
      }

      public Integer getPageSize() {
            return pageSize;
      }

      public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
      }

      public Integer getTotalResults() {
            return totalResults;
      }

      public void setTotalResults(Integer totalResults) {
            this.totalResults = totalResults;
      }

      public String getSortFields() {
            return sortFields;
      }

      public void setSortFields(String sortFields) {
            this.sortFields = sortFields;
      }

      public String getSortDirections() {
            return sortDirections;
      }

      public void setSortDirections(String sortDirections) {
            this.sortDirections = sortDirections;
      }

      public List<Produkt> getListProdukt() {
            return listProdukt;
      }

      public void setListProdukt(List<Produkt> listProdukt) {
            this.listProdukt = listProdukt;
      }

      public List<Kategoria> getListKategoria() {
            return listKategoria;
      }

      public void setListKategoria(List<Kategoria> listKategoria) {
            this.listKategoria = listKategoria;
      }

}
