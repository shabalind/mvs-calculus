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
    s1(s0 v0, s0 v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const std::vector<std::vector<s0>> &v1, const s1 &v2, const double &v3) {
    const std::vector<s0> v8 = v1[1];
    const s0 v9 = v8[0];
    const std::vector<double> v15 { v3, v3, v3, v3 };
    const std::vector<std::vector<double>> v13 = v9.p1;
    const std::vector<double> v40 = v13[1];
    const double v49 = v40[0];
    std::vector<double> v60 = v40;
    const double v86 = v15[0];
    const double v137 = v3 + v49;
    const std::vector<double> v100 { v3, v86 };
    v60[0] = v137;
    const double v253 = v60[0];
    const double v118 = v100[0];
    const double v179 = v118 / v253;
    return v179;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } } });
    std::vector<std::vector<s0>> v1({ { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } } });
    s1 v2({ { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } }, { { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } } } });
    double v3(45.0);
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
