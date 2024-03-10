package org.smartict.avms.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.smartict.avms.core.model.entity.BaseEntity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Vehicle extends BaseEntity {

    private String plate;
    private String model;
    private String brand;
    private int capacity;

    @OneToOne(optional = false)
    private Driver driver;

}
