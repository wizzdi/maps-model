package com.wizzdi.maps.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flexicore.model.SecuredBasic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MapGroup extends SecuredBasic {

  private String externalId;
  @JsonIgnore
  @OneToMany(targetEntity = MapGroupToMappedPOI.class,mappedBy = "mapGroup")
  private List<MapGroupToMappedPOI> mapGroupToMappedPOIS=new ArrayList<>();

  /** @return externalId */
  public String getExternalId() {
    return this.externalId;
  }

  /**
   * @param externalId externalId to set
   * @return MapGroup
   */
  public <T extends MapGroup> T setExternalId(String externalId) {
    this.externalId = externalId;
    return (T) this;
  }

  @JsonIgnore
  @OneToMany(targetEntity = MapGroupToMappedPOI.class,mappedBy = "mapGroup")
  public List<MapGroupToMappedPOI> getMapGroupToMappedPOIS() {
    return mapGroupToMappedPOIS;
  }

  public <T extends MapGroup> T setMapGroupToMappedPOIS(List<MapGroupToMappedPOI> mapGroupToMappedPOIS) {
    this.mapGroupToMappedPOIS = mapGroupToMappedPOIS;
    return (T) this;
  }
}
