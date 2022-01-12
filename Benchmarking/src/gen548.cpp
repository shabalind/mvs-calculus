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
  struct s4 {
    s1 p0;
    std::vector<s0> p1;
    s4(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<std::vector<double>> p0;
    s1 p1;
    s5(std::vector<std::vector<double>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s5 p0;
    std::vector<std::vector<s4>> p1;
    s8(s5 v0, std::vector<std::vector<s4>> v1): p0(v0), p1(v1) { }
  };
  double f101(const double &v0) {
    double v3 = v0;
    double v2 = v0;
    double v6 = v3;
    const double v4 = v3 + v6;
    double v1 = v6;
    double v9 = v3;
    const std::vector<double> v8 { v0, v9, v3, v2, v1, v6, v4 };
    const double v17 = v8[1];
    double v12 = v1;
    const double v34 = v8[4];
    const std::vector<double> v20 { v17, v17, v12, v34 };
    const std::vector<std::vector<double>> v41 { v20 };
    const std::vector<double> v48 = v41[0];
    const double v39 = v48[2];
    return v39;
  }
  double f88(const double &v0) {
    const double v4 = f101(v0);
    double v3 = v4;
    const std::vector<double> v2 { v0 };
    const double v1 = v2[0];
    std::vector<double> v5 = v2;
    std::vector<double> v10 = v2;
    v10[0] = v0;
    const double v9 = f101(v0);
    v5[0] = v0;
    const double v15 = v5[0];
    const double v13 = v10[0];
    std::vector<double> v21 = v2;
    double v19 = v3;
    v21 = v10;
    v10[0] = v19;
    const double v34 = f101(v1);
    const double v38 = v34 * v15;
    const double v24 = v21[0];
    v21[0] = v13;
    v10[0] = v9;
    v21[0] = v38;
    return v24;
  }
  __attribute__((noinline))
  double f0(const std::vector<s8> &v0, const double &v1) {
    const double v16 = v1 / v1;
    const double v68 = v16 - v1;
    const double v121 = f88(v16);
    const double v105 = v68 * v121;
    return v105;
  }
  int main() {
    std::vector<s8> v0({ { { { { 0.0 } }, { { { { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 } } } }, { { { 11.0 }, { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } }, { { { { { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 }, { 22.0 }, { 23.0 } }, { { 24.0 }, { 25.0 } } } }, { { { 26.0 }, { 27.0 }, { 28.0 } }, { { 29.0 }, { 30.0 } } } }, { { { { 31.0 }, { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } } } }, { { { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 } } }, { { { 41.0 }, { 42.0 }, { 43.0 } }, { { 44.0 }, { 45.0 } } } }, { { { 46.0 }, { 47.0 }, { 48.0 } }, { { 49.0 }, { 50.0 } } } }, { { { { 51.0 }, { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } } } } }, { { { { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 }, { 60.0 } } }, { { { 61.0 }, { 62.0 }, { 63.0 } }, { { 64.0 }, { 65.0 } } } }, { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 } } } }, { { { { 71.0 }, { 72.0 }, { 73.0 } }, { { 74.0 }, { 75.0 } } } } } } } }, { { { { 76.0 } }, { { { { { 77.0 }, { 78.0 }, { 79.0 } }, { { 80.0 }, { 81.0 } } }, { { { 82.0 }, { 83.0 }, { 84.0 } }, { { 85.0 }, { 86.0 } } } }, { { { 87.0 }, { 88.0 }, { 89.0 } }, { { 90.0 }, { 91.0 } } } } }, { { { { { { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 }, { 96.0 } } }, { { { 97.0 }, { 98.0 }, { 99.0 } }, { { 100.0 }, { 101.0 } } } }, { { { 102.0 }, { 103.0 }, { 104.0 } }, { { 105.0 }, { 106.0 } } } }, { { { { 107.0 }, { 108.0 }, { 109.0 } }, { { 110.0 }, { 111.0 } } } } } }, { { { { { { { 112.0 }, { 113.0 }, { 114.0 } }, { { 115.0 }, { 116.0 } } }, { { { 117.0 }, { 118.0 }, { 119.0 } }, { { 120.0 }, { 121.0 } } } }, { { { 122.0 }, { 123.0 }, { 124.0 } }, { { 125.0 }, { 126.0 } } } }, { { { { 127.0 }, { 128.0 }, { 129.0 } }, { { 130.0 }, { 131.0 } } } } } }, { { { { { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 }, { 136.0 } } }, { { { 137.0 }, { 138.0 }, { 139.0 } }, { { 140.0 }, { 141.0 } } } }, { { { 142.0 }, { 143.0 }, { 144.0 } }, { { 145.0 }, { 146.0 } } } }, { { { { 147.0 }, { 148.0 }, { 149.0 } }, { { 150.0 }, { 151.0 } } } } } } } } });
    double v1(152.0);
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
