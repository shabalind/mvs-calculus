  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    s0 p1;
    std::vector<std::vector<s2>> p2;
    s4(s0 v0, s0 v1, std::vector<std::vector<s2>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const s4 &v1, const double &v2) {
    double v7 = v2;
    const s0 v10 = v1.p1;
    const double v19 = v2 / v2;
    const std::vector<std::vector<double>> v17 = v10.p0;
    const double v18 = v10.p1;
    const double v20 = v18 / v2;
    const s0 v28(v17, v19);
    const std::vector<std::vector<double>> v37 = v28.p0;
    const s0 v34(v37, v19);
    const double v45 = v20 / v19;
    const double v103 = v34.p1;
    double v82 = v103;
    const double v99 = v18 - v7;
    const double v109 = v45 + v82;
    const double v137 = v99 * v109;
    return v137;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    s4 v1({ { { { 1.0 }, { 2.0 }, { 3.0 } }, 4.0 }, { { { 5.0 }, { 6.0 }, { 7.0 } }, 8.0 }, { { { { { { 9.0 }, { 10.0 }, { 11.0 } }, 12.0 }, { { { { 13.0 }, { 14.0 }, { 15.0 } }, 16.0 }, { { { 17.0 }, { 18.0 }, { 19.0 } }, 20.0 } } } }, { { { { { 21.0 }, { 22.0 }, { 23.0 } }, 24.0 }, { { { { 25.0 }, { 26.0 }, { 27.0 } }, 28.0 }, { { { 29.0 }, { 30.0 }, { 31.0 } }, 32.0 } } } } } });
    double v2(33.0);
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
