package by.itstep.julja8806.model.entity;

import java.util.Objects;

public class Product {
    private double prise;

    public Product() {
        prise = 0.01;
    }

    public Product(double prise) {
        this.prise = prise;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
        if (prise > 0) {
            this.prise = prise;
        } else {
            throw new Exception();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.prise, prise) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(prise);
    }

    @Override
    public String toString() {
        return "prise=" + prise;
    }


}

