#!/bin/bash

echo "benchmarking cpp"
cd cpp/
./bench.sh
cd -

echo "benchmarking scala"
cd scala/
./bench.sh
cd -

echo "benchmarking mvs"
cd mvs/
./bench.sh
cd -

echo "benchmarking swift"
cd swift/
./bench.sh
cd -
