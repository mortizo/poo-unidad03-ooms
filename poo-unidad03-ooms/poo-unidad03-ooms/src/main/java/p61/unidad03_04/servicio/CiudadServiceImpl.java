/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_04.servicio;

import java.util.ArrayList;
import java.util.List;
import p61.unidad03_04.modelo.Ciudad;

/**
 *
 * @author Mauricio Ortiz
 */
public class CiudadServiceImpl implements CiudadService{

    private static List<Ciudad> ciudadList= new ArrayList<>();
    
    @Override
    public void crear(Ciudad ciudad) {
        this.ciudadList.add(ciudad);
    }

    @Override
    public Ciudad buscarPorCodigo(int codigo) {
        Ciudad retorno=null;
        for(var ciudad:this.ciudadList){
            if(codigo==ciudad.getCodigo()){
                retorno=ciudad;
                break;
            }
        }
        return retorno;
    }
    
    @Override
    public List<Ciudad> listar() {
        return this.ciudadList;
    }

    
    
}
