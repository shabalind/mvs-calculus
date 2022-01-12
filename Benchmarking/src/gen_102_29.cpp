  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    std::vector<s0> p1;
    s3(std::vector<s1> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    s2 p1;
    s4(s1 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<std::vector<s3>> p0;
    std::vector<double> p1;
    s6(std::vector<std::vector<s3>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  std::vector<double> f20(const std::vector<double> &v0) {
    const double v3 = v0[1];
    std::vector<double> v7 = v0;
    double v5 = v3;
    const double v8 = v0[0];
    v7[1] = v5;
    double v1 = v8;
    std::vector<double> v6 = v7;
    std::vector<double> v4 = v7;
    std::vector<double> v2 = v6;
    const double v13 = v0[1];
    std::vector<double> v20 = v2;
    double v10 = v13;
    const double v11 = v6[0];
    const double v9 = v20[1];
    std::vector<double> v15 = v20;
    v6 = v20;
    double v22 = v8;
    std::vector<double> v14 = v2;
    double v17 = v13;
    std::vector<double> v12 = v4;
    const double v19 = v7[0];
    v2[0] = v3;
    double v18 = v19;
    std::vector<double> v16 = v7;
    std::vector<double> v23 = v7;
    double v29 = v10;
    const double v21 = v22 - v1;
    const double v25 = v9 * v17;
    std::vector<double> v24 = v7;
    const double v26 = v4[0];
    v15[1] = v17;
    v15 = v6;
    double v67 = v21;
    const double v51 = v24[1];
    double v46 = v25;
    const double v50 = v23[1];
    double v33 = v50;
    v15[1] = v46;
    const double v54 = v7[1];
    std::vector<double> v37 = v14;
    const double v28 = v16[1];
    const double v72 = v14[1];
    v7 = v6;
    v2[0] = v33;
    const double v55 = v12[1];
    double v73 = v8;
    v16[0] = v26;
    const double v70 = v7[1];
    v67 = v72;
    v6[1] = v51;
    v15[0] = v72;
    std::vector<double> v32 = v2;
    v15[1] = v22;
    const double v38 = v16[0];
    v6[1] = v54;
    v23[0] = v10;
    std::vector<double> v58 = v12;
    double v47 = v54;
    v14 = v0;
    std::vector<double> v63 = v37;
    v23[0] = v55;
    const double v79 = v2[0];
    std::vector<double> v99 = v6;
    v20[1] = v46;
    std::vector<double> v36 = v63;
    const double v140 = v2[0];
    v63[0] = v10;
    double v93 = v72;
    std::vector<double> v83 = v36;
    std::vector<double> v86 = v36;
    double v59 = v140;
    v32[1] = v18;
    const double v64 = v12[0];
    double v208 = v29;
    std::vector<double> v53 = v7;
    const double v118 = v15[0];
    const std::vector<std::vector<double>> v113 { v83, v53, v20, v32, v0, v53, v86 };
    v36[0] = v38;
    std::vector<std::vector<double>> v115 = v113;
    const std::vector<double> v68 = v113[0];
    const std::vector<double> v87 = v115[3];
    std::vector<double> v61 = v68;
    const double v119 = v53[0];
    const double v66 = v32[0];
    v36[1] = v10;
    v99[0] = v21;
    v20[1] = v66;
    double v60 = v208;
    const std::vector<std::vector<double>> v121 { v15, v58, v6, v61 };
    v61[0] = v11;
    std::vector<std::vector<double>> v75 = v121;
    v20[1] = v59;
    v6[0] = v28;
    v14[1] = v140;
    std::vector<std::vector<double>> v108 = v75;
    const std::vector<std::vector<double>> v85 { v87, v4 };
    v36[1] = v47;
    const double v111 = v118 + v93;
    v36[1] = v73;
    std::vector<std::vector<double>> v206 = v85;
    v63[1] = v119;
    v4[1] = v67;
    const std::vector<double> v116 = v108[0];
    const std::vector<double> v109 = v206[0];
    v83[1] = v79;
    v58[0] = v70;
    v61[0] = v111;
    v23[1] = v64;
    v12 = v99;
    v61[0] = v60;
    v32[1] = v72;
    v14 = v109;
    return v116;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const s6 &v1, const std::vector<s0> &v2, const s4 &v3, const s3 &v4, const double &v5) {
    const double v7 = v5 - v5;
    s6 v14 = v1;
    double v31 = v7;
    const std::vector<double> v56 = v14.p1;
    const std::vector<double> v19 = f20(v56);
    const double v26 = v19[1];
    const double v85 = v26 - v31;
    const double v261 = v31 / v85;
    return v261;
  }
  int main() {
    s2 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } } }, { { { 3.0 }, { 4.0 }, { 5.0 } } } });
    s6 v1({ { { { { { { { { 6.0 }, { 7.0 }, { 8.0 } } }, { { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 }, { 17.0 } } } } } }, { { { { { { { 18.0 }, { 19.0 }, { 20.0 } } }, { { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } } }, { { { 27.0 }, { 28.0 }, { 29.0 } } } } } }, { { { { { { { 30.0 }, { 31.0 }, { 32.0 } } }, { { { 33.0 }, { 34.0 }, { 35.0 } } } } }, { { { { 36.0 }, { 37.0 }, { 38.0 } } }, { { { 39.0 }, { 40.0 }, { 41.0 } } } } } } }, { 42.0, 43.0 } });
    std::vector<s0> v2({ { { { 44.0 }, { 45.0 }, { 46.0 } } }, { { { 47.0 }, { 48.0 }, { 49.0 } } } });
    s4 v3({ { { { { 50.0 }, { 51.0 }, { 52.0 } } }, { { { 53.0 }, { 54.0 }, { 55.0 } } } }, { { { { 56.0 }, { 57.0 }, { 58.0 } } }, { { { 59.0 }, { 60.0 }, { 61.0 } } } } });
    s3 v4({ { { { { { 62.0 }, { 63.0 }, { 64.0 } } }, { { { 65.0 }, { 66.0 }, { 67.0 } } } } }, { { { { 68.0 }, { 69.0 }, { 70.0 } } }, { { { 71.0 }, { 72.0 }, { 73.0 } } } } });
    double v5(74.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
