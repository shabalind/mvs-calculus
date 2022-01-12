  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const double &v2) {
    const std::vector<double> v5 { v2, v2, v2, v2, v2 };
    const double v28 = v2 + v2;
    std::vector<double> v13 = v5;
    std::vector<double> v16 = v13;
    v13 = v16;
    v13[1] = v28;
    v13 = v5;
    const double v31 = v13[1];
    const double v38 = v16[4];
    const double v60 = v16[4];
    const double v44 = v38 - v31;
    const double v96 = v44 / v60;
    return v96;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    std::vector<std::vector<double>> v1({ { 3.0 }, { 4.0 }, { 5.0 } });
    double v2(6.0);
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
