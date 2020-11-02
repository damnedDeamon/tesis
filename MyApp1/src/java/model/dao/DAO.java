package model.dao;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
    void create(T ob) throws SQLException; // Crear.
    void update(T ob) throws SQLException; // Actualizar.
    void delete(int id) throws SQLException; // Eliminar.
    List<T> read() throws SQLException; // Listar.
    
    List<T> findBy(String txt) throws SQLException; // Buscar cualquier cosa.
    T read(int id) throws SQLException; // Buscar a 1 solo usuario.
}
