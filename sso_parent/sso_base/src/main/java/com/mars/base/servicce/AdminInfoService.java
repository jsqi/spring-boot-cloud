package com.mars.base.servicce;

import com.mars.base.dao.AdminInfoDao;
import com.mars.base.domain.AdminInfo;
import com.mars.domain.eneity.com.mars.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminInfoService {

    @Autowired
    private AdminInfoDao adminInfoDao;
    @Autowired
    IdWorker idWorker;

    public List<AdminInfo> listAll() {

        return adminInfoDao.findAll();
    }

    public AdminInfo getById(String id) {
        return adminInfoDao.findById(id).get();
    }

    public void save(AdminInfo adminInfo) {
        adminInfo.setId(idWorker.nextId() + "");
        adminInfoDao.save(adminInfo);
    }

    public void update(AdminInfo adminInfo) {
        adminInfoDao.save(adminInfo);
    }

    public void delete(String adminId) {
        adminInfoDao.deleteById(adminId);
    }
}
