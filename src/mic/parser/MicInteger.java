/* Generated By:JJTree: Do not edit this line. MicInteger.java */

package mic.parser;

public class MicInteger extends SimpleNode {
  public MicInteger(int id) {
    super(id);
  }

  public MicInteger(MicParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MicParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}