/* Generated By:JJTree: Do not edit this line. MicLAndExpression.java */

package mic.parser;

public class MicLAndExpression extends SimpleNode {
  public MicLAndExpression(int id) {
    super(id);
  }

  public MicLAndExpression(MicParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MicParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
