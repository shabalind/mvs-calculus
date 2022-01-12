  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const std::vector<std::vector<double>> &v3, const double &v4) {
    double v6 = v4;
    const double v7 = v6 - v4;
    double v12 = v7;
    const std::vector<double> v11 = v0[0];
    double v15 = v12;
    const double v13 = v11[0];
    std::vector<double> v17 = v11;
    double v20 = v13;
    v17[0] = v15;
    std::vector<double> v29 = v17;
    const double v81 = v29[0];
    v17 = v11;
    v17[0] = v20;
    return v81;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    std::vector<std::vector<double>> v1({ { 1.0 } });
    std::vector<std::vector<double>> v2({ { 2.0 } });
    std::vector<std::vector<double>> v3({ { 3.0 } });
    double v4(4.0);
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
