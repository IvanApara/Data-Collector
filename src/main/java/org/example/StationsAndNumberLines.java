package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class StationsAndNumberLines {
    private String name;
    private String numberLines;

    @Override
    public String toString() {
        return name + " " + numberLines;
    }

}
