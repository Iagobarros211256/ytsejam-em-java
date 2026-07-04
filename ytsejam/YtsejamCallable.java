package ytsejam;

import java.util.List;

interface YtsejamCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}