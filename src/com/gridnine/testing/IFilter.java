package com.gridnine.testing;

import java.util.List;

/**
 * Общий интерфейс для фильтров
 */
public interface IFilter {
    List<Flight> doFilter(List<Flight> flightList);
}
