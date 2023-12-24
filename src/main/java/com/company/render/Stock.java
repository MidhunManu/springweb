package com.company.render;

public class Stock {
	private int stockId;
	private String stockName;
	private int stockPrice;

	public Stock() {
    }

    // Parameterized constructor
    public Stock(int stockId, String stockName, int stockPrice) {
        this.stockId = stockId;
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    // Getter for stockId
    public int getStockId() {
        return stockId;
    }

    // Setter for stockId
    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    // Getter for stockName
    public String getStockName() {
        return stockName;
    }

    // Setter for stockName
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    // Getter for stockPrice
    public int getStockPrice() {
        return stockPrice;
    }

    // Setter for stockPrice
    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
    }

    // toString method to represent the object as a string
    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", stockName='" + stockName + '\'' +
                ", stockPrice=" + stockPrice +
                '}';
    }
}
