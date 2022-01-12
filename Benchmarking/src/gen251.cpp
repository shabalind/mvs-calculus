  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f19(const s0 &v0) {
    s0 v4 = v0;
    s0 v1 = v4;
    const std::vector<std::vector<double>> v3 = v1.p1;
    const std::vector<std::vector<std::vector<double>>> v11 { v3, v3, v3, v3, v3, v3, v3 };
    s0 v8 = v1;
    v8.p1 = v3;
    const std::vector<std::vector<double>> v16 = v0.p0;
    const std::vector<std::vector<double>> v5 = v11[5];
    std::vector<std::vector<double>> v2 = v5;
    std::vector<std::vector<std::vector<double>>> v12 = v11;
    const std::vector<std::vector<double>> v19 = v1.p0;
    std::vector<std::vector<std::vector<double>>> v14 = v11;
    const std::vector<std::vector<double>> v15 = v4.p1;
    v14[5] = v3;
    const std::vector<std::vector<double>> v13 = v0.p0;
    const std::vector<double> v28 = v16[0];
    const std::vector<std::vector<double>> v17 = v14[2];
    v12[3] = v2;
    const s0 v39(v19, v3);
    v14[1] = v2;
    v2 = v15;
    std::vector<double> v18 = v28;
    const std::vector<std::vector<double>> v30 = v1.p0;
    v1.p0 = v30;
    const std::vector<std::vector<double>> v23 = v12[2];
    v2[0] = v18;
    const std::vector<std::vector<double>> v21 = v0.p0;
    v1.p0 = v13;
    v14[2] = v3;
    const std::vector<std::vector<double>> v43 = v1.p1;
    const s0 v40(v13, v43);
    s0 v34 = v8;
    v14[3] = v43;
    v1.p0 = v13;
    const std::vector<std::vector<double>> v55 = v40.p1;
    v1.p1 = v17;
    s0 v141 = v39;
    v8.p1 = v55;
    v4.p1 = v23;
    v1 = v34;
    v1.p1 = v2;
    v12[4] = v55;
    v141.p1 = v17;
    v1.p0 = v16;
    v34.p0 = v21;
    v8.p0 = v19;
    v12[1] = v2;
    v8.p1 = v55;
    v14[4] = v23;
    v34.p0 = v19;
    return v141;
  }
  s0 f16(const s0 &v0) {
    s0 v7 = v0;
    const s0 v3 = f19(v7);
    const std::vector<std::vector<double>> v2 = v3.p0;
    const s0 v9 = f19(v0);
    const s0 v4 = f19(v7);
    const s0 v13 = f19(v7);
    std::vector<std::vector<double>> v6 = v2;
    s0 v15 = v9;
    s0 v11 = v15;
    s0 v10 = v13;
    const s0 v17 = f19(v10);
    const s0 v29 = f19(v15);
    const std::vector<std::vector<double>> v1 = v29.p1;
    v15.p0 = v2;
    const std::vector<double> v18 = v1[0];
    const std::vector<std::vector<double>> v30 = v17.p1;
    const std::vector<std::vector<double>> v16 = v4.p0;
    v6[0] = v18;
    v11.p1 = v30;
    s0 v19 = v10;
    const std::vector<std::vector<double>> v35 = v7.p0;
    const s0 v22 = f19(v0);
    const std::vector<std::vector<double>> v34 = v0.p1;
    v11.p1 = v30;
    v19.p1 = v1;
    const std::vector<double> v57 = v6[1];
    v6[1] = v57;
    const std::vector<std::vector<double>> v27 = v10.p0;
    std::vector<std::vector<double>> v41 = v1;
    v10.p0 = v16;
    const s0 v31 = f19(v0);
    const std::vector<std::vector<double>> v61 = v9.p1;
    const s0 v42 = f19(v4);
    const s0 v39 = f19(v13);
    const s0 v32 = f19(v31);
    v19.p1 = v41;
    const std::vector<double> v66 = v35[1];
    v15 = v39;
    const s0 v56 = f19(v42);
    const std::vector<std::vector<double>> v36 = v32.p0;
    std::vector<std::vector<double>> v45 = v27;
    v19 = v42;
    v11.p1 = v41;
    v11.p0 = v2;
    std::vector<std::vector<double>> v86 = v6;
    v6[1] = v66;
    v7.p0 = v6;
    const s0 v117 = f19(v22);
    const s0 v93 = f19(v19);
    v7.p0 = v36;
    const std::vector<std::vector<double>> v94 = v93.p1;
    const s0 v96 = f19(v117);
    std::vector<std::vector<double>> v82 = v1;
    v19.p1 = v30;
    const std::vector<std::vector<double>> v71 = v11.p0;
    v15.p1 = v82;
    v15.p0 = v71;
    const std::vector<std::vector<double>> v135 = v96.p1;
    v10.p0 = v45;
    v7.p1 = v82;
    v15.p0 = v2;
    v7.p1 = v94;
    v11.p0 = v2;
    const s0 v223 = f19(v56);
    v10 = v223;
    v7.p1 = v34;
    v15.p1 = v135;
    v10.p1 = v61;
    v19.p0 = v86;
    return v19;
  }
  s0 f14(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v18 = v0.p0;
    const std::vector<std::vector<std::vector<double>>> v14 { v18, v18 };
    const s0 v34 = f16(v1);
    const std::vector<std::vector<double>> v45 = v14[1];
    const std::vector<std::vector<double>> v40 = v34.p1;
    const s0 v47(v45, v40);
    const s0 v49 = f19(v47);
    const s0 v136 = f16(v49);
    return v136;
  }
  s0 f10(const s0 &v0) {
    s0 v2 = v0;
    s0 v7 = v2;
    const s0 v4 = f14(v0, v7);
    const std::vector<std::vector<double>> v5 = v0.p0;
    const std::vector<std::vector<double>> v11 = v4.p1;
    const s0 v15(v5, v11);
    const s0 v12 = f14(v15, v4);
    const s0 v50 = f16(v4);
    const std::vector<std::vector<double>> v60 = v50.p1;
    const s0 v91 = f19(v12);
    v2.p1 = v60;
    return v91;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const s0 &v2, const double &v3) {
    const s0 v11 = v0[0];
    const s0 v20 = f10(v11);
    const double v14 = v3 + v3;
    const std::vector<std::vector<double>> v19 = v20.p1;
    const std::vector<double> v39 = v19[0];
    const double v128 = v39[0];
    const double v116 = v128 - v14;
    return v116;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } } });
    s0 v1({ { { 3.0 }, { 4.0 } }, { { 5.0 } } });
    s0 v2({ { { 6.0 }, { 7.0 } }, { { 8.0 } } });
    double v3(9.0);
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
