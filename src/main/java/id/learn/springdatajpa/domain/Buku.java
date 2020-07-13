package id.learn.springdatajpa.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * Project Name     : spring-data-jpa
 * Date Time        : 7/13/2020
 *
 * @author Teten Nugraha
 */

@Table()
@Data
@Entity(name = "tb_buku")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Buku {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama")
    private String nama;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "kategori_id", nullable = false)
    @JsonIgnore
    private Kategori kategori;

}
