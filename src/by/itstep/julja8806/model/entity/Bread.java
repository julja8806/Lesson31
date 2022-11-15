package by.itstep.julja8806.model.entity;

import java.util.Objects;

public class Bread extends Product {
    private String color;
    private String flour;
    private double prise;

    public Bread() {
    }

    public Bread(String color, String flour, double prise) {
        super(prise);
        this.color = color;
        this.flour = flour;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }



    public void setPrise(double prise) throws Exception {
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
        Bread bread = (Bread) o;
        return color.equals(bread.color) && flour.equals(bread.flour);
    }



    @Override
    public int hashCode() {
        return Objects.hash(color, flour, prise);

    }
    @Override
    public String toString() {
        return "Bread{" +
                "color='" + color + '\'' +
                ", flour='" + flour + '\'' +
                super.toString() + '}';
    }
}
