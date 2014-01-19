// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.erlang.ErlangTypes.*;
import org.intellij.erlang.psi.*;

public class ErlangBinaryExpressionImpl extends ErlangExpressionImpl implements ErlangBinaryExpression {

  public ErlangBinaryExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ErlangVisitor) ((ErlangVisitor)visitor).visitBinaryExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ErlangBinElement> getBinElementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ErlangBinElement.class);
  }

  @Override
  @Nullable
  public PsiElement getBinEnd() {
    return findChildByType(ERL_BIN_END);
  }

  @Override
  @NotNull
  public PsiElement getBinStart() {
    return findNotNullChildByType(ERL_BIN_START);
  }

}
