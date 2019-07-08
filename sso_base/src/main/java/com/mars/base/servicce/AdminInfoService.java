package com.mars.base.servicce;

import com.mars.base.dao.AdminInfoDao;
import com.mars.sso_api.user.domain.AdminInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminInfoService {

    @Autowired
    private AdminInfoDao adminInfoDao;

    public List<AdminInfo> listAll() {

        return adminInfoDao.findAll();
    }

    public AdminInfo getById(String id) {
        return adminInfoDao.findById(id).get();
    }

    public void save(AdminInfo adminInfo) {
        adminInfoDao.save(adminInfo);
    }

    public void update(AdminInfo adminInfo) {
        adminInfoDao.save(adminInfo);
    }

    public void delete(String adminId) {
        adminInfoDao.deleteById(adminId);
    }
}
