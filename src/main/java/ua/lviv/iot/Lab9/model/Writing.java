package ua.lviv.iot.Lab9.model;

public class Writing extends Stationary {
    private double priceByPencil;
    private double priceByPen;
    private Notebook typeOfNotebooks;

    public Writing(String manufactureOfGoodsParam, int priceOfGoodsParam, Quality qualityParam, String typeOfGoodsParam,
                   double priceByPencilParam, double priceByPenParam, Notebook typeOfNotebooksParam) {
        super(manufactureOfGoodsParam, priceOfGoodsParam, qualityParam, typeOfGoodsParam);
        priceByPencil = priceByPencilParam;
        priceByPen = priceByPenParam;
        typeOfNotebooks = typeOfNotebooksParam;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "Price by pencil, " + "Price by pen, " + "Type of notebooks";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + this.getPriceByPencil() + ", " + this.getPriceByPen()
                + ", " + this.getTypeOfNotebooks();
    }

    public final double getPriceByPencil() {
        return priceByPencil;
    }

    public final void setPriceByPencil(final double priceByPencilParam) {
        priceByPencil = priceByPencilParam;
    }

    public final double getPriceByPen() {
        return priceByPen;
    }

    public final void setPriceByPen(final double priceByPenParam) {
        priceByPen = priceByPenParam;
    }

    public final Notebook getTypeOfNotebooks() {
        return typeOfNotebooks;
    }

    public final void setTypeOfNotebooks(final Notebook typeOfNotebooksParam) {
        typeOfNotebooks = typeOfNotebooksParam;
    }
}

