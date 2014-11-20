package com.banckle.crm.model;

import java.util.*;
import java.util.Date;
import com.banckle.crm.model.CustomFieldValue;
public class CustomFieldDto {
  private String name = null;
  private CustomFieldValue valueHolder = null;
  private List<EnumOption> options = new ArrayList<EnumOption>();
  private String id = null;
  private Date updated = null;
  private String type = null;
  //public enum typeEnum { String, Integer, Date, Enum, Boll, Currency, }; 
  private Date created = null;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public CustomFieldValue getValueHolder() {
    return valueHolder;
  }
  public void setValueHolder(CustomFieldValue valueHolder) {
    this.valueHolder = valueHolder;
  }

  public List<EnumOption> getOptions() {
    return options;
  }
  public void setOptions(List<EnumOption> options) {
    this.options = options;
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
    sb.append("class CustomFieldDto {\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  valueHolder: ").append(valueHolder).append("\n");
    sb.append("  options: ").append(options).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

