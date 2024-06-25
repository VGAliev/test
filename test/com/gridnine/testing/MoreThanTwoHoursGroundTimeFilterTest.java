package com.gridnine.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.gridnine.testing.TestConstants.FLIGHT_FILTERED;
import static com.gridnine.testing.TestConstants.MORE_THAN_TWO_HOURS;
import static org.junit.jupiter.api.Assertions.*;

class MoreThanTwoHoursGroundTimeFilterTest {
    private final FilterContext filterContext = new FilterContext();

    @BeforeEach
    void setUp() {
        filterContext.setFilter(new MoreThanTwoHoursGroundTimeFilter());
    }

    @Test
    void doFilter() {
        List<Flight> filteredFlight = filterContext.doFilter(MORE_THAN_TWO_HOURS);
        assertEquals(filteredFlight, List.of(FLIGHT_FILTERED));
    }
}