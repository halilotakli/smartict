package org.smartict.avms.core.model.dto;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@MappedSuperclass
public abstract class BaseDto implements Serializable {
    private Long id;
    private LocalDate createdDt;
    private LocalDate modifiedDt;
    private Long createdBy;
    private Long modifiedBy;
    private Byte rowStatus;
    public void setId(Long id) {
        this.id = id;
    }
    public void setModifiedDt(LocalDate modifiedDt) {
        this.modifiedDt = modifiedDt;
    }
    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    public void setRowStatus(Byte rowStatus) {
        this.rowStatus = rowStatus;
    }
}
