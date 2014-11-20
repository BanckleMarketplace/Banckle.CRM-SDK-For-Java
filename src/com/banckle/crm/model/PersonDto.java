package com.banckle.crm.model;

import java.util.*;
import java.util.Date;
public class PersonDto {
  private String name = null;
  private Boolean favorite = null;
  private String role = null;
  private String description = null;
  private List<TagDto> tags = new ArrayList<TagDto>();
  private String creatorName = null;
  private String creatorId = null;
  private String skypeId = null;
  private List<PhoneDto> phones = new ArrayList<PhoneDto>();
  private String lastName = null;
  private Integer version = null;
  private String firstName = null;
  private String id = null;
  private Date updated = null;
  private String companyName = null;
  private Date birthDay = null;
  private Boolean isPrivate = null;
  private String userId = null;
  private String title = null;
  private String tenantId = null;
  private String type = null;
  private List<EmailDto> emails = new ArrayList<EmailDto>();
  private String companyId = null;
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

  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
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

  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
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

  public String getCompanyName() {
    return companyName;
  }
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Date getBirthDay() {
    return birthDay;
  }
  public void setBirthDay(Date birthDay) {
    this.birthDay = birthDay;
  }

  public Boolean getIsPrivate() {
    return isPrivate;
  }
  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
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

  public List<EmailDto> getEmails() {
    return emails;
  }
  public void setEmails(List<EmailDto> emails) {
    this.emails = emails;
  }

  public String getCompanyId() {
    return companyId;
  }
  public void setCompanyId(String companyId) {
    this.companyId = companyId;
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
    sb.append("class PersonDto {\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  favorite: ").append(favorite).append("\n");
    sb.append("  role: ").append(role).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  creatorName: ").append(creatorName).append("\n");
    sb.append("  creatorId: ").append(creatorId).append("\n");
    sb.append("  skypeId: ").append(skypeId).append("\n");
    sb.append("  phones: ").append(phones).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  companyName: ").append(companyName).append("\n");
    sb.append("  birthDay: ").append(birthDay).append("\n");
    sb.append("  isPrivate: ").append(isPrivate).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  tenantId: ").append(tenantId).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  emails: ").append(emails).append("\n");
    sb.append("  companyId: ").append(companyId).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  addresses: ").append(addresses).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

