  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    std::vector<std::vector<double>> p5;
    std::vector<std::vector<double>> p6;
    std::vector<std::vector<double>> p7;
    s0(std::vector<std::vector<double>> v0, double v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4, std::vector<std::vector<double>> v5, std::vector<std::vector<double>> v6, std::vector<std::vector<double>> v7): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6), p7(v7) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s1 f84(const s1 &v0) {
    s1 v5 = v0;
    const std::vector<s0> v7 = v5.p0;
    s1 v4 = v0;
    const s0 v12 = v5.p1;
    s0 v3 = v12;
    const s0 v11 = v0.p1;
    const s0 v2 = v7[1];
    const std::vector<s0> v8 = v4.p0;
    const s0 v16 = v4.p1;
    s1 v10 = v4;
    s0 v25 = v16;
    s1 v20 = v5;
    const std::vector<s0> v14 = v4.p0;
    const std::vector<s0> v18 = v20.p0;
    const s1 v13(v18, v25);
    const std::vector<std::vector<double>> v26 = v25.p4;
    v4.p1 = v2;
    std::vector<std::vector<double>> v29 = v26;
    const std::vector<std::vector<double>> v23 = v3.p4;
    s1 v37 = v4;
    const s0 v45 = v10.p1;
    std::vector<std::vector<double>> v28 = v23;
    v10.p1 = v11;
    v10.p0 = v8;
    const s0 v55 = v0.p1;
    v5.p1 = v45;
    const s0 v60 = v14[1];
    v3.p4 = v29;
    const s0 v31 = v13.p1;
    const std::vector<s1> v39 { v4, v0, v13, v37, v20, v13, v10 };
    v37.p1 = v55;
    const s1 v63 = v39[0];
    v4.p0 = v7;
    v25.p4 = v28;
    const std::vector<double> v83 = v23[0];
    const std::vector<s1> v64 { v13, v0, v63, v10 };
    std::vector<s1> v163 = v64;
    v163[3] = v37;
    v37.p1 = v31;
    v3.p6 = v23;
    v4.p0 = v8;
    const s1 v96 = v39[2];
    const s1 v178 = v163[3];
    v28[0] = v83;
    v10.p1 = v60;
    v163[0] = v96;
    return v178;
  }
  std::vector<double> f79(const std::vector<double> &v0) {
    std::vector<double> v5 = v0;
    std::vector<double> v6 = v0;
    const double v4 = v5[0];
    double v3 = v4;
    double v9 = v4;
    double v1 = v3;
    const double v2 = v0[0];
    const double v10 = v6[0];
    v5[0] = v2;
    v6[0] = v9;
    std::vector<double> v14 = v5;
    const double v17 = v5[0];
    const double v30 = v5[0];
    v5[0] = v9;
    std::vector<double> v12 = v6;
    v12 = v6;
    v12[0] = v2;
    std::vector<double> v16 = v14;
    const double v20 = v12[0];
    v16[0] = v1;
    const double v35 = v6[0];
    const std::vector<double> v13 { v9, v9, v4, v35, v10, v30, v35 };
    v16[0] = v17;
    std::vector<double> v47 = v13;
    const double v22 = v47[4];
    const double v42 = v47[3];
    v6[0] = v22;
    std::vector<double> v50 = v16;
    v50 = v6;
    v6[0] = v42;
    v47[3] = v20;
    return v50;
  }
  s0 f70(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p6;
    const std::vector<double> v4 = v5[0];
    s0 v12 = v0;
    const std::vector<double> v6 = f79(v4);
    v12.p6 = v5;
    const std::vector<std::vector<double>> v8 = v12.p0;
    std::vector<std::vector<double>> v16 = v8;
    v12 = v0;
    v16[0] = v6;
    v16[0] = v6;
    const std::vector<std::vector<double>> v22 = v0.p7;
    v12.p3 = v16;
    v12.p0 = v16;
    v12.p7 = v22;
    return v12;
  }
  s1 f60(const s1 &v0) {
    const std::vector<s1> v4 { v0, v0, v0, v0, v0, v0 };
    const s1 v2 = v4[3];
    const s1 v7 = f84(v0);
    const std::vector<s0> v3 = v7.p0;
    const s0 v19 = v3[0];
    const s1 v13(v3, v19);
    const s0 v41 = f70(v19);
    std::vector<s0> v24 = v3;
    s1 v78 = v13;
    v24[1] = v41;
    v78 = v2;
    v78.p0 = v24;
    return v78;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<std::vector<s1>> &v1, const double &v2) {
    const std::vector<s1> v5 = v1[0];
    const double v6 = v2 - v2;
    std::vector<s1> v7 = v5;
    const s1 v13 = v7[0];
    const double v20 = v2 * v2;
    const s0 v17 = v13.p1;
    const s1 v18 = f84(v13);
    const std::vector<std::vector<double>> v40 = v17.p4;
    std::vector<std::vector<double>> v34 = v40;
    double v42 = v20;
    const std::vector<double> v68 = v34[0];
    std::vector<double> v67 = v68;
    const s1 v45 = f60(v18);
    std::vector<double> v32 = v68;
    const double v80 = v6 / v42;
    v32 = v67;
    v7[0] = v45;
    std::vector<double> v94 = v32;
    const double v76 = v94[0];
    v32[0] = v80;
    const double v140 = v67[0];
    const double v208 = v140 * v76;
    return v208;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, 1.0, { { 2.0 }, { 3.0 } }, { { 4.0 } }, { { 5.0 } }, { { 6.0 }, { 7.0 } }, { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, 13.0, { { 14.0 }, { 15.0 } }, { { 16.0 } }, { { 17.0 } }, { { 18.0 }, { 19.0 } }, { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 } }, 25.0, { { 26.0 }, { 27.0 } }, { { 28.0 } }, { { 29.0 } }, { { 30.0 }, { 31.0 } }, { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } });
    std::vector<std::vector<s1>> v1({ { { { { { { 36.0 } }, 37.0, { { 38.0 }, { 39.0 } }, { { 40.0 } }, { { 41.0 } }, { { 42.0 }, { 43.0 } }, { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { 48.0 } }, 49.0, { { 50.0 }, { 51.0 } }, { { 52.0 } }, { { 53.0 } }, { { 54.0 }, { 55.0 } }, { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } }, { { { 60.0 } }, 61.0, { { 62.0 }, { 63.0 } }, { { 64.0 } }, { { 65.0 } }, { { 66.0 }, { 67.0 } }, { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } } }, { { { { { { 72.0 } }, 73.0, { { 74.0 }, { 75.0 } }, { { 76.0 } }, { { 77.0 } }, { { 78.0 }, { 79.0 } }, { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } }, { { { 84.0 } }, 85.0, { { 86.0 }, { 87.0 } }, { { 88.0 } }, { { 89.0 } }, { { 90.0 }, { 91.0 } }, { { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } }, { { { 96.0 } }, 97.0, { { 98.0 }, { 99.0 } }, { { 100.0 } }, { { 101.0 } }, { { 102.0 }, { 103.0 } }, { { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } } } }, { { { { { { 108.0 } }, 109.0, { { 110.0 }, { 111.0 } }, { { 112.0 } }, { { 113.0 } }, { { 114.0 }, { 115.0 } }, { { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } }, { { { 120.0 } }, 121.0, { { 122.0 }, { 123.0 } }, { { 124.0 } }, { { 125.0 } }, { { 126.0 }, { 127.0 } }, { { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } } }, { { { 132.0 } }, 133.0, { { 134.0 }, { 135.0 } }, { { 136.0 } }, { { 137.0 } }, { { 138.0 }, { 139.0 } }, { { 140.0 } }, { { 141.0 }, { 142.0 }, { 143.0 } } } } } });
    double v2(144.0);
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
