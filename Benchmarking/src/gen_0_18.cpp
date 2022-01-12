  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  std::vector<s2> f62(const std::vector<s2> &v0) {
    return v0;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const double &v1) {
    double v5 = v1;
    const std::vector<double> v2 { v1, v5, v1, v5 };
    const double v10 = v2[0];
    double v8 = v10;
    const std::vector<s2> v17 = v0[0];
    const std::vector<s2> v28 = f62(v17);
    const s2 v14 = v28[0];
    const s0 v16 = v14.p1;
    const std::vector<std::vector<double>> v29 = v16.p1;
    const std::vector<double> v40 = v29[0];
    const double v107 = v40[0];
    const double v94 = v8 / v107;
    return v94;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } } } });
    double v1(9.0);
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
