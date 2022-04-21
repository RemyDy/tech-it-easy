package nl.remco.techiteasy.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionsController
{

    // Get: alle televisies
    @GetMapping("/televisions")
    public ResponseEntity<Object> getAllTelevisions()
    {
        return ResponseEntity.ok().build();
    }

    // Get: 1 televisie
    @GetMapping("/televisions/{id}")
    public ResponseEntity<Object> getTelevisionById(long id)
    {
        return ResponseEntity.ok().build();
    }

    // Post: maak een nieuwe televisie aan
    @PostMapping("/television")
    public ResponseEntity<Object> createTelevision(@RequestBody String television)
    {
        return ResponseEntity.created();
    }

    // Put: pas 1 televisie aan
    @PutMapping("/televisions/{id}")
    public ResponseEntity<Object> modifyTelevisionById(@PathVariable int id, @RequestBody Object name)
    {
        return ResponseEntity.noContent().build();
    }

    // Delete: verwijder 1 televisie
    @DeleteMapping("/televisions/{id}")
    public ResponseEntity<Object> deleteTelevisionById(@PathVariable int id, @RequestBody Object name)
    {
        return ResponseEntity.noContent().build();
    }

}
