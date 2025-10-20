package adj.demo.server.modules.test;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adj-api/test")
@CrossOrigin(origins = "*")
public class TestController {

    @GetMapping("")
    public ResponseEntity<?> getResponse() {
        HashMap<String, Object> response = new HashMap<>();
        response.put("messae", "Api funcionando...");
        response.put("data", "OK");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
