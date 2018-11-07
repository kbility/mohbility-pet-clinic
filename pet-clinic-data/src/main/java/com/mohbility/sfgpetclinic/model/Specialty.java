package com.mohbility.sfgpetclinic.model;

/**
 * @author home ON ${Date}
 * @project sfg-pet-clinic
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
