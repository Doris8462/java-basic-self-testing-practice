package com.twc.javaBasic;

public class NameImpl implements WithName, Person {
    @Override
    public String getName() {
        // TODO:
        //  Please implement the method to pass the test.
        //
        // <--start
        try {
            return "Person";
            
        } catch (Exception e) {
            throw new RuntimeException("Not implemented");
        }
        // --end-->
    }
}
