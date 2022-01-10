#!/bin/bash
.build/release/mvs -O $1 --emit-llvm 2> $1.ll
clang++ -O3 Runtime/runtime.cc $1.ll -o $2
