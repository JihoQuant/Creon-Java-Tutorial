package cp.dib  ;

import com4j.*;

/**
 * ICpFields Interface
 */
@IID("{55D0C6E4-0966-11D4-8232-00105A7C4F8C}")
public interface ICpFields extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * property Count
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int count();


  /**
   * <p>
   * property Item
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object item(
    int index);


  /**
   * <p>
   * property _NewEnum
   * </p>
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
