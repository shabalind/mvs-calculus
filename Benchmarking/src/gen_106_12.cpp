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
    s0 p0;
    std::vector<s1> p1;
    s2(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<s2> &v1, const double &v2) {
    const s0 v7 = v0[0];
    const std::vector<std::vector<double>> v6 = v7.p0;
    const std::vector<double> v8 = v6[1];
    std::vector<std::vector<double>> v4 = v6;
    const double v20 = v8[0];
    v4[1] = v8;
    const std::vector<double> v50 = v4[0];
    const std::vector<double> v71 = v4[1];
    const double v75 = v50[0];
    v4[0] = v71;
    double v150 = v75;
    const double v55 = v20 - v150;
    return v55;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } });
    std::vector<s2> v1({ { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } }, { { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } } } });
    double v2(16.0);
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
