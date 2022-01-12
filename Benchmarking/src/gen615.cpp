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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<double> p1;
    s2(s0 v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s2> p0;
    s2 p1;
    s4(std::vector<s2> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s0 p0;
    std::vector<s4> p1;
    s7(s0 v0, std::vector<s4> v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s7 p0;
    s1 p1;
    s8(s7 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s10 {
    std::vector<s1> p0;
    s0 p1;
    s10(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s11 {
    std::vector<s10> p0;
    s0 p1;
    s11(std::vector<s10> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f57(const double &v0) {
    const std::vector<double> v6 { v0, v0, v0, v0 };
    std::vector<double> v3 = v6;
    v3 = v6;
    const double v5 = v0 + v0;
    double v4 = v5;
    const double v9 = v3[1];
    double v7 = v4;
    const double v1 = v3[0];
    v4 = v5;
    v3[2] = v4;
    double v23 = v7;
    const double v11 = v9 * v1;
    double v22 = v1;
    std::vector<double> v8 = v6;
    const double v10 = v0 / v23;
    const double v14 = v8[1];
    double v19 = v4;
    double v21 = v10;
    v22 = v19;
    double v38 = v11;
    const std::vector<double> v32 { v5, v4 };
    std::vector<double> v51 = v32;
    v8[0] = v22;
    std::vector<double> v24 = v51;
    const double v41 = v32[0];
    const double v37 = v32[0];
    const std::vector<double> v55 { v0, v21, v41 };
    std::vector<double> v73 = v32;
    std::vector<double> v31 = v55;
    std::vector<double> v46 = v51;
    v24[0] = v37;
    const std::vector<std::vector<double>> v147 { v46, v73, v24, v73 };
    const std::vector<double> v84 = v147[1];
    std::vector<std::vector<double>> v74 = v147;
    double v63 = v38;
    std::vector<double> v61 = v55;
    const std::vector<double> v54 = v74[3];
    v51[1] = v63;
    const double v103 = v54[0];
    v46[0] = v14;
    const double v80 = v61[0];
    v19 = v37;
    const double v151 = v8[0];
    const double v133 = v31[2];
    const double v93 = v80 / v103;
    v73 = v84;
    v46[1] = v37;
    v8[2] = v151;
    v4 = v133;
    return v93;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s8>> &v0, const s11 &v1, const s1 &v2, const double &v3) {
    double v11 = v3;
    double v18 = v11;
    const double v25 = f57(v18);
    return v25;
  }
  int main() {
    std::vector<std::vector<s8>> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { 10.0, 11.0 } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 } } }, { 17.0, 18.0 } } }, { { { { { { 19.0 }, { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } }, { 24.0, 25.0 } } }, { { { { 26.0 }, { 27.0 }, { 28.0 } }, { { 29.0 }, { 30.0 } } }, { 31.0, 32.0 } } }, { { { { { { 33.0 }, { 34.0 }, { 35.0 } }, { { 36.0 }, { 37.0 } } }, { 38.0, 39.0 } } }, { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } }, { 45.0, 46.0 } } } } }, { { { { { 47.0 }, { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } } }, { { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 }, { 56.0 } } } } } } } });
    s11 v1({ { { { { { { { { 57.0 }, { 58.0 }, { 59.0 } }, { { 60.0 }, { 61.0 } } } }, { { { { 62.0 }, { 63.0 }, { 64.0 } }, { { 65.0 }, { 66.0 } } } } }, { { { { { 67.0 }, { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } } }, { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 } } } } } }, { { { 77.0 }, { 78.0 }, { 79.0 } }, { { 80.0 }, { 81.0 } } } }, { { { { { { { 82.0 }, { 83.0 }, { 84.0 } }, { { 85.0 }, { 86.0 } } } }, { { { { 87.0 }, { 88.0 }, { 89.0 } }, { { 90.0 }, { 91.0 } } } } }, { { { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 }, { 96.0 } } } }, { { { { 97.0 }, { 98.0 }, { 99.0 } }, { { 100.0 }, { 101.0 } } } } } }, { { { 102.0 }, { 103.0 }, { 104.0 } }, { { 105.0 }, { 106.0 } } } }, { { { { { { { 107.0 }, { 108.0 }, { 109.0 } }, { { 110.0 }, { 111.0 } } } }, { { { { 112.0 }, { 113.0 }, { 114.0 } }, { { 115.0 }, { 116.0 } } } } }, { { { { { 117.0 }, { 118.0 }, { 119.0 } }, { { 120.0 }, { 121.0 } } } }, { { { { 122.0 }, { 123.0 }, { 124.0 } }, { { 125.0 }, { 126.0 } } } } } }, { { { 127.0 }, { 128.0 }, { 129.0 } }, { { 130.0 }, { 131.0 } } } } }, { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 }, { 136.0 } } } });
    s1 v2({ { { { { 137.0 }, { 138.0 }, { 139.0 } }, { { 140.0 }, { 141.0 } } } }, { { { { 142.0 }, { 143.0 }, { 144.0 } }, { { 145.0 }, { 146.0 } } } } });
    double v3(147.0);
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
