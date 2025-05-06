package com.perch.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class VerificationBlueTick {

    private boolean status = false;
    private LocalDateTime startedAt;
    private LocalDateTime expiryDate;
    private String planType;

}
