package core;

import java.util.ArrayList;
import java.util.List;

public class GeometricFigureComposite implements GeometricFigure {
  private List<GeometricFigure> geometricFigures;

  public GeometricFigureComposite() {
    geometricFigures = new ArrayList<>();
  }

  public void addGeometricFigure(GeometricFigure figure) {
    geometricFigures.add(figure);
  }

  @Override
  public Double calculateArea() {
    Double area = 0.0;
    for (GeometricFigure geometricFigure : geometricFigures) {
      area += geometricFigure.calculateArea();
    }
    return area;
  }
}
