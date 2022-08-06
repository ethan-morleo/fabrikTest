package com.esfabrick.esercizio.Services;

import java.io.IOException;
//import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.stereotype.Service;

import com.esfabrick.esercizio.Entity.Res;
import com.google.gson.Gson;

@Service
public class TransactionService {
    public String viewTransactions(String startDate,String endDate, String baseUrl) throws IOException, InterruptedException, URISyntaxException{
        String uri=baseUrl+"api/gbs/banking/v4.0/accounts/14537780/transactions";
        URIBuilder uriBuilder = new URIBuilder(uri);
        uriBuilder.setParameter("fromAccountingDate", startDate).setParameter("toAccountingDate", endDate);
        //build request
        HttpRequest request= HttpRequest.newBuilder()
        .uri(uriBuilder.build())
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
