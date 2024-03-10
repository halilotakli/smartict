package org.smartict.avms.core.model.general;

import java.time.LocalDate;


public class Error {

    // Enum yapılacaktı zamanım yetmedi
    private String errorId;

    // Enum yapılacaktı zamanım yetmedi
    private String DetailMessage;

    private Exception ex;

    private final LocalDate errorCreateLocalDate = LocalDate.now();

    public String getErrorId() {
        return errorId;
    }

    public Error setErrorId(String errorId) {
        this.errorId = errorId;
        return this;
    }

    public String getDetailMessage() {
        return DetailMessage;
    }

    public Error setDetailMessage(String detailMessage) {
        DetailMessage = detailMessage;
        return this;
    }

    public Exception getEx() {
        return ex;
    }

    public Error setEx(Exception ex) {
        this.ex = ex;
        return this;
    }

}
