package NLayeredExampleKodlamaio.business;

import NLayeredExampleKodlamaio.dao.ICategoryDao;
import NLayeredExampleKodlamaio.entities.Category;
import NLayeredExampleKodlamaio.entities.Course;
import NLayeredExampleKodlamaio.log.Logger;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private ICategoryDao categoryDAO;
    private List<Category> categories;
    private List<Logger> loggers;



    public CategoryManager(ICategoryDao categoryDAO, List<Logger> loggers) {
        this.categoryDAO = categoryDAO;
        this.categories = new ArrayList<>();
        this.loggers = loggers;

    }

    public void add(String categoryName,List<Course> courses) {


        if (findCategory(categoryName) == null) {
            Category course = new Category(categoryName,courses);
            categories.add(course);
            categoryDAO.add(course);

            for (Logger logger : loggers) {
                logger.log(course.getCategoryName());
            }
        } else {
            System.out.println("!!! Bu Kategori veritabanına kayıtlıdır. !!!");
        }


    }


    private Category findCategory(String categoryName) {
        for (Category category :categories) {
            if (category.getCategoryName().equalsIgnoreCase(categoryName)) {
                return category;
            }
        }
        return null;
    }

}
