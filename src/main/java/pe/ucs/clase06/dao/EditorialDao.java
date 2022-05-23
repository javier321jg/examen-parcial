package pe.ucs.clase06.dao;


import java.util.List;
import pe.ucs.clase06.model.Editorial;



/**
 *
 * @author admin
 */
public interface EditorialDao {
    int create(Editorial edito);
    int update(Editorial edito);
    int delete(int id);
    Editorial read(int id);
    List<Editorial> readAll();
}
