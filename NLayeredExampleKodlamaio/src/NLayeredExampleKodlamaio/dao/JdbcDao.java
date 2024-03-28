package NLayeredExampleKodlamaio.dao;

import NLayeredExampleKodlamaio.entities.Category;
import NLayeredExampleKodlamaio.entities.Course;
import NLayeredExampleKodlamaio.entities.Instructor;

public class JdbcDao implements ICategoryDao,ICourseDao,IInstructorDao{
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName()+"JDBC ile eklendi");
    }

    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName()+"JDBC ile eklendi");

    }

    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName()+instructor.getLastName()+"JDBC ile eklendi");

    }
}
