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
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    std::vector<s0> p1;
    s5(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s5 &v0, const std::vector<s2> &v1, const double &v2) {
    const s2 v6 = v1[0];
    const s0 v9 = v6.p1;
    const s2 v15 = v1[1];
    const std::vector<std::vector<double>> v4 = v9.p1;
    std::vector<std::vector<double>> v19 = v4;
    const std::vector<double> v11 = v19[0];
    const double v21 = v11[0];
    const s1 v24 = v15.p0;
    const std::vector<double> v22 = v4[0];
    v19[0] = v22;
    const std::vector<double> v53 { v2, v21, v21 };
    const s0 v27 = v24.p0;
    std::vector<double> v18 = v53;
    const std::vector<std::vector<double>> v17 = v27.p0;
    const std::vector<double> v30 = v17[1];
    const double v26 = v18[2];
    const double v115 = v18[2];
    v18[2] = v115;
    v19[0] = v30;
    const double v85 = v30[0];
    const std::vector<double> v55 { v26, v85 };
    const double v90 = v18[2];
    const double v128 = v55[0];
    const double v162 = v90 - v128;
    return v162;
  }
  int main() {
    s5 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } } });
    std::vector<s2> v1({ { { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } }, { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } } }, { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } }, { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } } } });
    double v2(48.0);
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
