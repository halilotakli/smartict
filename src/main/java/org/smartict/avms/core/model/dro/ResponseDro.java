package org.smartict.avms.core.model.dro;

import lombok.Getter;
import lombok.Setter;
import org.smartict.avms.core.model.general.Error;


public class ResponseDro {
    Object data;

    Error error;

    public Object getData() {
        return data;
    }

    public ResponseDro setData(Object data) {
        this.data = data;
        return this;
    }

    public Error getError() {
        return error;
    }

    public ResponseDro setError(Error error) {
        this.error = error;
        return this;
    }
}
