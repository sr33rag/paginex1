package net.codesree.paginex1.beans;

import java.util.Date;
import java.io.Serializable;

public interface IStudentDto extends Serializable {
  int getIsid();
  String getSname();
  Date getDdob();
  String getScourse();
  Date getDdoa();
  String getSstatus();
  String getScategory();
  int getIsubject1();
  int getIsubject2();
  int getIsubject3();
  int getItotal();
}