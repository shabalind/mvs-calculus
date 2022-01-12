  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    std::vector<std::vector<double>> p2;
    std::vector<double> p3;
    std::vector<std::vector<double>> p4;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1, std::vector<std::vector<double>> v2, std::vector<double> v3, std::vector<std::vector<double>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    double p1;
    s2(s1 v0, double v1): p0(v0), p1(v1) { }
  };
  s2 f112(const s2 &v0) {
    s2 v2 = v0;
    s2 v3 = v2;
    return v3;
  }
  s0 f109(const s0 &v0) {
    s0 v1 = v0;
    s0 v3 = v0;
    v1 = v0;
    s0 v7 = v0;
    s0 v10 = v1;
    const std::vector<std::vector<double>> v8 = v10.p0;
    const std::vector<std::vector<double>> v4 = v3.p4;
    const std::vector<std::vector<double>> v12 = v1.p0;
    const std::vector<std::vector<double>> v21 = v1.p2;
    s0 v27 = v7;
    v1.p4 = v4;
    const std::vector<std::vector<double>> v13 = v27.p4;
    std::vector<std::vector<double>> v30 = v8;
    const std::vector<double> v15 = v21[0];
    v30[1] = v15;
    v10.p0 = v12;
    v1 = v7;
    v10.p0 = v4;
    const std::vector<double> v50 = v27.p1;
    v1.p1 = v50;
    v7.p4 = v13;
    v10.p4 = v30;
    v7.p0 = v4;
    return v10;
  }
  s1 f105(const s1 &v0) {
    const s0 v2 = v0.p1;
    const std::vector<s0> v3 = v0.p0;
    const s0 v4 = v0.p1;
    const s0 v6 = v3[2];
    const s0 v1 = f109(v6);
    s0 v5 = v6;
    const s0 v10 = f109(v1);
    s1 v12 = v0;
    v12.p1 = v5;
    v5 = v6;
    s1 v20 = v12;
    s1 v22 = v12;
    v20.p1 = v4;
    v5 = v6;
    const std::vector<s0> v13 = v20.p0;
    v20.p1 = v10;
    v20.p1 = v5;
    s1 v37 = v22;
    v37.p0 = v13;
    s1 v31 = v37;
    v20.p1 = v2;
    return v31;
  }
  s2 f101(const s1 &v0, const s2 &v1) {
    const s1 v5 = f105(v0);
    const s1 v8 = f105(v5);
    const double v13 = v1.p1;
    const s2 v34(v8, v13);
    s2 v119 = v34;
    return v119;
  }
  s2 f97(const s2 &v0) {
    const s1 v2 = v0.p0;
    s1 v8 = v2;
    const s2 v1 = f112(v0);
    const s2 v3 = f101(v8, v1);
    s2 v19 = v3;
    return v19;
  }
  std::vector<s0> f95(const std::vector<s0> &v0) {
    const s0 v5 = v0[1];
    std::vector<s0> v2 = v0;
    const s0 v10 = f109(v5);
    const s0 v13 = f109(v5);
    const s0 v32 = f109(v10);
    const s0 v38 = f109(v32);
    const s0 v69 = f109(v13);
    const s0 v62 = f109(v38);
    std::vector<s0> v51 = v2;
    v2[1] = v13;
    v51[1] = v69;
    v2[2] = v62;
    return v51;
  }
  s0 f94(const s1 &v0, const s0 &v1) {
    s1 v3 = v0;
    const s0 v4 = f109(v1);
    const s1 v11 = f105(v3);
    v3.p1 = v1;
    v3 = v11;
    v3.p1 = v4;
    const std::vector<s0> v61 = v11.p0;
    const std::vector<s0> v53 = f95(v61);
    const std::vector<s0> v49 = v0.p0;
    const std::vector<s0> v266 = f95(v53);
    const std::vector<s0> v242 = f95(v49);
    v3.p0 = v242;
    const s0 v138 = v266[1];
    const s0 v243 = f109(v138);
    return v243;
  }
  s1 f93(const s1 &v0, const std::vector<s0> &v1) {
    const std::vector<s0> v2 = f95(v1);
    const s0 v6 = v2[1];
    const s1 v7(v1, v6);
    return v7;
  }
  s2 f88(const s2 &v0) {
    const s2 v3 = f112(v0);
    s2 v7 = v3;
    const s1 v4 = v7.p0;
    s1 v2 = v4;
    s2 v5 = v0;
    s2 v10 = v5;
    const std::vector<s0> v9 = v4.p0;
    const double v6 = v7.p1;
    const double v8 = v6 / v6;
    const s0 v17 = v9[2];
    const std::vector<double> v26 = v17.p3;
    const s0 v24 = f94(v2, v17);
    const s0 v13 = f94(v4, v24);
    std::vector<double> v14 = v26;
    std::vector<s0> v36 = v9;
    s0 v22 = v13;
    const double v19 = v3.p1;
    v36[0] = v24;
    const s1 v29 = f105(v4);
    v36[0] = v17;
    v14[1] = v6;
    const std::vector<s0> v16 = f95(v36);
    const std::vector<s0> v21 = f95(v16);
    s0 v41 = v22;
    v36[1] = v17;
    const std::vector<double> v34 = v22.p1;
    double v42 = v6;
    const std::vector<s0> v59 = v4.p0;
    v7.p0 = v4;
    v36[2] = v41;
    v14[1] = v8;
    const s0 v38 = f109(v22);
    v2.p0 = v21;
    const s1 v25 = f93(v29, v59);
    const double v28 = v34[0];
    std::vector<s0> v55 = v21;
    v41.p1 = v26;
    v5.p1 = v42;
    const s0 v35 = v2.p1;
    v5.p0 = v29;
    const s0 v56 = v2.p1;
    v36[0] = v38;
    v7.p0 = v25;
    v36[0] = v22;
    v14[0] = v19;
    const double v74 = v14[0];
    v36[1] = v24;
    const s1 v92 = v10.p0;
    const s1 v97 = f93(v25, v55);
    const s0 v96 = f94(v92, v56);
    const s0 v94 = v29.p1;
    v36[2] = v35;
    v7.p1 = v28;
    v5.p1 = v28;
    v36[1] = v94;
    v36[0] = v38;
    v5.p1 = v42;
    const s2 v102(v97, v74);
    v55[2] = v96;
    return v102;
  }
  s1 f80(const s1 &v0) {
    const std::vector<s0> v7 = v0.p0;
    const std::vector<s0> v5 = v0.p0;
    const std::vector<s0> v1 = v0.p0;
    std::vector<s0> v2 = v5;
    const s0 v3 = v2[1];
    const s0 v10 = v1[0];
    const s0 v13 = v5[0];
    v2[2] = v3;
    v2[2] = v3;
    v2[1] = v10;
    s1 v8 = v0;
    v8.p1 = v10;
    const s0 v15 = v2[0];
    const s0 v18 = v2[1];
    v8.p0 = v1;
    const s0 v16 = v8.p1;
    const s0 v24 = f94(v8, v10);
    std::vector<s0> v21 = v1;
    s1 v28 = v0;
    const s0 v27 = v7[1];
    const std::vector<double> v19 = v15.p1;
    v28.p0 = v1;
    v2[2] = v16;
    s1 v40 = v8;
    const std::vector<s0> v39 = f95(v5);
    const s1 v25(v1, v3);
    const std::vector<s0> v85 = v28.p0;
    const std::vector<s1> v45 { v25, v28, v40, v25, v8 };
    const std::vector<s0> v37 = f95(v7);
    const std::vector<s0> v54 = f95(v2);
    const std::vector<s0> v76 = f95(v2);
    const double v64 = v19[0];
    const std::vector<std::vector<s0>> v38 { v1, v39, v85, v54, v85, v85 };
    v40.p0 = v37;
    const s1 v63 = f105(v8);
    const std::vector<s0> v66 = v38[0];
    v28.p1 = v13;
    v40.p1 = v18;
    const s0 v98 = v0.p1;
    std::vector<s1> v79 = v45;
    const s1 v99 = f93(v63, v21);
    const s1 v331 = v79[3];
    v8.p1 = v27;
    v2[1] = v24;
    std::vector<s0> v125 = v85;
    const s1 v363 = f105(v99);
    v8.p0 = v76;
    const s2 v139(v363, v64);
    const s2 v94 = f101(v331, v139);
    const s2 v120 = f112(v94);
    v28.p0 = v66;
    v40.p0 = v125;
    v8.p0 = v85;
    const s2 v237 = f88(v120);
    v8.p1 = v98;
    v2 = v7;
    const s2 v135 = f97(v237);
    const s1 v154 = v135.p0;
    return v154;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const std::vector<s1> v7 = v0[1];
    const s1 v4 = v7[0];
    const s1 v5 = f80(v4);
    const std::vector<s0> v2 = v4.p0;
    const s0 v8 = v2[0];
    const std::vector<s0> v12 = v5.p0;
    const s0 v16 = v12[0];
    double v28 = v1;
    const std::vector<double> v29 = v8.p1;
    const std::vector<std::vector<double>> v41 = v16.p4;
    const std::vector<double> v36 = v41[0];
    const double v43 = v36[0];
    double v54 = v43;
    std::vector<double> v44 = v29;
    v44[0] = v28;
    const double v167 = v44[1];
    const double v73 = v54 * v167;
    return v73;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { { 0.0 }, { 1.0 } }, { 2.0, 3.0 }, { { 4.0 }, { 5.0 }, { 6.0 } }, { 7.0, 8.0 }, { { 9.0 }, { 10.0 } } }, { { { 11.0 }, { 12.0 } }, { 13.0, 14.0 }, { { 15.0 }, { 16.0 }, { 17.0 } }, { 18.0, 19.0 }, { { 20.0 }, { 21.0 } } }, { { { 22.0 }, { 23.0 } }, { 24.0, 25.0 }, { { 26.0 }, { 27.0 }, { 28.0 } }, { 29.0, 30.0 }, { { 31.0 }, { 32.0 } } } }, { { { 33.0 }, { 34.0 } }, { 35.0, 36.0 }, { { 37.0 }, { 38.0 }, { 39.0 } }, { 40.0, 41.0 }, { { 42.0 }, { 43.0 } } } } }, { { { { { { 44.0 }, { 45.0 } }, { 46.0, 47.0 }, { { 48.0 }, { 49.0 }, { 50.0 } }, { 51.0, 52.0 }, { { 53.0 }, { 54.0 } } }, { { { 55.0 }, { 56.0 } }, { 57.0, 58.0 }, { { 59.0 }, { 60.0 }, { 61.0 } }, { 62.0, 63.0 }, { { 64.0 }, { 65.0 } } }, { { { 66.0 }, { 67.0 } }, { 68.0, 69.0 }, { { 70.0 }, { 71.0 }, { 72.0 } }, { 73.0, 74.0 }, { { 75.0 }, { 76.0 } } } }, { { { 77.0 }, { 78.0 } }, { 79.0, 80.0 }, { { 81.0 }, { 82.0 }, { 83.0 } }, { 84.0, 85.0 }, { { 86.0 }, { 87.0 } } } } } });
    double v1(88.0);
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
