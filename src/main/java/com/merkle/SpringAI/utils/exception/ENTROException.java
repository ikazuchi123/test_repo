package com.merkle.SpringAI.utils.exception;

/**
 * @author vdeng
 * @description: TODO
 * @date 4/18/2023 1:18 PM
 */
public class ENTROException extends RuntimeException {

  public ENTROException() {
    super();
  }

  public ENTROException(String message, Throwable cause) {
    super(message, cause);
  }
  public ENTROException(String message) {
    super(message);
  }
  public ENTROException(Throwable cause) {
    super(cause);
  }
}
