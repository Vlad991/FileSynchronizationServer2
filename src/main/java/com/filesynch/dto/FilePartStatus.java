package com.filesynch.dto;

public enum FilePartStatus {
    NOT_SENT("NOT_SENT"),
    SENT("SENT");

    private String status;

    private FilePartStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
