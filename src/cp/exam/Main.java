package cp.exam;

import cp.dib.IDib;

public class Main {

    private static final int DDDD = 0;
    private static final int STOCK_CURRENT_PRICE = 11;
    private static final int STOCK_ASK_PRICE = 16;
    private static final int STOCK_BID_PRICE = 17;
    private static final String code = "A091090";

    public static void main(String[] args) {

        IDib stockMst = cp.dib.ClassFactory.createStockMst();

        stockMst.setInputValue(0, code);
        stockMst.blockRequest();

        StringBuilder sb = new StringBuilder();

        sb.append(stockMst.getHeaderValue(STOCK_CURRENT_PRICE)).append('\n');
        sb.append(stockMst.getHeaderValue(STOCK_ASK_PRICE)).append('\n');
        sb.append(stockMst.getHeaderValue(STOCK_BID_PRICE)).append('\n');

        System.out.print(sb);

    }

}
