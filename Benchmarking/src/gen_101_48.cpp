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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s2(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s2 p1;
    std::vector<s0> p2;
    s3(s1 v0, s2 v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s4 {
    std::vector<s3> p0;
    s1 p1;
    s4(std::vector<s3> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<double> p0;
    s2 p1;
    s7(std::vector<double> v0, s2 v1): p0(v0), p1(v1) { }
  };
  double f110(const double &v0) {
    const double v6 = v0 - v0;
    double v2 = v0;
    double v8 = v2;
    double v7 = v6;
    v7 = v8;
    const std::vector<double> v14 { v7 };
    const std::vector<std::vector<double>> v32 { v14, v14, v14, v14, v14, v14, v14 };
    const std::vector<double> v43 = v32[4];
    std::vector<double> v36 = v43;
    const double v35 = v36[0];
    return v35;
  }
  s7 f83(const s7 &v0) {
    const s2 v3 = v0.p1;
    const std::vector<s0> v1 = v3.p0;
    const s0 v4 = v1[1];
    const std::vector<std::vector<double>> v10 = v4.p0;
    const std::vector<double> v36 = v0.p0;
    const std::vector<double> v35 = v10[1];
    const double v32 = v35[0];
    std::vector<double> v48 = v36;
    v48[1] = v32;
    const s7 v130(v48, v3);
    return v130;
  }
  s7 f80(const s7 &v0) {
    const s2 v2 = v0.p1;
    s7 v3 = v0;
    const s7 v5 = f83(v3);
    const s7 v19 = f83(v3);
    const std::vector<double> v30 = v5.p0;
    const s7 v41 = f83(v19);
    std::vector<double> v57 = v30;
    const double v25 = v57[0];
    v3.p0 = v57;
    v57[0] = v25;
    std::vector<double> v46 = v30;
    const std::vector<double> v31 = v41.p0;
    const std::vector<std::vector<double>> v158 { v30, v31, v46, v31, v57, v31, v30 };
    const std::vector<double> v54 = v158[1];
    const s7 v173(v54, v2);
    s7 v143 = v173;
    return v143;
  }
  s7 f70(const s7 &v0) {
    const s2 v4 = v0.p1;
    const s7 v3 = f80(v0);
    const s7 v5 = f83(v0);
    const s2 v29 = v5.p1;
    const s2 v23 = v5.p1;
    const std::vector<s0> v16 = v23.p0;
    s7 v25 = v3;
    const std::vector<s0> v21 = v23.p1;
    const s2 v13 = v0.p1;
    const s0 v17 = v16[0];
    v25.p1 = v4;
    const s2 v26(v21, v21);
    std::vector<s0> v27 = v16;
    const std::vector<s0> v34 = v26.p1;
    v25.p1 = v29;
    const s2 v61 = v25.p1;
    const std::vector<s0> v78 = v61.p0;
    const s0 v74 = v34[0];
    const s2 v43(v27, v78);
    v27[0] = v17;
    v27[1] = v74;
    s7 v98 = v3;
    v25.p1 = v29;
    const s0 v118 = v34[1];
    s0 v82 = v118;
    v25 = v98;
    s7 v107 = v5;
    v107.p1 = v43;
    v25.p1 = v13;
    v27[0] = v82;
    v25.p1 = v23;
    const std::vector<std::vector<double>> v187 = v17.p0;
    v82.p0 = v187;
    return v107;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const s7 &v1, const double &v2) {
    const s7 v3 = f70(v1);
    const std::vector<double> v8 = v3.p0;
    const double v4 = v8[0];
    const double v12 = v4 / v2;
    const s2 v18 = v1.p1;
    s2 v61 = v18;
    const std::vector<s0> v24 = v61.p0;
    const s0 v17 = v24[0];
    double v50 = v4;
    const std::vector<std::vector<double>> v73 = v17.p0;
    const std::vector<double> v78 = v73[2];
    const double v62 = v78[0];
    const double v74 = v12 - v50;
    v50 = v62;
    const double v96 = v2 - v74;
    const double v271 = f110(v96);
    return v271;
  }
  int main() {
    s4 v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } }, { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } }, { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } } } }, { { { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } }, { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } } } }, { { { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } }, { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } } }, { { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } }, { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 }, { 100.0 }, { 101.0 } } } } }, { { { { 102.0 }, { 103.0 }, { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } } } } }, { { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 }, { 112.0 }, { 113.0 } } }, { { { { 114.0 }, { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } }, { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 }, { 125.0 } } }, { { { 126.0 }, { 127.0 }, { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } } } } });
    s7 v1({ { 132.0, 133.0 }, { { { { { 134.0 }, { 135.0 }, { 136.0 } }, { { 137.0 }, { 138.0 }, { 139.0 } } }, { { { 140.0 }, { 141.0 }, { 142.0 } }, { { 143.0 }, { 144.0 }, { 145.0 } } } }, { { { { 146.0 }, { 147.0 }, { 148.0 } }, { { 149.0 }, { 150.0 }, { 151.0 } } }, { { { 152.0 }, { 153.0 }, { 154.0 } }, { { 155.0 }, { 156.0 }, { 157.0 } } } } } });
    double v2(158.0);
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
