/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Datos.ConexionBD;

/**
 *
 * @author Christian
 */
public class Administrador {
    public ConexionBD conec = new ConexionBD();
    
    public void conectarInicio() {
        conec.conectarBD();
    }
    public Object cambiarUser(String login, String pass) 
    {
        boolean validar = false;
        ConexionBD conexion = new ConexionBD(login, pass);
        return conexion.conectarBD();
        //MetodosConexion metodos = new MetodosConexion();
        //validar =metodos.cambiarUsuario(login,pass);
    }
    
    public int [][] obtenerCantidad(int filas)
    {
        int [][] pedido=new int[filas][2];
        
        
        return pedido;
    }
}