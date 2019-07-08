package com.mars.base.dao;

import com.mars.sso_api.user.domain.AdminInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AdminInfoDao extends JpaRepository<AdminInfo,String>, JpaSpecificationExecutor<AdminInfo> {

}
