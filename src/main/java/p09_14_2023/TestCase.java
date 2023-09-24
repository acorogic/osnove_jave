package p09_14_2023;

import java.util.ArrayList;

public class TestCase {
    private int id;
    private String tcName;

    private ArrayList<TestStep> testSteps;

    public TestCase(int id, String tcName) {
        this.id= id;
        this.tcName=tcName;
        this.testSteps= new ArrayList<>();}

    public void addTestStep(TestStep newTestStep) {
        this.testSteps.add(newTestStep);
    }

   public int failedTestCounter () {
        int counter=0;
       for (int i = 0; i < testSteps.size(); i++) {
           if ( !testSteps.get(i).testPassed()) {counter++;}


       }
       return counter;

    }

//    public boolean stanjeTc (String t){
//        for (int i = 0; i < testSteps.size(); i++) {
//            if
//
//        }
    }

