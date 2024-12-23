package org.example;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class Person {
    private String FirstName;
    private String LastName;
    private LocalDate Age;
    public String FullName(String FirstName, String LastName) {
        return  FirstName + " " + LastName;
    }
    public int Age(int DateBirth) {
        LocalDate currentDate = LocalDate.now();
        return  currentDate.getYear() - DateBirth;
    }
    public boolean hasSameLastName(Person other) {
        if (other == null) return false;
        return this.LastName.equalsIgnoreCase(other.LastName);
    }

}
