/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.ucs.clase06.service;

import java.util.List;
import pe.ucs.clase06.model.Editorial;

/**
 *
 * @author admin
 */
public interface EditorialService {
    int create(Editorial edito);
    int update(Editorial edito);
    int delete(int id);
    Editorial read(int id);
    List<Editorial> readAll();
}
