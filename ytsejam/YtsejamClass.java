package ytsejam;

import java.util.List;
import java.util.Map;

class YtsejamClass implements YtsejamCallable{
  final String name;

  YtsejamClass(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public Object call(Interpreter interpreter,List<Object> arguments) {YtsejamInstance instance = new YtsejamInstance(this);
    return instance;
  }

  @Override
  public int arity() {
    return 0;
  }


}
