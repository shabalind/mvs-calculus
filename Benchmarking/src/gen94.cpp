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
    s1 p0;
    std::vector<std::vector<s1>> p1;
    s2(s1 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    s2 p1;
    s5(s0 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s2> p0;
    s6(std::vector<s2> v0): p0(v0) { }
  };
  struct s7 {
    s5 p0;
    s0 p1;
    s6 p2;
    s7(s5 v0, s0 v1, s6 v2): p0(v0), p1(v1), p2(v2) { }
  };
  s0 f9(const s0 &v0) {
    const s1 v6(v0, v0);
    const s0 v15 = v6.p0;
    return v15;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s2 &v1, const s7 &v2, const double &v3) {
    const s0 v7 = f9(v0);
    double v11 = v3;
    const std::vector<std::vector<double>> v13 = v7.p0;
    v11 = v3;
    const std::vector<double> v14 = v13[0];
    const double v40 = v3 * v11;
    const double v28 = v40 - v11;
    v11 = v28;
    const double v66 = v14[0];
    const double v60 = v3 + v40;
    std::vector<double> v64 = v14;
    v64[0] = v11;
    v64[0] = v60;
    v64[0] = v66;
    const double v127 = v64[0];
    return v127;
  }
  int main() {
    s0 v0({ { { 0.0 } } });
    s2 v1({ { { { { 1.0 } } }, { { { 2.0 } } } }, { { { { { { 3.0 } } }, { { { 4.0 } } } } }, { { { { { 5.0 } } }, { { { 6.0 } } } } }, { { { { { 7.0 } } }, { { { 8.0 } } } } } } });
    s7 v2({ { { { { 9.0 } } }, { { { { { 10.0 } } }, { { { 11.0 } } } }, { { { { { { 12.0 } } }, { { { 13.0 } } } } }, { { { { { 14.0 } } }, { { { 15.0 } } } } }, { { { { { 16.0 } } }, { { { 17.0 } } } } } } } }, { { { 18.0 } } }, { { { { { { { 19.0 } } }, { { { 20.0 } } } }, { { { { { { 21.0 } } }, { { { 22.0 } } } } }, { { { { { 23.0 } } }, { { { 24.0 } } } } }, { { { { { 25.0 } } }, { { { 26.0 } } } } } } } } } });
    double v3(27.0);
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
