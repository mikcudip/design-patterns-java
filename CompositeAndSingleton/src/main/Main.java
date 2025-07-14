package main;

import core.CompleteObject;

public class Main {
  public static void main(String[] args) {
    CompleteObject completeObject = new CompleteObject();

    completeObject.addGeometricFigure("adakndskal");
    System.out.println(completeObject.calculateTotalArea());

    completeObject.addGeometricFigure("Square");
    System.out.println(completeObject.calculateTotalArea());

    completeObject.addGeometricFigure("Rectangle");
    System.out.println(completeObject.calculateTotalArea());

    completeObject.addGeometricFigure("Triangle");
    System.out.println(completeObject.calculateTotalArea());
  }
}
