package pe.ucs.clase06.daoImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.ucs.clase06.model.Editorial;
import pe.ucs.clase06.dao.EditorialDao;


/**
 *
 * @author admin
 */
@Repository
public class EditorialDaoImpl implements EditorialDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int create(Editorial edito) {
        String SQL ="INSERT INTO edito (nombre, pais) VALUES(?,?)";
        return jdbcTemplate.update(SQL,new Object[]{edito.getNombre(),edito.getPais()});
    }

    @Override
    public int update(Editorial edito) {
        String SQL ="UPDATE edito SET nombre=?, pais=? WHERE ideditorial=?";                 
        return jdbcTemplate.update(SQL,new Object[]{edito.getNombre(), edito.getPais(), edito.getIdeditorial()});
    }

    @Override
    public int delete(int id) {
        String SQL ="DELETE FROM edito WHERE ideditorial=?"; 
        return jdbcTemplate.update(SQL,id);
        
    }

    @Override
    public Editorial read(int id) {
        String SQL ="SELECT *FROM edito WHERE ideditorial=?";
        try {
            Editorial edito = jdbcTemplate.queryForObject(SQL, BeanPropertyRowMapper.newInstance(Editorial.class),id);
            return edito;
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Editorial> readAll() {
        String SQL ="SELECT ideditorial, nombre, pais FROM editorial ORDER BY ideditorial ASC";        
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Editorial.class));
    }
    
}
