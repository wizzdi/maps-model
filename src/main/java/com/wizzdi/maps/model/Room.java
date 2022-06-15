package com.wizzdi.maps.model;

import com.flexicore.model.SecuredBasic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Room extends SecuredBasic {

  @ManyToOne(targetEntity = Building.class)
  private Building building;

  private String externalId;

  private Double x;

  private Double y;

  private Double z;

  /** @return building */
  @ManyToOne(targetEntity = Building.class)
  public Building getBuilding() {
    return this.building;
  }

  /**
   * @param building building to set
   * @return Room
   */
  public <T extends Room> T setBuilding(Building building) {
    this.building = building;
    return (T) this;
  }

  /** @return externalId */
  public String getExternalId() {
    return this.externalId;
  }

  /**
   * @param externalId externalId to set
   * @return Room
   */
  public <T extends Room> T setExternalId(String externalId) {
    this.externalId = externalId;
    return (T) this;
  }

  /** @return x */
  public Double getX() {
    return this.x;
  }

  /**
   * @param x x to set
   * @return Room
   */
  public <T extends Room> T setX(Double x) {
    this.x = x;
    return (T) this;
  }

  /** @return y */
  public Double getY() {
    return this.y;
  }

  /**
   * @param y y to set
   * @return Room
   */
  public <T extends Room> T setY(Double y) {
    this.y = y;
    return (T) this;
  }

  /** @return z */
  public Double getZ() {
    return this.z;
  }

  /**
   * @param z z to set
   * @return Room
   */
  public <T extends Room> T setZ(Double z) {
    this.z = z;
    return (T) this;
  }
}
