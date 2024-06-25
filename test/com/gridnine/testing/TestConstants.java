package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

public class TestConstants {
    static LocalDateTime threeDaysFromNow = LocalDateTime.now().plusDays(3);
    public final static Flight FLIGHT_FILTERED = new Flight(List.of(
            new Segment(threeDaysFromNow, threeDaysFromNow.plusHours(2))
    ));

    public final static List<Flight> DEPARTURE_EARLIER_NOW = List.of(
            new Flight(List.of(new Segment(threeDaysFromNow.minusDays(6), threeDaysFromNow))),
            FLIGHT_FILTERED
    );

    public final static List<Flight> ARRIVAL_EARLIER_DEPARTURE = List.of(
            new Flight(List.of(
                    new Segment(threeDaysFromNow, threeDaysFromNow.minusHours(6))
            )),
            FLIGHT_FILTERED
    );

    public final static List<Flight> MORE_THAN_TWO_HOURS = List.of(
            new Flight(List.of(
                    new Segment(threeDaysFromNow, threeDaysFromNow.plusHours(2)),
                    new Segment(threeDaysFromNow.plusHours(5), threeDaysFromNow.plusHours(6))
            )),
            FLIGHT_FILTERED
    );
}
