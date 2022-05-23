/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.ucs.clase06.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.ucs.clase06.model.Editorial;
import pe.ucs.clase06.service.EditorialService;
import pe.ucs.clase06.dao.EditorialDao;

/**
 *
 * @author admin
 */
@Service
public class EditorialServiceImpl implements EditorialService{
    @Autowired
    private EditorialDao editoDao;
    @Override
    public int create(Editorial edito) {
        return editoDao.create(edito);
    }

    @Override
    public int update(Editorial edito) {
        return editoDao.update(edito);
    }

    @Override
    public int delete(int id) {
        return editoDao.delete(id);
    }

    @Override
    public Editorial read(int id) {
        return editoDao.read(id);
    }

    @Override
    public List<Editorial> readAll() {
        return editoDao.readAll();
    }
    
}
