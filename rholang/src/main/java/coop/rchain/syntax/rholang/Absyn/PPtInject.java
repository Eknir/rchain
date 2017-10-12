package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class PPtInject extends PPattern {
  public final CPattern cpattern_;
  public PPtInject(CPattern p1) { cpattern_ = p1; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.PPattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.PPtInject) {
      coop.rchain.syntax.rholang.Absyn.PPtInject x = (coop.rchain.syntax.rholang.Absyn.PPtInject)o;
      return this.cpattern_.equals(x.cpattern_);
    }
    return false;
  }

  public int hashCode() {
    return this.cpattern_.hashCode();
  }


}
