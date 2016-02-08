#!/bin/bash

echo "compiling java ..."
javac HelloJNI.java

echo "building jni header ..."
javah HelloJNI

echo "building jni lib ..."
gcc -I$JAVA_HOME/include -I $JAVA_HOME/include/darwin -shared -o libhello.jnilib HelloJNI.c

echo "done"
