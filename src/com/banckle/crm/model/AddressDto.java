package com.banckle.crm.model;

import java.util.Date;
public class AddressDto {
  private String city = null;
  private String zip = null;
  private String state = null;
  private String country = null;
  private String building = null;
  private String id = null;
  private Date updated = null;
  private String street = null;
  private String type = null;
  private String parentId = null;
  private Date created = null;
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  public String getBuilding() {
    return building;
  }
  public void setBuilding(String building) {
    this.building = building;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDto {\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  zip: ").append(zip).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  building: ").append(building).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  street: ").append(street).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  parentId: ").append(parentId).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

