#!/bin/bash
mkdir -p results

echo "bounce benchmark"
for run in {1..10}
do
  bin/bounce 1000 100 1331 > results/bounce.$run
done

echo "mandelbrot benchmark"
for run in {1..10}
do
  bin/mandelbrot 1000 500 191 > results/mandelbrot.$run
done

echo "nbody benchmark"
for run in {1..10}
do
  bin/nbody 1000 250000 -16908 > results/nbody.$run
done

echo "permute benchmark"
for run in {1..10}
do
  bin/permute 1000 6 8660 > results/permute.$run
done

echo "queens benchmark"
for run in {1..10}
do
  bin/queens 1000 0 1 > results/queens.$run
done
