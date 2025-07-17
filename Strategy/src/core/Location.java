package core;

public class Location {
  private Double longitude;
  private Double latitude;

  public Location(Double longitude, Double latitude) {
    this.longitude = longitude;
    this.latitude = latitude;
  }

  public Double calculateDistance(Location location) {
    return Math.sqrt(Math.pow(this.latitude - location.latitude, 2) + Math.pow(this.longitude - location.longitude, 2));
  }

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }
}
