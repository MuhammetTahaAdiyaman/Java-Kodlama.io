package NLayeredExampleKodlamaio.dao;

import NLayeredExampleKodlamaio.entities.Category;
import NLayeredExampleKodlamaio.entities.Course;
import NLayeredExampleKodlamaio.entities.Instructor;

public class Hibernate implements ICategoryDao,IInstructorDao,ICourseDao{
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName()+"Hibernate ile eklendi");
    }

    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName()+"Hibernate ile eklendi");

    }

    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName()+instructor.getLastName()+"Hibernate ile eklendi");

    }
}
