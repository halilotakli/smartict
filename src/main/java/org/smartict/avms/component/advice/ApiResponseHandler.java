package org.smartict.avms.component.advice;

import org.smartict.avms.core.model.dro.ResponseDro;
import org.smartict.avms.core.model.general.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApiResponseHandler {

    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    ResponseEntity<ResponseDro> generalException(Object data) {
            return returnResponse(HttpStatus.OK, data);
    }

    private ResponseEntity<ResponseDro> returnResponse(HttpStatus httpStatus, Object data) {
        return ResponseEntity.ok(new ResponseDro().setData(data));
    }

}