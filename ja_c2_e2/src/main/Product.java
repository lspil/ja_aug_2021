package main;

import java.time.LocalDate;

public record Product (
    int id,
    String name,
    String color,
    LocalDate expDate
) {

}
