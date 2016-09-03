package net.codesree.paginex1.api.util;


import java.util.List;
import java.io.Serializable;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.codesree.paginex1.api.util.IRowMapper;

public class JDBCTemplate implements Serializable {

  private DataSource ds=null;
  
  public JDBCTemplate(DataSource _dSource) {
    this.ds=_dSource;
  }
  
  public <T extends Object> List<T> getList(String sql,IRowMapper mapper) throws Exception {
    List<T> resultList=null;
    try () {
    } catch(SQLException sqlex) {
    } finally {
    }
    return resultList;
  }

  public int saveOrUpdate(String sql,Object[] dataObj) throws Exception {
    try() {
    } catch(SQLException sqlex) {
    } finally {
    }
  }
  
  public List<Integer> batchSaveOrUpdate(String sql,Object[][] dataObjs) throws Exception {
    try() {
    } catch(SQLException sqlex) {
    } finally {
    }
  }

  private void closeRs(ResultSet _rs) {
    if(_rs!=null&&_rs.isClosed()==false) {
      try {
        _rs.close();
      } catch (SQLException sqlex) {
        System.out.println("Error in closing resultset "+sqlex.getMessage());
        sqlex.printStackTrace();
      } finally {
        _rs=null;
      }
    }
  }

  private void closeCon(Connection _con) {
    if(_rs!=null&&_rs.isClosed()==false) {
      try {
        _con.close();
      } catch (SQLException sqlex) {
        System.out.println("Error in closing connection "+sqlex.getMessage());
        sqlex.printStackTrace();
      } finally {
        _con=null;
      }
    }
  }

  private void closePs(PreparedStatement _ps) {
    if(_ps!=null&&_ps.isClosed()==false) {
      try {
        _ps.close();
      } catch (SQLException sqlex) {
        System.out.println("Error in closing preparedstatement "+sqlex.getMessage());
        sqlex.printStackTrace();
      } finally {
        _con=null;
      }
    }
  }  
}