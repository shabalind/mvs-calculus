  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<std::vector<s0>> p1;
    s2(std::vector<s1> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  s2 f86(const s2 &v0) {
    s2 v1 = v0;
    s2 v8 = v0;
    const std::vector<std::vector<s0>> v3 = v8.p1;
    v1 = v8;
    const std::vector<s2> v5 { v0 };
    std::vector<s2> v6 = v5;
    const std::vector<std::vector<s0>> v7 = v8.p1;
    const std::vector<s1> v11 = v1.p0;
    v1.p0 = v11;
    v6[0] = v1;
    const std::vector<s1> v4 = v8.p0;
    std::vector<std::vector<s0>> v9 = v7;
    v8.p1 = v9;
    v1.p0 = v4;
    const s2 v43 = v6[0];
    v8.p1 = v3;
    return v43;
  }
  s0 f85(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p0;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<double> v1 = v3[0];
    s0 v6 = v0;
    v6.p1 = v2;
    std::vector<std::vector<double>> v5 = v3;
    std::vector<double> v4 = v1;
    std::vector<std::vector<double>> v9 = v5;
    s0 v8 = v0;
    const std::vector<double> v12 = v2[2];
    const std::vector<std::vector<double>> v10 = v0.p0;
    const std::vector<std::vector<double>> v7 = v6.p1;
    v5[0] = v12;
    v5[0] = v4;
    const std::vector<double> v11 = v10[0];
    const std::vector<double> v17 = v5[0];
    const std::vector<std::vector<std::vector<double>>> v14 { v10, v9, v10, v5, v9 };
    const std::vector<std::vector<double>> v24 = v0.p1;
    const std::vector<std::vector<std::vector<double>>> v16 { v9, v5, v5, v3, v9, v5 };
    std::vector<std::vector<std::vector<double>>> v29 = v16;
    v6.p1 = v24;
    const std::vector<std::vector<double>> v23 = v14[1];
    std::vector<std::vector<std::vector<double>>> v22 = v16;
    v29[0] = v5;
    const std::vector<std::vector<double>> v19 = v0.p0;
    v22[3] = v10;
    v6.p0 = v3;
    const std::vector<std::vector<double>> v31 = v22[0];
    const std::vector<std::vector<double>> v21 = v0.p0;
    v8.p0 = v23;
    v8.p0 = v23;
    const std::vector<std::vector<double>> v32 = v14[4];
    std::vector<std::vector<double>> v47 = v7;
    const std::vector<std::vector<double>> v72 = v22[0];
    const std::vector<std::vector<std::vector<std::vector<double>>>> v20 { v14, v14, v14, v14, v14 };
    const std::vector<std::vector<double>> v46 = v0.p1;
    const s0 v27(v21, v7);
    v6.p0 = v5;
    v6.p1 = v7;
    const std::vector<std::vector<double>> v33 = v8.p0;
    v6.p1 = v47;
    const std::vector<std::vector<double>> v41 = v8.p0;
    std::vector<std::vector<std::vector<double>>> v28 = v14;
    v8.p0 = v9;
    v6.p0 = v9;
    v29[3] = v41;
    const std::vector<std::vector<double>> v40 = v28[2];
    v29[3] = v21;
    std::vector<std::vector<std::vector<double>>> v39 = v28;
    const std::vector<std::vector<double>> v36 = v6.p1;
    const std::vector<std::vector<double>> v42 = v27.p1;
    v6.p1 = v2;
    const std::vector<double> v35 = v36[2];
    const std::vector<std::vector<double>> v53 = v39[4];
    const std::vector<std::vector<double>> v38 = v29[1];
    v47[2] = v1;
    const std::vector<std::vector<double>> v43 = v27.p0;
    const std::vector<std::vector<double>> v51 = v0.p1;
    v9[0] = v11;
    v6.p1 = v46;
    const std::vector<std::vector<double>> v60 = v0.p1;
    v8.p1 = v7;
    v9 = v38;
    v39[1] = v23;
    const std::vector<std::vector<double>> v104 = v6.p0;
    s0 v94 = v0;
    v94.p1 = v2;
    v8.p0 = v19;
    v47 = v42;
    v8.p0 = v104;
    s0 v77 = v6;
    std::vector<std::vector<double>> v172 = v53;
    const std::vector<std::vector<double>> v106 = v6.p1;
    v77.p1 = v42;
    const std::vector<std::vector<std::vector<double>>> v164 = v20[3];
    const std::vector<std::vector<double>> v129 = v0.p1;
    const std::vector<std::vector<double>> v134 = v94.p1;
    v8.p0 = v5;
    v9[0] = v17;
    v77.p1 = v134;
    v94.p1 = v106;
    v39[4] = v43;
    v6.p1 = v46;
    v6.p0 = v33;
    v94.p0 = v32;
    v6.p1 = v129;
    const std::vector<std::vector<double>> v170 = v77.p1;
    v94.p1 = v60;
    const std::vector<std::vector<double>> v109 = v164[1];
    v5[0] = v35;
    v77.p0 = v172;
    v6.p1 = v51;
    const std::vector<std::vector<double>> v124 = v6.p0;
    const s0 v160(v72, v42);
    s0 v143 = v160;
    v77.p1 = v36;
    v39[2] = v109;
    v77.p0 = v31;
    v6.p0 = v40;
    v143.p1 = v36;
    v143.p1 = v129;
    v22[0] = v124;
    v143.p1 = v170;
    v143.p1 = v134;
    v22[5] = v109;
    return v143;
  }
  s2 f84(const s2 &v0) {
    const s2 v2 = f86(v0);
    const s2 v8 = f86(v2);
    const std::vector<std::vector<s0>> v16 = v8.p1;
    const std::vector<s1> v21 = v0.p0;
    const s2 v54(v21, v16);
    const s2 v35 = f86(v54);
    const s2 v49 = f86(v2);
    const s2 v85 = f86(v8);
    const s2 v58 = f86(v85);
    const std::vector<s2> v98 { v58, v49, v85, v58, v35 };
    const s2 v161 = v98[1];
    const s2 v205 = f86(v161);
    return v205;
  }
  s0 f59(const s2 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v2 = v1.p1;
    const s0 v4 = f85(v1);
    s0 v6 = v4;
    std::vector<std::vector<double>> v5 = v2;
    v6.p1 = v2;
    v5 = v2;
    v6.p1 = v2;
    const std::vector<double> v18 = v5[2];
    v5[0] = v18;
    v6.p1 = v2;
    const std::vector<std::vector<double>> v19 = v6.p0;
    v6.p1 = v5;
    const s0 v66(v19, v5);
    return v66;
  }
  s2 f25(const s2 &v0, const s2 &v1) {
    const std::vector<std::vector<s0>> v7 = v0.p1;
    s2 v5 = v1;
    const std::vector<s0> v4 = v7[0];
    v5.p1 = v7;
    const std::vector<s0> v3 = v7[0];
    std::vector<std::vector<s0>> v2 = v7;
    const std::vector<std::vector<s0>> v8 = v0.p1;
    const std::vector<s0> v12 = v8[0];
    v2[0] = v4;
    v2[0] = v3;
    v2[0] = v12;
    v5.p1 = v2;
    const s2 v30 = f84(v5);
    return v30;
  }
  double f22(const double &v0, const std::vector<std::vector<s0>> &v1, const s2 &v2) {
    const s2 v13 = f25(v2, v2);
    const std::vector<s1> v9 = v13.p0;
    const s1 v17 = v9[0];
    const std::vector<std::vector<s0>> v15 = v17.p0;
    const std::vector<s0> v18 = v15[1];
    const s0 v34 = v18[0];
    const s0 v16 = f85(v34);
    const std::vector<std::vector<double>> v36 = v16.p1;
    const std::vector<double> v58 = v36[0];
    const double v76 = v58[0];
    return v76;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s1 &v1, const s2 &v2, const std::vector<std::vector<s0>> &v3, const double &v4) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    std::vector<std::vector<double>> v9 = v6;
    const s0 v7 = v1.p1;
    const s0 v20 = f59(v2, v7);
    const s2 v13 = f25(v2, v2);
    const s2 v16 = f84(v13);
    const std::vector<double> v19 = v9[0];
    double v30 = v4;
    v9[0] = v19;
    v30 = v4;
    v30 = v4;
    std::vector<double> v34 = v19;
    const double v32 = v34[0];
    const std::vector<std::vector<double>> v31 = v20.p1;
    const std::vector<double> v45 = v9[0];
    v9[0] = v19;
    const std::vector<double> v66 = v31[0];
    const double v84 = f22(v32, v3, v16);
    const double v46 = v4 + v84;
    v9[0] = v34;
    double v72 = v46;
    v34 = v45;
    const double v138 = v46 / v72;
    v34[0] = v30;
    v9[0] = v66;
    v34[0] = v84;
    v34[0] = v72;
    return v138;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } });
    s1 v1({ { { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } });
    s2 v2({ { { { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } }, { { { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } }, { { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } } } } });
    std::vector<std::vector<s0>> v3({ { { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } });
    double v4(48.0);
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
