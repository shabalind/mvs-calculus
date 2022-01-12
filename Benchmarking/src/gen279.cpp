  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<double> &v0, const double &v1) {
    const double v4 = v0[2];
    const std::vector<double> v3 { v1, v4 };
    const double v2 = v3[0];
    const double v15 = v3[0];
    double v11 = v4;
    double v6 = v2;
    const double v26 = v0[2];
    const double v23 = v11 - v11;
    const double v18 = v23 * v1;
    double v21 = v6;
    const std::vector<double> v27 { v18, v21, v1, v26, v15, v26 };
    const double v69 = v27[5];
    return v69;
  }
  int main() {
    std::vector<double> v0({ 0.0, 1.0, 2.0 });
    double v1(3.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
