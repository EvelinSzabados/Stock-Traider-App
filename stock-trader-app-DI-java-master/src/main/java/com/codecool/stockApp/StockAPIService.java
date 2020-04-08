package com.codecool.stockApp;

import org.json.JSONObject;

import java.io.IOException;

/**
 * "https://financialmodelingprep.com/api/v3/stock/real-time-price/%s";
 * Stock price service that gets prices from Yahoo.
 **/
public class StockAPIService {

	private String apiPath;
	
	/** Get stock price from iex and return as a double
     *  @param symbol Stock symbol, for example "aapl"
     **/

	public StockAPIService(String url){
		this.apiPath = url;

	}
	public double getPrice(String symbol) throws IOException {
        String url = String.format(apiPath, symbol);
        String result = RemoteURLReader.readFromUrl(url);
        JSONObject json = new JSONObject(result);
        String price = json.get("price").toString();
        return Double.parseDouble(price);
	}
	
	/** Buys a share of the given stock at the current price. Returns false if the purchase fails */
	public boolean buy(String symbol) {
		// Stub. No need to implement this.
		return true;
	}
}