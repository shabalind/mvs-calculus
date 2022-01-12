  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f21(const std::vector<s0> &v0) {
    return v0;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<s0> &v1, const double &v2) {
    const std::vector<double> v7 = v0[0];
    std::vector<double> v9 = v7;
    const double v3 = v2 + v2;
    v9[0] = v3;
    const std::vector<s0> v6 = f21(v1);
    const s0 v5 = v6[0];
    const std::vector<std::vector<double>> v11 = v5.p1;
    const std::vector<double> v10 = v11[0];
    const double v8 = v10[0];
    double v19 = v8;
    v9[0] = v8;
    const double v31 = v10[0];
    v9[0] = v8;
    const double v59 = v9[0];
    const double v53 = v2 / v19;
    v9[0] = v53;
    double v47 = v59;
    double v55 = v31;
    double v179 = v55;
    v9[0] = v179;
    double v127 = v47;
    const double v177 = v127 * v47;
    return v177;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
    std::vector<s0> v1({ { { { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 }, { 6.0 } } } });
    double v2(7.0);
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
