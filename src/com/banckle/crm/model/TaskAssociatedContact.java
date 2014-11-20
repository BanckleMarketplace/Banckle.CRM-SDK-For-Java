package com.banckle.crm.model;

import java.util.Date;
public class TaskAssociatedContact {
  private String text = null;
  private String id = null;
  private Date updated = null;
  private String type = null;
  private Date created = null;
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
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

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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
    sb.append("class TaskAssociatedContact {\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

