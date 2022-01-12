  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    std::vector<s1> p1;
    s3(s1 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s3 p0;
    s2 p1;
    s4(s3 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s1 p0;
    s6(s1 v0): p0(v0) { }
  };
  struct s8 {
    std::vector<s1> p0;
    std::vector<s1> p1;
    s2 p2;
    std::vector<std::vector<s2>> p3;
    s2 p4;
    s6 p5;
    double p6;
    s8(std::vector<s1> v0, std::vector<s1> v1, s2 v2, std::vector<std::vector<s2>> v3, s2 v4, s6 v5, double v6): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6) { }
  };
  s2 f88(const s2 &v0) {
    s2 v3 = v0;
    s2 v5 = v3;
    const std::vector<s2> v2 { v3, v3 };
    const std::vector<s2> v6 { v5, v0, v5, v3, v5, v0, v0 };
    v5 = v0;
    std::vector<s2> v1 = v6;
    std::vector<s2> v8 = v6;
    const std::vector<s0> v7 = v3.p0;
    const s0 v14 = v5.p1;
    v8[5] = v5;
    s2 v11 = v5;
    const double v10 = v14.p0;
    const s2 v9 = v2[1];
    const s0 v12 = v7[1];
    const std::vector<std::vector<double>> v13 = v14.p1;
    const s0 v19(v10, v13);
    v8[2] = v0;
    v1[0] = v11;
    v8[4] = v3;
    const s2 v25 = v6[0];
    const std::vector<s0> v17 = v9.p0;
    v1[4] = v0;
    v5.p0 = v17;
    const s2 v24(v7, v14);
    v11.p0 = v7;
    v8[5] = v25;
    s2 v22 = v24;
    v3.p0 = v17;
    std::vector<s2> v21 = v1;
    const std::vector<s0> v50 = v24.p0;
    const s2 v54 = v8[1];
    s2 v37 = v54;
    const s0 v67 = v50[1];
    const std::vector<s0> v49 = v3.p0;
    std::vector<s2> v53 = v8;
    v3.p1 = v12;
    v3.p1 = v19;
    s2 v31 = v22;
    v31.p0 = v49;
    v37.p0 = v50;
    v21 = v53;
    v3.p0 = v50;
    const s2 v70 = v21[0];
    v11.p0 = v50;
    v8[2] = v31;
    v53[4] = v37;
    v8[2] = v70;
    v11.p1 = v67;
    const std::vector<s0> v142 = v5.p0;
    v3.p0 = v142;
    return v37;
  }
  s0 f36(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p1;
    s0 v2 = v0;
    const double v11 = v2.p0;
    const s0 v7(v11, v6);
    const std::vector<std::vector<double>> v8 = v7.p1;
    s0 v3 = v2;
    v2.p1 = v8;
    const std::vector<s0> v22 { v3, v2, v2, v2 };
    const s0 v16 = v22[3];
    return v16;
  }
  s0 f15(const s0 &v0, const s4 &v1) {
    const s0 v4 = f36(v0);
    const s0 v2 = f36(v4);
    s0 v8 = v2;
    v8 = v2;
    return v8;
  }
  s2 f1(const s2 &v0) {
    s2 v5 = v0;
    const s2 v11 = f88(v5);
    const s2 v38 = f88(v11);
    return v38;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const std::vector<s8> &v1, const double &v2) {
    const s4 v7 = v0[0];
    const s4 v18 = v0[0];
    const s2 v11 = v7.p1;
    const s2 v13 = f88(v11);
    const s2 v14 = f1(v13);
    const s2 v23 = f88(v14);
    const std::vector<s0> v41 = v23.p0;
    const s0 v45 = v41[1];
    const s0 v24 = f15(v45, v18);
    const std::vector<std::vector<double>> v46 = v24.p1;
    const std::vector<double> v58 = v46[0];
    const double v88 = v58[0];
    return v88;
  }
  int main() {
    std::vector<s4> v0({ { { { { 0.0, { { 1.0 } } }, { 2.0, { { 3.0 } } } }, { { { 4.0, { { 5.0 } } }, { 6.0, { { 7.0 } } } } } }, { { { 8.0, { { 9.0 } } }, { 10.0, { { 11.0 } } } }, { 12.0, { { 13.0 } } } } }, { { { { 14.0, { { 15.0 } } }, { 16.0, { { 17.0 } } } }, { { { 18.0, { { 19.0 } } }, { 20.0, { { 21.0 } } } } } }, { { { 22.0, { { 23.0 } } }, { 24.0, { { 25.0 } } } }, { 26.0, { { 27.0 } } } } } });
    std::vector<s8> v1({ { { { { 28.0, { { 29.0 } } }, { 30.0, { { 31.0 } } } }, { { 32.0, { { 33.0 } } }, { 34.0, { { 35.0 } } } } }, { { { 36.0, { { 37.0 } } }, { 38.0, { { 39.0 } } } }, { { 40.0, { { 41.0 } } }, { 42.0, { { 43.0 } } } } }, { { { 44.0, { { 45.0 } } }, { 46.0, { { 47.0 } } } }, { 48.0, { { 49.0 } } } }, { { { { { 50.0, { { 51.0 } } }, { 52.0, { { 53.0 } } } }, { 54.0, { { 55.0 } } } } }, { { { { 56.0, { { 57.0 } } }, { 58.0, { { 59.0 } } } }, { 60.0, { { 61.0 } } } } }, { { { { 62.0, { { 63.0 } } }, { 64.0, { { 65.0 } } } }, { 66.0, { { 67.0 } } } } } }, { { { 68.0, { { 69.0 } } }, { 70.0, { { 71.0 } } } }, { 72.0, { { 73.0 } } } }, { { { 74.0, { { 75.0 } } }, { 76.0, { { 77.0 } } } } }, 78.0 }, { { { { 79.0, { { 80.0 } } }, { 81.0, { { 82.0 } } } }, { { 83.0, { { 84.0 } } }, { 85.0, { { 86.0 } } } } }, { { { 87.0, { { 88.0 } } }, { 89.0, { { 90.0 } } } }, { { 91.0, { { 92.0 } } }, { 93.0, { { 94.0 } } } } }, { { { 95.0, { { 96.0 } } }, { 97.0, { { 98.0 } } } }, { 99.0, { { 100.0 } } } }, { { { { { 101.0, { { 102.0 } } }, { 103.0, { { 104.0 } } } }, { 105.0, { { 106.0 } } } } }, { { { { 107.0, { { 108.0 } } }, { 109.0, { { 110.0 } } } }, { 111.0, { { 112.0 } } } } }, { { { { 113.0, { { 114.0 } } }, { 115.0, { { 116.0 } } } }, { 117.0, { { 118.0 } } } } } }, { { { 119.0, { { 120.0 } } }, { 121.0, { { 122.0 } } } }, { 123.0, { { 124.0 } } } }, { { { 125.0, { { 126.0 } } }, { 127.0, { { 128.0 } } } } }, 129.0 } });
    double v2(130.0);
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
