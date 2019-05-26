package ua.lviv.iot.Lab9.model;

import javax.persistence.*;

@Entity
@Table(name = "stationary")
public class Stationary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String manufactureOfGoods;
    @Column
    private int priceOfGoods;
    @Column
    private Quality qualityOfGoods;
    @Column
    private String typeOfGoods;

    public Stationary() {
    }

    public Stationary(String manufactureOfGoods, int priceOfGoods, Quality qualityOfGoods, String typeOfGoods) {
        this.manufactureOfGoods = manufactureOfGoods;
        this.priceOfGoods = priceOfGoods;
        this.qualityOfGoods = qualityOfGoods;
        this.typeOfGoods = typeOfGoods;
    }

    public String getHeaders() {
        return "Manufacture of goods, " + "Price of goods, " + "Quality of goods, " + "Type of goods, ";
    }

    public String toCSV() {
        return this.getManufactureOfGoods() + ", " + this.getPriceOfGoods() + ", " + this.getQualityOfGoods()
                + ", " + this.getTypeOfGoods();
    }

    public final String toString() {
        return "Type of goods: " + typeOfGoods
                + "\nManufacture of goods : " + manufactureOfGoods
                + "\nPrice of Goods : " + priceOfGoods
                + "\nQuality of goods : " + qualityOfGoods;
    }

    public String getTypeOfGoods() {
        return typeOfGoods;
    }

    public String getManufactureOfGoods() {
        return manufactureOfGoods;
    }

    public int getPriceOfGoods() {
        return priceOfGoods;
    }

    public Quality getQualityOfGoods() {
        return qualityOfGoods;
    }

    public void setTypeOfGoods(String typeOfGoodsParam) {
        typeOfGoods = typeOfGoodsParam;
    }

    public void setManufactureOfGoods(String manufactureOfGoodsParam) {
        manufactureOfGoods = manufactureOfGoodsParam;
    }

    public void setPriceOfGoods(int priceOfGoodsParam) {
        priceOfGoods = priceOfGoodsParam;
    }

    public void setQualityOfGoods(Quality qualityOfGoodsParam) {
        qualityOfGoods = qualityOfGoodsParam;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

