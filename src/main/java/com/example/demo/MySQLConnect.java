package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MySQLConnect implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(MySQLConnect.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String sql = "INSERT INTO cards (theme, type, body, cost) VALUES (?, ?, ?, ?)";

        int result = jdbcTemplate.update(sql, "first card", "regular", "one teo three", 100);

        if (result > 0) {
            System.out.println("A new row has been inserted.");
        }

    }

}