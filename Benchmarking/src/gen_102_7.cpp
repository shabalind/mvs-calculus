  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s2(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s0> p0;
    s2 p1;
    s4(std::vector<s0> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    std::vector<s2> p0;
    s4 p1;
    s8(std::vector<s2> v0, s4 v1): p0(v0), p1(v1) { }
  };
  s2 f101(const s2 &v0) {
    return v0;
  }
  s2 f85(const s2 &v0) {
    const s2 v14 = f101(v0);
    const s2 v19 = f101(v14);
    const s2 v12 = f101(v19);
    return v12;
  }
  s8 f81(const s8 &v0) {
    const std::vector<s2> v1 = v0.p0;
    const s2 v7 = v1[0];
    std::vector<s2> v8 = v1;
    std::vector<s2> v3 = v1;
    const s2 v4 = f101(v7);
    std::vector<s2> v2 = v3;
    const s2 v12 = f85(v7);
    v3 = v8;
    v8[0] = v7;
    s8 v43 = v0;
    v2[0] = v4;
    const s2 v28 = f101(v12);
    v43.p0 = v2;
    const s2 v75 = f85(v28);
    const s4 v69 = v43.p1;
    v43.p1 = v69;
    v3[0] = v75;
    return v43;
  }
  s8 f76(const s8 &v0) {
    const std::vector<s2> v7 = v0.p0;
    std::vector<s2> v1 = v7;
    const s8 v6 = f81(v0);
    const s2 v3 = v7[0];
    const s2 v4 = v7[0];
    const s2 v9 = v7[0];
    s2 v10 = v3;
    s8 v8 = v6;
    std::vector<s2> v2 = v7;
    const s2 v24 = f85(v10);
    const s2 v29 = f101(v10);
    v8.p0 = v2;
    s8 v12 = v8;
    const s2 v18 = f85(v9);
    const s2 v32 = v7[0];
    const std::vector<s0> v15 = v24.p1;
    std::vector<s2> v33 = v7;
    v10.p1 = v15;
    const s4 v17 = v12.p1;
    v33[0] = v18;
    v8.p1 = v17;
    const std::vector<s0> v59 = v17.p0;
    s4 v28 = v17;
    v12.p0 = v33;
    v8 = v0;
    std::vector<s0> v65 = v59;
    const s2 v19 = f85(v3);
    v33[0] = v3;
    const s2 v69 = f101(v32);
    const std::vector<s0> v37 = v4.p0;
    v28.p1 = v29;
    std::vector<s2> v137 = v2;
    v33[0] = v29;
    std::vector<s2> v58 = v137;
    std::vector<s2> v48 = v58;
    const s2 v74 = v58[0];
    v28.p0 = v65;
    v8.p0 = v1;
    std::vector<s0> v86 = v37;
    v2[0] = v29;
    v58[0] = v19;
    v28.p1 = v3;
    v137 = v58;
    v1[0] = v69;
    v2[0] = v18;
    v12 = v8;
    const s8 v191(v48, v28);
    v10.p0 = v86;
    v33[0] = v74;
    return v191;
  }
  s8 f44(const s8 &v0) {
    const s8 v1 = f81(v0);
    const std::vector<s2> v4 = v0.p0;
    const s8 v5 = f76(v1);
    const s2 v3 = v4[0];
    const std::vector<s0> v8 = v3.p1;
    s2 v17 = v3;
    std::vector<s2> v2 = v4;
    const s0 v9 = v8[1];
    s0 v23 = v9;
    s2 v10 = v17;
    s2 v15 = v10;
    const s2 v13 = v2[0];
    const s2 v12 = v4[0];
    s2 v11 = v12;
    v11 = v15;
    v10.p1 = v8;
    s0 v18 = v23;
    const s0 v21 = v8[1];
    v2[0] = v13;
    s8 v41 = v5;
    v15.p1 = v8;
    v2[0] = v11;
    v11.p1 = v8;
    const s2 v28 = v2[0];
    v41.p0 = v2;
    const s0 v36 = v8[0];
    std::vector<s0> v51 = v8;
    const std::vector<std::vector<double>> v54 = v21.p0;
    const s0 v25 = v8[1];
    std::vector<s0> v34 = v8;
    std::vector<std::vector<double>> v38 = v54;
    const s0 v40 = v51[2];
    s0 v30 = v36;
    const s0 v47 = v51[2];
    const s4 v52 = v1.p1;
    v34[1] = v30;
    const std::vector<double> v89 = v54[1];
    v34[1] = v36;
    std::vector<s0> v102 = v34;
    v51[2] = v40;
    s0 v77 = v18;
    v102[1] = v47;
    v10.p1 = v102;
    s4 v114 = v52;
    v102[1] = v25;
    v2[0] = v10;
    v23.p0 = v54;
    v38[0] = v89;
    v102[2] = v25;
    v30.p0 = v38;
    v34[0] = v77;
    s0 v190 = v30;
    s4 v104 = v114;
    v15.p1 = v51;
    s8 v234 = v41;
    v34[2] = v9;
    v51[2] = v190;
    v234.p1 = v104;
    v17.p1 = v102;
    v114.p1 = v28;
    const std::vector<s0> v250 = v15.p0;
    v11.p0 = v250;
    return v234;
  }
  s8 f24(const s8 &v0) {
    const std::vector<s2> v5 = v0.p0;
    std::vector<s2> v8 = v5;
    std::vector<s2> v1 = v5;
    const std::vector<s2> v6 = v0.p0;
    const s2 v2 = v6[0];
    s8 v14 = v0;
    v14.p0 = v1;
    const s2 v3 = f85(v2);
    const s4 v11 = v14.p1;
    const s8 v25 = f44(v14);
    s4 v10 = v11;
    s8 v18 = v25;
    v8[0] = v3;
    v14.p0 = v6;
    const s2 v12 = v11.p1;
    const s2 v63 = v8[0];
    v10 = v11;
    v1[0] = v12;
    const std::vector<s0> v43 = v10.p0;
    const s8 v87 = f44(v14);
    v10.p0 = v43;
    v18.p1 = v11;
    v1[0] = v63;
    v18.p1 = v11;
    v14.p1 = v10;
    const s4 v46 = v87.p1;
    const s2 v118 = v8[0];
    const s4 v117 = v0.p1;
    v1[0] = v118;
    v18.p1 = v10;
    v14.p1 = v46;
    v1[0] = v2;
    v18.p1 = v117;
    return v18;
  }
  s4 f15(const s4 &v0, const s8 &v1) {
    const std::vector<s0> v32 = v0.p0;
    const s4 v46 = v1.p1;
    s4 v139 = v46;
    v139.p0 = v32;
    return v139;
  }
  __attribute__((noinline))
  double f0(const std::vector<s8> &v0, const double &v1) {
    const std::vector<double> v7 { v1, v1, v1, v1, v1, v1 };
    std::vector<s8> v3 = v0;
    const s8 v9 = v3[1];
    const double v6 = v7[2];
    const s4 v8 = v9.p1;
    v3 = v0;
    std::vector<s8> v11 = v0;
    v3 = v0;
    v11[0] = v9;
    const s4 v5 = f15(v8, v9);
    v11[0] = v9;
    const s8 v17 = v0[0];
    const s8 v34 = f24(v9);
    const std::vector<s2> v21 = v17.p0;
    const s8 v32 = f24(v34);
    v3[0] = v34;
    s8 v38 = v32;
    const std::vector<s2> v39 = v32.p0;
    v11[1] = v9;
    const s4 v60 = v38.p1;
    const s8 v41 = v0[0];
    v11[1] = v34;
    v11[0] = v32;
    const s8 v50 = v11[0];
    v38.p1 = v5;
    v38.p1 = v60;
    const std::vector<s0> v69 = v5.p0;
    v3[0] = v17;
    v3[0] = v50;
    const s0 v90 = v69[0];
    std::vector<s2> v56 = v21;
    const s8 v63 = f24(v34);
    const std::vector<std::vector<double>> v101 = v90.p0;
    v38.p1 = v8;
    v11[1] = v41;
    v11[1] = v50;
    const std::vector<double> v87 = v101[0];
    v38.p0 = v39;
    v11[0] = v38;
    v11[1] = v63;
    v38.p0 = v56;
    const double v107 = v87[0];
    const double v296 = v107 * v6;
    v3[1] = v32;
    return v296;
  }
  int main() {
    std::vector<s8> v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } } }, { { { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 } } }, { { { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 } } } } } } }, { { { { { { { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 } } } }, { { { { 39.0 }, { 40.0 } }, { { 41.0 } } }, { { { 42.0 }, { 43.0 } }, { { 44.0 } } }, { { { 45.0 }, { 46.0 } }, { { 47.0 } } } } } }, { { { { { 48.0 }, { 49.0 } }, { { 50.0 } } } }, { { { { { 51.0 }, { 52.0 } }, { { 53.0 } } }, { { { 54.0 }, { 55.0 } }, { { 56.0 } } } }, { { { { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 } } }, { { { 63.0 }, { 64.0 } }, { { 65.0 } } } } } } } });
    double v1(66.0);
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
