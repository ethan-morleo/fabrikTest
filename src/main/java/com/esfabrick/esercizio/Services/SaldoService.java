package com.esfabrick.esercizio.Services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import org.springframework.stereotype.Service;

import com.esfabrick.esercizio.Entity.Res;
import com.google.gson.Gson;

@Service
public class SaldoService {
    public  String getSaldo(String baseUrl) throws IOException, InterruptedException{
    String uri=baseUrl+"api/gbs/banking/v4.0/accounts";

    //build request 
    HttpRequest request=HttpRequest.newBuilder()
    .uri(URI.create(uri))
    .GET()
    .setHeader("Content-Type", "application/json")
    .setHeader("Auth-Schema", "S2S")
    .setHeader("Api-Key", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP")
    .build();

    HttpClient client=HttpClient.newBuilder().build();

    //response    
    HttpResponse<String> response=client.send(request, BodyHandlers.ofString());

    Res body= new Gson().fromJson(response.body(), Res.class);
    
        if(body.getStatus().equals("OK")){
            return body.getPayload().getList().toString();
                }else{
                    return body.getErrors().toString();
                }
    }
}
