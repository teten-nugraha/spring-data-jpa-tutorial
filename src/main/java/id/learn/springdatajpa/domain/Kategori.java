package id.learn.springdatajpa.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * Project Name     : spring-data-jpa
 * Date Time        : 7/13/2020
 *
 * @author Teten Nugraha
 */

@Table()
@Data
@Entity(name = "tb_kategori")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Kategori {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama")
    private String nama;

    @Column(name = "maker")
    private String maker;

    @Column(name = "is_active")
    private boolean isActive;

    @OneToMany(
            mappedBy = "kategori",
            cascade = CascadeType.ALL
    )
    private List<Buku> bukus;

}
