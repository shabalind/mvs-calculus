  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const std::vector<s0> &v2, const double &v3) {
    const s0 v5 = v2[1];
    const std::vector<std::vector<double>> v7 = v5.p0;
    const std::vector<double> v6 = v7[0];
    const s0 v18 = v2[1];
    const std::vector<std::vector<double>> v17 = v18.p0;
    const std::vector<double> v15 = v17[0];
    const double v23 = v15[0];
    std::vector<double> v24 = v6;
    v24[0] = v23;
    const double v68 = v24[0];
    return v68;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 } } });
    s0 v1({ { { 3.0 } }, { { 4.0 }, { 5.0 } } });
    std::vector<s0> v2({ { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } });
    double v3(12.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
