package com.banckle.crm.model;

import java.util.*;
import java.util.Date;
public class DealDto {
  private String dealSourceId = null;
  private String name = null;
  private String stageColor = null;
  private String stageId = null;
  private List<TagDto> tags = new ArrayList<TagDto>();
  private String creatorName = null;
  private String creatorId = null;
  private List<AssociatedContact> contacts = new ArrayList<AssociatedContact>();
  private Date stageDate = null;
  private Integer version = null;
  private String id = null;
  private String stageName = null;
  private Date updated = null;
  private Boolean isHot = null;
  private String assigneeName = null;
  private String dealSourceName = null;
  private String currency = null;
  private String assigneeId = null;
  private String tenantId = null;
  private String lossReasonName = null;
  private Double value = null;
  private String lossReasonId = null;
  private Date created = null;
  public String getDealSourceId() {
    return dealSourceId;
  }
  public void setDealSourceId(String dealSourceId) {
    this.dealSourceId = dealSourceId;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getStageColor() {
    return stageColor;
  }
  public void setStageColor(String stageColor) {
    this.stageColor = stageColor;
  }

  public String getStageId() {
    return stageId;
  }
  public void setStageId(String stageId) {
    this.stageId = stageId;
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

  public String getCreatorId() {
    return creatorId;
  }
  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public List<AssociatedContact> getContacts() {
    return contacts;
  }
  public void setContacts(List<AssociatedContact> contacts) {
    this.contacts = contacts;
  }

  public Date getStageDate() {
    return stageDate;
  }
  public void setStageDate(Date stageDate) {
    this.stageDate = stageDate;
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

  public String getStageName() {
    return stageName;
  }
  public void setStageName(String stageName) {
    this.stageName = stageName;
  }

  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public Boolean getIsHot() {
    return isHot;
  }
  public void setIsHot(Boolean isHot) {
    this.isHot = isHot;
  }

  public String getAssigneeName() {
    return assigneeName;
  }
  public void setAssigneeName(String assigneeName) {
    this.assigneeName = assigneeName;
  }

  public String getDealSourceName() {
    return dealSourceName;
  }
  public void setDealSourceName(String dealSourceName) {
    this.dealSourceName = dealSourceName;
  }

  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getAssigneeId() {
    return assigneeId;
  }
  public void setAssigneeId(String assigneeId) {
    this.assigneeId = assigneeId;
  }

  public String getTenantId() {
    return tenantId;
  }
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public String getLossReasonName() {
    return lossReasonName;
  }
  public void setLossReasonName(String lossReasonName) {
    this.lossReasonName = lossReasonName;
  }

  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  public String getLossReasonId() {
    return lossReasonId;
  }
  public void setLossReasonId(String lossReasonId) {
    this.lossReasonId = lossReasonId;
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
    sb.append("class DealDto {\n");
    sb.append("  dealSourceId: ").append(dealSourceId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  stageColor: ").append(stageColor).append("\n");
    sb.append("  stageId: ").append(stageId).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  creatorName: ").append(creatorName).append("\n");
    sb.append("  creatorId: ").append(creatorId).append("\n");
    sb.append("  contacts: ").append(contacts).append("\n");
    sb.append("  stageDate: ").append(stageDate).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  stageName: ").append(stageName).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  isHot: ").append(isHot).append("\n");
    sb.append("  assigneeName: ").append(assigneeName).append("\n");
    sb.append("  dealSourceName: ").append(dealSourceName).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  assigneeId: ").append(assigneeId).append("\n");
    sb.append("  tenantId: ").append(tenantId).append("\n");
    sb.append("  lossReasonName: ").append(lossReasonName).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  lossReasonId: ").append(lossReasonId).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

