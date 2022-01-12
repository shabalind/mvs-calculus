  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const double &v2) {
    double v7 = v2;
    const std::vector<double> v8 = v1[1];
    const std::vector<double> v5 = v1[1];
    const double v9 = v8[0];
    const std::vector<double> v13 { v7, v9, v9 };
    const double v28 = v5[0];
    const double v21 = v13[0];
    std::vector<double> v50 = v13;
    v50[0] = v28;
    const double v72 = v50[0];
    v7 = v21;
    double v208 = v72;
    return v208;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
    std::vector<std::vector<double>> v1({ { 2.0 }, { 3.0 }, { 4.0 } });
    double v2(5.0);
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
