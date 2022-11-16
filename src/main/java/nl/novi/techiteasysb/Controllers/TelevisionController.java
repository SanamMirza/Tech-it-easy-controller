package nl.novi.techiteasysb.Controllers;

import nl.novi.techiteasysb.Exceptions.RecordNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TelevisionController {
    private ArrayList<String> televisions;

    public TelevisionController() {
        televisions = new ArrayList<>();
    }

    @GetMapping("/televisions")
    public ResponseEntity<Object> getTelevisions() {
        return ResponseEntity.ok("television");
    }

    @GetMapping("/televisions/{id}")
    public ResponseEntity<Object> getTelevision(@PathVariable int id) {
        if (id < 10) {
            return ResponseEntity.ok("television" + id);
        } else {
            throw new RecordNotFoundException("id not found");
        }
    }

    @PostMapping("/televisions")
    public ResponseEntity<Object> addTelevision (@RequestBody String Television) {
        televisions.add(television);
        return ResponseEntity.created(null).body("television added");
    }

    @PutMapping("/television/{id}")
    public ResponseEntity<Object> updateTelevision (@PathVariable int id, @RequestBody String television) {
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/televisions/{id}")
    public ResponseEntity<Object> deleteTelevision (@PathVariable int id) {
        return ResponseEntity.noContent().build();
    }}


