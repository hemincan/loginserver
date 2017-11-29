package com.can.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.can.dao.BaseDao;  
  
  
/** 
 * BaseServiceImpl 定义Service的通用操作的实现 
 *  
 * @author Monday 
 */  
@Transactional  
public class BaseServiceImpl<T> implements BaseService<T> {  
      
    /** 
     * 注入BaseDao 
     */ 
	@Autowired
    private BaseDao<T> dao;  
  
    public void setDao(BaseDao<T> dao) {  
        this.dao = dao;  
    }  
  
    public void save(T entity) {  
        dao.save(entity);  
    }  
  
    public void update(T entity) {  
        dao.update(entity);  
    }  
  
    public void delete(Serializable id) {  
        dao.delete(id);  
    }  
  
    public T getById(Serializable id) {  
        return dao.findById(id);  
    }  
  
    public List<T> findByHQL(String hql) {  
        return dao.findByHQL(hql);  
    }  
}  