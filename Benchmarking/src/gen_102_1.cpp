  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const std::vector<std::vector<double>> &v3, const double &v4) {
    const std::vector<double> v12 = v3[2];
    double v6 = v4;
    const double v8 = v6 - v6;
    const double v15 = v12[0];
    const std::vector<double> v50 = v3[1];
    const std::vector<double> v14 { v15, v4, v8 };
    const double v29 = v50[0];
    std::vector<double> v41 = v14;
    std::vector<double> v54 = v41;
    v54[2] = v29;
    const double v84 = v54[1];
    return v84;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
    std::vector<std::vector<double>> v1({ { 2.0 }, { 3.0 } });
    std::vector<std::vector<double>> v2({ { 4.0 } });
    std::vector<std::vector<double>> v3({ { 5.0 }, { 6.0 }, { 7.0 } });
    double v4(8.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
