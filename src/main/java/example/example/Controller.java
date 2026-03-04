package example.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String helloWorld(){
        return """
                Hello World \
                
                 Integrantes: \
                
                 João Victor Alves da Silva: RM559726 \
                
                 Vinicius Kenzo Tocuyosi: RM559982""";
    }
}
