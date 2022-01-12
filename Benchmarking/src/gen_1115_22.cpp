  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s2 &v1, const s2 &v2, const double &v3) {
    const s0 v6 = v1.p1;
    const std::vector<std::vector<double>> v9 = v6.p1;
    const std::vector<std::vector<double>> v5 = v6.p0;
    const std::vector<double> v12 = v5[0];
    const std::vector<double> v41 = v9[0];
    const double v29 = v41[0];
    std::vector<double> v49 = v12;
    v49[0] = v3;
    std::vector<double> v27 = v49;
    v49[0] = v29;
    const double v145 = v27[0];
    v49[0] = v3;
    return v145;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 } } });
    s2 v1({ { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } }, { { { 6.0 } }, { { 7.0 } } } });
    s2 v2({ { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } }, { { { 12.0 } }, { { 13.0 } } } });
    double v3(14.0);
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
