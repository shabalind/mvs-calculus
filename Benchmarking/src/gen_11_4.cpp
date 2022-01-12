  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const double &v3) {
    const std::vector<double> v4 = v2[2];
    const double v19 = v4[0];
    double v34 = v19;
    const double v50 = v19 * v19;
    const std::vector<double> v92 { v50, v50, v34, v3, v3 };
    const double v84 = v92[1];
    std::vector<double> v132 = v92;
    v132[3] = v84;
    std::vector<double> v347 = v132;
    const double v441 = v347[1];
    return v441;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    std::vector<std::vector<double>> v1({ { 1.0 }, { 2.0 } });
    std::vector<std::vector<double>> v2({ { 3.0 }, { 4.0 }, { 5.0 } });
    double v3(6.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
