package com.javacto.service.impl;

import com.javacto.dao.ComputerDao;
import com.javacto.dao.impl.ComputerDaoImpl;
import com.javacto.po.Computer;
import com.javacto.service.ComputerService;

import java.util.List;

/**
 * liu
 **/
public class ComputerServiceImpl implements ComputerService {
    ComputerDao computerDao = new ComputerDaoImpl();

    @Override
    public Computer loginComputer(String phoneName, String pwd) {
        return computerDao.loginComputer(phoneName,pwd);
    }

    @Override
    public int addComputer(Computer computer) {
        return computerDao.addComputer(computer);
    }

    @Override
    public int deleteComputer(int id) {
        return computerDao.deleteComputer(id);
    }

    @Override
    public int updateComputer(Computer computer) {
        return computerDao.updateComputer(computer);
    }

    @Override
    public List<Computer> queryAllComputer() {
        return computerDao.queryAllComputer();
    }

    @Override
    public Computer findComputerById(int id) {
        return computerDao.findComputerById(id);
    }
}
