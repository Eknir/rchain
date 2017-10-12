package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class PPtNew extends PPattern {
  public final ListVarPattern listvarpattern_;
  public final PPattern ppattern_;
  public PPtNew(ListVarPattern p1, PPattern p2) { listvarpattern_ = p1; ppattern_ = p2; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.PPattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.PPtNew) {
      coop.rchain.syntax.rholang.Absyn.PPtNew x = (coop.rchain.syntax.rholang.Absyn.PPtNew)o;
      return this.listvarpattern_.equals(x.listvarpattern_) && this.ppattern_.equals(x.ppattern_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listvarpattern_.hashCode())+this.ppattern_.hashCode();
  }


}
