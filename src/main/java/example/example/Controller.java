package example.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String helloWorld(){
        return """
                Hello World \n
                
                 Integrantes: \n
                
                 João Victor Alves da Silva: RM559726 \n
                
                 Vinicius Kenzo Tocuyosi: RM559982""";
    }
    @GetMapping("/health")
    public String health(){
        return "Está saudável!";
    }
}
