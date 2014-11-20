package com.banckle.crm.model;

import java.util.*;
import java.util.Date;
import com.banckle.crm.model.Dictionary2Guid;
public class ContactFullDto {
  private String name = null;
  private Boolean favorite = null;
  private String description = null;
  private List<TagDto> tags = new ArrayList<TagDto>();
  private String creatorName = null;
  private List<WebsiteDto> websites = new ArrayList<WebsiteDto>();
  private List<CustomFieldDto> customFields = new ArrayList<CustomFieldDto>();
  private Dictionary2Guid associatedFiles = null;
  private String creatorId = null;
  private String skypeId = null;
  private List<PhoneDto> phones = new ArrayList<PhoneDto>();
  private Integer version = null;
  private String id = null;
  private List<TaskOccurrenceDto> tasks = new ArrayList<TaskOccurrenceDto>();
  private Date updated = null;
  private Boolean isPrivate = null;
  private List<NoteDto> notes = new ArrayList<NoteDto>();
  private String userId = null;
  private String tenantId = null;
  private String type = null;
  private List<DealDto> deals = new ArrayList<DealDto>();
  private List<SocialDto> socials = new ArrayList<SocialDto>();
  private List<EmailDto> emails = new ArrayList<EmailDto>();
  private Date created = null;
  private List<AddressDto> addresses = new ArrayList<AddressDto>();
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

  public List<WebsiteDto> getWebsites() {
    return websites;
  }
  public void setWebsites(List<WebsiteDto> websites) {
    this.websites = websites;
  }

  public List<CustomFieldDto> getCustomFields() {
    return customFields;
  }
  public void setCustomFields(List<CustomFieldDto> customFields) {
    this.customFields = customFields;
  }

  public Dictionary2Guid getAssociatedFiles() {
    return associatedFiles;
  }
  public void setAssociatedFiles(Dictionary2Guid associatedFiles) {
    this.associatedFiles = associatedFiles;
  }

  public String getCreatorId() {
    return creatorId;
  }
  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public String getSkypeId() {
    return skypeId;
  }
  public void setSkypeId(String skypeId) {
    this.skypeId = skypeId;
  }

  public List<PhoneDto> getPhones() {
    return phones;
  }
  public void setPhones(List<PhoneDto> phones) {
    this.phones = phones;
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

  public List<TaskOccurrenceDto> getTasks() {
    return tasks;
  }
  public void setTasks(List<TaskOccurrenceDto> tasks) {
    this.tasks = tasks;
  }

  public Date getUpdated() {
    return updated;
  }
  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public Boolean getIsPrivate() {
    return isPrivate;
  }
  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  public List<NoteDto> getNotes() {
    return notes;
  }
  public void setNotes(List<NoteDto> notes) {
    this.notes = notes;
  }

  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getTenantId() {
    return tenantId;
  }
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public List<DealDto> getDeals() {
    return deals;
  }
  public void setDeals(List<DealDto> deals) {
    this.deals = deals;
  }

  public List<SocialDto> getSocials() {
    return socials;
  }
  public void setSocials(List<SocialDto> socials) {
    this.socials = socials;
  }

  public List<EmailDto> getEmails() {
    return emails;
  }
  public void setEmails(List<EmailDto> emails) {
    this.emails = emails;
  }

  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
  }

  public List<AddressDto> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<AddressDto> addresses) {
    this.addresses = addresses;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactFullDto {\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  favorite: ").append(favorite).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  creatorName: ").append(creatorName).append("\n");
    sb.append("  websites: ").append(websites).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("  associatedFiles: ").append(associatedFiles).append("\n");
    sb.append("  creatorId: ").append(creatorId).append("\n");
    sb.append("  skypeId: ").append(skypeId).append("\n");
    sb.append("  phones: ").append(phones).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  tasks: ").append(tasks).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  isPrivate: ").append(isPrivate).append("\n");
    sb.append("  notes: ").append(notes).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  tenantId: ").append(tenantId).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  deals: ").append(deals).append("\n");
    sb.append("  socials: ").append(socials).append("\n");
    sb.append("  emails: ").append(emails).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  addresses: ").append(addresses).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

