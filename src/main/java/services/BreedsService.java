package services;

import api.model.Breeds;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class BreedsService extends MethodsService {
    public static Response get (String request){
        return get(request, Breeds.class);
    }
}
