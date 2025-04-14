public class Main {
    public static void main(String[] args) {
        Currency USDollar = new Currency(1.0, "United States", "USD");
        Currency Euro = new Currency(1.1, "Europe", "EUR");
        Currency PoundSterling = new Currency(.91, "United Kingdom", "GBP");
        Currency Renminbi =new Currency(7.34, "China", "CNY"); //aka Chinese Yuan
        Currency Yen = new Currency(146.58, "Japan", "JPY");
        Currency AustralianDollar = new Currency(, , "AUD");
        Currency CanadianDollar = new Currency(, , "CAD");
        Currency SwissFrank = new Currency(, , "CHF");
        Currency HongKongDollar = new Currency(, , );

        //Test Comment 2

        //prompts user to enter their type of currency and amount (will use the isoAlpha attribute.
        //example: if user has 15 dollars of U.S. Currency, they'll enter "15 USD"
        //prompt can ask for currency type first, then quantity. It could ask for it entered as a single line, like the example above

        //lists avaliable currencies to be converted to
        //Country       Rate        isoAlpha

        //prompts user to enter the isoAlpha of the Currency they want to convert to
        //converts it, displays the converted quantity
        //ends program

    }

    public float conversion(Currency currencyUser, Currency currencyChosen){

    }


}