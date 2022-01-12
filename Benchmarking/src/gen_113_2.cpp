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
    std::vector<s0> p2;
    s1(s0 v0, s0 v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  s0 f37(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v3 = v1.p1;
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<std::vector<double>> v7 = v1.p0;
    std::vector<std::vector<double>> v6 = v7;
    const std::vector<double> v8 = v6[0];
    const std::vector<std::vector<double>> v2 = v0.p1;
    const s0 v13(v7, v2);
    std::vector<double> v5 = v8;
    const double v9 = v8[0];
    const std::vector<double> v15 = v7[0];
    v6[0] = v5;
    const std::vector<std::vector<double>> v16 = v0.p0;
    v6[0] = v15;
    const double v20 = v8[0];
    const std::vector<double> v12 = v7[0];
    std::vector<std::vector<double>> v23 = v2;
    std::vector<std::vector<double>> v10 = v3;
    const s0 v21(v16, v2);
    v23 = v2;
    std::vector<std::vector<double>> v25 = v10;
    double v18 = v9;
    const std::vector<std::vector<double>> v14 = v13.p0;
    const double v42 = v15[0];
    v6[0] = v12;
    std::vector<std::vector<double>> v19 = v7;
    const std::vector<double> v17 = v10[2];
    const std::vector<double> v50 = v16[0];
    const double v27 = v20 + v18;
    v10 = v23;
    std::vector<std::vector<double>> v35 = v14;
    const std::vector<std::vector<double>> v31 = v0.p1;
    const std::vector<std::vector<double>> v39 = v21.p1;
    const s0 v30(v19, v4);
    double v72 = v18;
    std::vector<std::vector<double>> v49 = v35;
    const std::vector<std::vector<std::vector<double>>> v38 { v23, v23, v25, v10, v39, v31, v2 };
    double v56 = v27;
    const std::vector<double> v54 { v56, v72, v27, v56, v9 };
    const std::vector<std::vector<double>> v32 = v38[6];
    double v46 = v42;
    const std::vector<std::vector<std::vector<double>>> v115 { v49, v6 };
    s0 v37 = v21;
    v37.p1 = v23;
    const s0 v41(v16, v32);
    s0 v128 = v30;
    v37.p1 = v4;
    const s0 v67(v14, v32);
    double v95 = v46;
    v37.p1 = v3;
    const std::vector<std::vector<double>> v152 = v13.p0;
    const std::vector<std::vector<double>> v71 = v115[1];
    v128.p1 = v3;
    v128.p0 = v71;
    const std::vector<s0> v80 { v30, v21, v128, v1, v21 };
    v128.p1 = v3;
    v128.p0 = v152;
    const std::vector<std::vector<double>> v92 = v37.p1;
    const std::vector<double> v184 = v92[1];
    v35[0] = v17;
    const std::vector<std::vector<double>> v83 = v115[1];
    v19[0] = v5;
    const std::vector<std::vector<double>> v113 = v37.p0;
    const s0 v63(v83, v2);
    v128 = v67;
    v37.p0 = v14;
    v128.p0 = v19;
    const s0 v82 = v80[4];
    v128.p0 = v152;
    const std::vector<s0> v77 { v0, v63, v1, v30, v67, v41, v67 };
    std::vector<double> v94 = v54;
    v49[0] = v184;
    std::vector<s0> v121 = v77;
    v37.p1 = v2;
    const std::vector<double> v86 = v14[0];
    v128.p0 = v113;
    std::vector<s0> v166 = v121;
    v25[0] = v50;
    v166[3] = v13;
    std::vector<std::vector<double>> v244 = v4;
    v128.p1 = v92;
    const double v230 = v94[4];
    v5[0] = v230;
    const s0 v191 = v166[3];
    v5[0] = v95;
    v19 = v113;
    v128.p1 = v244;
    v23[1] = v8;
    const std::vector<std::vector<double>> v132 = v82.p0;
    v37.p0 = v132;
    v5 = v86;
    return v191;
  }
  double f2(const s0 &v0, const double &v1) {
    s0 v7 = v0;
    const s0 v3 = f37(v7, v7);
    double v5 = v1;
    double v6 = v1;
    s0 v9 = v7;
    const s0 v2 = f37(v9, v7);
    s0 v17 = v3;
    const std::vector<std::vector<double>> v10 = v17.p1;
    const std::vector<double> v14 = v10[0];
    const std::vector<std::vector<double>> v34 = v2.p0;
    const double v16 = v14[0];
    const double v20 = v14[0];
    const double v21 = v14[0];
    std::vector<std::vector<double>> v69 = v10;
    v7 = v9;
    const std::vector<double> v46 { v16, v20, v6, v1, v5, v6, v21 };
    std::vector<double> v24 = v46;
    v17.p1 = v69;
    v17.p0 = v34;
    v17.p1 = v69;
    v24[0] = v1;
    const double v26 = v24[3];
    return v26;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<s1> &v1, const s0 &v2, const std::vector<s2> &v3, const double &v4) {
    const s1 v16 = v0.p1;
    const s0 v20 = v16.p1;
    const std::vector<std::vector<double>> v29 = v20.p1;
    const std::vector<double> v43 = v29[2];
    const double v58 = v43[0];
    const double v84 = f2(v2, v58);
    return v84;
  }
  int main() {
    s2 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } });
    std::vector<s1> v1({ { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } }, { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } } } }, { { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } }, { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } }, { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } } } }, { { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } }, { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } }, { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } }, { { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } } } });
    s0 v2({ { { 84.0 } }, { { 85.0 }, { 86.0 }, { 87.0 } } });
    std::vector<s2> v3({ { { { { { 88.0 } }, { { 89.0 }, { 90.0 }, { 91.0 } } } }, { { { { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } }, { { { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } }, { { { { 100.0 } }, { { 101.0 }, { 102.0 }, { 103.0 } } }, { { { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } }, { { { 108.0 } }, { { 109.0 }, { 110.0 }, { 111.0 } } } } } }, { { { { { 112.0 } }, { { 113.0 }, { 114.0 }, { 115.0 } } } }, { { { { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } }, { { { 120.0 } }, { { 121.0 }, { 122.0 }, { 123.0 } } }, { { { { 124.0 } }, { { 125.0 }, { 126.0 }, { 127.0 } } }, { { { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } }, { { { 132.0 } }, { { 133.0 }, { 134.0 }, { 135.0 } } } } } } });
    double v4(136.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
