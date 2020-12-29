package lab5.ch1;

public class Main {
    public static void main(String[] args) {
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        RON ronValue = new RON(20);
        EUR eurValue = new EUR(5);
        USD usdValue = new USD(6);

        System.out.println("Exchange Desk");
        USD ronConverted = exchangeDesk.exchange(ronValue, USD.class, (float)2.4);
        System.out.println("Exchange Result " + ronConverted.getValue());

        EUR newEurValue = exchangeDesk.exchange(ronValue, EUR.class, (float) (1/4.8));
        System.out.println("Exchange result " + newEurValue.getValue());

        EUR newUsdValue = exchangeDesk.exchange(usdValue, EUR.class, (float) (1/1.3));
        System.out.println("Exchange result " + newUsdValue.getValue());

    }
}
