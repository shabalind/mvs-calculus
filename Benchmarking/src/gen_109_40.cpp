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
    std::vector<std::vector<s1>> p0;
    s0 p1;
    s2(std::vector<std::vector<s1>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f44(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<std::vector<double>> v4 = v5.p0;
    const std::vector<std::vector<double>> v6 = v5.p1;
    v5.p0 = v4;
    s0 v11 = v0;
    v5.p0 = v4;
    v11.p1 = v6;
    const std::vector<std::vector<double>> v12 = v11.p1;
    std::vector<std::vector<double>> v14 = v12;
    const std::vector<double> v29 = v6[0];
    const s0 v17(v4, v12);
    v14[1] = v29;
    const std::vector<std::vector<double>> v16 = v0.p1;
    const std::vector<std::vector<double>> v21 = v17.p0;
    const std::vector<double> v35 = v16[0];
    v11.p0 = v4;
    const std::vector<std::vector<double>> v19 = v11.p1;
    std::vector<std::vector<double>> v32 = v4;
    const s0 v44(v32, v14);
    const std::vector<std::vector<double>> v70 = v44.p0;
    const std::vector<std::vector<double>> v25 = v11.p1;
    const std::vector<double> v39 = v25[0];
    std::vector<std::vector<double>> v47 = v21;
    const std::vector<double> v54 = v19[1];
    v47[0] = v39;
    v11.p1 = v14;
    std::vector<std::vector<double>> v66 = v47;
    v32[0] = v54;
    v14[1] = v54;
    const std::vector<double> v76 = v4[2];
    const std::vector<std::vector<std::vector<double>>> v125 { v70, v66 };
    v11.p0 = v66;
    const std::vector<std::vector<double>> v60 = v125[0];
    const std::vector<std::vector<double>> v78 = v17.p0;
    v14[0] = v76;
    s0 v42 = v0;
    v11.p0 = v21;
    const std::vector<std::vector<double>> v91 = v5.p1;
    v66[1] = v35;
    const s0 v145(v60, v91);
    v11.p0 = v21;
    v5 = v42;
    v11.p0 = v70;
    v42.p0 = v21;
    v42.p0 = v78;
    return v145;
  }
  s1 f40(const s1 &v0) {
    return v0;
  }
  s1 f39(const s1 &v0) {
    const std::vector<s0> v6 = v0.p1;
    const s0 v5 = v6[0];
    const s1 v4 = f40(v0);
    const s1 v14 = f40(v4);
    const std::vector<s0> v1 = v4.p1;
    const s1 v31(v5, v6);
    const s1 v12 = f40(v31);
    const s1 v28 = f40(v12);
    s1 v100 = v14;
    v100.p1 = v1;
    v100.p1 = v6;
    v100 = v28;
    return v100;
  }
  s0 f38(const s0 &v0) {
    s0 v3 = v0;
    const std::vector<std::vector<double>> v6 = v0.p1;
    const std::vector<std::vector<double>> v5 = v0.p0;
    s0 v9 = v0;
    const s0 v7 = f44(v3);
    std::vector<std::vector<double>> v2 = v5;
    const std::vector<double> v4 = v2[0];
    std::vector<std::vector<double>> v8 = v6;
    const std::vector<double> v11 = v8[0];
    const std::vector<double> v12 = v8[0];
    const std::vector<double> v13 = v5[1];
    std::vector<std::vector<double>> v17 = v8;
    v3.p0 = v5;
    v17[0] = v11;
    v9.p1 = v17;
    v2[0] = v13;
    const s0 v15 = f44(v9);
    const std::vector<double> v10 = v8[1];
    const std::vector<std::vector<double>> v14 = v7.p0;
    v17[1] = v12;
    v3.p1 = v17;
    const std::vector<std::vector<double>> v18 = v15.p1;
    v2[2] = v4;
    const std::vector<std::vector<double>> v28 = v7.p0;
    const std::vector<std::vector<double>> v33 = v3.p0;
    const std::vector<double> v50 = v33[1];
    std::vector<std::vector<double>> v58 = v6;
    v17[1] = v4;
    std::vector<std::vector<double>> v19 = v2;
    const std::vector<std::vector<double>> v38 = v0.p0;
    const s0 v23 = f44(v3);
    v8[1] = v10;
    v3.p0 = v28;
    s0 v69 = v23;
    v69.p0 = v28;
    v9.p0 = v38;
    v19[2] = v10;
    v58[1] = v4;
    v2[0] = v50;
    v69.p0 = v14;
    v69.p1 = v18;
    const s0 v68 = f44(v15);
    const std::vector<double> v76 = v58[1];
    v2[1] = v76;
    const std::vector<std::vector<double>> v67 = v68.p1;
    v8[0] = v12;
    v3.p0 = v19;
    s0 v96 = v69;
    v9.p1 = v67;
    return v96;
  }
  s1 f25(const s1 &v0) {
    const s0 v6 = v0.p0;
    const s0 v3 = f38(v6);
    s1 v17 = v0;
    const s1 v94 = f39(v17);
    s1 v53 = v94;
    const std::vector<s0> v131 = v53.p1;
    const s1 v114(v3, v131);
    return v114;
  }
  s1 f18(const s1 &v0, const s1 &v1) {
    const s0 v9 = v0.p0;
    const s1 v13 = f39(v0);
    s1 v18 = v13;
    s1 v36 = v13;
    v36 = v18;
    const s1 v39 = f25(v36);
    v36.p0 = v9;
    const s1 v422 = f39(v39);
    return v422;
  }
  s1 f15(const s1 &v0) {
    s1 v5 = v0;
    s1 v6 = v0;
    const s0 v7 = v6.p0;
    const s0 v11 = f44(v7);
    v6 = v0;
    s1 v13 = v5;
    const std::vector<s0> v2 = v6.p1;
    v13.p0 = v7;
    v6.p1 = v2;
    const s1 v54 = f40(v13);
    v13.p0 = v11;
    return v54;
  }
  s1 f13(const s1 &v0, const s1 &v1) {
    const s1 v4 = f15(v1);
    const s1 v19 = f18(v4, v4);
    return v19;
  }
  s1 f10(const s1 &v0) {
    s1 v6 = v0;
    const std::vector<s0> v3 = v6.p1;
    v6.p1 = v3;
    const std::vector<s0> v7 = v0.p1;
    const s0 v5 = v7[2];
    s0 v2 = v5;
    const s0 v4 = v3[2];
    std::vector<s0> v1 = v7;
    v6.p1 = v3;
    const s1 v11 = f15(v0);
    s0 v14 = v2;
    const s0 v12 = v11.p0;
    v1[1] = v14;
    const s1 v17 = f40(v6);
    const s1 v28 = f39(v6);
    const s0 v22 = v1[0];
    const s1 v46 = f18(v28, v17);
    const s0 v27 = f38(v2);
    const std::vector<std::vector<double>> v19 = v4.p1;
    const std::vector<std::vector<std::vector<double>>> v36 { v19, v19, v19 };
    const std::vector<std::vector<double>> v60 = v36[1];
    v6.p0 = v5;
    s0 v37 = v27;
    v37.p1 = v60;
    s0 v70 = v12;
    const std::vector<std::vector<double>> v48 = v36[1];
    v1[2] = v70;
    const s1 v39 = f15(v46);
    v6.p0 = v27;
    v6.p0 = v37;
    v70.p1 = v60;
    std::vector<std::vector<double>> v84 = v48;
    const s1 v184 = f13(v39, v46);
    v6.p0 = v22;
    const s1 v127 = f15(v184);
    v14.p1 = v84;
    return v127;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const std::vector<std::vector<s2>> &v1, const double &v2) {
    const std::vector<s2> v3 = v1[0];
    const s2 v14 = v3[0];
    const std::vector<std::vector<s1>> v9 = v14.p0;
    const std::vector<s1> v20 = v9[2];
    const s1 v19 = v20[0];
    const s1 v17 = f10(v19);
    const std::vector<s0> v18 = v17.p1;
    const s0 v31 = v18[0];
    const std::vector<std::vector<double>> v41 = v31.p1;
    std::vector<std::vector<double>> v32 = v41;
    const std::vector<double> v83 = v32[0];
    v32[1] = v83;
    const std::vector<std::vector<double>> v99 = v31.p1;
    v32[0] = v83;
    std::vector<double> v103 = v83;
    const double v69 = v103[0];
    v32 = v99;
    std::vector<std::vector<double>> v71 = v41;
    const std::vector<double> v112 = v71[0];
    const double v134 = v112[0];
    double v169 = v2;
    const double v132 = v134 + v169;
    const double v215 = v132 - v69;
    return v215;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } } }, { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } }, { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } }, { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } } } });
    std::vector<std::vector<s2>> v1({ { { { { { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } }, { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } }, { { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } } } }, { { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 } } }, { { { { 65.0 }, { 66.0 }, { 67.0 } }, { { 68.0 }, { 69.0 } } }, { { { 70.0 }, { 71.0 }, { 72.0 } }, { { 73.0 }, { 74.0 } } }, { { { 75.0 }, { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } } } } }, { { { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 }, { 84.0 } } }, { { { { 85.0 }, { 86.0 }, { 87.0 } }, { { 88.0 }, { 89.0 } } }, { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 } } }, { { { 95.0 }, { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } } } } } }, { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 }, { 104.0 } } } } } });
    double v2(105.0);
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
