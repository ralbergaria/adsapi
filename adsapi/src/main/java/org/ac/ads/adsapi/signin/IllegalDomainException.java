package org.ac.ads.adsapi.signin;

/** Thrown when a user tries to sign in using an invalid domain. */
public class IllegalDomainException extends RuntimeException {

  private static final long serialVersionUID = -8897136450656801900L;

  public IllegalDomainException(String email) {
    super("invalid domain;" + email);
  }
}
