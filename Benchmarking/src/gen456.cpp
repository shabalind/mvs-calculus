  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v6 = v1.p1;
    const std::vector<double> v3 = v6[0];
    const double v11 = v3[0];
    const std::vector<double> v10 = v6[0];
    double v27 = v11;
    const std::vector<double> v24 = v6[0];
    const std::vector<std::vector<double>> v21 { v10, v24, v10, v3, v10 };
    const std::vector<double> v75 = v21[1];
    const double v117 = v75[0];
    const double v148 = v117 * v27;
    return v148;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } });
    s0 v1({ { { 6.0 }, { 7.0 } }, { { 8.0 } } });
    double v2(9.0);
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
