package id.learn.springdatajpa.repository;

import id.learn.springdatajpa.domain.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Project Name     : spring-data-jpa
 * Date Time        : 7/13/2020
 *
 * @author Teten Nugraha
 */

public interface KategoriRepository extends JpaRepository<Kategori, Long> {

    List<Kategori> findAllByMaker(String maker);

    @Query(
            nativeQuery=true,
            value="select * from db_kategori where is_active = ?1"
    )
    List<Kategori> findAllByStatus(boolean isActive);



}
