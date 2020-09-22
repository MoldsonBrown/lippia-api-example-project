package services;

import api.model.Analysis;
import api.model.Errores;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class ErroresService extends MethodsService {
    public static Response get (String request){
        return get(request, Errores.class);
    }
}
