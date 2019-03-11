package me.manzhos.dataprovider;

import org.testng.annotations.DataProvider;

public class IfElseDataProvider {

    private final String WEIRD = "Weird";
    private final String NON_WEIRD = "Not Weird";
    private final String ERROR = "Invalid input";

    @DataProvider (name="ifElse")
    private Object [][] setOFValues(){
      return new Object[][]{
              {0, ERROR},
              {1, WEIRD},
              {2, NON_WEIRD},
              {3, WEIRD},
              {4, NON_WEIRD},
              {5, WEIRD},
              {6, WEIRD},
              {8, WEIRD},
              {9, WEIRD},
              {12, WEIRD},
              {14, WEIRD},
              {20, WEIRD},
              {21, WEIRD},
              {22, NON_WEIRD},
              {97, WEIRD},
              {98, NON_WEIRD},
              {100, NON_WEIRD},
              {101, ERROR}
      };
    }
}
