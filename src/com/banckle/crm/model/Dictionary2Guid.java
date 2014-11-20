package com.banckle.crm.model;

import com.banckle.crm.model.Dictionary2KeyCollectionGuid;
import com.banckle.crm.model.Dictionary2ValueCollectionGuid;
import com.banckle.crm.model.IEqualityComparerGuid;
public class Dictionary2Guid {
  private Dictionary2KeyCollectionGuid Keys = null;
  private IEqualityComparerGuid Comparer = null;
  private Integer Count = null;
  private String Item = null;
  private Dictionary2ValueCollectionGuid Values = null;
  public Dictionary2KeyCollectionGuid getKeys() {
    return Keys;
  }
  public void setKeys(Dictionary2KeyCollectionGuid Keys) {
    this.Keys = Keys;
  }

  public IEqualityComparerGuid getComparer() {
    return Comparer;
  }
  public void setComparer(IEqualityComparerGuid Comparer) {
    this.Comparer = Comparer;
  }

  public Integer getCount() {
    return Count;
  }
  public void setCount(Integer Count) {
    this.Count = Count;
  }

  public String getItem() {
    return Item;
  }
  public void setItem(String Item) {
    this.Item = Item;
  }

  public Dictionary2ValueCollectionGuid getValues() {
    return Values;
  }
  public void setValues(Dictionary2ValueCollectionGuid Values) {
    this.Values = Values;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dictionary2Guid {\n");
    sb.append("  Keys: ").append(Keys).append("\n");
    sb.append("  Comparer: ").append(Comparer).append("\n");
    sb.append("  Count: ").append(Count).append("\n");
    sb.append("  Item: ").append(Item).append("\n");
    sb.append("  Values: ").append(Values).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

