package org.com.ehotel.repository.user;

import org.com.ehotel.entity.user.AppUserEntity;
import org.com.ehotel.entity.user.CustomerEntity;
import org.com.ehotel.entity.user.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


/**
 * @author : memo-aldu
 * @mailto : maldu064@uOttawa.ca
 * @created : 3/14/2023, Tuesday
 **/
@Repository
public interface CustomerEntityRepository extends JpaRepository<CustomerEntity, String> {


}