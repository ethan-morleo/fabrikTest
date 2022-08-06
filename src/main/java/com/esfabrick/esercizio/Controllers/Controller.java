package com.esfabrick.esercizio.Controllers;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.esfabrick.esercizio.Entity.TransferInfo;
import com.esfabrick.esercizio.Services.SaldoService;
import com.esfabrick.esercizio.Services.TransactionService;
import com.esfabrick.esercizio.Services.TransferService;

@RestController
public class Controller {
    String baseUrl="https://sandbox.platfr.io/";

    @Autowired
    private SaldoService saldoService;

    @GetMapping("/balance")
    public String getSaldo() throws IOException, InterruptedException{

        return saldoService.getSaldo(baseUrl);
    }

    @Autowired
    private TransferService transferService;

    @PostMapping("/transfer")
    public String Transfer(@RequestBody TransferInfo info) throws IOException, InterruptedException{

        return transferService.doTransfer(info, baseUrl, "14537780");
    }

    @Autowired 
    private TransactionService transactionService;

    @GetMapping("/transactions/{fromAccountingDate}/{toAccountingDate}")
    public String getTransaction(@PathVariable("fromAccountingDate") String fromAccountingDate, @PathVariable("toAccountingDate") String toAccountingDate) throws IOException, InterruptedException, URISyntaxException{
        
        return transactionService.viewTransactions(fromAccountingDate, toAccountingDate, baseUrl);
    }
   
    }
