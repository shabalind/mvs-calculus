  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f33(const double &v0) {
    double v5 = v0;
    double v7 = v5;
    const std::vector<double> v4 { v5 };
    v5 = v7;
    std::vector<double> v2 = v4;
    std::vector<double> v3 = v2;
    std::vector<double> v16 = v3;
    double v8 = v0;
    v3[0] = v8;
    v3[0] = v5;
    v2[0] = v7;
    v3[0] = v8;
    v16[0] = v0;
    v3[0] = v5;
    const double v24 = v16[0];
    v3[0] = v24;
    return v24;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const double v7 = f33(v1);
    const double v9 = f33(v7);
    const double v10 = f33(v1);
    const double v13 = f33(v9);
    const double v25 = f33(v13);
    const std::vector<double> v24 { v9 };
    const double v30 = v24[0];
    const double v33 = v24[0];
    const std::vector<double> v146 { v25, v25, v10, v30, v33, v10 };
    std::vector<double> v89 = v146;
    const double v115 = v89[1];
    return v115;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } });
    double v1(16.0);
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
