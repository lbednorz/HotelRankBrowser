package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.model;

/**
 *
 * @author Leszek Bednorz
 */
public class DetailedRank {

    private float food;
    private float loacalization;
    private float quality;
    private float roomComfort;
    private float workers;
    private float worthPrice;

    public float getFood() {
        return food;
    }

    public void setFood(float food) {
        this.food = food;
    }

    public float getLoacalization() {
        return loacalization;
    }

    public void setLoacalization(float loacalization) {
        this.loacalization = loacalization;
    }

    public float getQuality() {
        return quality;
    }

    public void setQuality(float quality) {
        this.quality = quality;
    }

    public float getRoomComfort() {
        return roomComfort;
    }

    public void setRoomComfort(float roomComfort) {
        this.roomComfort = roomComfort;
    }

    public float getWorkers() {
        return workers;
    }

    public void setWorkers(float workers) {
        this.workers = workers;
    }

    public float getWorthPrice() {
        return worthPrice;
    }

    public void setWorthPrice(float worthPrice) {
        this.worthPrice = worthPrice;
    }

    @Override
    public String toString() {
        return "DetailedRank{" + "food=" + food + ", loacalization=" + loacalization + ", quality=" + quality + ", roomComfort=" + roomComfort + ", workers=" + workers + ", worthPrice=" + worthPrice + '}';
    }

}
