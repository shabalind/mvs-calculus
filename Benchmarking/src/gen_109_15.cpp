  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s1>> p0;
    std::vector<std::vector<double>> p1;
    s4(std::vector<std::vector<s1>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const double &v1) {
    const s4 v3 = v0[0];
    const std::vector<std::vector<double>> v7 = v3.p1;
    const double v13 = v1 / v1;
    double v30 = v13;
    const double v29 = v30 / v13;
    double v41 = v29;
    v30 = v1;
    v30 = v1;
    const std::vector<double> v81 = v7[0];
    const double v71 = v81[0];
    const double v67 = v1 * v41;
    const double v152 = v41 + v71;
    const double v73 = v152 * v67;
    return v73;
  }
  int main() {
    std::vector<s4> v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } } } }, { { 18.0 }, { 19.0 } } } });
    double v1(20.0);
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
