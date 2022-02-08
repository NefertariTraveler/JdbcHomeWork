package com.javacto.dao;

import com.javacto.po.Computer;
import com.javacto.po.Phone;

import java.util.List;

/**
 * liu
 **/
public interface ComputerDao {
    /**
     * 登录
     * @param phoneName
     * @param pwd
     * @return
     */
    public Computer loginComputer(String phoneName, String pwd);

    /**
     * 添加
     */
    public int addComputer(Computer computer);

    /**
     * 删除
     */
    public int deleteComputer(int id);

    /**
     * 修改
     */
    public int updateComputer(Computer computer);

    /**
     * 查询全部
     */
    public List<Computer> queryAllComputer();

    /**
     * Id查询
     */
    public Computer findComputerById (int id);
}
