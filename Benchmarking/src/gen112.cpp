  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f111(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<std::vector<double>> v5 = v0.p1;
    const std::vector<double> v6 = v5[0];
    std::vector<std::vector<double>> v7 = v4;
    const s0 v2(v4, v7);
    s0 v10 = v0;
    const std::vector<std::vector<double>> v1 = v2.p1;
    v10.p1 = v1;
    v7[0] = v6;
    const std::vector<std::vector<double>> v25 = v0.p0;
    const std::vector<std::vector<double>> v22 = v2.p0;
    const std::vector<std::vector<double>> v73 = v2.p1;
    v10.p1 = v25;
    const std::vector<s0> v32 { v0, v10, v2, v10, v0, v2, v10 };
    std::vector<s0> v41 = v32;
    const s0 v33 = v41[0];
    const std::vector<double> v71 = v22[0];
    v7[0] = v71;
    v10.p1 = v73;
    return v33;
  }
  s0 f109(const s0 &v0, const std::vector<s0> &v1) {
    const s0 v3 = v1[0];
    const std::vector<std::vector<double>> v6 = v0.p1;
    std::vector<std::vector<double>> v5 = v6;
    v5 = v6;
    const std::vector<std::vector<double>> v4 = v3.p0;
    const s0 v2(v4, v5);
    const std::vector<std::vector<double>> v11 = v0.p0;
    const s0 v13 = f111(v2);
    const s0 v23 = f111(v3);
    const s0 v35 = v1[0];
    const s0 v21 = f111(v13);
    const std::vector<std::vector<double>> v16 = v23.p0;
    const std::vector<std::vector<double>> v15 = v35.p0;
    const std::vector<double> v24 = v11[0];
    v5[0] = v24;
    std::vector<double> v17 = v24;
    s0 v42 = v21;
    v42.p1 = v6;
    v5[0] = v24;
    const std::vector<double> v50 = v16[0];
    v42.p1 = v6;
    const std::vector<double> v68 = v15[0];
    v5[0] = v50;
    v5[0] = v17;
    const double v92 = v68[0];
    v17[0] = v92;
    return v42;
  }
  double f101(const double &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v8 = v1.p0;
    const std::vector<double> v4 = v8[0];
    const double v11 = v4[0];
    const s0 v3 = f111(v1);
    std::vector<double> v6 = v4;
    const double v9 = v4[0];
    const s0 v12 = f111(v3);
    const std::vector<std::vector<double>> v19 = v12.p1;
    v6 = v4;
    const double v56 = v9 + v11;
    const std::vector<double> v39 = v19[0];
    v6[0] = v0;
    const double v80 = v6[0];
    v6 = v4;
    v6 = v39;
    const double v140 = v80 - v56;
    return v140;
  }
  s0 f95(const s0 &v0) {
    const std::vector<s0> v1 { v0 };
    const s0 v8 = f109(v0, v1);
    const s0 v9 = f109(v8, v1);
    return v9;
  }
  s0 f90(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p1;
    s0 v7 = v0;
    s0 v6 = v7;
    const std::vector<std::vector<std::vector<double>>> v3 { v5, v5, v5 };
    std::vector<std::vector<double>> v4 = v5;
    const std::vector<std::vector<double>> v10 = v0.p0;
    v7.p0 = v5;
    s0 v2 = v7;
    const s0 v8 = f111(v6);
    const s0 v1 = f111(v2);
    const s0 v9 = f111(v1);
    const std::vector<std::vector<double>> v15 = v3[2];
    v2.p0 = v10;
    std::vector<std::vector<double>> v16 = v15;
    std::vector<std::vector<double>> v12 = v16;
    const std::vector<std::vector<double>> v14 = v1.p1;
    const s0 v22 = f111(v2);
    v7 = v1;
    v6.p0 = v12;
    const std::vector<std::vector<double>> v38 = v9.p1;
    const std::vector<std::vector<double>> v17 = v3[2];
    v7.p1 = v38;
    const s0 v19 = f111(v8);
    const std::vector<std::vector<double>> v28 = v8.p0;
    v7.p0 = v28;
    std::vector<std::vector<double>> v60 = v17;
    v7 = v19;
    const std::vector<std::vector<double>> v43 = v22.p0;
    v2.p1 = v4;
    v7.p0 = v60;
    v6.p1 = v5;
    v4 = v14;
    v16 = v12;
    v6.p0 = v43;
    s0 v58 = v1;
    return v58;
  }
  s0 f83(const s0 &v0) {
    s0 v3 = v0;
    const std::vector<std::vector<double>> v1 = v0.p0;
    s0 v4 = v3;
    std::vector<std::vector<double>> v5 = v1;
    const std::vector<std::vector<double>> v2 = v3.p0;
    s0 v12 = v4;
    s0 v27 = v12;
    const std::vector<std::vector<std::vector<double>>> v15 { v1, v2 };
    const std::vector<std::vector<double>> v13 = v27.p0;
    const s0 v23 = f90(v12);
    const s0 v24 = f90(v23);
    v3 = v24;
    const std::vector<double> v38 = v13[0];
    const std::vector<std::vector<double>> v42 = v15[1];
    std::vector<double> v19 = v38;
    const std::vector<std::vector<double>> v28 = v3.p0;
    const double v31 = v19[0];
    const std::vector<std::vector<double>> v22 = v23.p1;
    const double v36 = v31 + v31;
    const s0 v122(v5, v42);
    v19[0] = v36;
    s0 v50 = v0;
    const std::vector<std::vector<double>> v47 = v50.p1;
    v19[0] = v36;
    const s0 v66(v47, v28);
    v50.p0 = v22;
    const std::vector<std::vector<double>> v52 = v122.p1;
    std::vector<double> v78 = v19;
    v50.p1 = v52;
    v50.p1 = v28;
    v5[0] = v78;
    const s0 v217 = f111(v66);
    return v217;
  }
  s0 f81(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p1;
    const s0 v4 = f90(v0);
    const std::vector<std::vector<double>> v5 = v4.p0;
    const std::vector<std::vector<double>> v6 = v0.p1;
    const std::vector<s0> v1 { v0, v0, v0, v4, v4, v0, v4 };
    const s0 v2 = v1[6];
    s0 v3 = v2;
    const s0 v9 = v1[6];
    const s0 v8 = f83(v3);
    const std::vector<std::vector<double>> v18 = v9.p0;
    const s0 v13 = v1[6];
    const s0 v14 = f83(v13);
    const s0 v39 = f95(v8);
    s0 v26 = v0;
    v26.p1 = v5;
    const std::vector<std::vector<double>> v31 = v14.p0;
    const std::vector<std::vector<double>> v33 = v26.p1;
    s0 v50 = v39;
    v50.p0 = v18;
    v50.p0 = v7;
    v26.p1 = v31;
    const std::vector<std::vector<double>> v80 = v26.p1;
    v50.p0 = v33;
    const std::vector<std::vector<double>> v82 = v0.p1;
    v26.p1 = v31;
    v50.p0 = v6;
    v3.p1 = v82;
    v26.p1 = v80;
    return v50;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const double &v2) {
    const s0 v4 = v0[2];
    const s0 v17 = f81(v4);
    double v23 = v2;
    const s0 v21 = v0[2];
    double v30 = v23;
    const std::vector<std::vector<double>> v20 = v17.p0;
    const double v39 = f101(v30, v21);
    double v29 = v23;
    const std::vector<double> v58 = v20[0];
    const double v61 = v58[0];
    double v54 = v29;
    v29 = v61;
    const std::vector<double> v106 { v54, v29, v2, v39, v54, v61, v2 };
    std::vector<double> v195 = v106;
    const double v114 = v195[6];
    v195[1] = v2;
    return v114;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } });
    s0 v1({ { { 6.0 } }, { { 7.0 } } });
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
