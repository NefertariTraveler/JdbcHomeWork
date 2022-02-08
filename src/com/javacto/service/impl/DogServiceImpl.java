package com.javacto.service.impl;

import com.javacto.dao.DogDao;
import com.javacto.dao.impl.DogDaoImpl;
import com.javacto.po.Dog;
import com.javacto.service.DogService;

import java.util.List;

/**
 * liu
 **/
public class DogServiceImpl implements DogService {
    DogDao dogDao = new DogDaoImpl();

    @Override
    public Dog loginDog(String dogName, String pwd) {
        return dogDao.loginDog(dogName,pwd);
    }

    @Override
    public int addDog(Dog dog) {
        return dogDao.addDog(dog);
    }

    @Override
    public int deleteDog(int id) {
        return dogDao.deleteDog(id);
    }

    @Override
    public int updateDog(Dog dog) {
        return dogDao.updateDog(dog);
    }

    @Override
    public List<Dog> dogQueryAll() {
        return dogDao.dogQueryAll();
    }

    @Override
    public Dog findDogById(int id) {
        return dogDao.findDogById(id);
    }
}
