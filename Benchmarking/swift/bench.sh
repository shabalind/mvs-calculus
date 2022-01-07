#!/bin/bash
mkdir -p results
bin/bounce 1000 100 1331 > results/bounce
bin/mandelbrot 1000 500 191 > results/mandelbrot
bin/nbody 1000 250000 -16908 > results/nbody
bin/permute 1000 6 8660 > results/permute
bin/queens 1000 0 1 > results/queens
