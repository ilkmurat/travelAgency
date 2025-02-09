package com.travelagency.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@ToString(callSuper = true)
@Table(name = "status")
public class Status extends AbstractPersistableEntity {
    private static final long serialVersionUID = 1L;

    @Convert(converter = StringTrimConverter.class)
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "text")
    private String status;

    private Boolean havePrivacy = false;

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private Location location;

    @Transient
    private Long locationId;

    @Transient
    private String locationName;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private User user;

    @Transient
    private Long userId;

    @Transient
    private String userName;
}
