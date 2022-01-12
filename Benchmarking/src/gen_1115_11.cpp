  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s1 p1;
    s2(std::vector<std::vector<s0>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s2> p0;
    s0 p1;
    s5(std::vector<s2> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f31(const double &v0) {
    double v2 = v0;
    v2 = v0;
    double v1 = v0;
    double v3 = v0;
    const double v5 = v0 + v2;
    const double v11 = v1 * v5;
    double v20 = v11;
    double v32 = v20;
    const std::vector<double> v10 { v32, v3, v0 };
    std::vector<double> v41 = v10;
    std::vector<double> v31 = v41;
    std::vector<double> v51 = v31;
    v20 = v3;
    const double v26 = v51[1];
    v31[1] = v5;
    return v26;
  }
  double f29(const double &v0) {
    const double v6 = f31(v0);
    double v1 = v6;
    double v2 = v0;
    const std::vector<double> v8 { v6, v0 };
    double v10 = v2;
    std::vector<double> v4 = v8;
    v4[0] = v10;
    const double v7 = f31(v6);
    v2 = v1;
    v2 = v7;
    std::vector<double> v25 = v4;
    const double v28 = v25[1];
    const double v33 = f31(v28);
    v25[0] = v0;
    return v33;
  }
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const s2 &v1, const double &v2) {
    double v8 = v2;
    v8 = v2;
    const double v61 = f29(v8);
    double v236 = v61;
    return v236;
  }
  int main() {
    std::vector<s5> v0({ { { { { { { { { 0.0 } } } } }, { { { { 1.0 } } }, { { { 2.0 } } } } }, { { { { { { 3.0 } } } } }, { { { { 4.0 } } }, { { { 5.0 } } } } }, { { { { { { 6.0 } } } } }, { { { { 7.0 } } }, { { { 8.0 } } } } } }, { { { 9.0 } } } } });
    s2 v1({ { { { { { 10.0 } } } } }, { { { { 11.0 } } }, { { { 12.0 } } } } });
    double v2(13.0);
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
