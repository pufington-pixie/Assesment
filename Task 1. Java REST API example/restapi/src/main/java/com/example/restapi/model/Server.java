
package com.example.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class Server {


    // Instance variables
    private String id;
    private String name;
    private String language;
    private String framework;

    // Getters and setters automatically generated by Lombok annotations
    // No need to write boilerplate code

    // Default constructor automatically generated by Lombok annotations
    // No need to write boilerplate code

    // Constructor with all instance variables as parameters
    // Automatically generated by Lombok annotations
    // No need to write boilerplate code
}

