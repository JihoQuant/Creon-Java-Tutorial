package cp.util  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * CpUserInfo Class
   */
  public static cp.util.ICpUserInfo createCpUserInfo() {
    return COM4J.createInstance( cp.util.ICpUserInfo.class, "{DB656203-951A-4D6A-972E-0138DEBD6648}" );
  }

  /**
   * CpStockCode Class
   */
  public static cp.util.ICpStockCode createCpStockCode() {
    return COM4J.createInstance( cp.util.ICpStockCode.class, "{2297F381-FFB1-45C6-AA80-4C6913F45E91}" );
  }

  /**
   * CpFutureCode Class
   */
  public static cp.util.ICpFutureCode createCpFutureCode() {
    return COM4J.createInstance( cp.util.ICpFutureCode.class, "{15A37730-A973-47D7-9058-2686097642F8}" );
  }

  /**
   * CpKFutureCode Class
   */
  public static cp.util.ICpFutureCode createCpKFutureCode() {
    return COM4J.createInstance( cp.util.ICpFutureCode.class, "{E6BFF246-8B47-4833-AE20-F853BDAA3248}" );
  }

  /**
   * CpOptionCode Class
   */
  public static cp.util.ICpOptionCode createCpOptionCode() {
    return COM4J.createInstance( cp.util.ICpOptionCode.class, "{7566755F-36AD-43EF-B388-4CC62CA94279}" );
  }

  /**
   * CpSoptionCode Class
   */
  public static cp.util.ICpSoptionCode createCpSoptionCode() {
    return COM4J.createInstance( cp.util.ICpSoptionCode.class, "{F23D75C0-A0AC-4988-865C-54B3B9D009B2}" );
  }

  /**
   * CpCybos Class
   */
  public static cp.util.ICpCybos createCpCybos() {
    return COM4J.createInstance( cp.util.ICpCybos.class, "{19A11288-2B28-45C4-8CD4-3A12B60C3BD7}" );
  }

  /**
   * CpCodeMgr Class
   */
  public static cp.util.ICpCodeMgr createCpCodeMgr() {
    return COM4J.createInstance( cp.util.ICpCodeMgr.class, "{995B5ABE-ED4B-4D04-B46D-6238AB66EA71}" );
  }

  /**
   * CpElwCode Class
   */
  public static cp.util.ICpElwCode createCpElwCode() {
    return COM4J.createInstance( cp.util.ICpElwCode.class, "{3AB3C774-9971-4BD3-9393-183641A5028D}" );
  }

  /**
   * CpUsCode Class
   */
  public static cp.util.ICpUsCode createCpUsCode() {
    return COM4J.createInstance( cp.util.ICpUsCode.class, "{03948751-CF92-443E-81D9-94351E0F51FF}" );
  }

  /**
   * CpCalcOptGreeks Class
   */
  public static cp.util.ICpCalcOptGreeks createCpCalcOptGreeks() {
    return COM4J.createInstance( cp.util.ICpCalcOptGreeks.class, "{BA69760D-1698-4BC1-8947-E7F2D07F2173}" );
  }

  /**
   * CpBondCode Class
   */
  public static cp.util.ICpBondCode createCpBondCode() {
    return COM4J.createInstance( cp.util.ICpBondCode.class, "{8B4B7EFD-7BE3-4C82-A3A7-1E741BB6A2B1}" );
  }

  /**
   * CpBondCodes Class
   */
  public static cp.util.ICpBondCodes createCpBondCodes() {
    return COM4J.createInstance( cp.util.ICpBondCodes.class, "{73E62CE2-EB0C-49B2-94B6-029527C9DADA}" );
  }
}
