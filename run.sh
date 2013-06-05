#!/bin/bash

# original
# java -cp target/classes com.zsoltfabok.wrapper.Arithmetic $*

# instrumented
java -cp target/instrumented-classes:target/classes:lib/cobertura/cobertura-1.9.4.1.jar \
com.zsoltfabok.wrapper.Arithmetic $* \
| grep -v -e '^Flushing results' -e 'Cobertura:'