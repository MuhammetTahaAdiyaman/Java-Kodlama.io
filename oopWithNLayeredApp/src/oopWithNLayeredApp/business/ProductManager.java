package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.ILogger;
import oopWithNLayeredApp.dataAccess.IProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;
import java.util.List;
//business kısmında iş kurallarını yazıyoruz
//örneğin aynı isimden iki defa ekleme yapılmayacak veri tabanına.
public class ProductManager {
    private IProductDao productDao;
    private ILogger[] loggerList;
    public ProductManager(IProductDao productDao,ILogger[] loggerList) {
        this.productDao = productDao;
        this.loggerList = loggerList;
    }

    public void add(Product product) throws Exception {
        if(product.getUnitPrice() < 10){
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
        }

        //bir katman başka bir katmanın classını kullanıyorken sadece interface'inden erişim kurmalıdır.
        //aşağıda bağımlılık devam ediyor bundan dolayı yukarıda private olarak productDao ınterface tanımlayalım.
        //JdbcProductDao productDao = new JdbcProductDao();
        productDao.add(product);
        for(ILogger logger:loggerList){
            logger.log(product.getName());
        }
    }
}
