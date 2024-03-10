package org.smartict.avms.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.smartict.avms.core.model.entity.BaseEntity;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Route extends BaseEntity {

    private String routeName;

    @OneToOne(optional = false)
    private Vehicle vehicle;

    @OneToMany
    private List<Station> stationList;

}
