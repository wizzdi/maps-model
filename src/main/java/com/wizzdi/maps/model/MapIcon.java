package com.wizzdi.maps.model;

import com.flexicore.model.SecuredBasic;
import com.wizzdi.flexicore.file.model.FileResource;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class MapIcon extends SecuredBasic {

  @ManyToOne(targetEntity = FileResource.class)
  private FileResource fileResource;

  private String externalId;

  /** @return fileResource */
  @ManyToOne(targetEntity = FileResource.class)
  public FileResource getFileResource() {
    return this.fileResource;
  }

  /**
   * @param fileResource fileResource to set
   * @return MapIcon
   */
  public <T extends MapIcon> T setFileResource(FileResource fileResource) {
    this.fileResource = fileResource;
    return (T) this;
  }

  /** @return externalId */
  public String getExternalId() {
    return this.externalId;
  }

  /**
   * @param externalId externalId to set
   * @return MapIcon
   */
  public <T extends MapIcon> T setExternalId(String externalId) {
    this.externalId = externalId;
    return (T) this;
  }
}
