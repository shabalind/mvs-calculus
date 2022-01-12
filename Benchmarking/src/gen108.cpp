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
    std::vector<s0> p0;
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  std::vector<double> f121(const std::vector<double> &v0) {
    const std::vector<std::vector<double>> v1 { v0 };
    std::vector<std::vector<double>> v5 = v1;
    const double v4 = v0[0];
    v5 = v1;
    double v7 = v4;
    v5[0] = v0;
    const std::vector<double> v14 = v5[0];
    std::vector<double> v19 = v14;
    std::vector<double> v13 = v19;
    v19[0] = v7;
    std::vector<double> v12 = v13;
    v5[0] = v14;
    v5[0] = v12;
    v12[0] = v7;
    std::vector<double> v44 = v13;
    return v44;
  }
  s0 f115(const s0 &v0) {
    s0 v7 = v0;
    v7 = v0;
    s0 v1 = v7;
    const std::vector<std::vector<double>> v2 = v7.p0;
    v1 = v7;
    v7.p0 = v2;
    const std::vector<std::vector<double>> v14 = v0.p0;
    v1.p0 = v2;
    const s1 v9(v7, v0);
    const std::vector<std::vector<double>> v25 = v7.p0;
    const std::vector<s0> v32 { v1, v7 };
    v1.p0 = v14;
    const s1 v42(v0, v1);
    const std::vector<std::vector<double>> v17 = v7.p1;
    s1 v46 = v9;
    const s0 v29 = v46.p0;
    const s0 v16 = v9.p0;
    const std::vector<s0> v22 { v29, v16, v7, v1, v7, v0 };
    const s0 v59 = v9.p1;
    v7.p1 = v17;
    s1 v49 = v42;
    const s0 v47 = v32[0];
    const std::vector<std::vector<double>> v65 = v1.p0;
    v46.p0 = v7;
    std::vector<s0> v92 = v32;
    v1.p0 = v25;
    v7.p1 = v17;
    const s0 v71 = v49.p0;
    v7.p1 = v17;
    const s0 v67 = v42.p1;
    const s0 v80(v65, v17);
    const s0 v44 = v92[0];
    const s0 v54 = v46.p0;
    const s0 v172 = v9.p1;
    v49.p0 = v47;
    v49.p0 = v67;
    v49.p1 = v29;
    v49 = v9;
    const std::vector<std::vector<double>> v58 = v54.p1;
    const s0 v123 = v22[5];
    const std::vector<std::vector<double>> v197 = v80.p1;
    v1.p1 = v197;
    std::vector<s0> v75 = v22;
    v46.p0 = v44;
    v49.p0 = v123;
    v92[0] = v16;
    const s0 v124 = v75[5];
    s0 v235 = v59;
    v7 = v71;
    v49.p0 = v235;
    v49.p0 = v59;
    v46.p0 = v172;
    v235.p1 = v58;
    return v124;
  }
  s0 f88(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p0;
    std::vector<std::vector<double>> v5 = v7;
    const std::vector<double> v2 = v5[1];
    const std::vector<double> v1 = v7[0];
    v5[2] = v2;
    const s0 v3 = f115(v0);
    v5[2] = v1;
    v5 = v7;
    std::vector<std::vector<double>> v13 = v7;
    s0 v15 = v3;
    const s0 v12 = f115(v3);
    const s0 v47 = f115(v0);
    std::vector<std::vector<double>> v21 = v5;
    v15.p0 = v21;
    v15.p0 = v13;
    const std::vector<std::vector<double>> v17 = v12.p1;
    std::vector<std::vector<double>> v20 = v17;
    const std::vector<std::vector<double>> v48 = v0.p0;
    s0 v22 = v3;
    const std::vector<double> v74 = v20[0];
    const std::vector<double> v38 = v48[2];
    v21[0] = v74;
    const std::vector<double> v35 = f121(v38);
    v15.p1 = v20;
    const std::vector<std::vector<double>> v68 = v15.p0;
    v22.p0 = v13;
    v15.p0 = v68;
    const s0 v99 = f115(v22);
    s0 v59 = v0;
    v15.p1 = v17;
    const s0 v55 = f115(v59);
    const std::vector<std::vector<double>> v95 = v3.p1;
    v59.p1 = v95;
    const s0 v61 = f115(v3);
    const std::vector<std::vector<double>> v49 = v47.p1;
    v59.p0 = v21;
    const std::vector<std::vector<double>> v104 = v61.p1;
    const std::vector<double> v94 = f121(v35);
    v59.p1 = v49;
    const std::vector<std::vector<double>> v66 = v99.p0;
    const s1 v129(v55, v47);
    v15.p0 = v13;
    const std::vector<std::vector<double>> v93 = v59.p1;
    const std::vector<std::vector<double>> v96 = v61.p0;
    v21[2] = v94;
    v15.p1 = v93;
    v22.p1 = v104;
    v15.p0 = v66;
    const std::vector<double> v117 = v104[0];
    v59.p0 = v68;
    s1 v81 = v129;
    s1 v100 = v81;
    const s0 v121 = v100.p1;
    v5[1] = v117;
    v15.p0 = v96;
    return v121;
  }
  s1 f69(const s1 &v0) {
    const s0 v4 = v0.p0;
    const s0 v7 = f88(v4);
    const s0 v3 = f115(v7);
    const std::vector<std::vector<double>> v8 = v4.p1;
    const s0 v2 = f115(v4);
    const s0 v5 = v0.p1;
    const s0 v17 = f115(v2);
    s1 v12 = v0;
    const s0 v16 = f88(v5);
    s0 v15 = v7;
    const s0 v11 = v0.p1;
    const s0 v21 = v12.p1;
    const s0 v41 = f88(v16);
    const s1 v22(v17, v41);
    const std::vector<std::vector<double>> v32 = v21.p0;
    s1 v29 = v12;
    v15.p1 = v8;
    const s0 v36 = f88(v3);
    const s0 v31 = f88(v41);
    v12 = v0;
    v12 = v29;
    const s0 v25 = f115(v41);
    const s0 v24(v32, v8);
    const s0 v52 = f115(v24);
    v12.p0 = v31;
    v12.p0 = v52;
    v12.p0 = v36;
    v15 = v41;
    const s0 v144 = v0.p1;
    const s0 v50 = v12.p0;
    v29.p1 = v15;
    const std::vector<std::vector<double>> v71 = v17.p1;
    v15.p1 = v71;
    v29.p1 = v4;
    v12.p0 = v16;
    s1 v179 = v12;
    v15.p1 = v8;
    v29.p1 = v144;
    v15 = v11;
    v29.p0 = v17;
    v12.p1 = v25;
    v29 = v22;
    v179.p0 = v50;
    const s0 v91 = f115(v24);
    v15 = v91;
    return v179;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s2 &v1, const double &v2) {
    const s1 v5 = v1.p1;
    const s0 v8 = v5.p1;
    const std::vector<std::vector<double>> v16 = v8.p0;
    const s1 v14 = f69(v5);
    const s0 v26 = v14.p0;
    const std::vector<std::vector<double>> v33 = v26.p1;
    std::vector<std::vector<double>> v29 = v33;
    const std::vector<double> v25 = v16[0];
    v29[1] = v25;
    const std::vector<double> v50 = v29[1];
    v29[0] = v50;
    const double v98 = v50[0];
    return v98;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } });
    s2 v1({ { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } } });
    double v2(25.0);
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
