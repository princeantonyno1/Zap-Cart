package com.digitalstore.imperium.library.service.impl;

import com.digitalstore.imperium.library.repository.CityRepository;
import com.digitalstore.imperium.library.model.City;
import com.digitalstore.imperium.library.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }
}
