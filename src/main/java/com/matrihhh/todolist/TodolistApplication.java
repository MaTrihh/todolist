package com.matrihhh.todolist;

import com.matrihhh.todolist.model.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {



		SpringApplication.run(TodolistApplication.class, args);


	}

}
