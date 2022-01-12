  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const std::vector<std::vector<double>> &v3, const std::vector<std::vector<double>> &v4, const double &v5) {
    const std::vector<double> v6 = v3[0];
    const std::vector<double> v9 = v2[0];
    const double v15 = v6[0];
    const std::vector<double> v11 = v1[0];
    const double v29 = v11[0];
    double v27 = v15;
    const double v19 = v29 / v27;
    const double v40 = v9[0];
    v27 = v15;
    const double v59 = v19 / v40;
    return v59;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    std::vector<std::vector<double>> v1({ { 1.0 } });
    std::vector<std::vector<double>> v2({ { 2.0 } });
    std::vector<std::vector<double>> v3({ { 3.0 } });
    std::vector<std::vector<double>> v4({ { 4.0 }, { 5.0 } });
    double v5(6.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
