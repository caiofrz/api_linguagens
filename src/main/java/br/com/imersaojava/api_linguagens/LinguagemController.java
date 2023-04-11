package br.com.imersaojava.api_linguagens;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    private List<Linguagem> linguagens = 
            List.of(
                new Linguagem("Java", 
                    "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 
                    1),
                new Linguagem("PHP", 
                    "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png",
                    2)
            );
    
    @GetMapping(value="/")
    public String hellowWorld() {
        return "Hello, World";
    }

    @GetMapping(value="/linguagens")
    public List<Linguagem> getLinguagens() {
        return linguagens;
    }
}
