package id.learn.springdatajpa.web;

import id.learn.springdatajpa.domain.Kategori;
import id.learn.springdatajpa.repository.KategoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Project Name     : spring-data-jpa
 * Date Time        : 7/13/2020
 *
 * @author Teten Nugraha
 */

@RestController
@RequestMapping("/api/defaultquery")
public class DefaultQueryController {

    @Autowired
    private KategoriRepository kategoriRepository;

    @GetMapping("/findAll")
    public List<Kategori> findAll() {
        return kategoriRepository.findAll();
    }

    @PostMapping()
    public Kategori save(@RequestBody Kategori kategori) {
        return kategoriRepository.save(kategori);
    }

    @GetMapping("/findById/{id}")
    public Kategori findById(@PathVariable("id") Long id) {
        return kategoriRepository.findById(id).orElse(null);
    }
}
