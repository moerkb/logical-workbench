/* Generated By:JJTree: Do not edit this line. MpaImplExpr.java */

package mpa.cst.parser;

public class MpaImplExpr extends SimpleNode {
  public MpaImplExpr(int id) {
    super(id);
  }

  public MpaImplExpr(MpaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MpaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
