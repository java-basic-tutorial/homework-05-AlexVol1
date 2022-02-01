package com.softserveinc.task01;

public class NotMoneyEnoughException extends Throwable {
    public NotMoneyEnoughException() {
        super();
    }

    public NotMoneyEnoughException(String message) {
        super(message);
    }
}
