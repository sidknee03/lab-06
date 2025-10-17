package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {
    private String city;
    private String province;

    /**
     * Constructs a city with its name and province.
     * @param city
     *      The name of the city.
     * @param province
     *      The name of the province.
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city's name.
     * @return
     *      The name of the city.
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Gets the province name.
     * @return
     *      The name of the province.
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this city to another by name.
     * @param o
     *      The city to compare to.
     * @return
     *      0 if equal, positive if greater, negative if smaller.
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
}
