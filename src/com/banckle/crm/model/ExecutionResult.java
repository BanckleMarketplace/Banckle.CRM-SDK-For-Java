package com.banckle.crm.model;

public class ExecutionResult {
  private String id = null;
  private String message = null;
  private Integer version = null;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionResult {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

