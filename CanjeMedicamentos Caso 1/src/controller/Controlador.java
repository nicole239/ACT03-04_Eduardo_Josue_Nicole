/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Producto;

/**
 *
 * @author ericka
 */
public class Controlador {

    private static Controlador instance;
    private DTOProductos dTOProductos;
    private GestorProductos gProductos;
    private GestorCliente gCliente;
    private GestorFarmacia gFarmacia;
    
    private Controlador()
    {
        gProductos = new GestorProductos();
        dTOProductos = new DTOProductos();
        gCliente = new GestorCliente();
        gFarmacia = new GestorFarmacia();
    }
    
    
    public static Controlador getInstance()
    {
        if(instance == null){
            instance = new Controlador();
        }
        return instance;
    }
    
    /**
     * Consulta una farmacia en especifico
     * @param dto 
     */
    public void consultar(DTOFarmacia dto)
    {
        dto.setUnaFarmacia(gFarmacia.consulta(dto.getUnaFarmacia().getCodigo()));
    }
    
    /**
     * Recupera todas las farmacias
     * @param dto 
     */
    public void recuperar(DTOFarmacia dto)
    {
        dto.setListaFarmacias(gFarmacia.recuperar());
    }
    
    /**
     * Registra una farmacia en la bd
     * @param dto
     * @return 
     */
    public boolean registrarFarmacia(DTOFarmacia dto)
    {
        return gFarmacia.registrar(dto.getUnaFarmacia());
    }

    public DTOProductos getdTOProductos()
    {
        return dTOProductos;
    }
    
    public boolean registrarCliente(Cliente c){
        if(gCliente.crearCliente(c)){
            JOptionPane.showMessageDialog(null, "Registro", "El registro fue exitoso", JOptionPane.WARNING_MESSAGE);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Registro", "El cliente ya existe", JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }
    
    public boolean registrarProducto(int codigo, String descripcion, int unidades, int puntos){
        return true;
        
    }

    public boolean registrarProducto(){
        System.out.println("en el Controlador solicitando registro de producto");
        
        return gProductos.crearProducto(dTOProductos.getUnProducto());
    }
    
    public void recuperarProductos(){
        dTOProductos.setLosProductos((List) gProductos.recuperar());
    }

    public boolean recuperarProducto() {
        Producto elPrd =  gProductos.consultarProducto(dTOProductos.getUnProducto().getCodigo());
        dTOProductos.setUnProducto(elPrd);
        return elPrd!=null;
        
    }
}
