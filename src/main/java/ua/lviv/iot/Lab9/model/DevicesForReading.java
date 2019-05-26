package ua.lviv.iot.Lab9.model;


public class DevicesForReading extends Stationary {
    private boolean lamp;
    private boolean glasses;
    private Book typeOfBook;

    public DevicesForReading(
            String manufactureOfGoodsParam,
            int priceOfGoodsParam, Quality qualityParam, String typeOfGoodsParam,
            boolean lampParam, boolean glassesParam, Book typeOfBookParam) {
        super(manufactureOfGoodsParam, priceOfGoodsParam, qualityParam, typeOfGoodsParam);
        lamp = lampParam;
        glasses = glassesParam;
        typeOfBook = typeOfBookParam;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "Lamp, " + "Glasses, " + "Type of book";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + this.getLamp() + ", " + this.getGlasses() + ", " + this.getTypeOfBook();
    }

    public final boolean getLamp() {
        return lamp;
    }

    public final boolean getGlasses() {
        return glasses;
    }

    public final Book getTypeOfBook() {
        return typeOfBook;
    }

    public final void setLamp(final boolean lampParam) {
        lamp = lampParam;
    }

    public final void setGlasses(final boolean glassesParam) {
        glasses = glassesParam;
    }

    public final void setTypeOfBook(final Book typeOfBookParam) {
        typeOfBook = typeOfBookParam;
    }
}

