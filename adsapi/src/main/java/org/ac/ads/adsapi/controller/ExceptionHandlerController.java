package org.ac.ads.adsapi.controller;

import org.ac.ads.adsapi.model.ErrorMessage;
import org.ac.ads.adsapi.signin.IllegalDomainException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ExceptionHandlerController {

  @ExceptionHandler(AccessDeniedException.class)
  @ResponseStatus(code = HttpStatus.FORBIDDEN)
  public void handleForbidden(Exception exception) {
    log.error(exception.getMessage(), exception);
  }

  @ExceptionHandler(IllegalStateException.class)
  @ResponseBody
  public ResponseEntity<ErrorMessage> handleIllegalStateException(Exception exception) {
    log.error(exception.getMessage(), exception);
    ErrorMessage errorMessage = ErrorMessage.builder().message(exception.getMessage()).statusCode(HttpStatus.BAD_REQUEST).build();
    return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(IllegalDomainException.class)
  @ResponseStatus(code = HttpStatus.UNAUTHORIZED)
  public void handleIllegalDomainException(IllegalDomainException exception) {
    log.warn(exception.getMessage());
  }

  @ExceptionHandler(DuplicateKeyException.class)
  @ResponseStatus(code = HttpStatus.CONFLICT)
  public void handleDuplicateKeyException(DuplicateKeyException exception) {
    log.warn(exception.getMessage());
  }
}
