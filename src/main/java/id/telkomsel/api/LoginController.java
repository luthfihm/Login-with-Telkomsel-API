package id.telkomsel.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by luthfi on 07/12/15.
 */
@RestController
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<String> login(@RequestBody String phoneNumber) {
        String token = "123456";
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping(value = "/validateLoginToken", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> validateToken(@RequestBody String loginSession) {

        String apiToken = "123456789";
        return new ResponseEntity<String>(apiToken,HttpStatus.OK);
    }
}
