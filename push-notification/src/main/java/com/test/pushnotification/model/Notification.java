package com.test.pushnotification.model;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Notification {
    private String from;
    private String message;
}
