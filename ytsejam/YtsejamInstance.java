package ytsejam;

import java.util.HashMap;
import java.util.Map;

class YtsejamInstance {
  private YtsejamClass klass;

  YtsejamInstance(YtsejamClass klass) {
    this.klass = klass;
  }

  @Override
  public String toString() {
    return klass.name + " instance";
  }
}