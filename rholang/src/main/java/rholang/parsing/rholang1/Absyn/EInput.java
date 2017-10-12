package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public class EInput extends Expr {
  public final ListBind listbind_;
  public final Expr expr_;
  public EInput(ListBind p1, Expr p2) { listbind_ = p1; expr_ = p2; }

  public <R,A> R accept(rholang.parsing.rholang1.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang1.Absyn.EInput) {
      rholang.parsing.rholang1.Absyn.EInput x = (rholang.parsing.rholang1.Absyn.EInput)o;
      return this.listbind_.equals(x.listbind_) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listbind_.hashCode())+this.expr_.hashCode();
  }


}
