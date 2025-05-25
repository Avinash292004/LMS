package com.lms.model;

public class Instructor extends User {
    private String firstName;
    private String lastName;
    private String specialization;
    private String bio;
    private String qualifications;
    private String officeLocation;

    public Instructor() {}

    public Instructor(int userId, String username, String password, String email, String role,
                     String firstName, String lastName, String specialization, String bio,
                     String qualifications, String officeLocation) {
        super(userId, username, password, email, role);
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.bio = bio;
        this.qualifications = qualifications;
        this.officeLocation = officeLocation;
    }

    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }
    public String getQualifications() { return qualifications; }
    public void setQualifications(String qualifications) { this.qualifications = qualifications; }
    public String getOfficeLocation() { return officeLocation; }
    public void setOfficeLocation(String officeLocation) { this.officeLocation = officeLocation; }

    @Override
    public String toString() {
        return "Instructor{" +
                "userId=" + getUserId() +
                ", username='" + getUsername() + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", bio='" + bio + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", officeLocation='" + officeLocation + '\'' +
                '}';
    }
}
