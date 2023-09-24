package p09_14_2023;

public class TestStep {

    private String opis;
    private String actualResult;
    private String expectedResult;

    private String errorMessage;

    public TestStep(String opis, String actualResult, String expectedResult, String errorMessage) {
        this.opis = opis;
        this.actualResult = actualResult;
        this.expectedResult = expectedResult;
        this.errorMessage = errorMessage;
    }

    public String getOpis() {
        return opis;
    }


    public String getActualResult() {
        return actualResult;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public String getErrorMessage() {
        return errorMessage;
    }


    public boolean testPassed ()
    {if (this.expectedResult.equals(this.actualResult)) {return true;}
        else {return false;}
    }


    public void print (){
        System.out.println("|"+ this.opis+"|");
        System.out.println("|"+ "Status:" +  testPassed()+"|");

        if (!testPassed()) {
        System.out.println("|"+ this.errorMessage+"|");}
    }
}
