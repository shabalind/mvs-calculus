  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    double v4 = v1;
    double v15 = v4;
    const std::vector<s0> v5 = v0[1];
    const s0 v9 = v5[0];
    const double v24 = v15 * v4;
    const std::vector<std::vector<double>> v17 = v9.p0;
    const std::vector<double> v21 = v17[0];
    std::vector<double> v25 = v21;
    v25[0] = v24;
    const double v87 = v25[0];
    return v87;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } });
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
