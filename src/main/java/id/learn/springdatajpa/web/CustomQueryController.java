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
@RequestMapping("/api/customquery")
public class CustomQueryController {

    @Autowired
    private KategoriRepository kategoriRepository;

    @GetMapping("/{statusLong}")
    public List<Kategori> findAllByStatus(@PathVariable Long statusLong) {

        boolean status=false;
        if(statusLong == 1) {
            status = true;
        }else{
            status = false;
        }

        List<Kategori> datas = kategoriRepository.findAllByStatus(status);
        return datas;
    }

}
