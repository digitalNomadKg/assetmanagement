package com.example.assetmanagement.demoassetManagement.config;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@Getter

public class Error {
    private Date timestamp;
    private String message;
    private String details;
}
