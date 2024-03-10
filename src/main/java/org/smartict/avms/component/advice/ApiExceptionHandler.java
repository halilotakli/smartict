package org.smartict.avms.component.advice;

import lombok.extern.log4j.Log4j2;
import org.smartict.avms.core.model.dro.ResponseDro;
import org.smartict.avms.core.model.general.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Log4j2
public class ApiExceptionHandler {

    @ExceptionHandler(Exception.class)
    ResponseEntity<ResponseDro> generalException(Exception exception) {
        if (exception instanceof BadCredentialsException) {
            return returnErrorResponse(HttpStatus.UNAUTHORIZED, exception);
        }
        if (exception instanceof RuntimeException) {
            return returnErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, exception);
        } else {
            return returnErrorResponse(HttpStatus.FORBIDDEN, exception);
        }
    }

    private ResponseEntity<ResponseDro> returnErrorResponse(HttpStatus httpStatus, Exception ex) {
        log.error(ex);
        return new ResponseEntity(new ResponseDro().setError(new Error().setErrorId(ex.hashCode() + "").setDetailMessage(ex.getMessage())), httpStatus);
    }

}