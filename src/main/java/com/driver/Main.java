package com.driver;

public class Main {
    public class Product {

        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x, double y) {
            return (double)x*y;
        }

    }
    public void main(String []args){
        Product p = new Product();
        p.product(2,4);
        p.product(2.22,3.33);
        p.product(2,3,4);
    }
}