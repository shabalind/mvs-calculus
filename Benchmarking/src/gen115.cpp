  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f87(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p1;
    const std::vector<double> v2 = v5[0];
    const std::vector<std::vector<double>> v7 = v0.p0;
    s0 v35 = v0;
    v35.p1 = v5;
    s0 v24 = v0;
    v24.p1 = v5;
    const std::vector<std::vector<double>> v43 = v24.p1;
    s0 v39 = v0;
    v39.p1 = v5;
    const std::vector<std::vector<double>> v20 = v0.p0;
    const std::vector<std::vector<double>> v26 = v24.p0;
    v35.p0 = v26;
    std::vector<std::vector<double>> v50 = v20;
    v24.p0 = v20;
    v39 = v35;
    std::vector<std::vector<double>> v54 = v43;
    const std::vector<std::vector<double>> v58 = v0.p0;
    v35.p1 = v43;
    v39.p1 = v54;
    v35.p0 = v7;
    v35 = v24;
    v24.p0 = v50;
    const std::vector<std::vector<double>> v112 = v0.p1;
    v35.p0 = v58;
    v39.p1 = v43;
    std::vector<std::vector<double>> v79 = v43;
    s0 v105 = v39;
    v39.p1 = v112;
    v35.p1 = v5;
    v79[0] = v2;
    const std::vector<std::vector<double>> v252 = v39.p1;
    v105.p1 = v79;
    v39.p1 = v252;
    return v105;
  }
  s0 f82(const s0 &v0, const s0 &v1) {
    s0 v7 = v0;
    const s0 v10 = f87(v1);
    const std::vector<std::vector<double>> v4 = v0.p1;
    const s0 v5 = f87(v1);
    const std::vector<std::vector<double>> v8 = v7.p1;
    std::vector<std::vector<double>> v3 = v8;
    const std::vector<double> v6 = v3[0];
    std::vector<std::vector<double>> v9 = v4;
    std::vector<double> v11 = v6;
    std::vector<double> v2 = v11;
    v9[0] = v6;
    const std::vector<std::vector<double>> v15 = v5.p1;
    v9[0] = v2;
    v7.p1 = v15;
    v3[0] = v6;
    v7.p1 = v3;
    v7.p1 = v8;
    const double v22 = v2[0];
    const s0 v19 = f87(v1);
    v2 = v11;
    const std::vector<double> v14 = v4[0];
    v7.p1 = v9;
    const std::vector<std::vector<double>> v81 { v6, v2, v11, v14, v11 };
    v9 = v8;
    double v23 = v22;
    const std::vector<double> v42 = v81[0];
    const std::vector<std::vector<double>> v27 = v19.p0;
    v3 = v15;
    std::vector<double> v33 = v14;
    v7.p1 = v9;
    const std::vector<std::vector<double>> v26 = v10.p0;
    std::vector<std::vector<double>> v21 = v26;
    v7.p0 = v21;
    v3[0] = v33;
    v9[0] = v2;
    v3[0] = v42;
    const s0 v61 = f87(v7);
    s0 v28 = v61;
    v2[0] = v23;
    v7.p0 = v27;
    return v28;
  }
  s0 f59(const s0 &v0) {
    s0 v8 = v0;
    s0 v6 = v0;
    s0 v4 = v0;
    const std::vector<std::vector<double>> v7 = v4.p1;
    const std::vector<std::vector<double>> v1 = v6.p0;
    const std::vector<double> v10 = v7[0];
    const s0 v5 = f82(v4, v6);
    std::vector<std::vector<double>> v2 = v7;
    const std::vector<double> v3 = v1[1];
    const s0 v11 = f87(v0);
    const s0 v13 = f87(v5);
    v6.p0 = v1;
    const std::vector<std::vector<double>> v12 = v0.p0;
    v2[0] = v10;
    const s0 v17 = f82(v5, v11);
    v6.p0 = v12;
    const std::vector<std::vector<double>> v22 = v13.p0;
    const std::vector<double> v24 = v12[0];
    const s0 v34 = f82(v17, v8);
    const std::vector<std::vector<double>> v26 = v6.p0;
    v8.p0 = v12;
    std::vector<double> v30 = v10;
    std::vector<double> v16 = v30;
    std::vector<double> v27 = v16;
    const double v31 = v3[0];
    v8.p1 = v2;
    v8.p0 = v26;
    v6.p0 = v22;
    const s0 v57 = f87(v6);
    const std::vector<std::vector<double>> v52 = v8.p1;
    v6.p1 = v52;
    v6.p0 = v1;
    const s0 v96 = f82(v34, v8);
    v27[0] = v31;
    const std::vector<std::vector<double>> v72 = v57.p1;
    v4.p1 = v72;
    const std::vector<std::vector<double>> v62 = v0.p1;
    v2[0] = v24;
    v8.p0 = v26;
    v16[0] = v31;
    v2[0] = v27;
    v4.p1 = v62;
    return v96;
  }
  std::vector<s0> f52(const std::vector<s0> &v0) {
    const s0 v4 = v0[0];
    const std::vector<std::vector<double>> v7 = v4.p0;
    const s0 v11 = f82(v4, v4);
    const std::vector<std::vector<double>> v5 = v11.p1;
    std::vector<s0> v2 = v0;
    const s0 v9 = f82(v4, v4);
    const s0 v15(v7, v5);
    const s0 v18 = f59(v15);
    const s0 v20 = f59(v9);
    v2[0] = v15;
    std::vector<s0> v69 = v2;
    v69[0] = v20;
    v69[0] = v18;
    return v69;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const std::vector<double> v3 { v1, v1, v1 };
    const double v7 = v3[2];
    const std::vector<s0> v22 = v0[0];
    double v13 = v7;
    double v10 = v1;
    double v12 = v13;
    const std::vector<s0> v28 = f52(v22);
    const s0 v15 = v28[0];
    const double v35 = v1 - v12;
    const double v55 = v35 * v12;
    const std::vector<std::vector<double>> v36 = v15.p0;
    v13 = v10;
    const std::vector<double> v58 = v36[0];
    const double v34 = v58[0];
    const double v87 = v55 * v34;
    return v87;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } });
    double v1(9.0);
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
