/* Generated By:JJTree: Do not edit this line. MpaOrExpr.java */

package mpa.cst.parser;

public class MpaOrExpr extends SimpleNode {
  public MpaOrExpr(int id) {
    super(id);
  }

  public MpaOrExpr(MpaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MpaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
