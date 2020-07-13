package id.learn.springdatajpa.web;

import id.learn.springdatajpa.domain.Buku;
import id.learn.springdatajpa.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Project Name     : spring-data-jpa
 * Date Time        : 7/13/2020
 *
 * @author Teten Nugraha
 */

@RestController
@RequestMapping("/api/buku")
public class BukuController {

    @Autowired
    private BukuRepository bukuRepository;

    @GetMapping
    public List<Buku> findAll() {
        return bukuRepository.findAll();
    }

}
