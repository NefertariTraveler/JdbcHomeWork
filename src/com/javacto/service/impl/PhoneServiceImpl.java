package com.javacto.service.impl;

import com.javacto.dao.PhoneDao;
import com.javacto.dao.impl.PhoneDaoImpl;
import com.javacto.po.Phone;
import com.javacto.service.PhoneService;

import java.util.List;

/**
 * liu
 **/
public class PhoneServiceImpl implements PhoneService {
    private PhoneDao phoneDao = new PhoneDaoImpl();

    /**
     * 登录
     * @param phoneName
     * @param pwd
     * @return
     */
    public Phone login(String phoneName, String pwd){
        return phoneDao.login(phoneName,pwd);
    }

    /**
     * 添加
     */
    public int addPhone(Phone phone){
        return phoneDao.addPhone(phone);
    }

    /**
     * 删除
     */
    public int deletePhone(int id){
        return phoneDao.deletePhone(id);
    }

    /**
     * 修改
     */
    public int updatePhone(Phone phone){
        return phoneDao.updatePhone(phone);
    }

    /**
     * 查询全部
     */
    public List<Phone> queryAll(){
        return phoneDao.queryAll();
    }

    /**
     * Id查询
     */
    public Phone findPhoneById (int id){
        return phoneDao.findPhoneById(id);
    }
}
