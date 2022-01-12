  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const double &v2) {
    const std::vector<double> v5 = v0[1];
    const std::vector<double> v8 = v0[0];
    const double v25 = v5[0];
    const double v31 = v2 - v25;
    const double v36 = v8[0];
    const double v42 = v5[0];
    const std::vector<double> v34 { v25, v31, v36 };
    std::vector<double> v62 = v34;
    const double v78 = v62[2];
    const double v134 = v34[2];
    double v87 = v78;
    const double v122 = v134 * v42;
    const double v288 = v122 + v87;
    return v288;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
    std::vector<std::vector<double>> v1({ { 2.0 } });
    double v2(3.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
