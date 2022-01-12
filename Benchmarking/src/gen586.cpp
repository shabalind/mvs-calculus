  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const std::vector<s0> &v1, const s0 &v2, const double &v3) {
    const std::vector<std::vector<double>> v4 = v2.p0;
    const std::vector<double> v8 = v4[0];
    double v13 = v3;
    const double v7 = v13 * v13;
    const double v21 = v8[0];
    double v24 = v7;
    v13 = v7;
    v24 = v21;
    double v205 = v24;
    const double v136 = v205 / v21;
    return v136;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } } } });
    std::vector<s0> v1({ { { { 9.0 } }, { { 10.0 }, { 11.0 } } } });
    s0 v2({ { { 12.0 } }, { { 13.0 }, { 14.0 } } });
    double v3(15.0);
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
