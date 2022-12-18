package org.jh.springboot3demo.exception;

import java.util.List;

public class EntityNotFoundException extends RuntimeException {

    private final String entityName;
    private final String message;
    private final List<String> parameters;

    public EntityNotFoundException(String entityName, String message, List<String> parameters) {
        this.entityName = entityName;
        this.message = message;
        this.parameters = parameters;
    }

    public String getEntityName() {
        return entityName;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public List<String> getParameters() {
        return parameters;
    }
}
