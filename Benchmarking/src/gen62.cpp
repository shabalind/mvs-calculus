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
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    std::vector<std::vector<s0>> p1;
    s3(s2 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s3> p0;
    s1 p1;
    s4(std::vector<s3> v0, s1 v1): p0(v0), p1(v1) { }
  };
  s0 f106(const s0 &v0) {
    s0 v6 = v0;
    s0 v1 = v0;
    s0 v3 = v1;
    const std::vector<std::vector<double>> v8 = v6.p1;
    const std::vector<std::vector<double>> v12 = v1.p0;
    v3.p0 = v12;
    v1.p1 = v8;
    const std::vector<std::vector<double>> v39 = v3.p1;
    s0 v32 = v3;
    v3.p1 = v39;
    return v32;
  }
  s2 f105(const s2 &v0) {
    const s1 v1 = v0.p1;
    const s0 v8 = v1.p1;
    const std::vector<s0> v4 = v1.p0;
    s1 v5 = v1;
    const std::vector<s0> v7 = v5.p0;
    v5.p1 = v8;
    s2 v18 = v0;
    v5 = v1;
    v18 = v0;
    const std::vector<s0> v13 = v1.p0;
    const s0 v14 = v7[0];
    v5.p1 = v14;
    const std::vector<s0> v24 = v1.p0;
    const s1 v16 = v0.p0;
    v5.p0 = v4;
    const s1 v22 = v18.p0;
    v18.p1 = v16;
    s1 v44 = v5;
    v5.p0 = v13;
    s1 v32 = v1;
    v32.p0 = v4;
    s2 v40 = v0;
    v40.p1 = v44;
    s2 v30 = v40;
    s1 v29 = v22;
    s1 v59 = v29;
    const s2 v57(v44, v44);
    const std::vector<s0> v58 = v32.p0;
    const s1 v64 = v18.p1;
    v18.p1 = v1;
    const s1 v63 = v57.p1;
    s2 v94 = v18;
    const s1 v73 = v30.p0;
    s2 v100 = v30;
    v59.p0 = v24;
    v18.p0 = v64;
    v94.p1 = v1;
    s2 v143 = v57;
    v143.p0 = v59;
    const std::vector<s2> v138 { v30, v100, v0, v143, v40, v94, v143 };
    v29.p0 = v58;
    v143.p0 = v63;
    v100.p1 = v73;
    const s2 v152 = v138[1];
    return v152;
  }
  s0 f86(const s0 &v0) {
    s0 v7 = v0;
    s0 v1 = v0;
    s0 v2 = v1;
    const std::vector<std::vector<double>> v4 = v1.p0;
    v1.p0 = v4;
    v2.p0 = v4;
    const std::vector<std::vector<double>> v8 = v1.p0;
    v2.p0 = v4;
    const std::vector<std::vector<double>> v13 = v1.p1;
    const s0 v6 = f106(v0);
    const s0 v12 = f106(v7);
    v7.p1 = v13;
    v1.p0 = v4;
    v2 = v12;
    std::vector<std::vector<double>> v15 = v4;
    std::vector<std::vector<double>> v26 = v4;
    const s0 v41 = f106(v0);
    std::vector<std::vector<double>> v46 = v15;
    v7.p1 = v13;
    const std::vector<std::vector<double>> v62 = v6.p0;
    const s0 v23 = f106(v41);
    v46 = v8;
    const s0 v35 = f106(v2);
    const s0 v25 = f106(v2);
    const s0 v54 = f106(v35);
    const s0 v100 = f106(v23);
    v2.p0 = v46;
    const std::vector<s0> v36 { v2, v23, v54, v25, v100 };
    v1.p1 = v13;
    const std::vector<std::vector<double>> v34 = v7.p1;
    std::vector<s0> v85 = v36;
    v7.p0 = v62;
    v2.p1 = v34;
    v1.p0 = v8;
    std::vector<s0> v135 = v85;
    const std::vector<std::vector<double>> v88 = v0.p0;
    std::vector<std::vector<double>> v149 = v88;
    std::vector<std::vector<double>> v53 = v26;
    v7.p0 = v149;
    v1.p0 = v53;
    const s0 v268 = v135[2];
    const s0 v167 = f106(v268);
    return v167;
  }
  s1 f72(const s1 &v0) {
    const std::vector<s0> v6 = v0.p0;
    const s0 v2 = v6[0];
    s0 v5 = v2;
    const s0 v8 = v6[0];
    s1 v3 = v0;
    const s0 v10 = v3.p1;
    v3.p1 = v5;
    const s0 v11 = f86(v10);
    v3.p1 = v2;
    const std::vector<std::vector<double>> v9 = v11.p1;
    v5.p1 = v9;
    v3 = v0;
    const s0 v16 = f106(v8);
    const s0 v12 = f106(v16);
    const std::vector<std::vector<double>> v81 = v16.p0;
    v5 = v12;
    v5.p0 = v81;
    return v3;
  }
  s0 f67(const s0 &v0) {
    const s0 v15 = f86(v0);
    const std::vector<std::vector<double>> v34 = v15.p0;
    const s0 v22 = f86(v0);
    s0 v30 = v22;
    v30.p0 = v34;
    return v30;
  }
  s1 f61(const s1 &v0) {
    s1 v1 = v0;
    s1 v2 = v1;
    const s0 v7 = v1.p1;
    v1 = v2;
    const s0 v4 = f67(v7);
    const s2 v9(v1, v1);
    const s1 v21 = v9.p1;
    s1 v14 = v0;
    const s2 v15(v14, v0);
    v1.p1 = v4;
    const s1 v28 = f72(v1);
    const s0 v22 = v28.p1;
    const s1 v20 = v15.p0;
    const std::vector<s0> v42 = v0.p0;
    std::vector<s0> v52 = v42;
    v52[0] = v22;
    v1.p0 = v52;
    s2 v32 = v15;
    v32 = v9;
    const s0 v39 = v52[0];
    v2.p1 = v39;
    const s2 v46 = f105(v32);
    v32.p0 = v21;
    const s0 v47 = f67(v4);
    v32.p1 = v28;
    std::vector<s0> v54 = v52;
    const s1 v110 = f72(v20);
    const s2 v176 = f105(v46);
    const s0 v113 = f86(v7);
    v54[0] = v113;
    s0 v58 = v47;
    v54[0] = v4;
    const s0 v77 = v54[0];
    const s0 v68 = f67(v77);
    v32.p1 = v14;
    v54[0] = v58;
    v32.p1 = v110;
    const s0 v169 = f106(v22);
    v52[0] = v68;
    const s2 v150 = f105(v176);
    const s1 v163 = v150.p0;
    v1.p1 = v169;
    return v163;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const std::vector<std::vector<s4>> &v1, const double &v2) {
    const s1 v4 = f72(v0);
    double v7 = v2;
    const s1 v3 = f61(v4);
    const s0 v8 = v3.p1;
    const s0 v20 = f106(v8);
    const std::vector<std::vector<double>> v25 = v20.p0;
    const std::vector<double> v36 = v25[2];
    const double v68 = v2 / v7;
    const double v76 = v36[0];
    const double v117 = v76 - v68;
    return v117;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } });
    std::vector<std::vector<s4>> v1({ { { { { { { { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } }, { { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } }, { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } } } } }, { { { { { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } }, { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } } }, { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } } }, { { { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } } } } } }, { { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } } }, { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } } } }, { { { { { { { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } } }, { { { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 } } } }, { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 } } } } }, { { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 } } } } } }, { { { { { { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 } } } }, { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 } } } }, { { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 } } } }, { { { 88.0 }, { 89.0 }, { 90.0 } }, { { 91.0 } } } } }, { { { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 } } } } } } }, { { { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 } } } }, { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 } } } } } } });
    double v2(104.0);
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
