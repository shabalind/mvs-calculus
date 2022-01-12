  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s0 p2;
    s1(std::vector<std::vector<s0>> v0, s0 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s1> p1;
    s2(s1 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  double f50(const double &v0) {
    double v5 = v0;
    v5 = v0;
    double v6 = v0;
    double v1 = v5;
    double v7 = v6;
    const double v2 = v1 / v1;
    const double v3 = v7 * v6;
    double v4 = v7;
    double v10 = v2;
    const std::vector<double> v8 { v4 };
    const double v11 = v8[0];
    double v18 = v3;
    std::vector<double> v14 = v8;
    std::vector<double> v33 = v14;
    v10 = v2;
    double v15 = v11;
    double v19 = v10;
    double v86 = v15;
    const double v30 = v14[0];
    double v23 = v3;
    v14[0] = v30;
    double v29 = v7;
    v14[0] = v19;
    std::vector<double> v35 = v33;
    const double v55 = v14[0];
    v23 = v11;
    v33[0] = v30;
    v1 = v29;
    v33[0] = v55;
    std::vector<double> v28 = v8;
    std::vector<double> v66 = v28;
    double v20 = v18;
    const double v48 = v28[0];
    v14[0] = v30;
    v28[0] = v0;
    v33[0] = v86;
    const double v71 = v8[0];
    const std::vector<std::vector<double>> v70 { v35, v33, v14, v66, v14 };
    v28[0] = v23;
    std::vector<double> v51 = v66;
    std::vector<std::vector<double>> v52 = v70;
    std::vector<std::vector<double>> v54 = v52;
    v52[1] = v28;
    const std::vector<double> v103 = v54[0];
    v28[0] = v20;
    v51[0] = v48;
    std::vector<double> v154 = v103;
    const double v123 = v51[0];
    v14[0] = v123;
    const double v167 = v154[0];
    v14[0] = v71;
    return v167;
  }
  s2 f43(const s2 &v0) {
    s2 v1 = v0;
    const std::vector<s1> v7 = v1.p1;
    s2 v3 = v1;
    s2 v30 = v3;
    v1.p1 = v7;
    return v30;
  }
  s2 f29(const s2 &v0) {
    const s2 v1 = f43(v0);
    s2 v4 = v1;
    s2 v2 = v1;
    const std::vector<s2> v3 { v4, v1, v0, v2, v1, v0, v1 };
    v4 = v0;
    const s2 v19 = v3[2];
    const s2 v36 = f43(v19);
    const s2 v35 = f43(v36);
    const s2 v24 = f43(v35);
    return v24;
  }
  double f14(const double &v0) {
    const std::vector<double> v6 { v0, v0, v0 };
    const double v2 = v6[0];
    const double v1 = f50(v2);
    const double v5 = v6[2];
    std::vector<double> v7 = v6;
    v7[1] = v5;
    const double v3 = v7[0];
    v7 = v6;
    std::vector<double> v10 = v7;
    const double v13 = v7[2];
    v10[0] = v13;
    const double v9 = f50(v2);
    const double v18 = f50(v0);
    const double v16 = f50(v9);
    const double v19 = f50(v13);
    v10[1] = v18;
    const double v12 = f50(v9);
    const double v15 = f50(v16);
    std::vector<double> v20 = v6;
    std::vector<double> v17 = v6;
    double v27 = v13;
    std::vector<double> v34 = v10;
    const double v40 = v15 / v16;
    const double v29 = f50(v15);
    v20[0] = v12;
    v10[1] = v27;
    double v31 = v0;
    std::vector<double> v30 = v6;
    const double v35 = f50(v13);
    double v21 = v29;
    v34[0] = v35;
    const double v23 = v20[0];
    std::vector<double> v106 = v17;
    v34[2] = v19;
    v10[0] = v3;
    v10 = v7;
    const double v32 = f50(v29);
    double v66 = v27;
    const double v53 = v7[0];
    std::vector<double> v57 = v6;
    const double v71 = v10[0];
    double v62 = v21;
    const double v49 = f50(v32);
    const double v45 = f50(v53);
    v10[0] = v40;
    v20[2] = v1;
    const double v83 = v20[1];
    double v58 = v5;
    const double v95 = f50(v62);
    v30[0] = v66;
    const double v81 = f50(v49);
    const double v82 = f50(v31);
    std::vector<double> v143 = v106;
    const double v107 = f50(v9);
    std::vector<double> v111 = v143;
    v111[1] = v107;
    v111[2] = v95;
    v7[2] = v49;
    std::vector<double> v85 = v111;
    const double v139 = f50(v35);
    v7[1] = v82;
    v143[2] = v3;
    v17[2] = v23;
    v57[2] = v107;
    const double v227 = v111[0];
    v106[2] = v227;
    v30[2] = v139;
    v7[1] = v71;
    const std::vector<std::vector<double>> v289 { v34, v20, v6, v30, v85, v57, v106 };
    v57[1] = v45;
    const std::vector<double> v194 = v289[3];
    v34[2] = v82;
    const double v110 = v194[2];
    v57[0] = v58;
    v20[1] = v83;
    v85[2] = v81;
    return v110;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const s2 &v1, const double &v2) {
    const s2 v5 = f29(v0);
    const s1 v3 = v5.p0;
    const s1 v10 = v1.p0;
    const s0 v9 = v3.p1;
    s0 v26 = v9;
    const std::vector<std::vector<double>> v23 = v26.p0;
    const std::vector<std::vector<double>> v16 = v26.p0;
    const std::vector<double> v13 = v16[0];
    v26.p0 = v23;
    const std::vector<std::vector<double>> v32 = v9.p0;
    const std::vector<std::vector<s0>> v22 = v3.p0;
    v26.p0 = v16;
    const std::vector<double> v60 = v32[1];
    const double v50 = v13[0];
    std::vector<std::vector<s0>> v47 = v22;
    std::vector<double> v54 = v60;
    v26.p0 = v16;
    const double v166 = v54[0];
    const double v71 = v50 - v166;
    const std::vector<s0> v53 = v47[0];
    const std::vector<std::vector<s0>> v93 = v10.p0;
    const s0 v112 = v53[0];
    const std::vector<s0> v78 = v93[2];
    std::vector<s0> v102 = v78;
    std::vector<s0> v118 = v102;
    v47[2] = v118;
    const double v149 = f14(v71);
    v102[0] = v26;
    const std::vector<std::vector<double>> v120 = v112.p0;
    v26.p0 = v120;
    return v149;
  }
  int main() {
    s2 v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } } } }, { { { { 3.0 }, { 4.0 }, { 5.0 } } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } } } } }, { { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } } } }, { { { { { { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { { 18.0 }, { 19.0 }, { 20.0 } } } }, { { { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { 24.0 }, { 25.0 }, { 26.0 } } }, { { { 27.0 }, { 28.0 }, { 29.0 } } } } } });
    s2 v1({ { { { { { { 30.0 }, { 31.0 }, { 32.0 } } } }, { { { { 33.0 }, { 34.0 }, { 35.0 } } } }, { { { { 36.0 }, { 37.0 }, { 38.0 } } } } }, { { { 39.0 }, { 40.0 }, { 41.0 } } }, { { { 42.0 }, { 43.0 }, { 44.0 } } } }, { { { { { { { 45.0 }, { 46.0 }, { 47.0 } } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } } } }, { { { { 51.0 }, { 52.0 }, { 53.0 } } } } }, { { { 54.0 }, { 55.0 }, { 56.0 } } }, { { { 57.0 }, { 58.0 }, { 59.0 } } } } } });
    double v2(60.0);
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
