package jon.jpajonprep.controller;

import jon.jpajonprep.model.Flag;
import jon.jpajonprep.model.FlagRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController { // Mathias.

    @PostMapping("/findFlag")
    public ResponseEntity<Flag> findFlag(@RequestBody FlagRequest flagRequest){
        Flag flag = new Flag();
        System.out.println("received request " + flagRequest.getRequest());
        flag.setMessage("Flag is here! TU+TU " + flagRequest.getRequest() );
        return new ResponseEntity<>(flag, HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<String> check(){
        return new ResponseEntity<>("Check checks out", HttpStatus.OK);
    }

}
