package hpn.sort;

import hpn.model.Product;

import java.util.Comparator;

public class SortByQuantityDESC implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getQuantity() - o1.getQuantity();
    }
}
