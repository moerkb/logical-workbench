/* Generated By:JJTree: Do not edit this line. MicUnaryExpression.java */

package mic.parser;

public class MicUnaryExpression extends SimpleNode {
  public MicUnaryExpression(int id) {
    super(id);
  }

  public MicUnaryExpression(MicParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MicParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
