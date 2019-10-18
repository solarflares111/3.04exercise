package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Course course;
        course = new Course("1989", "Ford", "description is Fairmont", 9);
        repository.save(course);

        course = new Course("1992", "Chevy", "description is Cavalier", 8);
        repository.save(course);

        course = new Course("2004", "Toyota", "model description is Corolla", 7);
        repository.save(course);
    }
}
