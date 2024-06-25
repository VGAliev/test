package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Фильтр, позволяющий отфильтровать перелёты, где вылет до текущего момента времени
 */
public class DepartureEarlierNowFilter implements IFilter {
    LocalDateTime currentTime = LocalDateTime.now();

    @Override
    public List<Flight> doFilter(List<Flight> flightList) {
        return flightList.stream()
                .filter(flight -> flight.getSegments().stream()
                        .anyMatch(segment -> segment.getDepartureDate().isAfter(currentTime)))
                .collect(Collectors.toList());
    }
}
