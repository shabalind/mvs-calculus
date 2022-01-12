  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    s2 p1;
    s4(s1 v0, s2 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s4 &v0, const s1 &v1, const double &v2) {
    double v4 = v2;
    const std::vector<s0> v11 = v1.p0;
    const s0 v9 = v11[2];
    const std::vector<std::vector<double>> v35 = v9.p1;
    const std::vector<double> v10 = v35[0];
    const double v26 = v10[0];
    const double v68 = v2 * v4;
    v4 = v68;
    const double v86 = v4 + v4;
    const double v90 = v86 / v26;
    return v90;
  }
  int main() {
    s4 v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } }, { { 16.0 }, { 17.0 } } } }, { { { 18.0 } }, { { 19.0 }, { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 } }, { { 31.0 }, { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } }, { { 40.0 }, { 41.0 } } } }, { { { 42.0 } }, { { 43.0 }, { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } } }, { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 } } } } });
    s1 v1({ { { { { 54.0 } }, { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } }, { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } }, { { 64.0 }, { 65.0 } } }, { { { 66.0 } }, { { 67.0 }, { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } } }, { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } }, { { 76.0 }, { 77.0 } } } });
    double v2(78.0);
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
