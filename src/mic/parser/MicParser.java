/* Generated By:JJTree&JavaCC: Do not edit this line. MicParser.java */
package mic.parser;

public class MicParser/*@bgen(jjtree)*/implements MicParserTreeConstants, MicParserConstants {/*@bgen(jjtree)*/
  protected JJTMicParserState jjtree = new JJTMicParserState();

  final public MicStart Start() throws ParseException {
 /*@bgen(jjtree) Start */
  MicStart jjtn000 = new MicStart(JJTSTART);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Expression();
      jj_consume_token(0);
                             jjtree.closeNodeScope(jjtn000, true);
                             jjtc000 = false;
                             {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte000;}
          }
          if (jjte000 instanceof ParseException) {
            {if (true) throw (ParseException)jjte000;}
          }
          {if (true) throw (Error)jjte000;}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
    throw new Error("Missing return statement in function");
  }

  final public void Expression() throws ParseException {
    LOrExpression();
  }

  final public void LOrExpression() throws ParseException {
    MicLOrExpression jjtn001 = new MicLOrExpression(JJTLOREXPRESSION);
    boolean jjtc001 = true;
    jjtree.openNodeScope(jjtn001);
    try {
      LAndExpression();
    } catch (Throwable jjte001) {
    if (jjtc001) {
      jjtree.clearNodeScope(jjtn001);
      jjtc001 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte001 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte001;}
    }
    if (jjte001 instanceof ParseException) {
      {if (true) throw (ParseException)jjte001;}
    }
    {if (true) throw (Error)jjte001;}
    } finally {
    if (jjtc001) {
      jjtree.closeNodeScope(jjtn001, jjtree.nodeArity() > 1);
    }
    }
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LOR:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      jj_consume_token(LOR);
                  MicLOrExpression jjtn002 = new MicLOrExpression(JJTLOREXPRESSION);
                  boolean jjtc002 = true;
                  jjtree.openNodeScope(jjtn002);
      try {
        LAndExpression();
      } catch (Throwable jjte002) {
                  if (jjtc002) {
                    jjtree.clearNodeScope(jjtn002);
                    jjtc002 = false;
                  } else {
                    jjtree.popNode();
                  }
                  if (jjte002 instanceof RuntimeException) {
                    {if (true) throw (RuntimeException)jjte002;}
                  }
                  if (jjte002 instanceof ParseException) {
                    {if (true) throw (ParseException)jjte002;}
                  }
                  {if (true) throw (Error)jjte002;}
      } finally {
                  if (jjtc002) {
                    jjtree.closeNodeScope(jjtn002,  2);
                  }
      }
    }
  }

  final public void LAndExpression() throws ParseException {
          MicLAndExpression jjtn001 = new MicLAndExpression(JJTLANDEXPRESSION);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
    try {
      BOrExpression();
    } catch (Throwable jjte001) {
          if (jjtc001) {
            jjtree.clearNodeScope(jjtn001);
            jjtc001 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte001 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte001;}
          }
          if (jjte001 instanceof ParseException) {
            {if (true) throw (ParseException)jjte001;}
          }
          {if (true) throw (Error)jjte001;}
    } finally {
          if (jjtc001) {
            jjtree.closeNodeScope(jjtn001, jjtree.nodeArity() > 1);
          }
    }
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LAND:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      jj_consume_token(LAND);
                           MicLAndExpression jjtn002 = new MicLAndExpression(JJTLANDEXPRESSION);
                           boolean jjtc002 = true;
                           jjtree.openNodeScope(jjtn002);
      try {
        BOrExpression();
      } catch (Throwable jjte002) {
                           if (jjtc002) {
                             jjtree.clearNodeScope(jjtn002);
                             jjtc002 = false;
                           } else {
                             jjtree.popNode();
                           }
                           if (jjte002 instanceof RuntimeException) {
                             {if (true) throw (RuntimeException)jjte002;}
                           }
                           if (jjte002 instanceof ParseException) {
                             {if (true) throw (ParseException)jjte002;}
                           }
                           {if (true) throw (Error)jjte002;}
      } finally {
                           if (jjtc002) {
                             jjtree.closeNodeScope(jjtn002,  2);
                           }
      }
    }
  }

  final public void BOrExpression() throws ParseException {
          MicBOrExpression jjtn001 = new MicBOrExpression(JJTBOREXPRESSION);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
    try {
      BXorExpression();
    } catch (Throwable jjte001) {
          if (jjtc001) {
            jjtree.clearNodeScope(jjtn001);
            jjtc001 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte001 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte001;}
          }
          if (jjte001 instanceof ParseException) {
            {if (true) throw (ParseException)jjte001;}
          }
          {if (true) throw (Error)jjte001;}
    } finally {
          if (jjtc001) {
            jjtree.closeNodeScope(jjtn001, jjtree.nodeArity() > 1);
          }
    }
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BOR:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_3;
      }
      jj_consume_token(BOR);
                          MicBOrExpression jjtn002 = new MicBOrExpression(JJTBOREXPRESSION);
                          boolean jjtc002 = true;
                          jjtree.openNodeScope(jjtn002);
      try {
        BXorExpression();
      } catch (Throwable jjte002) {
                          if (jjtc002) {
                            jjtree.clearNodeScope(jjtn002);
                            jjtc002 = false;
                          } else {
                            jjtree.popNode();
                          }
                          if (jjte002 instanceof RuntimeException) {
                            {if (true) throw (RuntimeException)jjte002;}
                          }
                          if (jjte002 instanceof ParseException) {
                            {if (true) throw (ParseException)jjte002;}
                          }
                          {if (true) throw (Error)jjte002;}
      } finally {
                          if (jjtc002) {
                            jjtree.closeNodeScope(jjtn002,  2);
                          }
      }
    }
  }

  final public void BXorExpression() throws ParseException {
          MicBXorExpression jjtn001 = new MicBXorExpression(JJTBXOREXPRESSION);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
    try {
      BAndExpression();
    } catch (Throwable jjte001) {
          if (jjtc001) {
            jjtree.clearNodeScope(jjtn001);
            jjtc001 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte001 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte001;}
          }
          if (jjte001 instanceof ParseException) {
            {if (true) throw (ParseException)jjte001;}
          }
          {if (true) throw (Error)jjte001;}
    } finally {
          if (jjtc001) {
            jjtree.closeNodeScope(jjtn001, jjtree.nodeArity() > 1);
          }
    }
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BXOR:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_4;
      }
      jj_consume_token(BXOR);
                           MicBXorExpression jjtn002 = new MicBXorExpression(JJTBXOREXPRESSION);
                           boolean jjtc002 = true;
                           jjtree.openNodeScope(jjtn002);
      try {
        BAndExpression();
      } catch (Throwable jjte002) {
                           if (jjtc002) {
                             jjtree.clearNodeScope(jjtn002);
                             jjtc002 = false;
                           } else {
                             jjtree.popNode();
                           }
                           if (jjte002 instanceof RuntimeException) {
                             {if (true) throw (RuntimeException)jjte002;}
                           }
                           if (jjte002 instanceof ParseException) {
                             {if (true) throw (ParseException)jjte002;}
                           }
                           {if (true) throw (Error)jjte002;}
      } finally {
                           if (jjtc002) {
                             jjtree.closeNodeScope(jjtn002,  2);
                           }
      }
    }
  }

  final public void BAndExpression() throws ParseException {
          MicBAndExpression jjtn001 = new MicBAndExpression(JJTBANDEXPRESSION);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
    try {
      EqualExpression();
    } catch (Throwable jjte001) {
          if (jjtc001) {
            jjtree.clearNodeScope(jjtn001);
            jjtc001 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte001 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte001;}
          }
          if (jjte001 instanceof ParseException) {
            {if (true) throw (ParseException)jjte001;}
          }
          {if (true) throw (Error)jjte001;}
    } finally {
          if (jjtc001) {
            jjtree.closeNodeScope(jjtn001, jjtree.nodeArity() > 1);
          }
    }
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BAND:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_5;
      }
      jj_consume_token(BAND);
                           MicBAndExpression jjtn002 = new MicBAndExpression(JJTBANDEXPRESSION);
                           boolean jjtc002 = true;
                           jjtree.openNodeScope(jjtn002);
      try {
        EqualExpression();
      } catch (Throwable jjte002) {
                           if (jjtc002) {
                             jjtree.clearNodeScope(jjtn002);
                             jjtc002 = false;
                           } else {
                             jjtree.popNode();
                           }
                           if (jjte002 instanceof RuntimeException) {
                             {if (true) throw (RuntimeException)jjte002;}
                           }
                           if (jjte002 instanceof ParseException) {
                             {if (true) throw (ParseException)jjte002;}
                           }
                           {if (true) throw (Error)jjte002;}
      } finally {
                           if (jjtc002) {
                             jjtree.closeNodeScope(jjtn002,  2);
                           }
      }
    }
  }

  final public void EqualExpression() throws ParseException {
        Token t;
          MicEqualExpression jjtn001 = new MicEqualExpression(JJTEQUALEXPRESSION);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
    try {
      RelationalExpression();
    } catch (Throwable jjte001) {
          if (jjtc001) {
            jjtree.clearNodeScope(jjtn001);
            jjtc001 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte001 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte001;}
          }
          if (jjte001 instanceof ParseException) {
            {if (true) throw (ParseException)jjte001;}
          }
          {if (true) throw (Error)jjte001;}
    } finally {
          if (jjtc001) {
            jjtree.closeNodeScope(jjtn001, jjtree.nodeArity() > 1);
          }
    }
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EQ:
      case NE:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_6;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EQ:
        t = jj_consume_token(EQ);
        break;
      case NE:
        t = jj_consume_token(NE);
        break;
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      RelationalExpression();
                                          MicEqualExpression jjtn002 = new MicEqualExpression(JJTEQUALEXPRESSION);
                                          boolean jjtc002 = true;
                                          jjtree.openNodeScope(jjtn002);
      try {
                                          jjtree.closeNodeScope(jjtn002,  2);
                                          jjtc002 = false;
                                          jjtn002.setOp( t.kind );
      } finally {
                                          if (jjtc002) {
                                            jjtree.closeNodeScope(jjtn002,  2);
                                          }
      }
    }
  }

  final public void RelationalExpression() throws ParseException {
        Token t;
          MicRelationalExpression jjtn001 = new MicRelationalExpression(JJTRELATIONALEXPRESSION);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
    try {
      ShiftExpression();
    } catch (Throwable jjte001) {
          if (jjtc001) {
            jjtree.clearNodeScope(jjtn001);
            jjtc001 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte001 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte001;}
          }
          if (jjte001 instanceof ParseException) {
            {if (true) throw (ParseException)jjte001;}
          }
          {if (true) throw (Error)jjte001;}
    } finally {
          if (jjtc001) {
            jjtree.closeNodeScope(jjtn001, jjtree.nodeArity() > 1);
          }
    }
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LT:
      case GT:
      case LE:
      case GE:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_7;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LT:
        t = jj_consume_token(LT);
        break;
      case GT:
        t = jj_consume_token(GT);
        break;
      case LE:
        t = jj_consume_token(LE);
        break;
      case GE:
        t = jj_consume_token(GE);
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      ShiftExpression();
                                          MicRelationalExpression jjtn002 = new MicRelationalExpression(JJTRELATIONALEXPRESSION);
                                          boolean jjtc002 = true;
                                          jjtree.openNodeScope(jjtn002);
      try {
                                          jjtree.closeNodeScope(jjtn002,  2);
                                          jjtc002 = false;
                                          jjtn002.setOp( t.kind );
      } finally {
                                          if (jjtc002) {
                                            jjtree.closeNodeScope(jjtn002,  2);
                                          }
      }
    }
  }

  final public void ShiftExpression() throws ParseException {
        Token t;
          MicShiftExpression jjtn001 = new MicShiftExpression(JJTSHIFTEXPRESSION);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
    try {
      AdditiveExpression();
    } catch (Throwable jjte001) {
          if (jjtc001) {
            jjtree.clearNodeScope(jjtn001);
            jjtc001 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte001 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte001;}
          }
          if (jjte001 instanceof ParseException) {
            {if (true) throw (ParseException)jjte001;}
          }
          {if (true) throw (Error)jjte001;}
    } finally {
          if (jjtc001) {
            jjtree.closeNodeScope(jjtn001, jjtree.nodeArity() > 1);
          }
    }
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LSHIFT:
      case RSHIFT:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_8;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LSHIFT:
        t = jj_consume_token(LSHIFT);
        break;
      case RSHIFT:
        t = jj_consume_token(RSHIFT);
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      AdditiveExpression();
                                          MicShiftExpression jjtn002 = new MicShiftExpression(JJTSHIFTEXPRESSION);
                                          boolean jjtc002 = true;
                                          jjtree.openNodeScope(jjtn002);
      try {
                                          jjtree.closeNodeScope(jjtn002,  2);
                                          jjtc002 = false;
                                          jjtn002.setOp( t.kind );
      } finally {
                                          if (jjtc002) {
                                            jjtree.closeNodeScope(jjtn002,  2);
                                          }
      }
    }
  }

  final public void AdditiveExpression() throws ParseException {
        Token t;
          MicAdditiveExpression jjtn001 = new MicAdditiveExpression(JJTADDITIVEEXPRESSION);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
    try {
      MultiplicativeExpression();
    } catch (Throwable jjte001) {
          if (jjtc001) {
            jjtree.clearNodeScope(jjtn001);
            jjtc001 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte001 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte001;}
          }
          if (jjte001 instanceof ParseException) {
            {if (true) throw (ParseException)jjte001;}
          }
          {if (true) throw (Error)jjte001;}
    } finally {
          if (jjtc001) {
            jjtree.closeNodeScope(jjtn001, jjtree.nodeArity() > 1);
          }
    }
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
        ;
        break;
      default:
        jj_la1[11] = jj_gen;
        break label_9;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        t = jj_consume_token(PLUS);
        break;
      case MINUS:
        t = jj_consume_token(MINUS);
        break;
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      MultiplicativeExpression();
                                          MicAdditiveExpression jjtn002 = new MicAdditiveExpression(JJTADDITIVEEXPRESSION);
                                          boolean jjtc002 = true;
                                          jjtree.openNodeScope(jjtn002);
      try {
                                          jjtree.closeNodeScope(jjtn002,  2);
                                          jjtc002 = false;
                                          jjtn002.setOp( t.kind );
      } finally {
                                          if (jjtc002) {
                                            jjtree.closeNodeScope(jjtn002,  2);
                                          }
      }
    }
  }

  final public void MultiplicativeExpression() throws ParseException {
        Token t;
   MicMultiplicativeExpression jjtn001 = new MicMultiplicativeExpression(JJTMULTIPLICATIVEEXPRESSION);
   boolean jjtc001 = true;
   jjtree.openNodeScope(jjtn001);
    try {
      PowerExpression();
    } catch (Throwable jjte001) {
   if (jjtc001) {
     jjtree.clearNodeScope(jjtn001);
     jjtc001 = false;
   } else {
     jjtree.popNode();
   }
   if (jjte001 instanceof RuntimeException) {
     {if (true) throw (RuntimeException)jjte001;}
   }
   if (jjte001 instanceof ParseException) {
     {if (true) throw (ParseException)jjte001;}
   }
   {if (true) throw (Error)jjte001;}
    } finally {
   if (jjtc001) {
     jjtree.closeNodeScope(jjtn001, jjtree.nodeArity() > 1);
   }
    }
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MUL:
      case DIV:
      case MOD:
        ;
        break;
      default:
        jj_la1[13] = jj_gen;
        break label_10;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MUL:
        t = jj_consume_token(MUL);
        break;
      case DIV:
        t = jj_consume_token(DIV);
        break;
      case MOD:
        t = jj_consume_token(MOD);
        break;
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      PowerExpression();
                                          MicMultiplicativeExpression jjtn002 = new MicMultiplicativeExpression(JJTMULTIPLICATIVEEXPRESSION);
                                          boolean jjtc002 = true;
                                          jjtree.openNodeScope(jjtn002);
      try {
                                          jjtree.closeNodeScope(jjtn002,  2);
                                          jjtc002 = false;
                                          jjtn002.setOp( t.kind );
      } finally {
                                          if (jjtc002) {
                                            jjtree.closeNodeScope(jjtn002,  2);
                                          }
      }
    }
  }

  final public void PowerExpression() throws ParseException {
          MicPowerExpression jjtn001 = new MicPowerExpression(JJTPOWEREXPRESSION);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
    try {
      UnaryExpression();
    } catch (Throwable jjte001) {
          if (jjtc001) {
            jjtree.clearNodeScope(jjtn001);
            jjtc001 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte001 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte001;}
          }
          if (jjte001 instanceof ParseException) {
            {if (true) throw (ParseException)jjte001;}
          }
          {if (true) throw (Error)jjte001;}
    } finally {
          if (jjtc001) {
            jjtree.closeNodeScope(jjtn001, jjtree.nodeArity() > 2);
          }
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case POWER:
      jj_consume_token(POWER);
                            MicPowerExpression jjtn002 = new MicPowerExpression(JJTPOWEREXPRESSION);
                            boolean jjtc002 = true;
                            jjtree.openNodeScope(jjtn002);
      try {
        PowerExpression();
      } catch (Throwable jjte002) {
                            if (jjtc002) {
                              jjtree.clearNodeScope(jjtn002);
                              jjtc002 = false;
                            } else {
                              jjtree.popNode();
                            }
                            if (jjte002 instanceof RuntimeException) {
                              {if (true) throw (RuntimeException)jjte002;}
                            }
                            if (jjte002 instanceof ParseException) {
                              {if (true) throw (ParseException)jjte002;}
                            }
                            {if (true) throw (Error)jjte002;}
      } finally {
                            if (jjtc002) {
                              jjtree.closeNodeScope(jjtn002,  2);
                            }
      }
      break;
    default:
      jj_la1[15] = jj_gen;
      ;
    }
  }

  final public void UnaryExpression() throws ParseException {
        Token t;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LPAREN:
    case INT_LITERAL:
      UnarySimpleExpression();
      break;
    case PLUS:
    case MINUS:
    case BNEG:
    case LNEG:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        t = jj_consume_token(PLUS);
        break;
      case MINUS:
        t = jj_consume_token(MINUS);
        break;
      case BNEG:
        t = jj_consume_token(BNEG);
        break;
      case LNEG:
        t = jj_consume_token(LNEG);
        break;
      default:
        jj_la1[16] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      UnaryExpression();
                                          MicUnaryExpression jjtn001 = new MicUnaryExpression(JJTUNARYEXPRESSION);
                                          boolean jjtc001 = true;
                                          jjtree.openNodeScope(jjtn001);
      try {
                                          jjtree.closeNodeScope(jjtn001,  1);
                                          jjtc001 = false;
                                          jjtn001.setOp( t.kind );
      } finally {
                                          if (jjtc001) {
                                            jjtree.closeNodeScope(jjtn001,  1);
                                          }
      }
      break;
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void UnarySimpleExpression() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT_LITERAL:
      Integer();
      break;
    case LPAREN:
      jj_consume_token(LPAREN);
      Expression();
      jj_consume_token(RPAREN);
      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Integer() throws ParseException {
 /*@bgen(jjtree) Integer */
        MicInteger jjtn000 = new MicInteger(JJTINTEGER);
        boolean jjtc000 = true;
        jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(INT_LITERAL);
                            jjtree.closeNodeScope(jjtn000, true);
                            jjtc000 = false;
                            jjtn000.setLexeme( t.image );
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
  }

  public MicParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  public Token token, jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[19];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_0();
      jj_la1_1();
   }
   private static void jj_la1_0() {
      jj_la1_0 = new int[] {0x8000000,0x4000000,0x2000000,0x1000000,0x800000,0x600000,0x600000,0x1e0000,0x1e0000,0x18000,0x18000,0x180,0x180,0x7000,0x7000,0x800,0x780,0x400007a0,0x40000020,};
   }
   private static void jj_la1_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }

  public MicParser(java.io.InputStream stream) {
     this(stream, null);
  }
  public MicParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new MicParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public MicParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new MicParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public MicParser(MicParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  public void ReInit(MicParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  final private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  @SuppressWarnings("unchecked")
  private java.util.Vector jj_expentries = new java.util.Vector();
  private int[] jj_expentry;
  private int jj_kind = -1;

  @SuppressWarnings("unchecked")
  public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[34];
    for (int i = 0; i < 34; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 19; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 34; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  final public void enable_tracing() {
  }

  final public void disable_tracing() {
  }

}