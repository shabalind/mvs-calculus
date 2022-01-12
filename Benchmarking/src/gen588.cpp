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
    std::vector<s1> p1;
    s2(s1 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s2 p1;
    s3(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s1>> p0;
    s1 p1;
    s4(std::vector<std::vector<s1>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  s1 f103(const s1 &v0) {
    s1 v7 = v0;
    const s0 v4 = v0.p0;
    s0 v5 = v4;
    s0 v2 = v4;
    s1 v3 = v7;
    const std::vector<std::vector<double>> v9 = v2.p0;
    s0 v6 = v4;
    const s0 v1 = v3.p0;
    const std::vector<double> v12 = v9[0];
    const s0 v8 = v3.p1;
    const std::vector<s1> v16 { v7, v0, v3, v7, v7, v7, v0 };
    v5.p0 = v9;
    const s1 v11 = v16[5];
    std::vector<s1> v26 = v16;
    const s0 v24 = v7.p1;
    v26[0] = v11;
    const std::vector<double> v23 = v9[0];
    const std::vector<std::vector<double>> v17 = v8.p0;
    v26[5] = v0;
    const s1 v22(v5, v4);
    const std::vector<std::vector<s1>> v29 { v26 };
    const s1 v56 = v16[2];
    const std::vector<std::vector<double>> v32 = v4.p0;
    std::vector<std::vector<s1>> v25 = v29;
    const s0 v42 = v7.p0;
    v6.p0 = v17;
    const std::vector<std::vector<double>> v34 = v4.p1;
    v6.p0 = v9;
    v26[1] = v3;
    v6.p0 = v17;
    const std::vector<s1> v31 = v25[0];
    s1 v50 = v22;
    s1 v45 = v0;
    std::vector<std::vector<double>> v73 = v32;
    const s1 v60(v5, v6);
    v26[3] = v60;
    v2.p0 = v9;
    v7 = v11;
    const std::vector<s1> v52 = v25[0];
    std::vector<s1> v92 = v31;
    v26[2] = v0;
    const s0 v41 = v11.p0;
    const s0 v65 = v50.p0;
    v7.p0 = v65;
    v25[0] = v92;
    v92[2] = v11;
    v5.p0 = v73;
    s1 v113 = v56;
    std::vector<std::vector<double>> v140 = v34;
    const std::vector<s1> v78 = v29[0];
    v6.p1 = v140;
    v92[5] = v113;
    v45.p1 = v42;
    const s0 v151 = v45.p0;
    v50.p0 = v6;
    v73[0] = v23;
    v25[0] = v78;
    v140[2] = v12;
    v7.p0 = v1;
    v45.p0 = v4;
    v50.p1 = v41;
    v3.p0 = v24;
    v3.p0 = v151;
    const s1 v108 = v52[4];
    return v108;
  }
  s4 f80(const s4 &v0) {
    s4 v2 = v0;
    const std::vector<std::vector<s1>> v4 = v0.p0;
    const s1 v11 = v0.p1;
    const s1 v37 = f103(v11);
    v2 = v0;
    v2.p0 = v4;
    s4 v133 = v2;
    const std::vector<std::vector<s1>> v121 = v133.p0;
    const s4 v210(v121, v37);
    return v210;
  }
  s4 f73(const s4 &v0) {
    s4 v9 = v0;
    const std::vector<std::vector<s1>> v34 = v9.p0;
    const s4 v48 = f80(v9);
    v9.p0 = v34;
    return v48;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const std::vector<std::vector<s3>> &v1, const double &v2) {
    const s4 v16 = f73(v0);
    const s1 v17 = v16.p1;
    const s0 v24 = v17.p1;
    const std::vector<std::vector<double>> v54 = v24.p1;
    const std::vector<double> v31 = v54[1];
    std::vector<double> v170 = v31;
    std::vector<double> v152 = v170;
    const double v145 = v152[0];
    return v145;
  }
  int main() {
    s4 v0({ { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } } }, { { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } });
    std::vector<std::vector<s3>> v1({ { { { { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } }, { { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } }, { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } } } } }, { { { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } } }, { { { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } }, { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } }, { { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } }, { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } }, { { { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } }, { { { 84.0 } }, { { 85.0 }, { 86.0 }, { 87.0 } } } } } } } }, { { { { { { { 88.0 } }, { { 89.0 }, { 90.0 }, { 91.0 } } }, { { { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } }, { { { { { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } }, { { { 100.0 } }, { { 101.0 }, { 102.0 }, { 103.0 } } } }, { { { { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } }, { { { 108.0 } }, { { 109.0 }, { 110.0 }, { 111.0 } } } }, { { { { 112.0 } }, { { 113.0 }, { 114.0 }, { 115.0 } } }, { { { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } } } }, { { { { { 120.0 } }, { { 121.0 }, { 122.0 }, { 123.0 } } }, { { { 124.0 } }, { { 125.0 }, { 126.0 }, { 127.0 } } } }, { { { { { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } }, { { { 132.0 } }, { { 133.0 }, { 134.0 }, { 135.0 } } } }, { { { { 136.0 } }, { { 137.0 }, { 138.0 }, { 139.0 } } }, { { { 140.0 } }, { { 141.0 }, { 142.0 }, { 143.0 } } } }, { { { { 144.0 } }, { { 145.0 }, { 146.0 }, { 147.0 } } }, { { { 148.0 } }, { { 149.0 }, { 150.0 }, { 151.0 } } } } } } } } });
    double v2(152.0);
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
