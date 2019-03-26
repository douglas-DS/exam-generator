package br.com.ds.examgenerator.endpoint.v1;

import br.com.ds.examgenerator.error.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Douglas Souza on 25/03/2019
 */
@RestController
@RequestMapping("v1/professor")
public class ProfessorEndPoint {

    @GetMapping
    public ResponseEntity<?> hi() {
//        verifyIfProfessorExists();
        return new ResponseEntity<>("Hi", HttpStatus.OK);
    }

    public void verifyIfProfessorExists(Long id) {
        if (id == null)
            throw new ResourceNotFoundException("Professor not found for ID: " + id);
    }

}
