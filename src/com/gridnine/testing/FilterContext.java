package com.gridnine.testing;

import java.util.List;

public class FilterContext {
    private IFilter filter;

    public void setFilter(IFilter filter) {
        this.filter = filter;
    }

    public List<Flight> doFilter(List<Flight> flightList) {
        return filter.doFilter(flightList);
    }
}
