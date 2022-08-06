package com.esfabrick.esercizio.Services;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import org.springframework.stereotype.Service;

import com.esfabrick.esercizio.Entity.Res;
import com.esfabrick.esercizio.Entity.TransferInfo;
import com.google.gson.Gson;

@Service
public class TransferService {
    public String doTransfer(TransferInfo tinfo, String baseUrl, String id) throws IOException, InterruptedException{

        String body=new Gson().toJson(tinfo);
        String uri=baseUrl+"api/gbs/banking/v4.0/accounts/"+id+"/payments/money-transfers";

        //build request
        HttpRequest request=HttpRequest.newBuilder()
        .uri(URI.create(uri))
        .POST(BodyPublishers.ofString(body))
        .setHeader("Content-Type", "application/json")
        .setHeader("Auth-Schema", "S2S")
        .setHeader("Api-Key", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP")
        .setHeader("X-Time-Zone", "Europe/Rome")
        .build();

        HttpClient client=HttpClient.newBuilder().build();

        //response 
        HttpResponse<String> response=client.send(request, BodyHandlers.ofString());

        Res bodyRes=new Gson().fromJson(response.body(), Res.class);

        if(bodyRes.getStatus().equals("OK")){
            return bodyRes.getPayload().getList().toString();
        }else{
            return bodyRes.getErrors().toString();
        }
    }
}
