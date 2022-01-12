  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    double p0;
    s0 p1;
    s1(double v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<s1> p1;
    std::vector<s1> p2;
    std::vector<s0> p3;
    s2(std::vector<s1> v0, std::vector<s1> v1, std::vector<s1> v2, std::vector<s0> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s3 {
    s1 p0;
    std::vector<s0> p1;
    s3(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s3 p0;
    s0 p1;
    s4(s3 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s2> p0;
    s2 p1;
    s5(std::vector<s2> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s3 p0;
    std::vector<s1> p1;
    s8(s3 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s2 f22(const s2 &v0) {
    s2 v1 = v0;
    s2 v5 = v1;
    s2 v11 = v5;
    v11 = v0;
    return v11;
  }
  std::vector<s2> f18(const std::vector<s2> &v0) {
    const s2 v7 = v0[1];
    const s2 v5 = f22(v7);
    s2 v8 = v5;
    const s2 v10 = f22(v8);
    const std::vector<s1> v9 = v10.p0;
    v8.p0 = v9;
    const s2 v11 = f22(v10);
    v8.p0 = v9;
    v8.p0 = v9;
    const s5 v62(v0, v11);
    const std::vector<s2> v71 = v62.p0;
    return v71;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const std::vector<s2> &v1, const std::vector<s4> &v2, const double &v3) {
    const std::vector<s2> v9 = f18(v1);
    std::vector<s2> v8 = v9;
    double v7 = v3;
    const double v17 = v7 + v3;
    s3 v13 = v0;
    const s2 v14 = v8[0];
    const std::vector<s1> v22 = v14.p2;
    const s1 v16 = v22[0];
    const std::vector<s1> v28 = v14.p1;
    v8[1] = v14;
    v13.p0 = v16;
    const s8 v19(v0, v28);
    std::vector<s1> v15 = v28;
    v13.p0 = v16;
    const s8 v64(v13, v15);
    const s1 v59 = v0.p0;
    const s3 v48 = v19.p0;
    v15[0] = v59;
    const std::vector<s1> v54 = v64.p1;
    const std::vector<s1> v82 { v16, v59, v59, v16, v16, v59 };
    v13 = v48;
    const s1 v119 = v82[5];
    std::vector<s1> v90 = v54;
    v13.p0 = v119;
    const double v176 = v7 * v17;
    const s1 v130 = v90[0];
    const double v213 = v130.p0;
    v13.p0 = v59;
    double v98 = v213;
    const std::vector<double> v171 { v213, v17, v98, v98, v176, v213, v98 };
    const double v301 = v171[4];
    v90[0] = v119;
    return v301;
  }
  int main() {
    s3 v0({ { 0.0, { { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 } } } } });
    std::vector<s2> v1({ { { { 11.0, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 } } } }, { 17.0, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 } } } } }, { { 23.0, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 } } } } }, { { 29.0, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } } }, { { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } } } }, { { { 45.0, { { { 46.0 }, { 47.0 }, { 48.0 } }, { { 49.0 }, { 50.0 } } } }, { 51.0, { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 }, { 56.0 } } } } }, { { 57.0, { { { 58.0 }, { 59.0 }, { 60.0 } }, { { 61.0 }, { 62.0 } } } } }, { { 63.0, { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 }, { 68.0 } } } } }, { { { { 69.0 }, { 70.0 }, { 71.0 } }, { { 72.0 }, { 73.0 } } }, { { { 74.0 }, { 75.0 }, { 76.0 } }, { { 77.0 }, { 78.0 } } } } }, { { { 79.0, { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 }, { 84.0 } } } }, { 85.0, { { { 86.0 }, { 87.0 }, { 88.0 } }, { { 89.0 }, { 90.0 } } } } }, { { 91.0, { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 }, { 96.0 } } } } }, { { 97.0, { { { 98.0 }, { 99.0 }, { 100.0 } }, { { 101.0 }, { 102.0 } } } } }, { { { { 103.0 }, { 104.0 }, { 105.0 } }, { { 106.0 }, { 107.0 } } }, { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 }, { 112.0 } } } } } });
    std::vector<s4> v2({ { { { 113.0, { { { 114.0 }, { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 } } } }, { { { { 119.0 }, { 120.0 }, { 121.0 } }, { { 122.0 }, { 123.0 } } } } }, { { { 124.0 }, { 125.0 }, { 126.0 } }, { { 127.0 }, { 128.0 } } } }, { { { 129.0, { { { 130.0 }, { 131.0 }, { 132.0 } }, { { 133.0 }, { 134.0 } } } }, { { { { 135.0 }, { 136.0 }, { 137.0 } }, { { 138.0 }, { 139.0 } } } } }, { { { 140.0 }, { 141.0 }, { 142.0 } }, { { 143.0 }, { 144.0 } } } } });
    double v3(145.0);
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
