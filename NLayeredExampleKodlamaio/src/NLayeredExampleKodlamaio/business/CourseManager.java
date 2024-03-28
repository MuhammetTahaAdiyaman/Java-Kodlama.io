package NLayeredExampleKodlamaio.business;

import NLayeredExampleKodlamaio.dao.ICourseDao;
import NLayeredExampleKodlamaio.entities.Course;
import NLayeredExampleKodlamaio.log.Logger;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private ICourseDao courseDAO;
    private List<Course> courses;
    private List<Logger> loggers;



    public CourseManager(ICourseDao courseDAO, List<Logger> loggers) {
        this.courseDAO = courseDAO;
        this.courses = new ArrayList<>();
        this.loggers = loggers;

    }

    public void add(String courseName,double price) {

        if (price < 0) {
            System.out.println("!!! Kurs ücreti " + price + " olarak girilemez. !!!");
            return;
        }

        if (findCourse(courseName) == null) {
            Course course = new Course(courseName,price);
            courses.add(course);
            courseDAO.add(course);

            for (Logger logger : loggers) {
                logger.log(course.getCourseName());
            }
        } else {
            System.out.println("!!! Bu kurs veritabanına kayıtlıdır. !!!");
        }


    }


    private Course findCourse(String courseName) {
        for (Course course :courses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                return course;
            }
        }
        return null;
    }
}
