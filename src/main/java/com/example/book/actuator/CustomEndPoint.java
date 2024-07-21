package com.example.book.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id = "bookPurchaseFailure")
@Component
public class CustomEndPoint {

    @ReadOperation
    public int getBookPurchaseFailureCount() {
        return 10;
    }
}
