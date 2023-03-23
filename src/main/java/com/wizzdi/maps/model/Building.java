package com.wizzdi.maps.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flexicore.model.SecuredBasic;

import javax.management.openmbean.TabularData;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Building extends SecuredBasic {

  @ManyToOne(targetEntity = MappedPOI.class)
  private MappedPOI mappedPOI;

  private String externalId;
  @OneToMany(targetEntity = BuildingFloor.class, mappedBy = "building")
  @JsonIgnore
  private List<BuildingFloor> buildingFloors;
  /** @return mappedPOI */
  @ManyToOne(targetEntity = MappedPOI.class)
  public MappedPOI getMappedPOI() {
    return this.mappedPOI;
  }

  /**
   * @param mappedPOI mappedPOI to set
   * @return Building
   */
  public <T extends Building> T setMappedPOI(MappedPOI mappedPOI) {
    this.mappedPOI = mappedPOI;
    return (T) this;
  }

  /** @return externalId */
  public String getExternalId() {
    return this.externalId;
  }

  /**
   * @param externalId externalId to set
   * @return Building
   */
  public <T extends Building> T setExternalId(String externalId) {
    this.externalId = externalId;
    return (T) this;
  }

  public List<BuildingFloor> getBuildingFloors() {
    return buildingFloors;
  }

  public Building setBuildingFloors(List<BuildingFloor> buildingFloors) {
    this.buildingFloors = buildingFloors;
    return this;
  }
}
