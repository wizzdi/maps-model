package com.wizzdi.maps.model;

import com.flexicore.model.SecuredBasic;
import com.wizzdi.flexicore.file.model.FileResource;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BuildingFloor extends SecuredBasic {
    @ManyToOne(targetEntity = Building.class)
    private Building building;
    @ManyToOne(targetEntity = Building.class)
    private FileResource drawing;
    @OneToMany(targetEntity = MappedPOI.class,mappedBy = "buildingFloor")
    private List<MappedPOI> mappedPOIs=new ArrayList<>();

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

    public List<MappedPOI> getMappedPOIs() {
        return mappedPOIs;
    }

    public BuildingFloor setMappedPOIs(List<MappedPOI> mappedPOIs) {
        this.mappedPOIs = mappedPOIs;
        return this;
    }
}
