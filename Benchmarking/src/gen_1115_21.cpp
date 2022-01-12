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
    s1(s0 v0): p0(v0) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    std::vector<s0> p2;
    s2(std::vector<s0> v0, s1 v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const s2 &v1, const double &v2) {
    const std::vector<s0> v5 = v1.p0;
    const s0 v7 = v5[0];
    const std::vector<std::vector<double>> v11 = v7.p0;
    const std::vector<double> v26 { v2, v2, v2 };
    const std::vector<double> v23 = v11[1];
    std::vector<double> v25 = v26;
    v25[2] = v2;
    v25[0] = v2;
    const std::vector<s1> v20 = v0[0];
    const double v53 = v23[0];
    const double v37 = v53 / v53;
    const s1 v36 = v20[0];
    const s0 v46 = v36.p0;
    v25 = v26;
    v25[2] = v37;
    const std::vector<std::vector<double>> v100 = v46.p1;
    const double v114 = v25[0];
    const std::vector<double> v119 = v100[0];
    const double v64 = v119[0];
    const double v158 = v114 / v64;
    return v158;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } } }, { { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } } });
    s2 v1({ { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } } });
    double v2(18.0);
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
