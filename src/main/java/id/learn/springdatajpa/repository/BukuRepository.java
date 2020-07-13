package id.learn.springdatajpa.repository;

import id.learn.springdatajpa.domain.Buku;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project Name     : spring-data-jpa
 * Date Time        : 7/13/2020
 *
 * @author Teten Nugraha
 */

public interface BukuRepository extends JpaRepository<Buku, Long> {
}
