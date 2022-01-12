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
    const s0 v2 = v0[0];
    const std::vector<std::vector<double>> v5 = v2.p0;
    const std::vector<std::vector<double>> v4 = v2.p0;
    const s0 v3(v5, v4);
    double v13 = v1;
    const std::vector<std::vector<double>> v14 = v3.p0;
    std::vector<std::vector<double>> v10 = v4;
    v10 = v14;
    const std::vector<double> v15 = v10[0];
    const double v26 = v15[0];
    v13 = v26;
    return v13;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 } } } });
    double v1(2.0);
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
