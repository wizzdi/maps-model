package com.wizzdi.maps.model;

import com.flexicore.model.SecuredBasic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class MapGroupToMappedPOI extends SecuredBasic {

  @ManyToOne(targetEntity = MapGroup.class)
  private MapGroup mapGroup;

  @ManyToOne(targetEntity = MappedPOI.class)
  private MappedPOI mappedPOI;

  /** @return mapGroup */
  @ManyToOne(targetEntity = MapGroup.class)
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

  /** @return mappedPOI */
  @ManyToOne(targetEntity = MappedPOI.class)
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
}
