package zzzyourturn1complete;

public class StockOrder {
    private String tickerSymbol;
    private int numberOfShares;
    private double sellingPrice;

    private static boolean marketOpen;
    private static double totalDollarsSold;

    public StockOrder(String tickerSymbol, int numberOfShares, double sellingPrice) {
        this.tickerSymbol = tickerSymbol;
        this.numberOfShares = numberOfShares;
        this.sellingPrice = sellingPrice;
    }

    public String getTickerSymbol()
    {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol)
    {
        this.tickerSymbol = tickerSymbol;
    }

    public int getNumberOfShares()
    {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares)
    {
        this.numberOfShares = numberOfShares;
    }

    public double getSellingPrice()
    {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }

    public static boolean isMarketOpen()
    {
        return marketOpen;
    }

    public static void setMarketOpen(boolean marketOpen)
    {
        StockOrder.marketOpen = marketOpen;
    }

    public static int getTotalDollarsSold()
    {
        return totalDollarsSold;
    }

    public static void setTotalDollarsSold(int totalDollarsSold)
    {
        StockOrder.totalDollarsSold = totalDollarsSold;
    }

    public void sellOrder()
    {
        double totalSale = numberOfShares * sellingPrice;
        StockOrder.totalDollarsSold = totalSale;
    }

}
