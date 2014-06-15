package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leszek Bednorz
 */
public class DetailedRankAndInfo {

    private float food;
    private float loacalization;
    private float quality;
    private float roomComfort;
    private float workers;
    private float worthPrice;
    private int reviewCountAll;
    private int reviewCountBusinessTravelers;
    private int reviewCountFamiliesWithYountChildrens;
    private int reviewCOuntFamiliesWithOlderChildrens;
    private int reviewCountCouples;
    private int reviewCountGroups;
    private int reviewCountSolorTravelers;
    private List<String> areaRecommended = new ArrayList<String>();
    private String distanceToAirportInfo;

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

    public int getReviewCountAll() {
        return reviewCountAll;
    }

    public void setReviewCountAll(int reviewCountAll) {
        this.reviewCountAll = reviewCountAll;
    }

    public int getReviewCountBusinessTravelers() {
        return reviewCountBusinessTravelers;
    }

    public void setReviewCountBusinessTravelers(int reviewCountBusinessTravelers) {
        this.reviewCountBusinessTravelers = reviewCountBusinessTravelers;
    }

    public int getReviewCountFamiliesWithYountChildrens() {
        return reviewCountFamiliesWithYountChildrens;
    }

    public void setReviewCountFamiliesWithYountChildrens(int reviewCountFamiliesWithYountChildrens) {
        this.reviewCountFamiliesWithYountChildrens = reviewCountFamiliesWithYountChildrens;
    }

    public int getReviewCOuntFamiliesWithOlderChildrens() {
        return reviewCOuntFamiliesWithOlderChildrens;
    }

    public void setReviewCOuntFamiliesWithOlderChildrens(int reviewCOuntFamiliesWithOlderChildrens) {
        this.reviewCOuntFamiliesWithOlderChildrens = reviewCOuntFamiliesWithOlderChildrens;
    }

    public int getReviewCountCouples() {
        return reviewCountCouples;
    }

    public void setReviewCountCouples(int reviewCountCouples) {
        this.reviewCountCouples = reviewCountCouples;
    }

    public int getReviewCountGroups() {
        return reviewCountGroups;
    }

    public void setReviewCountGroups(int reviewCountGroups) {
        this.reviewCountGroups = reviewCountGroups;
    }

    public int getReviewCountSolorTravelers() {
        return reviewCountSolorTravelers;
    }

    public void setReviewCountSolorTravelers(int reviewCountSolorTravelers) {
        this.reviewCountSolorTravelers = reviewCountSolorTravelers;
    }

    public List<String> getAreaRecommended() {
        return areaRecommended;
    }

    public void setAreaRecommended(List<String> areaRecommended) {
        this.areaRecommended = areaRecommended;
    }

    public String getDistanceToAirportInfo() {
        return distanceToAirportInfo;
    }

    public void setDistanceToAirportInfo(String distanceToAirportInfo) {
        this.distanceToAirportInfo = distanceToAirportInfo;
    }

    @Override
    public String toString() {
        return "DetailedRankAndInfo{" + "food=" + food + ", loacalization=" + loacalization + ", quality=" + quality + ", roomComfort=" + roomComfort + ", workers=" + workers + ", worthPrice=" + worthPrice + ", reviewCountAll=" + reviewCountAll + ", reviewCountBusinessTravelers=" + reviewCountBusinessTravelers + ", reviewCountFamiliesWithYountChildrens=" + reviewCountFamiliesWithYountChildrens + ", reviewCOuntFamiliesWithOlderChildrens=" + reviewCOuntFamiliesWithOlderChildrens + ", reviewCountCouples=" + reviewCountCouples + ", reviewCountGroups=" + reviewCountGroups + ", reviewCountSolorTravelers=" + reviewCountSolorTravelers + ", areaRecommended=" + areaRecommended + ", distanceToAirportInfo=" + distanceToAirportInfo + '}';
    }

}
