package io.altenf.project.stock;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.altenf.project.stock.Stock;
import io.altenf.project.stock.StockService;

@RestController()
public class StockController {
	@Autowired
	private StockService stockService;

	@RequestMapping("/stocks")
	public List<Stock>getAllStocks() {
			return stockService.getAllStocks();
	}
	@RequestMapping("/stocks/{id}")
	public Stock getStock(@PathVariable String id) {
		return stockService.getStock(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/stocks")
	public void addStock(@RequestBody Stock stock) {
		stockService.addStock(stock);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/stocks/{id}")
	public void updateStock(@RequestBody Stock stock, @PathVariable String id) {
		stockService.updateStock(id, stock);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/stocks/{id}")
	public void deleteStock(@PathVariable String id) {
		stockService.deleteStock(id);
	}
}

