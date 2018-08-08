package ModelClass;

public class PlaceInfo {
    private int thumbnail;
    private String placeName;
    private String placeDetails;

    public PlaceInfo(int thumbnail, String placeName, String placeDetails) {
        this.thumbnail = thumbnail;
        this.placeName = placeName;
        this.placeDetails = placeDetails;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceDetails() {
        return placeDetails;
    }

    public void setPlaceDetails(String placeDetails) {
        this.placeDetails = placeDetails;
    }
}
