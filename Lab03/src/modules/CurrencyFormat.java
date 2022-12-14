package modules;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormat {
  public static String getCurrency(double balance) {
    NumberFormat vn = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
    return vn.format(balance);
  }
}
