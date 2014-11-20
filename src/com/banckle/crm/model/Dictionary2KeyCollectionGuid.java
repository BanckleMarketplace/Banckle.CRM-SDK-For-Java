package com.banckle.crm.model;

public class Dictionary2KeyCollectionGuid {
  private Integer Count = null;
  public Integer getCount() {
    return Count;
  }
  public void setCount(Integer Count) {
    this.Count = Count;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dictionary2KeyCollectionGuid {\n");
    sb.append("  Count: ").append(Count).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

