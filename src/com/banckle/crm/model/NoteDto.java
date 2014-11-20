package com.banckle.crm.model;

import java.util.Date;
import com.banckle.crm.model.TypeDto;
public class NoteDto {
  private String id = null;
  private Date updated = null;
  private String content = null;
  private TypeDto type = null;
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

  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }

  public TypeDto getType() {
    return type;
  }
  public void setType(TypeDto type) {
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
    sb.append("class NoteDto {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  parentId: ").append(parentId).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

