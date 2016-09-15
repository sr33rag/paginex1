package net.codesree.paginex1.beans.impl;

import java.io.Serializable;
import java.util.Date;

import net.codesree.paginex1.beans.IStudentDto;

public class StudentDtoImpl implements IStudentDto {

  private int isid=-1;
  private String sname=null;
  private Date ddob=null;
  private String scourse=null;
  private String ddoa=null;
  private String sstatus="";
  private String scategory="";
  private int ssubject1=-1;
  private int ssubject2=-1;
  private int ssubject3=-1;
  private int itotal=-1;
  
  private StudentDtoImpl(StudentDtoBuilder builder) {}
}