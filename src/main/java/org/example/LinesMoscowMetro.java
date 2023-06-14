package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LinesMoscowMetro {
    private String name;
    private String numberLines;

    public String toString() {
        return name + " " + numberLines;
    }
}
