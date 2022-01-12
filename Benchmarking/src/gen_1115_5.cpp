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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s0> p0;
    s0 p1;
    s5(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    std::vector<s0> p0;
    std::vector<s5> p1;
    s8(std::vector<s0> v0, std::vector<s5> v1): p0(v0), p1(v1) { }
  };
  double f40(const double &v0) {
    double v4 = v0;
    double v7 = v4;
    v7 = v0;
    double v6 = v0;
    double v5 = v0;
    const double v2 = v6 + v7;
    double v11 = v6;
    const std::vector<double> v12 { v11, v5 };
    double v14 = v2;
    std::vector<double> v21 = v12;
    std::vector<double> v25 = v21;
    const double v41 = v25[1];
    v25[1] = v14;
    return v41;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s8 &v1, const double &v2) {
    const s0 v9 = v0.p0;
    const std::vector<std::vector<double>> v60 = v9.p0;
    double v31 = v2;
    const std::vector<double> v42 = v60[0];
    const double v45 = f40(v31);
    const double v82 = v42[0];
    std::vector<double> v32 = v42;
    v32[0] = v82;
    std::vector<double> v55 = v32;
    const double v87 = v55[0];
    const double v86 = f40(v45);
    v32[0] = v86;
    v32[0] = v2;
    return v87;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } } });
    s8 v1({ { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } }, { { { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } } }, { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } } }, { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } } } } });
    double v2(55.0);
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
