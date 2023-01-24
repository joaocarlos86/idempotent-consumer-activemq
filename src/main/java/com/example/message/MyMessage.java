package com.example.message;

public class MyMessage {

  private Integer id;
  private String name;

  public MyMessage() {

  }

  public MyMessage(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "MyMessage{" +
      "id=" + id +
      ", name='" + name + '\'' +
      '}';
  }
}
