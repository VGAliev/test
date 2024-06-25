package com.gridnine.testing;

import java.util.List;

public interface IFilter {
    List<Flight> doFilter(List<Flight> flightList);
}
