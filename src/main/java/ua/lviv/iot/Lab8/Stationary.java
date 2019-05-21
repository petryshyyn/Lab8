package ua.lviv.iot.Lab8;

import javax.persistence.*;

@Entity
@Table(name = "stationary")
 class Stationary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "manufactureOfGoods")
    private String manufactureOfGoods;
    @Column(name = "priceOfGoods")
    private int priceOfGoods;
    @Column(name = "qualityOfGoods")
    private Quality qualityOfGoods;
    @Column(name = "typeOfGoods")
    private String typeOfGoods;

    public Stationary() {
    }

    public Stationary(String manufactureOfGoods, int priceOfGoods,
                      Quality qualityOfGoods, String typeOfGoods) {
        this.manufactureOfGoods = manufactureOfGoods;
        this.priceOfGoods = priceOfGoods;
        this.qualityOfGoods = qualityOfGoods;
        this.typeOfGoods = typeOfGoods;
    }

    public final String toString() {
        return "Type of goods: " + typeOfGoods
                + "\nManufacture of goods : " + manufactureOfGoods
                + "\nPrice of Goods : " + priceOfGoods;
    }

    public  String getTypeOfGoods() {
        return typeOfGoods;
    }

    public  String getManufactureOfGoods() {
        return manufactureOfGoods;
    }

    public  int getPriceOfGoods() {
        return priceOfGoods;
    }

    public  Quality getQualityOfGoods() {
        return qualityOfGoods;
    }

    public  void setTypeOfGoods(String typeOfGoodsParam) {
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
}

