package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.model;

/**
 *
 * @author Leszek Bednorz
 */
public class HotelInfo {

    private String engineName;
    private String pageUrl;
    private float mainRank;
    private String description;
    private DetailedRank detailedRank;

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DetailedRank getDetailedRank() {
        return detailedRank;
    }

    public void setDetailedRank(DetailedRank detailedRank) {
        this.detailedRank = detailedRank;
    }

    public float getMainRank() {
        return mainRank;
    }

    public void setMainRank(float mainRank) {
        this.mainRank = mainRank;
    }

    @Override
    public String toString() {
        return "HotelInfo{" + "engineName=" + engineName + ", pageUrl=" + pageUrl + ", mainRank=" + mainRank + ", description=" + description + ", detailedRank=" + detailedRank + '}';
    }
    
 
    
}
