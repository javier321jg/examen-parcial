
package pe.ucs.clase06.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.ucs.clase06.model.Editorial;
import pe.ucs.clase06.service.EditorialService;

/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/edito")
public class EditorialRestController {

    @Autowired
    private EditorialService editoService;

    @GetMapping("/all")
    public List<Editorial> getEditorial() {
        return editoService.readAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Editorial> getEditorial(@PathVariable int id) {
        Editorial post = editoService.read(id);
        return ResponseEntity.ok(post);
    }

    @DeleteMapping("/{id}")
    public int deleteEditorial(@PathVariable int id) {        
        return editoService.delete(id);
    }
    @PostMapping("/add")
    public int addEditorial(@RequestBody Editorial edito) {  
        System.out.println(edito.getNombre());
        return editoService.create(edito);
    }
    @PutMapping("/edito")
    public int editEditorial(@RequestBody Editorial edito) {  
        Editorial pos = new Editorial(edito.getIdeditorial(),edito.getNombre(),edito.getPais());
        System.out.println(edito.getIdeditorial()+" , "+edito.getNombre()+" , "+edito.getPais());
        return editoService.update(edito);
    }
}
