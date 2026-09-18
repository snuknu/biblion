package snuknu.biblion.config;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import snuknu.biblion.modules.autor.Autor;
import snuknu.biblion.modules.autor.AutorRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SetupDataLoader implements
        ApplicationListener<ContextRefreshedEvent> {

    boolean alreadySetup = false;

    @Autowired
    private AutorRepository autorRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {

        if (alreadySetup) return;

        Autor autorTest1 = new Autor(null, "Vinicius de Moraes", "https://pt.wikipedia.org/wiki/Vinicius_de_Moraes");
        Autor autorTest2 = new Autor(null, "Machado de Assis", "https://pt.wikipedia.org/wiki/Machado_de_Assis");
        Autor autorTest3 = new Autor(null, "Castro Alves", "https://pt.wikipedia.org/wiki/Castro_Alves");
        Autor autorTest4 = new Autor(null, "Clarice Lispector", "https://pt.wikipedia.org/wiki/Clarice_Lispector");

        List<Autor> autores = new ArrayList<>(Arrays.asList(autorTest1, autorTest2, autorTest3, autorTest4));
        autorRepository.saveAll(autores);

        alreadySetup = true;
    }
}
