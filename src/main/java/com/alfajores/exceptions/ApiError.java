package com.alfajores.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ApiError {
    private String error;
    private String message;
    private Integer status;
}
