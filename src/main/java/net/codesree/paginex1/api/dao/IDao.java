package net.codesree.paginex1.api.dao;

import java.util.List;
import java.io.Serializable;

import net.codesree.pageinex1.api.util.JDBCTemplate;

public interface IDao extends Serializable {
  <T extends Object> T getBean(JDBCTemplate template) throws Exception;
  <T extends Object> List<T> getList(JDBCTemplate template) throws Exception;
  boolean saveOrUpdate(JDBCTemplate template) throws Exception;
  boolean remove(JDBCTemplate template) throws Exception;
}