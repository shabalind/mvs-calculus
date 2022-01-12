  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<double> p1;
    s2(std::vector<s0> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s2 p0;
    s2 p1;
    s4(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const std::vector<std::vector<s1>> &v1, const std::vector<s4> &v2, const std::vector<std::vector<s0>> &v3, const double &v4) {
    double v6 = v4;
    const s4 v5 = v2[1];
    const s2 v18 = v5.p1;
    const std::vector<double> v38 = v18.p1;
    double v109 = v4;
    const double v49 = v38[0];
    double v71 = v109;
    const double v85 = v49 * v6;
    const double v107 = v85 + v6;
    const double v54 = v71 * v85;
    const double v86 = v54 + v107;
    return v86;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } });
    std::vector<std::vector<s1>> v1({ { { { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } } });
    std::vector<s4> v2({ { { { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { 24.0, 25.0 } }, { { { { { 26.0 }, { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 } } } }, { 34.0, 35.0 } } }, { { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } }, { 44.0, 45.0 } }, { { { { { 46.0 }, { 47.0 }, { 48.0 } }, { { 49.0 } } }, { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 } } } }, { 54.0, 55.0 } } } });
    std::vector<std::vector<s0>> v3({ { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } } } });
    double v4(64.0);
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
