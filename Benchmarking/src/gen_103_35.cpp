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
  s1 f7(const s1 &v0, const s0 &v1) {
    return v0;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const std::vector<s0> &v1, const s1 &v2, const s1 &v3, const double &v4) {
    const s0 v6 = v2.p0;
    const double v7 = v4 + v4;
    const double v16 = v7 - v4;
    const double v14 = v16 + v16;
    const s1 v27 = f7(v2, v6);
    const s0 v20 = v27.p0;
    const std::vector<std::vector<double>> v13 = v20.p0;
    const std::vector<double> v23 = v13[1];
    const double v55 = v23[0];
    const double v41 = v14 + v55;
    const double v135 = v41 * v41;
    return v135;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } });
    std::vector<s0> v1({ { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } });
    s1 v2({ { { { 15.0 }, { 16.0 } }, { { 17.0 } } } });
    s1 v3({ { { { 18.0 }, { 19.0 } }, { { 20.0 } } } });
    double v4(21.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
