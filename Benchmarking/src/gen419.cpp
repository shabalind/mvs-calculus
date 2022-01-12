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
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    s0 p2;
    std::vector<std::vector<s1>> p3;
    s2(std::vector<s0> v0, s1 v1, s0 v2, std::vector<std::vector<s1>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s3 {
    s1 p0;
    std::vector<std::vector<s2>> p1;
    s3(s1 v0, std::vector<std::vector<s2>> v1): p0(v0), p1(v1) { }
  };
  s0 f19(const s0 &v0) {
    return v0;
  }
  std::vector<std::vector<double>> f16(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v4 = v0[0];
    const std::vector<std::vector<std::vector<double>>> v6 { v0, v0 };
    const std::vector<double> v9 = v0[1];
    std::vector<double> v5 = v4;
    std::vector<std::vector<std::vector<double>>> v1 = v6;
    std::vector<double> v3 = v5;
    std::vector<std::vector<double>> v8 = v0;
    std::vector<std::vector<std::vector<double>>> v2 = v1;
    const std::vector<std::vector<double>> v7 = v2[1];
    const std::vector<std::vector<std::vector<std::vector<double>>>> v11 { v2, v6, v6, v2, v6 };
    v8[0] = v3;
    std::vector<std::vector<std::vector<std::vector<double>>>> v14 = v11;
    std::vector<std::vector<std::vector<std::vector<double>>>> v30 = v11;
    std::vector<double> v13 = v9;
    v30[4] = v2;
    v1[1] = v8;
    const std::vector<std::vector<std::vector<double>>> v18 = v14[4];
    const std::vector<double> v19 = v8[1];
    const std::vector<std::vector<std::vector<double>>> v15 = v30[2];
    v2[0] = v7;
    std::vector<std::vector<double>> v23 = v8;
    const std::vector<double> v10 = v23[0];
    std::vector<std::vector<double>> v24 = v8;
    std::vector<std::vector<double>> v81 = v7;
    const std::vector<std::vector<double>> v21 = v18[1];
    const double v35 = v3[0];
    v81[1] = v10;
    v13[0] = v35;
    v8 = v7;
    v14[4] = v15;
    std::vector<std::vector<std::vector<double>>> v61 = v2;
    std::vector<double> v58 = v3;
    const std::vector<std::vector<double>> v32 = v1[1];
    v81[1] = v13;
    v61[0] = v24;
    v23 = v81;
    const double v29 = v3[0];
    v3[0] = v35;
    const std::vector<std::vector<std::vector<double>>> v85 = v30[3];
    v5[0] = v35;
    const std::vector<double> v38 = v81[0];
    v3[0] = v29;
    std::vector<double> v33 = v58;
    v58[0] = v35;
    const std::vector<std::vector<std::vector<double>>> v51 { v81, v21, v32, v8, v21 };
    double v69 = v35;
    v33[0] = v29;
    const std::vector<std::vector<double>> v98 = v51[3];
    std::vector<std::vector<std::vector<double>>> v87 = v51;
    v30[0] = v61;
    const std::vector<std::vector<double>> v39 = v85[0];
    v8[0] = v13;
    const double v111 = v29 + v35;
    const std::vector<std::vector<std::vector<double>>> v158 { v23, v8 };
    const std::vector<std::vector<std::vector<std::vector<double>>>> v103 { v87 };
    const std::vector<std::vector<std::vector<double>>> v94 = v103[0];
    double v170 = v111;
    v87[1] = v8;
    v8[1] = v33;
    v14[0] = v158;
    v8[0] = v38;
    const std::vector<std::vector<double>> v102 = v94[4];
    v2[0] = v39;
    v1[0] = v98;
    v13 = v3;
    v8[1] = v19;
    v3[0] = v170;
    v3[0] = v69;
    return v102;
  }
  s1 f9(const s1 &v0) {
    const s0 v4 = v0.p1;
    s1 v7 = v0;
    s1 v6 = v7;
    const s0 v34 = f19(v4);
    const s0 v22 = f19(v34);
    const s0 v35 = f19(v34);
    const s0 v26 = v6.p1;
    s1 v32 = v7;
    v7.p1 = v22;
    v32.p1 = v26;
    v7.p1 = v35;
    return v32;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s1 v5 = v0.p0;
    const s1 v7 = v0.p0;
    const s0 v6 = v5.p1;
    s0 v4 = v6;
    s3 v2 = v0;
    const s0 v3 = f19(v4);
    const std::vector<std::vector<double>> v11 = v3.p0;
    v2.p0 = v7;
    std::vector<std::vector<double>> v18 = v11;
    double v8 = v1;
    const double v10 = v8 / v1;
    const std::vector<double> v14 = v18[1];
    v18[1] = v14;
    std::vector<double> v12 = v14;
    const s1 v24 = v2.p0;
    const s1 v15 = f9(v24);
    const std::vector<std::vector<double>> v32 = f16(v18);
    v2.p0 = v7;
    v12[0] = v10;
    v12[0] = v1;
    v12[0] = v8;
    s1 v26 = v24;
    const double v42 = v12[0];
    const s1 v29 = f9(v26);
    v12[0] = v42;
    const std::vector<double> v22 = v11[0];
    v18[1] = v22;
    std::vector<double> v54 = v12;
    const std::vector<std::vector<s2>> v40 = v2.p1;
    const double v51 = v12[0];
    v2.p1 = v40;
    v18[0] = v54;
    const s0 v41 = v29.p1;
    const double v101 = v22[0];
    v54[0] = v10;
    v2.p0 = v15;
    const double v91 = v101 + v51;
    v54[0] = v10;
    v4 = v41;
    v4.p0 = v32;
    return v91;
  }
  int main() {
    s3 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { { { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 } } }, { { { { { { { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 } } } }, { { { 33.0 }, { 34.0 } }, { { 35.0 } } } } }, { { { { { { 36.0 }, { 37.0 } }, { { 38.0 } } }, { { { 39.0 }, { 40.0 } }, { { 41.0 } } } }, { { { 42.0 }, { 43.0 } }, { { 44.0 } } } } } } } }, { { { { { { 45.0 }, { 46.0 } }, { { 47.0 } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 } } } }, { { { { { 51.0 }, { 52.0 } }, { { 53.0 } } }, { { { 54.0 }, { 55.0 } }, { { 56.0 } } } }, { { { 57.0 }, { 58.0 } }, { { 59.0 } } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 } } }, { { { { { { { 63.0 }, { 64.0 } }, { { 65.0 } } }, { { { 66.0 }, { 67.0 } }, { { 68.0 } } } }, { { { 69.0 }, { 70.0 } }, { { 71.0 } } } } }, { { { { { { 72.0 }, { 73.0 } }, { { 74.0 } } }, { { { 75.0 }, { 76.0 } }, { { 77.0 } } } }, { { { 78.0 }, { 79.0 } }, { { 80.0 } } } } } } } }, { { { { { { 81.0 }, { 82.0 } }, { { 83.0 } } }, { { { 84.0 }, { 85.0 } }, { { 86.0 } } } }, { { { { { 87.0 }, { 88.0 } }, { { 89.0 } } }, { { { 90.0 }, { 91.0 } }, { { 92.0 } } } }, { { { 93.0 }, { 94.0 } }, { { 95.0 } } } }, { { { 96.0 }, { 97.0 } }, { { 98.0 } } }, { { { { { { { 99.0 }, { 100.0 } }, { { 101.0 } } }, { { { 102.0 }, { 103.0 } }, { { 104.0 } } } }, { { { 105.0 }, { 106.0 } }, { { 107.0 } } } } }, { { { { { { 108.0 }, { 109.0 } }, { { 110.0 } } }, { { { 111.0 }, { 112.0 } }, { { 113.0 } } } }, { { { 114.0 }, { 115.0 } }, { { 116.0 } } } } } } } } } });
    double v1(117.0);
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
