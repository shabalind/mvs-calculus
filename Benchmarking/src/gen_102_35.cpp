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
    double p1;
    s1(s0 v0, double v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    s0 p2;
    s2(std::vector<s0> v0, s1 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s2 &v1, const std::vector<s0> &v2, const double &v3) {
    const std::vector<s0> v5 = v1.p0;
    const s0 v14 = v5[0];
    const s0 v20 = v5[0];
    const std::vector<std::vector<double>> v29 = v20.p1;
    const std::vector<double> v31 = v29[1];
    const double v52 = v31[0];
    const std::vector<std::vector<double>> v53 = v14.p0;
    const std::vector<double> v77 = v53[0];
    const double v239 = v77[0];
    const double v259 = v52 / v239;
    return v259;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } });
    s2 v1({ { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, 16.0 }, { { { 17.0 } }, { { 18.0 }, { 19.0 }, { 20.0 } } } });
    std::vector<s0> v2({ { { { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { { 25.0 } }, { { 26.0 }, { 27.0 }, { 28.0 } } }, { { { 29.0 } }, { { 30.0 }, { 31.0 }, { 32.0 } } } });
    double v3(33.0);
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
