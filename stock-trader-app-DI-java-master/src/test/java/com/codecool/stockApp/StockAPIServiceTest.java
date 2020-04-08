package com.codecool.stockApp;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.rmi.server.ServerNotActiveException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

// TODO
class StockAPIServiceTest {
    StockAPIService stockAPIService = Mockito.mock(StockAPIService.class);


    @Test // everything works
    void testGetPriceNormalValues() throws IOException {
        Double price = stockAPIService.getPrice("appl");
        assertNotNull(price);

    }

    @Test // readFromURL threw an exception
    void testGetPriceServerDown() throws IOException {

//        assertThrows(IOException.class, () ->{
//            stockAPIService.getPrice("g");
//        });
//

    }

    @Test // readFromURL returned wrong JSON
    void testGetPriceMalformedResponse() {

    }

}