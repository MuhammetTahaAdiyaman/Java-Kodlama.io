package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface IProductDao {
    //birbirinin alternatifi olan durumlarda interface yapıyoruz
    //örneğin jdbc ile hibernate alternatif olduğu için productdao adında bir interface oluşturmamız gerekti.
    //interface sadece imza gerçekleştiriyoruz.

    public void add(Product product);
    //productdao ile ilgili alternatifler jdbc ve hibernate add adında operasyon içerebilmelidir.
}
