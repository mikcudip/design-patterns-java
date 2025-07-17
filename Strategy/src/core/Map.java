package core;

public class Map {
  private Location currentLocation;
  private MovementStrategy movementStrategy;

  public Map(Location currentLocation, MovementStrategy movementStrategy) {
    this.currentLocation = currentLocation;
    this.movementStrategy = movementStrategy;
  }

  public Double calculateTimeLocation(Location location) {
    Double distance = currentLocation.calculateDistance(location);
    return movementStrategy.calculateTime(distance);
  }

  public void setMovementStrategy(MovementStrategy movementStrategy) {
    this.movementStrategy = movementStrategy;
  }
}
