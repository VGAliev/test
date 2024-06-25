package com.gridnine.testing;

import java.util.List;

public class MoreThanTwoHoursGroundTimeFilter implements IFilter {
    @Override
    public List<Flight> doFilter(List<Flight> flightList) {
        return List.of();
    }
}
