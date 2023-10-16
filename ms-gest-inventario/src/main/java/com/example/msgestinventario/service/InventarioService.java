package com.example.msgestinventario.service;

import com.example.msgestinventario.entity.Inventario;

import java.util.List;
import java.util.Optional;

public interface InventarioService {
    public List<Inventario> listar ();

    public Inventario guardar(Inventario inventario);
    public Inventario actualizar(Inventario inventario);
    public Optional<Inventario> listarPorId(Integer id);
    public void eliminarPorId(Integer id);

}
