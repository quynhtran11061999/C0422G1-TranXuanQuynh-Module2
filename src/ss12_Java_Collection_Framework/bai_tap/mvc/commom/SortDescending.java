package ss12_Java_Collection_Framework.bai_tap.mvc.commom;

import ss12_Java_Collection_Framework.bai_tap.mvc.model.Product;

import java.util.Comparator;

public class SortDescending implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
