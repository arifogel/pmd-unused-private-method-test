package org.arifogel.pmd_unused_private_method_test;

public final class OuterClass {

  private static class InnerClass {

    private void callPrivateMethod() {
      Referrer.getOuterClass().privateMethod();
    }

  }

  private void privateMethod() {}

}
