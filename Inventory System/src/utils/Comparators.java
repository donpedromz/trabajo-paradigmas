package utils;

import domain.Product;

import java.util.Comparator;

public class Comparators {
    public static Comparator<Product> sortByname(){
        return (o1, o2) -> o1.getName().compareTo(o2.getName());
    }
}
