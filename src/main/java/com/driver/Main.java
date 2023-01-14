package com.driver;

class Main {
    public static void main(String[] args) {
        Product p = new Product();
         p.product(2,3);
         p.product(2,3,4);
         p.product(2.5,3.5);
    }
}

class Product {
    public int product(int x, int y) {
        return x*y;
    }
    public int product(int x, int y, int z) {
        return x*y*z;
    }
    public double product(double x, double y) {
        return x*y;
    }
    }
