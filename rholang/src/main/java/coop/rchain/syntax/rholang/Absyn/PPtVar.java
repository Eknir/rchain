package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class PPtVar extends PPattern {
  public final VarPattern varpattern_;
  public PPtVar(VarPattern p1) { varpattern_ = p1; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.PPattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.PPtVar) {
      coop.rchain.syntax.rholang.Absyn.PPtVar x = (coop.rchain.syntax.rholang.Absyn.PPtVar)o;
      return this.varpattern_.equals(x.varpattern_);
    }
    return false;
  }

  public int hashCode() {
    return this.varpattern_.hashCode();
  }


}
