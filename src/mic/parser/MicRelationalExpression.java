/* Generated By:JJTree: Do not edit this line. MicRelationalExpression.java */

package mic.parser;

public class MicRelationalExpression extends SimpleNode {
  public MicRelationalExpression(int id) {
    super(id);
  }

  public MicRelationalExpression(MicParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MicParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
