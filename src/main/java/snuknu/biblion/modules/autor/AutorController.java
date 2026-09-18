package snuknu.biblion.modules.autor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import snuknu.biblion.modules.autor.dto.AutorView;

@RestController
@RequestMapping("/info")
public class AutorController {

    @GetMapping
    public ResponseEntity<AutorView> info(){

        AutorView info = new AutorView(1L,"Hello World!");
        return ResponseEntity.ok(info);
    }
}
