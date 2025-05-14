package com.digitalstore.imperium.library.service.impl;

import com.digitalstore.imperium.library.model.Complain;
import com.digitalstore.imperium.library.repository.ComplainRepository;
import com.digitalstore.imperium.library.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplainServiceImpl implements ComplainService {

    @Autowired
    private ComplainRepository complainRepository;

    @Override
    public List<Complain> listAll() {
        return (List<Complain>) complainRepository.findAll();
    }

    @Override
    public Complain get(long id) {
        return complainRepository.findById(id);
    }

    @Override
    public void delete(long id) {
        complainRepository.delete(get(id));
    }

    @Override
    public void updateStatus(long id) {
        Complain complainNew = complainRepository.getById(id);
        complainNew.setReadStatus(!complainNew.isReadStatus());
        complainRepository.save(complainNew);
    }

    @Override
    public void save(Complain complain) {
        complainRepository.save(complain);
    }
}
