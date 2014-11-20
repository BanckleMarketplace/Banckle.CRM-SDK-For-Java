package com.banckle.crm.model;

public class OptionDto {
  private String id = null;
  private String text = null;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionDto {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

