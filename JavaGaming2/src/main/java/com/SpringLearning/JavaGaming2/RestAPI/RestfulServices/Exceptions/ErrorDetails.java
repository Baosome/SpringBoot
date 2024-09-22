package com.SpringLearning.JavaGaming2.RestAPI.RestfulServices.Exceptions;

import java.time.LocalDate;

public class ErrorDetails {
    LocalDate timestamp;
    String message;
    String details;

    public ErrorDetails(LocalDate timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
