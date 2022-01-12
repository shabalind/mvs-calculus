  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<double> p1;
    s0(std::vector<double> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  s0 f27(const s0 &v0, const std::vector<s0> &v1, const s0 &v2, const s0 &v3) {
    std::vector<s0> v8 = v1;
    v8[2] = v2;
    const s0 v7 = v8[2];
    const std::vector<s0> v6 { v7, v0, v2, v3, v3, v0, v2 };
    v8 = v1;
    const s0 v9 = v6[2];
    v8[2] = v9;
    std::vector<s0> v23 = v6;
    std::vector<s0> v20 = v23;
    v23 = v6;
    v23[1] = v2;
    std::vector<s0> v45 = v8;
    const s0 v50 = v45[1];
    v8 = v45;
    const std::vector<std::vector<s0>> v84 { v20, v20, v6 };
    std::vector<s0> v49 = v6;
    std::vector<std::vector<s0>> v58 = v84;
    const std::vector<std::vector<std::vector<s0>>> v114 { v58 };
    std::vector<std::vector<std::vector<s0>>> v95 = v114;
    const std::vector<std::vector<s0>> v94 = v95[0];
    std::vector<s0> v117 = v49;
    const std::vector<s0> v113 = v94[0];
    v58[0] = v117;
    v49[1] = v7;
    const s0 v180 = v113[5];
    v49[1] = v50;
    return v180;
  }
  s0 f25(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<double> v7 = v5.p1;
    const std::vector<double> v8 = v0.p0;
    std::vector<double> v2 = v8;
    std::vector<double> v3 = v2;
    std::vector<double> v1 = v8;
    const std::vector<double> v9 = v0.p1;
    const double v4 = v1[0];
    v5 = v0;
    v5.p0 = v8;
    v5.p0 = v2;
    v1[0] = v4;
    v5.p1 = v1;
    const double v6 = v7[0];
    std::vector<double> v12 = v1;
    const double v22 = v2[0];
    v12[0] = v22;
    const double v24 = v12[0];
    v12[0] = v22;
    double v13 = v24;
    double v33 = v13;
    v5.p1 = v12;
    v5 = v0;
    std::vector<double> v19 = v3;
    const double v38 = v2[0];
    const std::vector<double> v23 = v0.p0;
    s0 v31 = v5;
    v5.p1 = v12;
    s0 v27 = v0;
    v27.p0 = v7;
    const std::vector<double> v59 = v0.p1;
    const std::vector<double> v61 = v31.p1;
    const double v20 = v23[0];
    const std::vector<double> v34 = v5.p1;
    v33 = v13;
    v27 = v31;
    const std::vector<double> v32 = v0.p1;
    const double v46 = v59[0];
    const std::vector<double> v42 = v0.p0;
    v27.p0 = v42;
    const double v41 = v61[0];
    const double v54 = v9[0];
    v2[0] = v46;
    const double v57 = v12[0];
    const std::vector<double> v120 = v5.p1;
    v5.p1 = v32;
    const std::vector<double> v75 = v31.p0;
    v3[0] = v6;
    v5.p1 = v120;
    v3[0] = v46;
    std::vector<double> v47 = v2;
    v19[0] = v54;
    v5.p0 = v19;
    v31.p1 = v34;
    v5.p1 = v23;
    v12[0] = v57;
    const std::vector<double> v79 { v20, v41, v33 };
    const std::vector<double> v103 = v27.p0;
    const std::vector<double> v179 = v27.p0;
    v27.p1 = v47;
    v5.p0 = v23;
    const std::vector<double> v185 = v31.p0;
    v27.p1 = v103;
    std::vector<double> v141 = v7;
    s0 v97 = v0;
    const std::vector<double> v176 = v97.p0;
    v27.p0 = v120;
    v31.p1 = v75;
    std::vector<double> v76 = v79;
    v47[0] = v38;
    v31.p1 = v185;
    const double v306 = v76[2];
    const double v208 = v306 * v24;
    const std::vector<std::vector<double>> v276 { v179, v9 };
    std::vector<std::vector<double>> v160 = v276;
    const std::vector<double> v214 = v160[1];
    v27.p1 = v141;
    v19[0] = v41;
    v97.p1 = v214;
    v27.p0 = v176;
    v3[0] = v208;
    return v27;
  }
  s0 f7(const s0 &v0) {
    const s0 v5 = f25(v0);
    s0 v4 = v5;
    s0 v3 = v4;
    const std::vector<double> v7 = v3.p1;
    const s0 v11(v7, v7);
    v3 = v4;
    const s0 v14 = f25(v11);
    return v14;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s0> &v1, const double &v2) {
    const s0 v5 = f27(v0, v1, v0, v0);
    const s0 v3 = f7(v5);
    const std::vector<double> v12 = v3.p0;
    const std::vector<double> v9 = v5.p0;
    const s0 v18(v12, v9);
    const std::vector<double> v39 = v18.p1;
    const double v42 = v39[0];
    return v42;
  }
  int main() {
    s0 v0({ { 0.0 }, { 1.0 } });
    std::vector<s0> v1({ { { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } });
    double v2(8.0);
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
