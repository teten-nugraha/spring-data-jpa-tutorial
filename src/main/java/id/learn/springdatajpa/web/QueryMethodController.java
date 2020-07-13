package id.learn.springdatajpa.web;

import id.learn.springdatajpa.domain.Kategori;
import id.learn.springdatajpa.repository.KategoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/api/querymethod")
public class QueryMethodController {

    @Autowired
    private KategoriRepository kategoriRepository;

    @GetMapping("/{maker}")
    public List<Kategori> findAll(@PathVariable String maker) {
        return kategoriRepository.findAllByMaker(maker);
    }

}
