package timife;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ResponseClientController {

    @GetMapping
    public String getClientResponse(){
        return "Client is tested";
    }
}
