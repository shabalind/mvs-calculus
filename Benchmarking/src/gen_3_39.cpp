  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<double> p3;
    std::vector<std::vector<double>> p4;
    std::vector<std::vector<double>> p5;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<double> v3, std::vector<std::vector<double>> v4, std::vector<std::vector<double>> v5): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5) { }
  };
  struct s1 {
    s0 p0;
    s1(s0 v0): p0(v0) { }
  };
  struct s4 {
    std::vector<s1> p0;
    s0 p1;
    s4(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s4>> &v0, const double &v1) {
    const std::vector<s4> v3 = v0[0];
    const s4 v5 = v3[0];
    const s0 v7 = v5.p1;
    const s0 v8 = v5.p1;
    const std::vector<std::vector<double>> v17 = v8.p2;
    const std::vector<double> v50 = v17[0];
    const std::vector<std::vector<double>> v24 = v7.p2;
    const double v20 = v50[0];
    const std::vector<double> v72 = v24[0];
    std::vector<double> v67 = v72;
    const double v211 = v67[0];
    v67[0] = v20;
    return v211;
  }
  int main() {
    std::vector<std::vector<s4>> v0({ { { { { { { { 0.0 } }, { { 1.0 } }, { { 2.0 } }, { 3.0, 4.0, 5.0 }, { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 } }, { { 14.0 } }, { 15.0, 16.0, 17.0 }, { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { 24.0 } }, { { 25.0 } }, { { 26.0 } }, { 27.0, 28.0, 29.0 }, { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } }, { { { 36.0 } }, { { 37.0 } }, { { 38.0 } }, { 39.0, 40.0, 41.0 }, { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } } });
    double v1(48.0);
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
