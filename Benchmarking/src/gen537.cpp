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
    s1(std::vector<s0> v0): p0(v0) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s1 p0;
    s2 p1;
    s6(s1 v0, s2 v1): p0(v0), p1(v1) { }
  };
  double f56(const double &v0) {
    double v7 = v0;
    double v3 = v7;
    double v1 = v3;
    double v6 = v3;
    double v8 = v7;
    double v9 = v1;
    double v4 = v8;
    double v22 = v1;
    const std::vector<double> v13 { v6 };
    std::vector<double> v34 = v13;
    const double v18 = v13[0];
    const double v19 = v34[0];
    v34[0] = v18;
    const double v16 = v34[0];
    double v24 = v9;
    v34[0] = v24;
    v34[0] = v18;
    double v81 = v4;
    const std::vector<double> v33 { v1, v9, v22, v22, v22, v19 };
    std::vector<double> v45 = v33;
    v34[0] = v81;
    v34[0] = v16;
    v45[4] = v6;
    const double v38 = v45[1];
    return v38;
  }
  __attribute__((noinline))
  double f0(const std::vector<s6> &v0, const double &v1) {
    const double v8 = f56(v1);
    const double v2 = f56(v8);
    double v17 = v2;
    return v17;
  }
  int main() {
    std::vector<s6> v0({ { { { { { { 0.0 } }, { { 1.0 } } } } }, { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } } }, { { { { { { 6.0 } }, { { 7.0 } } } } }, { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } } } });
    double v1(12.0);
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
