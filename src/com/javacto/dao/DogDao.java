package com.javacto.dao;

import com.javacto.po.Dog;
import com.javacto.po.Phone;

import java.util.List;

/**
 * liu
 **/
public interface DogDao {
    /**
     * 登录
     */
    public Dog loginDog(String dogName, String pwd);

    /**
     * 添加
     */
    public int addDog(Dog dog);

    /**
     * 删除
     */
    public int deleteDog(int id);

    /**
     * 修改
     */
    public int updateDog(Dog dog);

    /**
     * 查询全部
     */
    public List<Dog> dogQueryAll();

    /**
     * Id查询
     */
    public Dog findDogById (int id);
}
