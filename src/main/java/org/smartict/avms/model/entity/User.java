package org.smartict.avms.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.antlr.v4.runtime.misc.NotNull;
import org.smartict.avms.core.model.entity.BaseEntity;


@EqualsAndHashCode(callSuper = false)
@Data
@Entity
// user ismi postgre struct olarak tanımlı olduğu için tablo adı mudale edildi.
@Table(name = "\"user\"")
public class User extends BaseEntity  {

    @NotNull
    @Column(nullable = false)
    private String email;

    @NotNull
    @Column(nullable = false)
    private String password;

}
