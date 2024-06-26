package com.ecommerce.dao;
import com.ecommerce.entity.LocalUser;
import com.ecommerce.entity.OrderDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailDao extends CrudRepository<OrderDetail,Integer> {
    public List<OrderDetail> findByUser(LocalUser user);
    public List<OrderDetail> findByOrderStatues(String orderStatues);
}
