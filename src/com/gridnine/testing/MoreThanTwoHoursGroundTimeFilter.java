package com.gridnine.testing;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Фильтр, позволяющий отфильтровать перелёты, где время на земле между сегментами превышает два часа
 */
public class MoreThanTwoHoursGroundTimeFilter implements IFilter {
    @Override
    public List<Flight> doFilter(List<Flight> flightList) {
        return flightList.stream()
                .filter(flight -> {
                    List<Segment> segments = flight.getSegments();
                    for (int i = 0; i < segments.size() - 1; i++) {
                        Duration duration = Duration.between(segments.get(i).getArrivalDate(), segments.get(i + 1).getDepartureDate());
                        if (duration.toHours() >= 2) {
                            return false;
                        }
                    }
                    return true;
                })
                .collect(Collectors.toList());
    }
}
