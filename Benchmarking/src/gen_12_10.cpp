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
    std::vector<s0> p2;
    s0 p3;
    s1(s0 v0, s0 v1, std::vector<s0> v2, s0 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s2 {
    s1 p0;
    s2(s1 v0): p0(v0) { }
  };
  struct s4 {
    s0 p0;
    s2 p1;
    s4(s0 v0, s2 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const double &v1) {
    const s4 v7 = v0[0];
    double v5 = v1;
    const s0 v22 = v7.p0;
    const double v57 = v1 + v5;
    const std::vector<std::vector<double>> v46 = v22.p1;
    const std::vector<double> v23 = v46[0];
    const double v31 = v23[0];
    double v112 = v31;
    const double v197 = v57 - v112;
    const double v61 = v31 / v197;
    const double v76 = v61 * v197;
    return v76;
  }
  int main() {
    std::vector<s4> v0({ { { { { 0.0 } }, { { 1.0 } } }, { { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } }, { { { { 6.0 } }, { { 7.0 } } }, { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } }, { { { 12.0 } }, { { 13.0 } } } } } } });
    double v1(14.0);
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
