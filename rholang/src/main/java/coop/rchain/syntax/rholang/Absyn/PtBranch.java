package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class PtBranch extends PatternPatternMatch {
  public final PPattern ppattern_1, ppattern_2;
  public PtBranch(PPattern p1, PPattern p2) { ppattern_1 = p1; ppattern_2 = p2; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.PatternPatternMatch.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.PtBranch) {
      coop.rchain.syntax.rholang.Absyn.PtBranch x = (coop.rchain.syntax.rholang.Absyn.PtBranch)o;
      return this.ppattern_1.equals(x.ppattern_1) && this.ppattern_2.equals(x.ppattern_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ppattern_1.hashCode())+this.ppattern_2.hashCode();
  }


}
