package com.banckle.crm.model;

import java.util.Date;
public class EmailDto {
  private String id = null;
  private Date updated = null;
  private String address = null;
  private String type = null;
  private String parentId = null;
  private Date created = null;
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

  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
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
    sb.append("class EmailDto {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  parentId: ").append(parentId).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

