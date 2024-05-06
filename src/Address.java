public class Address {
    public String country;
    public String city;
    public String postalCode;
    public String streetName;
    public String apartmentNumber;

    public Address(String country, String city, String postalCode, String streetName, String apartmentNumber) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.streetName = streetName;
        this.apartmentNumber = apartmentNumber;
    }
    public String createAddress(String country) {
        return String.format("Country: %s", country);
    }
    public String createAddress(String country, String city) {
        return String.format("Country: %s, City: %s", country, city);
    }
    public String createAddress(String country, String city, String postalCode) {
        return String.format("Country: %s, City: %s, Postal Code: %s", country, city, postalCode);
    }
    public String createAddress(String country, String city, String postalCode, String streetName) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s", country, city, postalCode, streetName);
    }

    public String createAddress(String country, String city, String postalCode, String streetName, String apartmentNumber) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s, Apartment: %s", country, city, postalCode, streetName, apartmentNumber);
    }

}