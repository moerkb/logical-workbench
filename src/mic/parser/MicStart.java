/* Generated By:JJTree: Do not edit this line. MicStart.java */

package mic.parser;

public class MicStart extends SimpleNode {
  public MicStart(int id) {
    super(id);
  }

  public MicStart(MicParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MicParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
