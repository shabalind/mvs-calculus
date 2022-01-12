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
    s0 p0;
    std::vector<std::vector<s1>> p1;
    std::vector<s0> p2;
    s2(s0 v0, std::vector<std::vector<s1>> v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s11 {
    s2 p0;
    std::vector<std::vector<s1>> p1;
    s11(s2 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  s2 f85(const s2 &v0) {
    s2 v4 = v0;
    const s0 v3 = v0.p0;
    s0 v7 = v3;
    v4.p0 = v7;
    v4.p0 = v7;
    v4 = v0;
    v4 = v0;
    const std::vector<std::vector<double>> v9 = v7.p0;
    s0 v1 = v7;
    s2 v2 = v0;
    const std::vector<double> v6 = v9[0];
    std::vector<double> v18 = v6;
    v4.p0 = v1;
    const std::vector<std::vector<double>> v35 { v6 };
    const std::vector<std::vector<double>> v19 = v1.p1;
    std::vector<std::vector<double>> v27 = v19;
    const std::vector<double> v16 = v35[0];
    const double v24 = v16[0];
    const std::vector<double> v44 = v19[0];
    v2.p0 = v7;
    const std::vector<std::vector<s1>> v20 = v2.p1;
    v27[0] = v18;
    std::vector<std::vector<s1>> v41 = v20;
    const std::vector<s0> v23 = v4.p2;
    s2 v105 = v2;
    v105.p2 = v23;
    v2.p2 = v23;
    s0 v70 = v1;
    const std::vector<std::vector<double>> v28 = v70.p0;
    v1.p1 = v27;
    v2.p1 = v41;
    const s0 v66 = v23[0];
    v27[0] = v44;
    v18[0] = v24;
    const std::vector<std::vector<s1>> v67 = v2.p1;
    v27[0] = v44;
    v7.p0 = v28;
    v2.p1 = v67;
    v2.p0 = v66;
    return v105;
  }
  s1 f79(const s1 &v0) {
    const std::vector<s0> v6 = v0.p1;
    s1 v8 = v0;
    v8.p1 = v6;
    const s0 v7 = v8.p0;
    const std::vector<std::vector<double>> v3 = v7.p0;
    s0 v1 = v7;
    v1.p0 = v3;
    const std::vector<std::vector<double>> v13 = v1.p0;
    std::vector<std::vector<double>> v2 = v13;
    v2 = v3;
    std::vector<s0> v12 = v6;
    v12[2] = v7;
    const std::vector<double> v14 = v13[0];
    const s0 v10 = v12[1];
    std::vector<s0> v18 = v6;
    s1 v20 = v8;
    std::vector<double> v36 = v14;
    const s0 v21 = v18[1];
    const std::vector<s0> v17 = v20.p1;
    const s0 v26 = v6[1];
    v8.p0 = v1;
    v20.p1 = v18;
    v1.p0 = v2;
    const s1 v31(v21, v17);
    const double v46 = v36[0];
    v18[1] = v26;
    v2[1] = v36;
    v8.p0 = v10;
    const double v43 = v46 - v46;
    s1 v32 = v31;
    const double v84 = v46 * v43;
    v32.p0 = v21;
    v36[0] = v84;
    return v32;
  }
  s1 f68(const s2 &v0, const s1 &v1) {
    const std::vector<std::vector<s1>> v4 = v0.p1;
    s2 v7 = v0;
    const s2 v22 = f85(v7);
    s2 v8 = v0;
    v8.p1 = v4;
    const s0 v26 = v8.p0;
    v8.p1 = v4;
    const std::vector<std::vector<double>> v28 = v26.p1;
    s0 v54 = v26;
    const std::vector<std::vector<double>> v38 = v54.p0;
    const std::vector<s0> v84 = v1.p1;
    const s1 v69(v54, v84);
    v8 = v22;
    v54.p1 = v28;
    const std::vector<std::vector<double>> v98 = v26.p1;
    v54.p0 = v38;
    v54.p0 = v38;
    v54.p1 = v98;
    return v69;
  }
  s2 f21(const s2 &v0) {
    const std::vector<s0> v1 = v0.p2;
    const s0 v6 = v1[0];
    const s0 v4 = v1[0];
    const s2 v19 = f85(v0);
    const std::vector<s0> v9 = v19.p2;
    const s2 v18 = f85(v19);
    const s2 v13 = f85(v19);
    s2 v14 = v19;
    const std::vector<s0> v30 = v19.p2;
    const std::vector<s0> v15 = v18.p2;
    v14.p2 = v1;
    const s2 v51 = f85(v14);
    const s0 v16 = v9[0];
    v14.p2 = v1;
    v14.p0 = v4;
    v14.p0 = v6;
    v14.p2 = v1;
    const std::vector<s0> v27 = v19.p2;
    v14.p0 = v4;
    v14.p0 = v4;
    const std::vector<std::vector<s1>> v44 = v13.p1;
    v14.p0 = v6;
    v14 = v18;
    std::vector<std::vector<s1>> v76 = v44;
    const s11 v38(v14, v76);
    const s2 v58 = f85(v51);
    const s0 v42 = v27[0];
    s2 v50 = v58;
    v50.p2 = v15;
    v14.p0 = v42;
    v14.p0 = v16;
    const std::vector<std::vector<s1>> v177 = v38.p1;
    v50.p1 = v177;
    v50.p2 = v30;
    return v50;
  }
  std::vector<s1> f16(const s11 &v0, const std::vector<s1> &v1) {
    const std::vector<std::vector<s1>> v8 = v0.p1;
    std::vector<std::vector<s1>> v72 = v8;
    const std::vector<s1> v156 = v72[0];
    return v156;
  }
  s1 f14(const s2 &v0, const s1 &v1, const s11 &v2) {
    s2 v4 = v0;
    s1 v7 = v1;
    s1 v3 = v7;
    s2 v9 = v0;
    const s2 v16 = f85(v4);
    const s0 v18 = v3.p0;
    v4.p0 = v18;
    const s2 v12 = v2.p0;
    const s2 v20 = f21(v9);
    const s1 v43 = f68(v20, v3);
    const s1 v112 = f68(v12, v43);
    const s1 v106 = f68(v16, v112);
    return v106;
  }
  s11 f6(const s2 &v0, const s11 &v1) {
    s11 v2 = v1;
    v2.p0 = v0;
    const s2 v3 = f21(v0);
    s2 v6 = v0;
    const std::vector<std::vector<s1>> v7 = v1.p1;
    const std::vector<s1> v5 = v7[0];
    s11 v18 = v2;
    v6.p1 = v7;
    v6.p1 = v7;
    const std::vector<s1> v4 = v7[0];
    const std::vector<std::vector<s1>> v8 = v1.p1;
    s11 v9 = v18;
    const s1 v12 = v4[0];
    const std::vector<s1> v15 = v7[0];
    const std::vector<s1> v14 = v8[0];
    v2.p0 = v0;
    const s2 v11 = f21(v6);
    const s1 v20 = f68(v11, v12);
    const s1 v25 = f14(v0, v20, v9);
    std::vector<std::vector<s1>> v13 = v7;
    const s1 v34 = f79(v25);
    v18.p1 = v13;
    const s11 v31(v3, v7);
    const s0 v35 = v34.p0;
    const std::vector<s1> v41 = f16(v31, v15);
    s0 v27 = v35;
    const std::vector<s0> v36 = v25.p1;
    v13[0] = v5;
    v6.p0 = v27;
    v2.p0 = v3;
    v13[0] = v14;
    const s2 v102 = f85(v0);
    const s0 v49 = v36[2];
    const s2 v51 = v1.p0;
    v2 = v18;
    s2 v40 = v102;
    v13[0] = v41;
    const s0 v78 = v36[0];
    v40.p0 = v78;
    const s2 v131 = f85(v11);
    const std::vector<s2> v67 { v51, v102, v3, v131, v40, v6, v51 };
    const s2 v62 = v67[6];
    const s11 v128(v62, v13);
    const s2 v91 = v1.p0;
    const s2 v227 = f21(v91);
    const s2 v266 = v67[1];
    v18.p0 = v227;
    const std::vector<std::vector<double>> v155 = v49.p1;
    v27.p1 = v155;
    v9.p0 = v266;
    return v128;
  }
  __attribute__((noinline))
  double f0(const std::vector<s11> &v0, const double &v1) {
    std::vector<s11> v4 = v0;
    const s11 v2 = v0[2];
    const s11 v11 = v4[0];
    v4[2] = v2;
    const s11 v13 = v4[2];
    const s2 v15 = v11.p0;
    const s11 v23 = f6(v15, v2);
    const s2 v24 = f85(v15);
    v4[1] = v23;
    const s11 v43 = v4[0];
    const s0 v42 = v24.p0;
    v4[0] = v13;
    v4[2] = v13;
    const std::vector<std::vector<double>> v35 = v42.p1;
    const std::vector<double> v73 = v35[0];
    const double v103 = v73[0];
    v4[1] = v43;
    return v103;
  }
  int main() {
    std::vector<s11> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } } } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } }, { { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } }, { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } } } } } }, { { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } }, { { { { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } }, { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } }, { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } } } } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } } } }, { { { { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 } } }, { { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 } } }, { { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 } } } } } } } }, { { { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 } } }, { { { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 } } }, { { { { 88.0 }, { 89.0 }, { 90.0 } }, { { 91.0 } } }, { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 } } }, { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 } } } } } } }, { { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 } } } } }, { { { { { { 104.0 }, { 105.0 }, { 106.0 } }, { { 107.0 } } }, { { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 } } }, { { { 112.0 }, { 113.0 }, { 114.0 } }, { { 115.0 } } }, { { { 116.0 }, { 117.0 }, { 118.0 } }, { { 119.0 } } } } } } } } });
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
