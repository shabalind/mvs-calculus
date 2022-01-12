  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<double> p3;
    std::vector<std::vector<double>> p4;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<double> v3, std::vector<std::vector<double>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
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
  s0 f79(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<std::vector<double>> v3 = v0.p4;
    const std::vector<std::vector<double>> v8 = v5.p1;
    const s1 v4(v0, v5);
    const s1 v6(v5, v5);
    v5.p1 = v8;
    const std::vector<std::vector<double>> v11 = v0.p2;
    const std::vector<double> v1 = v11[0];
    const std::vector<std::vector<double>> v7 { v1, v1, v1, v1 };
    const std::vector<std::vector<double>> v9 = v0.p1;
    std::vector<double> v15 = v1;
    const std::vector<std::vector<double>> v10 = v0.p4;
    v5.p4 = v10;
    v15 = v1;
    const std::vector<std::vector<double>> v17 = v5.p1;
    const s0 v2 = v4.p1;
    std::vector<std::vector<double>> v14 = v3;
    v5.p4 = v17;
    v14[0] = v1;
    const std::vector<std::vector<double>> v20 = v5.p4;
    const s0 v25 = v4.p0;
    const std::vector<double> v23 = v9[0];
    std::vector<double> v12 = v1;
    const s1 v24(v5, v2);
    s1 v18 = v24;
    v14[0] = v12;
    const std::vector<double> v16 = v17[0];
    const double v13 = v16[0];
    const std::vector<double> v30 = v7[3];
    v15[0] = v13;
    v14 = v10;
    v14[0] = v12;
    const double v26 = v30[0];
    std::vector<std::vector<double>> v60 = v20;
    const s0 v35 = v18.p1;
    const s0 v27 = v24.p0;
    const std::vector<std::vector<double>> v32 = v35.p4;
    v60[0] = v23;
    v18.p0 = v27;
    const double v56 = v15[0];
    std::vector<std::vector<double>> v28 = v3;
    const std::vector<double> v48 = v11[0];
    v60[0] = v12;
    v5.p1 = v60;
    const std::vector<std::vector<double>> v72 = v25.p0;
    double v79 = v26;
    v79 = v26;
    const std::vector<double> v74 = v25.p3;
    v5.p3 = v74;
    const double v84 = v15[0];
    double v54 = v13;
    std::vector<double> v57 = v23;
    v5.p1 = v28;
    double v73 = v84;
    v14[0] = v57;
    std::vector<double> v98 = v74;
    const double v85 = v74[0];
    v12[0] = v79;
    v14[0] = v23;
    const s0 v43(v11, v32, v72, v98, v20);
    std::vector<double> v137 = v74;
    const std::vector<std::vector<double>> v40 = v43.p2;
    v28[0] = v57;
    v57[0] = v56;
    v137[0] = v85;
    const s0 v81 = v6.p1;
    v137[0] = v73;
    v98[1] = v54;
    v18.p0 = v81;
    const s0 v179(v40, v14, v40, v137, v9);
    v28[0] = v48;
    v137[0] = v56;
    v5.p0 = v11;
    v98[0] = v73;
    v15[0] = v56;
    v57[0] = v54;
    return v179;
  }
  std::vector<s0> f73(const std::vector<s0> &v0) {
    std::vector<s0> v3 = v0;
    std::vector<s0> v1 = v3;
    const s0 v6 = v1[1];
    s0 v8 = v6;
    const s0 v4 = f79(v6);
    const std::vector<std::vector<double>> v2 = v8.p0;
    const s0 v10 = f79(v4);
    const s0 v18 = f79(v4);
    std::vector<std::vector<double>> v9 = v2;
    std::vector<s0> v13 = v0;
    const std::vector<std::vector<double>> v12 = v10.p1;
    const std::vector<std::vector<double>> v20 = v6.p0;
    const s0 v35 = f79(v10);
    v8.p2 = v20;
    v1[2] = v35;
    v13[2] = v18;
    const s0 v44 = f79(v6);
    v8.p1 = v12;
    v8.p1 = v12;
    const std::vector<double> v16 = v12[0];
    v8 = v6;
    std::vector<std::vector<double>> v29 = v2;
    s0 v39 = v8;
    const std::vector<std::vector<double>> v31 = v10.p2;
    v29[0] = v16;
    v3 = v13;
    const s0 v51 = f79(v44);
    v39.p0 = v20;
    s0 v24 = v39;
    const s0 v37 = f79(v24);
    const std::vector<std::vector<double>> v47 = v51.p1;
    v24.p4 = v47;
    v39.p2 = v9;
    v39.p1 = v47;
    v24.p1 = v12;
    const s0 v59 = f79(v37);
    v39.p0 = v29;
    v3[1] = v59;
    v39.p0 = v31;
    return v13;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    const s2 v7 = v0[1];
    const std::vector<s0> v2 = v7.p0;
    const std::vector<s0> v4 = f73(v2);
    const s0 v6 = v4[1];
    const s1 v3(v6, v6);
    const s0 v14 = v3.p0;
    const std::vector<std::vector<double>> v33 = v14.p0;
    const std::vector<double> v9 = v33[1];
    std::vector<double> v23 = v9;
    const double v12 = v23[0];
    return v12;
  }
  int main() {
    std::vector<s2> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 }, { 5.0 }, { 6.0 } }, { 7.0, 8.0 }, { { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 } }, { { 14.0 }, { 15.0 }, { 16.0 } }, { 17.0, 18.0 }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } }, { { 24.0 }, { 25.0 }, { 26.0 } }, { 27.0, 28.0 }, { { 29.0 } } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 } }, { { 34.0 }, { 35.0 }, { 36.0 } }, { 37.0, 38.0 }, { { 39.0 } } } }, { { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } }, { { 44.0 }, { 45.0 }, { 46.0 } }, { 47.0, 48.0 }, { { 49.0 } } }, { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 } }, { { 54.0 }, { 55.0 }, { 56.0 } }, { 57.0, 58.0 }, { { 59.0 } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } }, { { 64.0 }, { 65.0 }, { 66.0 } }, { 67.0, 68.0 }, { { 69.0 } } } }, { { { 70.0 }, { 71.0 }, { 72.0 } }, { { 73.0 } }, { { 74.0 }, { 75.0 }, { 76.0 } }, { 77.0, 78.0 }, { { 79.0 } } } }, { { { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 } }, { { 84.0 }, { 85.0 }, { 86.0 } }, { 87.0, 88.0 }, { { 89.0 } } }, { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 } }, { { 94.0 }, { 95.0 }, { 96.0 } }, { 97.0, 98.0 }, { { 99.0 } } }, { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 } }, { { 104.0 }, { 105.0 }, { 106.0 } }, { 107.0, 108.0 }, { { 109.0 } } } }, { { { 110.0 }, { 111.0 }, { 112.0 } }, { { 113.0 } }, { { 114.0 }, { 115.0 }, { 116.0 } }, { 117.0, 118.0 }, { { 119.0 } } } } });
    double v1(120.0);
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
