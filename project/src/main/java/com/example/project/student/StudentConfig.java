//package com.example.project.student;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//@Configuration
//public class StudentConfig {
//@Bean
//    CommandLineRunner commandLineRunner(
//            StudentRepository repository)
//{
//    return args -> {
//      Student Christah =  new Student(
//                        "kiki",
//                        LocalDate.of(2000, Month.JANUARY, 2),
//                        "christabelchinyanganya@gmail.com"
//
//                );
//
//        Student Shingie =  new Student(
//                "Shingie",
//                LocalDate.of(2003, Month.JANUARY, 2),
//                "shingiechinya@gmail.com"
//
//        );
//        repository.saveAll(
//                List.of(Christah,Shingie)
//        );
//    };
//}
//}
