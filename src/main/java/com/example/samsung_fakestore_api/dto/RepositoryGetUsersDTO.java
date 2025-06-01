/*package com.example.samsung_fakestore_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryGetUsersDTO(
        @JsonProperty("id") Integer id,
        @JsonProperty("lat") String lat,
        @JsonProperty("long") String longitude,
        @JsonProperty("city") String city,
        @JsonProperty("street") String street,
        @JsonProperty("number") Integer number,
        @JsonProperty("zipcode") String zipcode,
        @JsonProperty("email") String email,
        @JsonProperty("username") String username,
        @JsonProperty("password") String password,
        @JsonProperty("firstname") String firstname,
        @JsonProperty("lastname") String lastname,
        @JsonProperty("phone") String phone,
        @JsonProperty("__v") Integer __v
) {
}*/
package com.example.samsung_fakestore_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryGetUsersDTO(
        @JsonProperty("id") Integer id,
        @JsonProperty("email") String email,
        @JsonProperty("username") String username,
        @JsonProperty("password") String password,
        @JsonProperty("phone") String phone,
        @JsonProperty("__v") Integer __v,
        @JsonProperty("address") AddressDTO address,
        @JsonProperty("name") NameDTO name
) {

    public record AddressDTO(
            @JsonProperty("geolocation") GeoLocationDTO geolocation,
            @JsonProperty("city") String city,
            @JsonProperty("street") String street,
            @JsonProperty("number") Integer number,
            @JsonProperty("zipcode") String zipcode
    ) {}

    public record GeoLocationDTO(
            @JsonProperty("lat") String lat,
            @JsonProperty("long") String longitude
    ) {}

    public record NameDTO(
            @JsonProperty("firstname") String firstname,
            @JsonProperty("lastname") String lastname
    ) {}
}

