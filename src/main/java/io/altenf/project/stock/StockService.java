package io.altenf.project.stock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.altenf.project.stock.Stock;

@Service
public class StockService {		
	private List<Stock> stocks = new ArrayList<>(Arrays.asList(
				new Stock("bonds","Municipal Bonds","Municipal Bond Description"),
				new Stock("stock", "Amazon stock", "Amazon Stock Description"),
				new Stock("mutual funds","Target Retirement Funds","Target Retirement Funds Description")
				));
	public List<Stock> getAllStocks(){ 
		return stocks;
			}
	public Stock getStock(String id) {
		return stocks.stream().filter(t ->t.getId().equals(id)).findFirst().get();
			}
	public void addStock(Stock stock) {
		stocks.add(stock);
			}
	public void updateStock(String id, Stock stock) {
		for(int i = 0; i < stocks.size(); i++) {
			Stock t = stocks.get(i);
			if(t.getId().equals(id)) {
				stocks.set(i, stock);
				return;
				}
			}
		}
	public void deleteStock(String id) {
		stocks.removeIf(t->t.getId().equals(id));
	}
			
}	

	
