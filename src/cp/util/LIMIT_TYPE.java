package cp.util  ;

import com4j.*;

/**
 */
public enum LIMIT_TYPE {
  /**
   * <p>
   * 주문관련 Request
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  LT_TRADE_REQUEST, // 0
  /**
   * <p>
   * 시세 Request
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  LT_NONTRADE_REQUEST, // 1
  /**
   * <p>
   * 시세 Subscribe
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  LT_SUBSCRIBE, // 2
}
