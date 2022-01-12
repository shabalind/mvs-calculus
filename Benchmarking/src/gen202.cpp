  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<std::vector<s0>> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<std::vector<s1>> p1;
    s2(std::vector<s0> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s0> p0;
    s1 p1;
    s4(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s2 p0;
    std::vector<s1> p1;
    s5(s2 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s4> p0;
    std::vector<s0> p1;
    s0 p2;
    s5 p3;
    std::vector<s1> p4;
    s7(std::vector<s4> v0, std::vector<s0> v1, s0 v2, s5 v3, std::vector<s1> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  s0 f82(const std::vector<std::vector<double>> &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v4 = v1.p1;
    s0 v11 = v1;
    v11.p0 = v0;
    s0 v14 = v1;
    v14.p1 = v4;
    const std::vector<std::vector<double>> v27 = v1.p1;
    const std::vector<std::vector<double>> v26 = v11.p1;
    v14.p1 = v27;
    const std::vector<std::vector<double>> v31 = v14.p1;
    v14.p1 = v26;
    s0 v35 = v1;
    std::vector<std::vector<double>> v71 = v26;
    v11.p0 = v0;
    s0 v43 = v35;
    v14.p1 = v71;
    const std::vector<std::vector<double>> v68 = v14.p0;
    std::vector<std::vector<double>> v54 = v26;
    const std::vector<s0> v56 { v14, v11, v35, v35, v35, v43, v35 };
    v43.p1 = v31;
    std::vector<std::vector<double>> v50 = v68;
    v43.p1 = v71;
    std::vector<std::vector<double>> v57 = v54;
    v14.p0 = v50;
    v11.p1 = v26;
    const s0 v133 = v56[0];
    v14.p1 = v57;
    v11.p1 = v4;
    return v133;
  }
  s0 f76(const s0 &v0, const s7 &v1) {
    s7 v8 = v1;
    const s0 v24 = v8.p2;
    const std::vector<std::vector<double>> v10 = v0.p0;
    const s0 v18 = f82(v10, v0);
    const s0 v40 = f82(v10, v0);
    const std::vector<std::vector<double>> v21 = v18.p0;
    v8.p2 = v24;
    const s5 v36 = v8.p3;
    v8 = v1;
    v8.p3 = v36;
    v8.p2 = v40;
    const std::vector<std::vector<double>> v48 = v18.p0;
    v8.p3 = v36;
    const std::vector<std::vector<std::vector<double>>> v124 { v21, v10, v48, v21, v21, v21 };
    const std::vector<std::vector<double>> v91 = v124[0];
    const s0 v88 = f82(v91, v24);
    return v88;
  }
  s0 f59(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<std::vector<double>> v1 = v0.p1;
    const std::vector<double> v3 = v4[0];
    const s0 v2 = f82(v4, v0);
    std::vector<std::vector<double>> v7 = v1;
    const s0 v6 = f82(v4, v2);
    const std::vector<std::vector<double>> v15 = v6.p0;
    const std::vector<double> v11 = v1[0];
    v7[0] = v3;
    std::vector<std::vector<double>> v16 = v15;
    const s0 v14(v16, v7);
    v16[0] = v3;
    v7[1] = v11;
    return v14;
  }
  s0 f48(const s0 &v0) {
    s0 v5 = v0;
    const s0 v6 = f59(v5);
    const std::vector<std::vector<double>> v4 = v5.p0;
    const s0 v7 = f59(v6);
    s0 v9 = v6;
    v5.p0 = v4;
    v9 = v7;
    s0 v2 = v7;
    const std::vector<double> v8 = v4[0];
    s0 v10 = v5;
    const s0 v1 = f82(v4, v5);
    const std::vector<std::vector<double>> v14 = v1.p0;
    const s0 v11 = f82(v4, v1);
    const s0 v17 = f59(v5);
    const std::vector<std::vector<double>> v12 = v2.p1;
    const std::vector<double> v21 = v12[2];
    const std::vector<std::vector<double>> v15 = v11.p1;
    s0 v24 = v11;
    std::vector<std::vector<double>> v30 = v14;
    const std::vector<std::vector<double>> v26 = v9.p0;
    const s0 v20 = f82(v4, v17);
    const std::vector<std::vector<double>> v25 = v24.p1;
    const std::vector<double> v38 = v30[0];
    const s0 v28(v26, v25);
    std::vector<std::vector<double>> v33 = v12;
    v2 = v11;
    v30[0] = v21;
    const s0 v49 = f82(v30, v28);
    v9.p0 = v26;
    v33[1] = v8;
    std::vector<std::vector<double>> v48 = v33;
    v48 = v12;
    v33[1] = v38;
    v2.p0 = v14;
    const std::vector<std::vector<double>> v139 = v10.p1;
    const std::vector<std::vector<double>> v56 = v20.p0;
    const std::vector<std::vector<std::vector<double>>> v95 { v30, v4, v56, v26 };
    const std::vector<std::vector<double>> v178 = v95[3];
    v5.p0 = v178;
    v5.p1 = v48;
    v5.p1 = v15;
    v24.p1 = v139;
    const std::vector<std::vector<double>> v98 = v49.p0;
    s0 v71 = v24;
    v71.p0 = v98;
    return v71;
  }
  s7 f31(const s7 &v0) {
    s7 v2 = v0;
    v2 = v0;
    s7 v7 = v2;
    const s0 v8 = v7.p2;
    v2.p2 = v8;
    v7.p2 = v8;
    const s0 v3 = f76(v8, v0);
    v2 = v7;
    const std::vector<std::vector<double>> v9 = v3.p1;
    v7.p2 = v3;
    const s0 v13 = v7.p2;
    v7.p2 = v13;
    v7.p2 = v8;
    const s0 v6 = f59(v8);
    const s0 v11 = f48(v8);
    s0 v15 = v3;
    v7.p2 = v15;
    const std::vector<std::vector<double>> v32 = v6.p0;
    const s0 v17 = f82(v32, v11);
    v7.p2 = v17;
    v15.p1 = v9;
    return v7;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const double &v1) {
    const s7 v2 = f31(v0);
    double v7 = v1;
    const s0 v6 = v2.p2;
    const std::vector<std::vector<double>> v11 = v6.p1;
    const std::vector<double> v3 = v11[0];
    std::vector<double> v16 = v3;
    v16[0] = v7;
    const double v5 = v3[0];
    v16[0] = v1;
    v16[0] = v5;
    std::vector<double> v13 = v16;
    v7 = v5;
    std::vector<double> v50 = v13;
    const double v23 = v50[0];
    v13[0] = v23;
    double v53 = v7;
    v13[0] = v23;
    v50[0] = v5;
    v13[0] = v5;
    const double v68 = v5 * v23;
    v16[0] = v53;
    double v95 = v68;
    v13[0] = v95;
    return v95;
  }
  int main() {
    s7 v0({ { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } }, { { { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } }, { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } } } } }, { { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } }, { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } } } }, { { { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } }, { { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } }, { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } } } } } } }, { { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } }, { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } }, { { { { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } } }, { { { { { { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } }, { { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } } }, { { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } } }, { { { { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } }, { { { { 84.0 } }, { { 85.0 }, { 86.0 }, { 87.0 } } } }, { { { { 88.0 } }, { { 89.0 }, { 90.0 }, { 91.0 } } } } } } } } }, { { { { { { { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } }, { { { { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } } }, { { { { 100.0 } }, { { 101.0 }, { 102.0 }, { 103.0 } } } } }, { { { { { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } } }, { { { { 108.0 } }, { { 109.0 }, { 110.0 }, { 111.0 } } } }, { { { { 112.0 } }, { { 113.0 }, { 114.0 }, { 115.0 } } } } } } } }, { { { { { { { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } }, { { { { 120.0 } }, { { 121.0 }, { 122.0 }, { 123.0 } } } }, { { { { 124.0 } }, { { 125.0 }, { 126.0 }, { 127.0 } } } } }, { { { { { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } } }, { { { { 132.0 } }, { { 133.0 }, { 134.0 }, { 135.0 } } } }, { { { { 136.0 } }, { { 137.0 }, { 138.0 }, { 139.0 } } } } } } } });
    double v1(140.0);
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
