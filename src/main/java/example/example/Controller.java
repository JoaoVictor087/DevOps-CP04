package example.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String helloWorld(){
        return """
                Hello World \n
               \s
                 Integrantes: \n
               \s
                 João Victor Alves da Silva: RM559726 \n
                 Vinicius Kenzo Tocuyosi: RM559982 \n
                 Juan Pablo Rebelo Coelho RM:560445
                \s""";
    }
    @GetMapping("/health")
    public String health(){
        return "Está saudável!";
    }
}
