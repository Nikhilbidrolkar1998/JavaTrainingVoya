package com.org.doctorapp.exception;

public class DoctorNotFoundException extends Exception{
    public DoctorNotFoundException() {
    }

    public DoctorNotFoundException(String message) {
        super(message);
    }
}