/*
 * Copyright 2019, EnMasse authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.enmasse.user.keycloak;

@SuppressWarnings("serial")
public class KeycloakUnavailableException extends RuntimeException {
    public KeycloakUnavailableException(String message) {
        super(message);
    }
}