  #include <vector>
  #include <iostream>
  #include <chrono>
  double f17(const double &v0) {
    double v2 = v0;
    double v6 = v2;
    v2 = v6;
    const double v1 = v6 * v6;
    double v4 = v1;
    double v3 = v4;
    double v21 = v3;
    return v21;
  }
  __attribute__((noinline))
  double f0(const double &v0) {
    double v7 = v0;
    double v1 = v0;
    double v5 = v7;
    double v10 = v5;
    double v9 = v1;
    v5 = v10;
    double v23 = v1;
    const double v30 = f17(v23);
    const double v15 = f17(v9);
    const std::vector<double> v73 { v5, v10 };
    v1 = v10;
    std::vector<double> v107 = v73;
    v107[0] = v15;
    double v172 = v30;
    std::vector<double> v93 = v107;
    const double v79 = v93[0];
    v10 = v30;
    v93[1] = v172;
    return v79;
  }
  int main() {
    double v0(0.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
