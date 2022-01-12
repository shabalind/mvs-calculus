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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    s0 p1;
    std::vector<s1> p2;
    s4(s0 v0, s0 v1, std::vector<s1> v2): p0(v0), p1(v1), p2(v2) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const s2 &v1, const s4 &v2, const double &v3) {
    const double v6 = v3 - v3;
    const s0 v5 = v2.p1;
    const std::vector<std::vector<double>> v10 = v5.p0;
    const std::vector<double> v19 = v10[2];
    const double v12 = v19[0];
    double v17 = v12;
    const double v98 = v17 * v6;
    const std::vector<double> v56 = v10[1];
    const double v62 = v56[0];
    const double v81 = v62 - v98;
    return v81;
  }
  int main() {
    s2 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } } });
    s2 v1({ { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } });
    s4 v2({ { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } }, { { { { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } }, { { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } } } }, { { { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } } }, { { { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } } } }, { { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } } }, { { { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 } } } } } } } });
    double v3(68.0);
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
