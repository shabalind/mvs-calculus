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
    std::vector<s1> p0;
    std::vector<std::vector<s0>> p1;
    std::vector<s0> p2;
    s2(std::vector<s1> v0, std::vector<std::vector<s0>> v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    s1 p0;
    std::vector<s0> p1;
    s3(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f108(const double &v0) {
    double v7 = v0;
    double v5 = v0;
    double v6 = v0;
    double v9 = v7;
    double v2 = v7;
    double v3 = v6;
    double v16 = v7;
    double v15 = v0;
    const double v12 = v16 - v3;
    double v4 = v16;
    const double v30 = v16 - v4;
    double v33 = v6;
    double v22 = v30;
    double v20 = v3;
    const std::vector<double> v41 { v33, v16, v3, v22, v12, v12 };
    std::vector<double> v18 = v41;
    const double v25 = v18[2];
    const double v53 = v18[5];
    double v42 = v53;
    const double v59 = v41[5];
    std::vector<double> v24 = v41;
    double v28 = v9;
    v24[0] = v5;
    std::vector<double> v49 = v24;
    std::vector<double> v71 = v49;
    v24[1] = v25;
    const std::vector<std::vector<double>> v37 { v41 };
    std::vector<double> v43 = v41;
    v49[0] = v12;
    const std::vector<double> v56 = v37[0];
    const std::vector<std::vector<double>> v85 { v56, v18, v41, v49, v41, v24 };
    v24[5] = v28;
    std::vector<std::vector<double>> v45 = v85;
    std::vector<std::vector<double>> v44 = v85;
    v45 = v44;
    v2 = v59;
    v24 = v71;
    v22 = v42;
    std::vector<std::vector<double>> v123 = v44;
    v71[3] = v2;
    std::vector<std::vector<double>> v47 = v123;
    v123[4] = v43;
    v43 = v24;
    v24[2] = v28;
    std::vector<std::vector<double>> v89 = v47;
    const std::vector<std::vector<std::vector<double>>> v94 { v89, v47, v47, v45, v123, v44, v45 };
    v2 = v7;
    std::vector<std::vector<std::vector<double>>> v103 = v94;
    v43[4] = v0;
    v18[0] = v9;
    std::vector<std::vector<std::vector<double>>> v100 = v103;
    const std::vector<std::vector<double>> v78 = v100[4];
    v71[0] = v20;
    const std::vector<double> v80 = v78[4];
    v49[5] = v15;
    const double v259 = v80[3];
    return v259;
  }
  double f73(const double &v0) {
    const double v7 = f108(v0);
    double v5 = v0;
    const double v4 = f108(v7);
    double v11 = v5;
    double v8 = v4;
    const std::vector<double> v14 { v8, v11, v11, v5 };
    const double v9 = v14[1];
    const double v26 = f108(v0);
    std::vector<double> v12 = v14;
    const double v19 = v12[2];
    std::vector<double> v40 = v12;
    std::vector<double> v20 = v40;
    const double v24 = f108(v5);
    const double v43 = f108(v26);
    v12[3] = v7;
    v40 = v14;
    std::vector<double> v25 = v12;
    std::vector<double> v22 = v25;
    const double v28 = v20[3];
    const double v32 = f108(v9);
    std::vector<double> v59 = v25;
    const double v79 = v14[0];
    std::vector<double> v61 = v14;
    v20[2] = v32;
    std::vector<double> v57 = v59;
    std::vector<double> v42 = v40;
    v12[1] = v4;
    const double v34 = v40[0];
    const double v44 = v14[3];
    std::vector<double> v41 = v59;
    std::vector<double> v103 = v61;
    const double v134 = f108(v26);
    std::vector<double> v75 = v61;
    v40[2] = v19;
    const double v63 = f108(v44);
    v103[2] = v134;
    const double v52 = v41[3];
    v42 = v22;
    v41[2] = v34;
    v59[0] = v52;
    v57 = v61;
    v40[0] = v8;
    const double v62 = v14[3];
    v57[3] = v79;
    std::vector<double> v139 = v61;
    v41[0] = v24;
    const std::vector<std::vector<double>> v114 { v57, v103, v139, v75, v61, v42, v12 };
    v61[0] = v62;
    v61 = v40;
    v59[0] = v43;
    const std::vector<double> v81 = v114[6];
    v12[2] = v28;
    const double v119 = f108(v63);
    std::vector<double> v133 = v81;
    v25[2] = v119;
    double v181 = v5;
    const double v116 = v133[0];
    const double v135 = f108(v116);
    v139[1] = v19;
    v42[3] = v181;
    v41[2] = v135;
    return v135;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const s3 &v1, const s2 &v2, const double &v3) {
    const std::vector<s0> v6 = v2.p2;
    const s0 v28 = v6[1];
    double v13 = v3;
    const std::vector<std::vector<double>> v25 = v28.p1;
    const std::vector<double> v26 = v25[0];
    std::vector<double> v34 = v26;
    const double v50 = f73(v13);
    std::vector<double> v60 = v34;
    const double v46 = v60[0];
    v60[0] = v3;
    const double v38 = v34[0];
    v34[0] = v13;
    std::vector<double> v49 = v26;
    const double v87 = v3 + v13;
    v34[0] = v38;
    v49 = v34;
    v60[0] = v50;
    v60[0] = v87;
    v34[0] = v46;
    const double v119 = v49[0];
    return v119;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } });
    s3 v1({ { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } });
    s2 v2({ { { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } }, { { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } } } }, { { { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } } } }, { { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } } } });
    double v3(78.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
