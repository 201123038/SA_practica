/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author yessenia
 */
@WebService(serviceName = "Aduana")
public class Aduana {

@WebMethod(operationName = "calcular_Costo_Aduana")
    public String calcular_Costo_Aduana(@WebParam(name = "linea") String linea,
                                        @WebParam(name = "modelo") int modelo) {
        
        String costo_Aduana = "";
        
        return costo_Aduana;
    }
    
@WebMethod(operationName = "guardar_Id_Transferencia")
    public boolean guardar_Id_Transferencia(@WebParam(name = "id_Transferencia") int id_Transferencia,
                                        @WebParam(name = " monto_Compra") int  monto_Compra) {
        
        boolean respuesta = false;
        
        return respuesta;
    }
    
}
