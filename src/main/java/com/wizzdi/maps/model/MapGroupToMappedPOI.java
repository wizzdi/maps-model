package com.wizzdi.maps.model;

import com.flexicore.model.SecuredBasic;
import javax.persistence.Entity;

@Entity
public class MapGroupToMappedPOI extends SecuredBasic {

  private MappedPOI mappedPOI;

  private MapGroup mapGroup;

  /** @return mappedPOI */
  public MappedPOI getMappedPOI() {
    return this.mappedPOI;
  }

  /**
   * @param mappedPOI mappedPOI to set
   * @return MapGroupToMappedPOI
   */
  public <T extends MapGroupToMappedPOI> T setMappedPOI(MappedPOI mappedPOI) {
    this.mappedPOI = mappedPOI;
    return (T) this;
  }

  /** @return mapGroup */
  public MapGroup getMapGroup() {
    return this.mapGroup;
  }

  /**
   * @param mapGroup mapGroup to set
   * @return MapGroupToMappedPOI
   */
  public <T extends MapGroupToMappedPOI> T setMapGroup(MapGroup mapGroup) {
    this.mapGroup = mapGroup;
    return (T) this;
  }
}
