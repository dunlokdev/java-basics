package modules;

public interface Withdraw {
  /**
   * Xử lý nghiệp vụ rút tiền
   *
   * @param amount
   * @return
   */
  boolean withDraw(double amount);

  /**
   * Xác định xem giá trị có thoả điều kiện rút tiền hay không?
   * 
   * @param amount
   * @return
   */
  boolean isAccepted(double amount);
}
