/* Generated By:JJTree: Do not edit this line. MpaIffExpr.java */

package mpa.cst.parser;

public class MpaIffExpr extends SimpleNode {
  public MpaIffExpr(int id) {
    super(id);
  }

  public MpaIffExpr(MpaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MpaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
