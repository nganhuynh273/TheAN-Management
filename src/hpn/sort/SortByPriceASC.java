package hpn.sort;

import hpn.model.Product;

import java.util.Comparator;

public class SortByPriceASC implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() > o2.getPrice()){
            return 1;
        }else if(o1.getPrice() == o2.getPrice()){
            return 0;
        }else{
            return -1;
        }
    }
}
