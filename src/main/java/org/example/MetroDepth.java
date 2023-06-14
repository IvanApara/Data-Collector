package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MetroDepth {

    String station_name;
    String depth;

    @Override
    public String toString() {
        return station_name + " " + depth;
    }
}
