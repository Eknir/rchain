package rholang.parsing.rholang2.Absyn; // Java Package generated by the BNF Converter.

public class EChar extends Entity {
  public final Character char_;
  public EChar(Character p1) { char_ = p1; }

  public <R,A> R accept(rholang.parsing.rholang2.Absyn.Entity.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang2.Absyn.EChar) {
      rholang.parsing.rholang2.Absyn.EChar x = (rholang.parsing.rholang2.Absyn.EChar)o;
      return this.char_.equals(x.char_);
    }
    return false;
  }

  public int hashCode() {
    return this.char_.hashCode();
  }


}
