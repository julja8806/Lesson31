package by.itstep.julja8806.model.entity;

import java.util.Objects;

public class BreadEntity {
    private String color;
    private String flour;
    private double prise;

    public BreadEntity() {
    }

    public BreadEntity(String color, String flour, double prise) {
        this.color = color;
        this.flour = flour;
        this.prise = prise;
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

    public double getPrise() {
        return prise;
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
        BreadEntity bread = (BreadEntity) o;
        return Double.compare(bread.prise, prise) == 0 && color.equals(bread.color) && flour.equals(bread.flour);
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
                ", prise=" + prise +
                '}';
    }

//    public boolean equals(Object object) {
//        if (object == null) {
//            return false;
//        }
//        if (this == object) {
//            return true;
//        }
//        if (!(object instanceof Bread)) {
//            return false;
//        }
//        Bread temp = (Bread) object;
//        if (!color.equals(temp.color)) {
//            return false;
//        }
//        if (!flour.equals(temp.flour)) {
//            return false;
//        }
//        if (prise != temp.prise) {
//            return false;
//        }
//        return true;
//    }
//}
}