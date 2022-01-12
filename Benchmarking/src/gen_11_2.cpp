  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  std::vector<double> f41(const double &v0, const std::vector<double> &v1) {
    double v3 = v0;
    std::vector<double> v20 = v1;
    v3 = v0;
    v20[0] = v3;
    return v20;
  }
  __attribute__((noinline))
  double f0(const std::vector<double> &v0, const std::vector<s0> &v1, const double &v2) {
    const s0 v3 = v1[0];
    const std::vector<std::vector<double>> v7 = v3.p0;
    const double v5 = v0[1];
    const std::vector<double> v18 = v7[0];
    const std::vector<double> v16 = f41(v5, v18);
    const double v73 = v16[0];
    return v73;
  }
  int main() {
    std::vector<double> v0({ 0.0, 1.0, 2.0 });
    std::vector<s0> v1({ { { { 3.0 }, { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 }, { 8.0 } } } });
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
