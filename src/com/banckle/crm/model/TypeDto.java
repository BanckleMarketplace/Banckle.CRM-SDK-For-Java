package com.banckle.crm.model;

import java.util.Date;
import com.banckle.crm.model.Guid;
public class TypeDto {
  private String name = null;
  private String id = null;
  private Date updated = null;
  private String entity = null;
  //public enum entityEnum { Notes, }; 
  private Guid tenantId = null;
  private Guid parentId = null;
  private Date created = null;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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

  public String getEntity() {
    return entity;
  }
  public void setEntity(String entity) {
    this.entity = entity;
  }

  public Guid getTenantId() {
    return tenantId;
  }
  public void setTenantId(Guid tenantId) {
    this.tenantId = tenantId;
  }

  public Guid getParentId() {
    return parentId;
  }
  public void setParentId(Guid parentId) {
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
    sb.append("class TypeDto {\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  entity: ").append(entity).append("\n");
    sb.append("  tenantId: ").append(tenantId).append("\n");
    sb.append("  parentId: ").append(parentId).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

