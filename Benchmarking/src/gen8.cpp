  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s1(std::vector<s0> v0): p0(v0) { }
  };
  struct s5 {
    std::vector<s1> p0;
    s0 p1;
    s5(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f49(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<s0> v3 { v0, v0, v5, v5, v5, v5 };
    s0 v1 = v0;
    const s0 v10 = v3[3];
    const std::vector<double> v12 = v10.p0;
    std::vector<s0> v24 = v3;
    v5 = v1;
    v24[4] = v10;
    v24[0] = v0;
    v1.p0 = v12;
    const s0 v21 = v24[3];
    return v21;
  }
  s1 f44(const s1 &v0) {
    const std::vector<s0> v1 = v0.p0;
    s1 v2 = v0;
    s1 v6 = v0;
    v6.p0 = v1;
    v6 = v2;
    v6.p0 = v1;
    return v6;
  }
  s1 f40(const std::vector<std::vector<double>> &v0, const s1 &v1) {
    const std::vector<s0> v7 = v1.p0;
    const s1 v3 = f44(v1);
    const std::vector<s0> v5 = v3.p0;
    const s0 v6 = v5[0];
    const s0 v13 = f49(v6);
    const s0 v9 = v5[1];
    const s1 v12 = f44(v1);
    std::vector<s0> v23 = v7;
    const s0 v17 = f49(v6);
    const std::vector<double> v50 = v9.p0;
    s0 v77 = v17;
    const s0 v22(v50, v0);
    const s0 v30 = f49(v22);
    v23[0] = v6;
    s1 v63 = v12;
    v23[0] = v77;
    v23[0] = v30;
    std::vector<s0> v61 = v23;
    v61[0] = v77;
    v61[1] = v13;
    v23[0] = v9;
    v63.p0 = v61;
    s1 v84 = v63;
    return v84;
  }
  s0 f29(const s0 &v0) {
    s0 v3 = v0;
    s0 v1 = v0;
    s0 v2 = v0;
    const s0 v7 = f49(v2);
    s0 v5 = v7;
    const std::vector<double> v13 = v5.p0;
    const std::vector<std::vector<double>> v4 = v1.p1;
    v2.p0 = v13;
    const s0 v10 = f49(v3);
    const std::vector<double> v18 = v1.p0;
    v5.p1 = v4;
    const std::vector<std::vector<double>> v20 = v10.p1;
    const s0 v142(v13, v4);
    v1.p0 = v18;
    v2.p1 = v20;
    return v142;
  }
  s0 f24(const s0 &v0) {
    const s0 v1 = f29(v0);
    s0 v2 = v0;
    const s0 v9 = f49(v0);
    const s0 v7 = f29(v9);
    const s0 v5 = f29(v1);
    const std::vector<std::vector<double>> v4 = v7.p1;
    const s0 v8 = f29(v7);
    const std::vector<s0> v3 { v5, v2 };
    v2.p1 = v4;
    const std::vector<std::vector<double>> v12 = v5.p1;
    const std::vector<double> v11 = v1.p0;
    const std::vector<double> v10 = v12[0];
    const std::vector<double> v17 = v9.p0;
    v2.p1 = v4;
    const s0 v23 = f49(v7);
    const double v13 = v11[0];
    const std::vector<std::vector<double>> v21 { v10, v10 };
    double v25 = v13;
    v2.p0 = v17;
    const std::vector<double> v50 = v8.p0;
    std::vector<double> v22 = v50;
    v22[0] = v13;
    v2.p1 = v12;
    const std::vector<double> v18 = v21[1];
    v22[2] = v25;
    const s1 v36(v3);
    const double v16 = v18[0];
    v2.p0 = v22;
    const s1 v54 = f40(v4, v36);
    const std::vector<s0> v29 = v54.p0;
    v2.p0 = v50;
    double v87 = v25;
    const double v65 = v10[0];
    v22[2] = v65;
    const s0 v64 = v29[0];
    const double v77 = v11[1];
    v22[2] = v16;
    const double v47 = v50[0];
    v22[2] = v87;
    v22[2] = v77;
    v22[2] = v77;
    const std::vector<s0> v99 { v8, v0, v0, v64, v5, v8 };
    std::vector<s0> v96 = v99;
    v22[2] = v77;
    v25 = v47;
    v2 = v23;
    const s0 v164 = v96[3];
    return v164;
  }
  s0 f4(const s0 &v0) {
    s0 v4 = v0;
    s0 v5 = v0;
    s0 v1 = v5;
    const s0 v2 = f49(v1);
    const s0 v3 = f49(v5);
    const s0 v8 = f49(v3);
    const std::vector<s0> v6 { v4, v3, v2, v8 };
    const std::vector<double> v11 = v1.p0;
    const std::vector<double> v10 = v8.p0;
    const s0 v9 = f29(v4);
    const s0 v13 = f29(v5);
    v4.p0 = v10;
    const s0 v15 = f49(v2);
    std::vector<s0> v19 = v6;
    const std::vector<double> v14 = v2.p0;
    v19[2] = v13;
    v19[1] = v0;
    s0 v18 = v15;
    v4.p0 = v11;
    const std::vector<std::vector<double>> v23 = v13.p1;
    std::vector<double> v28 = v10;
    v19 = v6;
    std::vector<std::vector<double>> v30 = v23;
    v19[1] = v18;
    v19[3] = v0;
    const double v31 = v28[2];
    const double v38 = v31 - v31;
    std::vector<double> v53 = v11;
    const std::vector<double> v86 = v9.p0;
    v1.p0 = v86;
    std::vector<std::vector<double>> v72 = v30;
    const std::vector<double> v32 = v30[1];
    std::vector<double> v87 = v32;
    v18.p0 = v10;
    v87[0] = v31;
    v5.p1 = v72;
    v28[0] = v31;
    v1.p0 = v10;
    v87[0] = v31;
    v5.p0 = v14;
    const s0 v83 = v19[3];
    v53[2] = v38;
    v72[0] = v87;
    v1.p0 = v53;
    v72[1] = v32;
    v72[0] = v32;
    v18.p0 = v28;
    v87[0] = v31;
    return v83;
  }
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const double &v1) {
    const s5 v2 = v0[0];
    const s0 v7 = v2.p1;
    const s0 v9 = f29(v7);
    const s0 v8 = f24(v7);
    const s0 v10 = f4(v8);
    const std::vector<double> v13 = v7.p0;
    s0 v5 = v7;
    v5.p0 = v13;
    v5.p0 = v13;
    const std::vector<double> v17 = v10.p0;
    const std::vector<std::vector<double>> v28 = v5.p1;
    const std::vector<std::vector<double>> v23 = v9.p1;
    const std::vector<double> v34 = v28[1];
    v5.p1 = v23;
    const double v49 = v17[1];
    std::vector<double> v26 = v34;
    const double v61 = v26[0];
    const std::vector<std::vector<double>> v85 = v8.p1;
    v5.p1 = v85;
    const double v66 = v34[0];
    const double v54 = v61 * v49;
    v26[0] = v66;
    v26[0] = v61;
    double v123 = v54;
    const double v258 = v54 * v123;
    return v258;
  }
  int main() {
    std::vector<s5> v0({ { { { { { { 0.0, 1.0, 2.0 }, { { 3.0 }, { 4.0 } } }, { { 5.0, 6.0, 7.0 }, { { 8.0 }, { 9.0 } } } } }, { { { { 10.0, 11.0, 12.0 }, { { 13.0 }, { 14.0 } } }, { { 15.0, 16.0, 17.0 }, { { 18.0 }, { 19.0 } } } } } }, { { 20.0, 21.0, 22.0 }, { { 23.0 }, { 24.0 } } } } });
    double v1(25.0);
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
