package code;

import java.lang.reflect.Method;

public record Result(Method meth, Object[] args) {}
