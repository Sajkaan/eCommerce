package com.acme.ecommerce;

public class FlashMessage {
    private String message;
    private Status status;

    public FlashMessage(String message, Status status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public Status getStatus() {
        return status;
    }

    public static enum Status {
        SUCCESS, FAILURE
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlashMessage that = (FlashMessage) o;

        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        return status == that.status;
    }

    @Override
    public int hashCode() {
        int result = message != null ? message.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}