package main;

import core.NewsPaper;
import core.Reader;

public class Main {
  public static void main(String[] args) {
    Reader reader = new Reader("Peter", 16);
    Reader anotherReader = new Reader("Norman", 60);

    NewsPaper newsPaper = new NewsPaper("New York Rimes");

    newsPaper.addObserver(reader);
    newsPaper.addObserver(anotherReader);

    newsPaper.publish();
  }
}
