package org.smartict.avms.core.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDate createdDt;
    @LastModifiedDate
    private LocalDate modifiedDt;
    @Column(nullable = false, updatable = false)
    private Long createdBy;
    private Long modifiedBy;
    private Byte rowStatus=1;
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
