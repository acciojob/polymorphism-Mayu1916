package com.driver;

public class Main {
    class Product {

        public int product(int x, int y) {
            return x*y;
        }
        public double product(double x, double y) {
            return (double)x*y;
        }

    }
    public void main(String []args){
        Product p = new Product();
        p.product(2,4);
        p.product(2.22,3.33);
    }
}