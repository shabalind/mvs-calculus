  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<s0> &v1, const double &v2) {
    const s0 v3 = v1[2];
    const std::vector<std::vector<double>> v5 = v3.p0;
    const std::vector<double> v10 = v5[0];
    const double v12 = v10[0];
    double v17 = v12;
    std::vector<double> v23 = v10;
    v23[0] = v17;
    const double v45 = v23[0];
    v23[0] = v17;
    v23[0] = v12;
    v17 = v12;
    return v45;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } } }, { { { 1.0 } } }, { { { 2.0 } } } });
    std::vector<s0> v1({ { { { 3.0 } } }, { { { 4.0 } } }, { { { 5.0 } } } });
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
