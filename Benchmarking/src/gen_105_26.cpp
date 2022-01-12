  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s2>> p0;
    s2 p1;
    s4(std::vector<std::vector<s2>> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<std::vector<s4>> p0;
    s0 p1;
    s6(std::vector<std::vector<s4>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s6 f8(const s6 &v0) {
    const std::vector<std::vector<s4>> v5 = v0.p0;
    const std::vector<s4> v3 = v5[0];
    const s4 v7 = v3[0];
    const s2 v18 = v7.p1;
    const s0 v54 = v18.p1;
    const s6 v87(v5, v54);
    return v87;
  }
  s6 f1(const s6 &v0) {
    const s6 v3 = f8(v0);
    s6 v2 = v3;
    const s0 v6 = v2.p1;
    s0 v4 = v6;
    s6 v13 = v0;
    const s0 v9 = v3.p1;
    s0 v8 = v9;
    s6 v12 = v13;
    v12.p1 = v8;
    v12.p1 = v4;
    return v12;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s6 &v1, const double &v2) {
    const std::vector<double> v5 { v2, v2, v2, v2, v2 };
    const double v8 = v5[3];
    s0 v4 = v0;
    const std::vector<double> v17 = v4.p1;
    const double v19 = v17[0];
    const std::vector<double> v18 = v4.p1;
    const double v33 = v8 + v19;
    const double v30 = v18[0];
    const s6 v37 = f1(v1);
    const s0 v22 = v37.p1;
    const std::vector<std::vector<double>> v32 = v22.p0;
    const std::vector<double> v34 = v32[2];
    const double v49 = v34[0];
    const std::vector<double> v86 { v33, v49, v2, v2, v30 };
    const double v95 = v86[1];
    return v95;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { 3.0, 4.0 }, { { 5.0 } } });
    s6 v1({ { { { { { { { { { { 6.0 }, { 7.0 }, { 8.0 } }, { 9.0, 10.0 }, { { 11.0 } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { 15.0, 16.0 }, { { 17.0 } } } } }, { { { { { { 18.0 }, { 19.0 }, { 20.0 } }, { 21.0, 22.0 }, { { 23.0 } } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { 27.0, 28.0 }, { { 29.0 } } } } }, { { { { { { 30.0 }, { 31.0 }, { 32.0 } }, { 33.0, 34.0 }, { { 35.0 } } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { 39.0, 40.0 }, { { 41.0 } } } } } }, { { { { { 42.0 }, { 43.0 }, { 44.0 } }, { 45.0, 46.0 }, { { 47.0 } } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { 51.0, 52.0 }, { { 53.0 } } } } } }, { { { { { { { { { 54.0 }, { 55.0 }, { 56.0 } }, { 57.0, 58.0 }, { { 59.0 } } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { 63.0, 64.0 }, { { 65.0 } } } } }, { { { { { { 66.0 }, { 67.0 }, { 68.0 } }, { 69.0, 70.0 }, { { 71.0 } } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { 75.0, 76.0 }, { { 77.0 } } } } }, { { { { { { 78.0 }, { 79.0 }, { 80.0 } }, { 81.0, 82.0 }, { { 83.0 } } } }, { { { 84.0 }, { 85.0 }, { 86.0 } }, { 87.0, 88.0 }, { { 89.0 } } } } } }, { { { { { 90.0 }, { 91.0 }, { 92.0 } }, { 93.0, 94.0 }, { { 95.0 } } } }, { { { 96.0 }, { 97.0 }, { 98.0 } }, { 99.0, 100.0 }, { { 101.0 } } } } } } }, { { { 102.0 }, { 103.0 }, { 104.0 } }, { 105.0, 106.0 }, { { 107.0 } } } });
    double v2(108.0);
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
