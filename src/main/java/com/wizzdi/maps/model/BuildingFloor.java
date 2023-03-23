package com.wizzdi.maps.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flexicore.model.SecuredBasic;
import com.wizzdi.flexicore.file.model.FileResource;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(indexes = {
        @Index(name = "buildingFloor_idx",columnList = "building_id")
})
public class BuildingFloor extends SecuredBasic {
    @ManyToOne(targetEntity = Building.class)
    private Building building;
    @ManyToOne(targetEntity = FileResource.class)
    private FileResource drawing;
    private int ordinal;

    @OneToMany(targetEntity = Room.class, mappedBy = "buildingFloor")
    @JsonIgnore
    private List<Room> rooms;
    @OneToMany(targetEntity = MappedPOI.class, mappedBy = "buildingFloor")
    @JsonIgnore
    private List<MappedPOI> mappedPOIS;
    public Building getBuilding() {
        return building;
    }

    public BuildingFloor setBuilding(Building building) {
        this.building = building;
        return this;
    }

    public FileResource getDrawing() {
        return drawing;
    }

    public BuildingFloor setDrawing(FileResource drawing) {
        this.drawing = drawing;
        return this;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public BuildingFloor setOrdinal(int ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public BuildingFloor setRooms(List<Room> rooms) {
        this.rooms = rooms;
        return this;
    }

    public List<MappedPOI> getMappedPOIS() {
        return mappedPOIS;
    }

    public BuildingFloor setMappedPOIS(List<MappedPOI> mappedPOIS) {
        this.mappedPOIS = mappedPOIS;
        return this;
    }
}
