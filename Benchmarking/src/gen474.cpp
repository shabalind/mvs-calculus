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
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    s2 p1;
    s4(s1 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s12 {
    std::vector<s4> p0;
    s2 p1;
    s12(std::vector<s4> v0, s2 v1): p0(v0), p1(v1) { }
  };
  double f15(const double &v0) {
    const double v6 = v0 * v0;
    double v3 = v6;
    double v5 = v0;
    double v4 = v0;
    double v1 = v3;
    double v8 = v4;
    const std::vector<double> v10 { v6, v6, v0, v1 };
    const std::vector<std::vector<double>> v25 { v10, v10, v10, v10, v10 };
    const std::vector<double> v12 = v25[4];
    const std::vector<double> v18 = v25[4];
    std::vector<std::vector<double>> v14 = v25;
    std::vector<std::vector<double>> v17 = v14;
    v17[3] = v10;
    std::vector<double> v37 = v12;
    const std::vector<double> v26 = v17[3];
    v37[1] = v0;
    v14[1] = v18;
    const double v57 = v8 + v5;
    const double v41 = v12[0];
    v17[3] = v37;
    v14[4] = v12;
    std::vector<double> v24 = v26;
    v14[0] = v26;
    const double v48 = v24[3];
    v24[0] = v1;
    v24[3] = v57;
    v37[2] = v3;
    double v61 = v48;
    const double v63 = v61 * v41;
    return v63;
  }
  __attribute__((noinline))
  double f0(const std::vector<s12> &v0, const double &v1) {
    double v5 = v1;
    const double v4 = f15(v1);
    const double v3 = f15(v4);
    v5 = v3;
    double v23 = v5;
    const double v32 = f15(v23);
    v23 = v32;
    return v32;
  }
  int main() {
    std::vector<s12> v0({ { { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } }, { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } } }, { { { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } }, { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } }, { { { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } } }, { { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } } } } }, { { { { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } } }, { { { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } } } }, { { { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } } } } });
    double v1(72.0);
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
