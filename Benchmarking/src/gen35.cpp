  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const double &v2) {
    std::vector<std::vector<double>> v8 = v1;
    const std::vector<double> v5 = v8[0];
    const double v4 = v5[0];
    double v3 = v2;
    const std::vector<double> v13 = v8[0];
    double v26 = v2;
    std::vector<double> v20 = v13;
    const double v36 = v20[0];
    double v46 = v26;
    const double v41 = v36 - v4;
    std::vector<double> v28 = v5;
    v28[0] = v41;
    v28[0] = v46;
    v8[0] = v28;
    v20[0] = v3;
    double v178 = v41;
    return v178;
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
