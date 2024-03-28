package NLayeredExampleKodlamaio.business;

import NLayeredExampleKodlamaio.dao.IInstructorDao;
import NLayeredExampleKodlamaio.entities.Course;
import NLayeredExampleKodlamaio.entities.Instructor;
import NLayeredExampleKodlamaio.log.Logger;

import java.util.List;

public class InstructorManager {
    private IInstructorDao instructorDAO;
    private List<Logger> loggers;



    public InstructorManager(IInstructorDao instructorDAO,List<Logger> loggers) {
        this.instructorDAO = instructorDAO;
        this.loggers = loggers;
    }

    public void add(String firstName, String lastName, List<Course> courses) {

        Instructor instructor = new Instructor(firstName,lastName,courses);
        instructorDAO.add(instructor);

        for (Logger logger : loggers) {
            logger.log(instructor.getFirstName());
        }
    }
}
