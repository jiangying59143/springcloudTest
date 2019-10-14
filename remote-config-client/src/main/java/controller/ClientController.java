package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remote-config-client")
public class ClientController {

    @Value("${server.port}")
    private String port;

    @Value("${info}")
    private String info;

    @GetMapping("/test")
    public String test(){
        return port + "-" + info + 4;
    }
}
