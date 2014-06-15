package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.model;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Leszek Bednorz
 */
public class HotelInfo {

    private String engineName;
    private String pageUrl;
    private float mainRank;
    private String description;
    private Map<String, String> usefoulInfo;
    private Map<String, List<String>> facilites;
    private DetailedRankAndInfo detailedRank;

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

    public DetailedRankAndInfo getDetailedRank() {
        return detailedRank;
    }

    public void setDetailedRank(DetailedRankAndInfo detailedRank) {
        this.detailedRank = detailedRank;
    }

    public float getMainRank() {
        return mainRank;
    }

    public void setMainRank(float mainRank) {
        this.mainRank = mainRank;
    }

    public Map<String, String> getUsefoulInfo() {
        return usefoulInfo;
    }

    public void setUsefoulInfo(Map<String, String> usefoulInfo) {
        this.usefoulInfo = usefoulInfo;
    }

    public Map<String, List<String>> getFacilites() {
        return facilites;
    }

    public void setFacilites(Map<String, List<String>> facilites) {
        this.facilites = facilites;
    }

    @Override
    public String toString() {
        return "HotelInfo{" + "engineName=" + engineName + ", pageUrl=" + pageUrl + ", mainRank=" + mainRank + ", description=" + description + ", usefoulInfo=" + usefoulInfo + ", facilites=" + facilites + ", detailedRank=" + detailedRank + '}';
    }

}
