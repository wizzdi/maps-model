package com.wizzdi.maps.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flexicore.model.SecuredBasic;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Layer extends SecuredBasic {
    int ordinal;
    @JsonIgnore
    @OneToMany(targetEntity = MappedPOI.class,mappedBy = "layer")
    private List<MappedPOI> mappedPOIS=new ArrayList<>();
    public int getOrdinal() {
        return ordinal;
    }

    public Layer setOrdinal(int ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    public List<MappedPOI> getMappedPOIS() {
        return mappedPOIS;
    }

    public Layer setMappedPOIS(List<MappedPOI> mappedPOIS) {
        this.mappedPOIS = mappedPOIS;
        return this;
    }
}
