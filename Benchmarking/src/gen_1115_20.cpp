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
    const s0 v3 = v0[0];
    const std::vector<std::vector<double>> v6 = v3.p1;
    const s0 v5 = v0[0];
    const std::vector<std::vector<double>> v9 = v5.p0;
    const std::vector<double> v13 = v9[0];
    const std::vector<double> v34 = v6[1];
    const double v43 = v34[0];
    const double v40 = v13[0];
    double v59 = v40;
    const double v26 = v59 * v43;
    return v26;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } });
    double v1(5.0);
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
