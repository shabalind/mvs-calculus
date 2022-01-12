  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f93(const s0 &v0) {
    const std::vector<std::vector<double>> v8 = v0.p1;
    const std::vector<std::vector<std::vector<double>>> v6 { v8, v8, v8, v8, v8 };
    const std::vector<std::vector<double>> v17 = v6[0];
    s0 v20 = v0;
    v20.p1 = v17;
    v20 = v0;
    v20.p1 = v17;
    return v20;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<s0> &v1, const s0 &v2, const s0 &v3, const double &v4) {
    const s0 v5 = f93(v3);
    const std::vector<std::vector<double>> v12 = v5.p1;
    const std::vector<double> v13 = v12[0];
    const double v42 = v13[0];
    return v42;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 } } } });
    std::vector<s0> v1({ { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } });
    s0 v2({ { { 9.0 } }, { { 10.0 }, { 11.0 } } });
    s0 v3({ { { 12.0 } }, { { 13.0 }, { 14.0 } } });
    double v4(15.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
