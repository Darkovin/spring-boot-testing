package net.javaguides.springboot.model;

/**
 * A Projection for the {@link Employee} entity
 */
public interface EmployeeInfo {
    String getFirstName();

    String getLastName();
}