package com.banckle.crm.model;

import java.util.*;
import java.util.Date;
public class TaskOccurrenceDto {
  private String name = null;
  private Boolean favorite = null;
  private String description = null;
  private List<TagDto> tags = new ArrayList<TagDto>();
  private String creatorName = null;
  private List<CustomFieldDto> customFields = new ArrayList<CustomFieldDto>();
  private String creatorId = null;
  private List<TaskAssociatedContact> contacts = new ArrayList<TaskAssociatedContact>();
  private Integer version = null;
  private String id = null;
  private Date updated = null;
  private String assigneeName = null;
  private String assigneeId = null;
  private Boolean done = null;
  private Date finishDate = null;
  private String tenantId = null;
  private List<OptionDto> deals = new ArrayList<OptionDto>();
  private Date startDate = null;
  private Date created = null;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Boolean getFavorite() {
    return favorite;
  }
  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public List<TagDto> getTags() {
    return tags;
  }
  public void setTags(List<TagDto> tags) {
    this.tags = tags;
  }

  public String getCreatorName() {
    return creatorName;
  }
  public void setCreatorName(String creatorName) {
    this.creatorName = creatorName;
  }

  public List<CustomFieldDto> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(List<CustomFieldDto> customFields) {
    this.customFields = customFields;
  }

  public String getCreatorId() {
    return creatorId;
  }
  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public List<TaskAssociatedContact> getContacts() {
    return contacts;
  }
  public void setContacts(List<TaskAssociatedContact> contacts) {
    this.contacts = contacts;
  }

  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
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

  public String getAssigneeName() {
    return assigneeName;
  }
  public void setAssigneeName(String assigneeName) {
    this.assigneeName = assigneeName;
  }

  public String getAssigneeId() {
    return assigneeId;
  }
  public void setAssigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
  }

  public Boolean getDone() {
    return done;
  }
  public void setDone(Boolean done) {
    this.done = done;
  }

  public Date getFinishDate() {
    return finishDate;
  }
  public void setFinishDate(Date finishDate) {
    this.finishDate = finishDate;
  }

  public String getTenantId() {
    return tenantId;
  }
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public List<OptionDto> getDeals() {
    return deals;
  }
  public void setDeals(List<OptionDto> deals) {
    this.deals = deals;
  }

  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
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
    sb.append("class TaskOccurrenceDto {\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  favorite: ").append(favorite).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  creatorName: ").append(creatorName).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("  creatorId: ").append(creatorId).append("\n");
    sb.append("  contacts: ").append(contacts).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  assigneeName: ").append(assigneeName).append("\n");
    sb.append("  assigneeId: ").append(assigneeId).append("\n");
    sb.append("  done: ").append(done).append("\n");
    sb.append("  finishDate: ").append(finishDate).append("\n");
    sb.append("  tenantId: ").append(tenantId).append("\n");
    sb.append("  deals: ").append(deals).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

