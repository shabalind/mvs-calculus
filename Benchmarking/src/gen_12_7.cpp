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
    double v5 = v1;
    const std::vector<s0> v8 = v0[1];
    const s0 v3 = v8[0];
    const std::vector<std::vector<double>> v9 = v3.p0;
    const std::vector<double> v4 = v9[0];
    v5 = v1;
    v5 = v1;
    const double v27 = v5 + v1;
    const double v53 = v4[0];
    double v83 = v53;
    const double v98 = v83 / v27;
    return v98;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 } }, { { 1.0 } } } }, { { { { 2.0 } }, { { 3.0 } } } } });
    double v1(4.0);
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
