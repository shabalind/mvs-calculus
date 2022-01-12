  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v3 = v0[2];
    const s0 v14 = v0[0];
    const std::vector<std::vector<double>> v8 = v3.p0;
    const std::vector<double> v29 = v8[0];
    const std::vector<std::vector<double>> v34 = v14.p1;
    const double v38 = v29[0];
    const std::vector<double> v28 = v34[0];
    std::vector<double> v69 = v28;
    v69[0] = v1;
    v69[0] = v1;
    const std::vector<double> v64 { v38, v1 };
    std::vector<double> v106 = v69;
    const double v146 = v64[0];
    const double v238 = v106[0];
    const double v196 = v238 - v146;
    return v196;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } });
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
