import NLayeredExampleKodlamaio.business.CategoryManager;
import NLayeredExampleKodlamaio.business.CourseManager;
import NLayeredExampleKodlamaio.business.InstructorManager;
import NLayeredExampleKodlamaio.dao.Hibernate;
import NLayeredExampleKodlamaio.dao.JdbcDao;
import NLayeredExampleKodlamaio.entities.Course;
import NLayeredExampleKodlamaio.log.DatabaseLogger;
import NLayeredExampleKodlamaio.log.FileLogger;
import NLayeredExampleKodlamaio.log.Logger;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Course> programlama = new ArrayList<>(List.of(
                new Course("Java",34.5),
                new Course("C++",14.5)
        ));

        ArrayList<Course> veritabani = new ArrayList<>(List.of(
                new Course("MySql",84.7),
                new Course("Oracle",18.5)
        ));

        ArrayList<Logger> loggers = new ArrayList<>(List.of(
                new FileLogger(),
                new DatabaseLogger()
        ));

        InstructorManager instructorManager = new InstructorManager(new Hibernate(),loggers);
        instructorManager.add("Ali","Kaya",veritabani);

        System.out.println("-".repeat(30));

        // Test 1 --> Bir kursun fiyatı 0 dan küçükse veritabanına eklenmez.
        CourseManager courseManager = new CourseManager(new JdbcDao(),loggers);
        courseManager.add("Temel Java Kursu",-1);

        System.out.println("-".repeat(30));

        // Test 2 --> Aynı ada sahip kurslar veritabanına eklenemez.

        CourseManager courseManager1 = new CourseManager(new Hibernate(),loggers);
        courseManager1.add("Python Introduction",45.8);
        courseManager1.add("Python Introduction",45.8); // Tekrar Veri Tabanına Eklenemez

        System.out.println("-".repeat(30));

        // Test 3 --> Aynı ada sahip kategoriler veritabanına eklenemez.
        CategoryManager categoryManager = new CategoryManager(new Hibernate(),loggers);
        categoryManager.add("Programlama",programlama);
        categoryManager.add("Programlama",programlama); // Tekrar Veri Tabanına eklenemez


    }
}