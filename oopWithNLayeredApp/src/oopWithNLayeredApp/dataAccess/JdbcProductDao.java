package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements IProductDao {
    public void add(Product product){
        System.out.println("JDBC ile veritabanına eklendi");
        //sadece ve sadece db erişim kodları buraya yazılır
    }


}
