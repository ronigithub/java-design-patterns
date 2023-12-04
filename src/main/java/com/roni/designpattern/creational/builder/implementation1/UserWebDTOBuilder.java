package com.roni.designpattern.creational.builder.implementation1;

import java.time.LocalDate;
import java.time.Period;

/** The concrete builder for UserWebDTO **/
public class UserWebDTOBuilder implements UserDTOBuilder {
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fName) {
        firstName = fName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lName) {
        lastName = lName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDay(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toBinaryString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet() + ", "
                + "\n" + address.getCity() + "\n" + address.getState() + "\n" + address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName + " " + lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
