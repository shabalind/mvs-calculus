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
    std::vector<s0> p0;
    std::vector<std::vector<s1>> p1;
    s2(std::vector<s0> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  double f76(const double &v0) {
    double v2 = v0;
    double v4 = v0;
    double v8 = v4;
    const double v1 = v8 / v2;
    v2 = v4;
    double v5 = v2;
    double v10 = v1;
    double v6 = v2;
    double v7 = v1;
    v5 = v8;
    double v20 = v5;
    const std::vector<double> v21 { v10, v6, v5, v7, v4 };
    std::vector<double> v32 = v21;
    v32[3] = v20;
    const double v29 = v32[0];
    return v29;
  }
  double f34(const double &v0) {
    const double v5 = f76(v0);
    const double v2 = f76(v5);
    double v1 = v5;
    const double v19 = v2 * v1;
    const double v16 = f76(v5);
    const double v29 = f76(v16);
    double v20 = v29;
    const std::vector<double> v13 { v20, v29, v19 };
    const double v23 = v13[0];
    return v23;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s2 &v1, const double &v2) {
    double v3 = v2;
    double v57 = v3;
    const double v19 = f34(v57);
    const double v41 = f76(v19);
    return v41;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } });
    s2 v1({ { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } } } });
    double v2(30.0);
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
