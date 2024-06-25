package com.gridnine.testing;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Фильтр, позволяющий отфильтровать сегменты, где дата прилёта раньше даты вылета
 */
public class ArrivalEarlierDepartureFilter implements IFilter {
    @Override
    public List<Flight> doFilter(List<Flight> flightList) {
        return flightList.stream()
                .filter(flight -> flight.getSegments().stream()
                        .allMatch(segment -> segment.getArrivalDate().isAfter(segment.getDepartureDate())))
                .collect(Collectors.toList());
    }
}
