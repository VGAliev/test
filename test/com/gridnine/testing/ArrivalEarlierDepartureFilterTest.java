package com.gridnine.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.gridnine.testing.TestConstants.ARRIVAL_EARLIER_DEPARTURE;
import static com.gridnine.testing.TestConstants.FLIGHT_FILTERED;
import static org.junit.jupiter.api.Assertions.*;

class ArrivalEarlierDepartureFilterTest {
    private final FilterContext filterContext = new FilterContext();

    @BeforeEach
    void setUp() {
        filterContext.setFilter(new ArrivalEarlierDepartureFilter());
    }

    @Test
    void doFilter() {
        List<Flight> filteredFlight = filterContext.doFilter(ARRIVAL_EARLIER_DEPARTURE);
        assertEquals(filteredFlight, List.of(FLIGHT_FILTERED));
    }
}