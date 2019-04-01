package com.itacademy.nikolaichik.util;

import java.util.Objects;
import java.util.logging.Logger;

public class ObjectUtil {
  
  private static final Logger logger = Logger.getLogger(ObjectUtil.class.getName());

  public static boolean isNull(Object object) {
    if (Objects.isNull(object)) {
      logger.info(String.format("parameter [%s] is null", object));
      return true;
    }
    return false;
  }
}
