  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s0> &v1, const double &v2) {
    const std::vector<std::vector<double>> v9 = v0.p0;
    double v5 = v2;
    const std::vector<double> v4 = v9[0];
    double v32 = v5;
    const double v25 = v2 / v32;
    const double v37 = v4[0];
    std::vector<double> v20 = v4;
    v20 = v4;
    v32 = v37;
    v20[0] = v25;
    std::vector<double> v54 = v20;
    const double v56 = v54[0];
    v54[0] = v25;
    double v129 = v56;
    return v129;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } });
    std::vector<s0> v1({ { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } });
    double v2(16.0);
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
