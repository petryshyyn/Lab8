package ua.lviv.iot.Lab9.model;

public class StorageAccessories extends Stationary {
    private String materialOfBag;
    private double priceByToolbar;
    private Folder typeOfFolder;

    public StorageAccessories(
            String manufactureOfGoodsParam, int priceOfGoodsParam, Quality qualityParam, String typeOfGoodsParam,
            String materialOfBagParam, double priceByToolbarParam, Folder typeOfFolderParam) {
        super(manufactureOfGoodsParam, priceOfGoodsParam, qualityParam, typeOfGoodsParam);
        materialOfBag = materialOfBagParam;
        priceByToolbar = priceByToolbarParam;
        typeOfFolder = typeOfFolderParam;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "Material of bag, " + "Price by toolbar, " + "Type of folder";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + this.getMaterialOfBag() + ", " + this.getPriceByToolbar()
                + ", " + this.getTypeOfFolder();
    }

    public final String getMaterialOfBag() {
        return materialOfBag;
    }

    public final double getPriceByToolbar() {
        return priceByToolbar;
    }

    public final Folder getTypeOfFolder() {
        return typeOfFolder;
    }

    public final void setMaterialOfBag(final String materialOfBagParam) {
        this.materialOfBag = materialOfBagParam;
    }

    public final void setPriceByToolbar(final double priceByToolbarParam) {
        this.priceByToolbar = priceByToolbarParam;
    }

    public final void setTypeOfFolder(final Folder typeOfFolderParam) {
        this.typeOfFolder = typeOfFolderParam;
    }
}

