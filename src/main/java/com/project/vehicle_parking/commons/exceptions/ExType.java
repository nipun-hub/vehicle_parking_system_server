package com.project.vehicle_parking.commons.exceptions;

public enum ExType implements ExceptionType {
    BAD_REQUEST,
    UNAUTHORIZED,
    CONFLICT,
    INTERNAL_ERROR,
    NOT_FOUND,
    ACCESS_DENIED,
    TOO_MANY_REQUESTS,
    INVALID_TOKEN,
    TOKEN_EXPIRED,
    FILE_SIZE_EXCEED,
    UNSUPPORTED_FILE_TYPE,
    INSUFFICIENT_STOCK;

    @Override
    public String getType() {
        return this.toString();
    }
}

