package core;

import java.util.ArrayList;
import java.util.List;

public class CompleteObject {
  private List<GeometricFigure> geometricFigures;

  public CompleteObject() {
    geometricFigures = new ArrayList<>();
  }

  public void addGeometricFigure(String code) {
    try {
      GeometricFigure geometricFigure = GeometricFigureFactory.getInstance().generateGeometricFigure(code);
      geometricFigures.add(geometricFigure);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public Double calculateTotalArea() {
    Double totalArea = 0.0;
    for (GeometricFigure geometricFigure : geometricFigures) {
      totalArea += geometricFigure.CalculateArea();
    }
    return totalArea;
  }
}
