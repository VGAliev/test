package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FilterContext filterContext = new FilterContext();
        List<Flight> flightList = FlightBuilder.createFlights();

        System.out.println("Тестовый набор перелётов: ");
        flightList.forEach(System.out::println);

        // Правило первое - отфильтровать перелёты, где вылет до текущего момента времени
        filterContext.setFilter(new DepartureEarlierNowFilter());
        System.out.println("Исключены перелёты с вылетом до текущего момента времени: ");
        filterContext.doFilter(flightList).forEach(System.out::println);

        // Правило второе - отфильтровать сегменты, где дата прилёта раньше даты вылета
        filterContext.setFilter(new ArrivalEarlierDepartureFilter());
        System.out.println("Исключены перелёты с сегментами, где дата прилёта раньше даты вылета: ");
        filterContext.doFilter(flightList).forEach(System.out::println);

        // Правило третье - отфильтровать перелёты, где время на земле между сегментами превышает два часа
        filterContext.setFilter(new MoreThanTwoHoursGroundTimeFilter());
        System.out.println("Исключены перелёты, где время на земле между перелётами превышает 2 часа: ");
        filterContext.doFilter(flightList).forEach(System.out::println);
    }
}
