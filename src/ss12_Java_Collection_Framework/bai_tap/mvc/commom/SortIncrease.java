package ss12_Java_Collection_Framework.bai_tap.mvc.commom;

import ss12_Java_Collection_Framework.bai_tap.mvc.model.Product;

import java.util.Comparator;

public class SortIncrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
