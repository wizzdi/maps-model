package com.wizzdi.maps.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flexicore.model.SecuredBasic;
import java.util.List;
import javax.persistence.*;

@Entity
public class Room extends SecuredBasic {

  @ManyToOne(targetEntity = BuildingFloor.class)
  private BuildingFloor buildingFloor;

  @OneToMany(targetEntity = LocationHistory.class, mappedBy = "room")
  @JsonIgnore
  private List<LocationHistory> roomLocationHistories;



  private Double z;

  private Double x;

  private String externalId;

  private Double y;


  /** @return roomLocationHistories */
  @OneToMany(targetEntity = LocationHistory.class, mappedBy = "room")
  @JsonIgnore
  public List<LocationHistory> getRoomLocationHistories() {
    return this.roomLocationHistories;
  }

  /**
   * @param roomLocationHistories roomLocationHistories to set
   * @return Room
   */
  public <T extends Room> T setRoomLocationHistories(List<LocationHistory> roomLocationHistories) {
    this.roomLocationHistories = roomLocationHistories;
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

  public BuildingFloor getBuildingFloor() {
    return buildingFloor;
  }

  public Room setBuildingFloor(BuildingFloor buildingFloor) {
    this.buildingFloor = buildingFloor;
    return this;
  }
}
