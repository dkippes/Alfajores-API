package com.alfajores.config;

import com.alfajores.exceptions.ValidationError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class ControllerExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<ValidationError> handleException(MethodArgumentNotValidException ex) {
        LOGGER.info("Error de validacion");
        return ex.getBindingResult().getAllErrors()
                .stream()
                .map(this::mapError)
                .collect(Collectors.toList());
    }

    private ValidationError mapError(ObjectError objectError) {
        if (objectError instanceof FieldError) {
            return new ValidationError(((FieldError) objectError).getField(), objectError.getDefaultMessage());
        }
        return new ValidationError(objectError.getObjectName(), objectError.getDefaultMessage());
    }
}
