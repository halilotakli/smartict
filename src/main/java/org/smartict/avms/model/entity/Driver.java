package org.smartict.avms.model.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.smartict.avms.core.model.entity.BaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Driver extends BaseEntity {

    private String name;
    private String surname;
    private String drivingLicenseType;

}
