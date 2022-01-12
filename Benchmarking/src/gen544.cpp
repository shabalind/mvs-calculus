  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const std::vector<std::vector<double>> &v3, const std::vector<std::vector<double>> &v4, const std::vector<double> &v5, const double &v6, const std::vector<std::vector<double>> &v7) {
    const std::vector<double> v11 = v1[1];
    const std::vector<double> v20 = v2[0];
    double v12 = v6;
    const double v15 = v11[0];
    const double v9 = v20[0];
    const double v13 = v20[0];
    const std::vector<double> v59 { v13, v15, v9, v6, v12 };
    const double v77 = v11[0];
    v12 = v77;
    const std::vector<std::vector<double>> v132 { v59, v59 };
    const std::vector<double> v105 = v132[0];
    const double v154 = v105[3];
    return v154;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    std::vector<std::vector<double>> v1({ { 1.0 }, { 2.0 }, { 3.0 } });
    std::vector<std::vector<double>> v2({ { 4.0 } });
    std::vector<std::vector<double>> v3({ { 5.0 }, { 6.0 }, { 7.0 } });
    std::vector<std::vector<double>> v4({ { 8.0 }, { 9.0 }, { 10.0 } });
    std::vector<double> v5({ 11.0 });
    double v6(12.0);
    std::vector<std::vector<double>> v7({ { 13.0 } });
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
