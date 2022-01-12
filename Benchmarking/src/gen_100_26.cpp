  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    s1 p1;
    s5(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f62(const double &v0) {
    double v1 = v0;
    double v4 = v1;
    double v10 = v1;
    double v15 = v4;
    double v20 = v10;
    double v11 = v0;
    double v12 = v11;
    const std::vector<double> v30 { v20, v12, v15 };
    v4 = v0;
    const double v21 = v30[1];
    return v21;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s5 &v1, const double &v2) {
    double v5 = v2;
    const double v13 = v5 - v2;
    double v8 = v5;
    v5 = v8;
    const double v41 = v13 * v8;
    const double v81 = v41 + v8;
    const double v143 = f62(v81);
    v5 = v81;
    return v143;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } });
    s5 v1({ { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } });
    double v2(20.0);
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
