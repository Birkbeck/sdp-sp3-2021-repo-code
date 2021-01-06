package com.thing;

import java.util.logging.Logger;

public class UnnamedTest2 {
  private static final Logger log = Logger.getLogger(UnnamedTest2.class.getName());

  public static void main(String... st) {
    Module module = UnnamedTest2.class.getModule();
    log.info(module.toString());
  }
}