package com.wizzdi.maps.model;

import com.flexicore.model.SecuredBasic;
import javax.persistence.Entity;

@Entity
public class MapGroup extends SecuredBasic {

  private String externalId;

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
}
