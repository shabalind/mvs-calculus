  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f63(const double &v0, const s0 &v1) {
    const double v6 = v0 / v0;
    double v16 = v6;
    return v16;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    double v7 = v1;
    const double v2 = v1 * v7;
    double v3 = v1;
    v3 = v7;
    const s0 v11 = v0[0];
    const double v15 = f63(v1, v11);
    const std::vector<double> v17 { v2, v1, v15, v7, v15, v1 };
    v7 = v3;
    const double v49 = v17[4];
    return v49;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } });
    double v1(6.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
