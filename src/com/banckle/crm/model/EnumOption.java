package com.banckle.crm.model;

public class EnumOption {
  private Integer id = null;
  private String text = null;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
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
    sb.append("class EnumOption {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

