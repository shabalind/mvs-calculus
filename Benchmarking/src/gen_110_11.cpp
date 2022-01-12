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
    s0 p2;
    std::vector<s0> p3;
    std::vector<std::vector<s0>> p4;
    s0 p5;
    s1(std::vector<s0> v0, s0 v1, s0 v2, std::vector<s0> v3, std::vector<std::vector<s0>> v4, s0 v5): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5) { }
  };
  struct s2 {
    std::vector<std::vector<s1>> p0;
    std::vector<s0> p1;
    s2(std::vector<std::vector<s1>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s1 p0;
    s0 p1;
    s6(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f31(const double &v0) {
    double v2 = v0;
    double v7 = v2;
    double v1 = v2;
    double v3 = v7;
    double v6 = v2;
    double v13 = v7;
    double v5 = v0;
    double v11 = v3;
    double v10 = v0;
    double v8 = v10;
    double v31 = v1;
    double v19 = v13;
    const std::vector<double> v18 { v1, v11, v1, v10, v8, v0, v19 };
    const double v17 = v18[5];
    std::vector<double> v21 = v18;
    v21[2] = v11;
    const double v27 = v18[0];
    const double v33 = v5 - v27;
    const double v44 = v21[5];
    const double v43 = v18[4];
    const double v41 = v19 + v13;
    v21[6] = v17;
    double v93 = v6;
    v21[6] = v93;
    const std::vector<double> v28 { v44, v8, v0, v41, v43 };
    v21[0] = v11;
    std::vector<double> v22 = v28;
    v22[4] = v33;
    v22[0] = v7;
    const double v116 = v22[1];
    v21[3] = v31;
    return v116;
  }
  __attribute__((noinline))
  double f0(const std::vector<s6> &v0, const s2 &v1, const double &v2) {
    const double v3 = f31(v2);
    double v6 = v2;
    double v7 = v2;
    v6 = v2;
    v7 = v3;
    v6 = v7;
    return v6;
  }
  int main() {
    std::vector<s6> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } } }, { { { { { { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 } } }, { { { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 } } } }, { { { { { 33.0 }, { 34.0 } }, { { 35.0 } } } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 } } } }, { { { 39.0 }, { 40.0 } }, { { 41.0 } } } }, { { { { { { 42.0 }, { 43.0 } }, { { 44.0 } } } }, { { { 45.0 }, { 46.0 } }, { { 47.0 } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 } } }, { { { { 51.0 }, { 52.0 } }, { { 53.0 } } } }, { { { { { 54.0 }, { 55.0 } }, { { 56.0 } } } } }, { { { 57.0 }, { 58.0 } }, { { 59.0 } } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 } } } } });
    s2 v1({ { { { { { { { 63.0 }, { 64.0 } }, { { 65.0 } } } }, { { { 66.0 }, { 67.0 } }, { { 68.0 } } }, { { { 69.0 }, { 70.0 } }, { { 71.0 } } }, { { { { 72.0 }, { 73.0 } }, { { 74.0 } } } }, { { { { { 75.0 }, { 76.0 } }, { { 77.0 } } } } }, { { { 78.0 }, { 79.0 } }, { { 80.0 } } } } }, { { { { { { 81.0 }, { 82.0 } }, { { 83.0 } } } }, { { { 84.0 }, { 85.0 } }, { { 86.0 } } }, { { { 87.0 }, { 88.0 } }, { { 89.0 } } }, { { { { 90.0 }, { 91.0 } }, { { 92.0 } } } }, { { { { { 93.0 }, { 94.0 } }, { { 95.0 } } } } }, { { { 96.0 }, { 97.0 } }, { { 98.0 } } } } }, { { { { { { 99.0 }, { 100.0 } }, { { 101.0 } } } }, { { { 102.0 }, { 103.0 } }, { { 104.0 } } }, { { { 105.0 }, { 106.0 } }, { { 107.0 } } }, { { { { 108.0 }, { 109.0 } }, { { 110.0 } } } }, { { { { { 111.0 }, { 112.0 } }, { { 113.0 } } } } }, { { { 114.0 }, { 115.0 } }, { { 116.0 } } } } } }, { { { { 117.0 }, { 118.0 } }, { { 119.0 } } }, { { { 120.0 }, { 121.0 } }, { { 122.0 } } }, { { { 123.0 }, { 124.0 } }, { { 125.0 } } } } });
    double v2(126.0);
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
