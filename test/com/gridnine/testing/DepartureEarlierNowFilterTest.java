package com.gridnine.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.gridnine.testing.TestConstants.DEPARTURE_EARLIER_NOW;
import static com.gridnine.testing.TestConstants.FLIGHT_FILTERED;
import static org.junit.jupiter.api.Assertions.*;

class DepartureEarlierNowFilterTest {
    private final FilterContext filterContext = new FilterContext();

    @BeforeEach
    void setUp() {
        filterContext.setFilter(new DepartureEarlierNowFilter());
    }

    @Test
    void doFilter() {
        List<Flight> filteredFlight = filterContext.doFilter(DEPARTURE_EARLIER_NOW);
        assertEquals(filteredFlight, List.of(FLIGHT_FILTERED));
    }
}