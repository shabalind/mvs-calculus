  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    double p1;
    s1(std::vector<s0> v0, double v1): p0(v0), p1(v1) { }
  };
  s1 f36(const s1 &v0, const s1 &v1) {
    const std::vector<s0> v4 = v1.p0;
    const std::vector<s0> v3 = v1.p0;
    s1 v7 = v0;
    const std::vector<s0> v9 = v1.p0;
    const s0 v6 = v3[0];
    v7.p0 = v3;
    const std::vector<std::vector<double>> v25 = v6.p0;
    const double v15 = v7.p1;
    const std::vector<double> v17 = v25[0];
    const std::vector<double> v20 { v15, v15, v15, v15 };
    const double v40 = v17[0];
    std::vector<double> v73 = v20;
    v7.p0 = v4;
    v7.p1 = v40;
    const double v24 = v40 * v40;
    const double v28 = v20[1];
    const std::vector<s0> v46 = v7.p0;
    const double v37 = v24 * v28;
    v73[1] = v40;
    const double v41 = v73[1];
    const double v36 = v41 - v37;
    const double v34 = v0.p1;
    v7.p0 = v46;
    v7.p0 = v46;
    const s1 v80(v46, v36);
    v7.p0 = v9;
    v73[2] = v34;
    return v80;
  }
  s1 f27(const s1 &v0) {
    const std::vector<s0> v4 = v0.p0;
    const s1 v2 = f36(v0, v0);
    const s0 v6 = v4[0];
    const std::vector<std::vector<double>> v21 = v6.p0;
    const std::vector<double> v14 = v21[0];
    std::vector<std::vector<double>> v18 = v21;
    v18[0] = v14;
    const std::vector<double> v43 = v18[0];
    const double v26 = v43[0];
    const std::vector<s0> v69 = v2.p0;
    const s1 v50(v69, v26);
    return v50;
  }
  s0 f17(const s0 &v0) {
    s0 v6 = v0;
    const std::vector<std::vector<double>> v7 = v0.p1;
    const std::vector<double> v4 = v7[1];
    s0 v2 = v0;
    const std::vector<std::vector<double>> v5 = v6.p0;
    v2.p0 = v5;
    const std::vector<std::vector<double>> v1 = v2.p1;
    std::vector<double> v12 = v4;
    const std::vector<std::vector<double>> v13 = v2.p0;
    s0 v15 = v6;
    v15.p1 = v1;
    v6.p0 = v13;
    const std::vector<std::vector<double>> v23 = v6.p0;
    std::vector<std::vector<double>> v28 = v7;
    std::vector<std::vector<double>> v16 = v28;
    v2.p1 = v16;
    const std::vector<std::vector<double>> v22 = v15.p0;
    std::vector<std::vector<double>> v27 = v13;
    v28[0] = v12;
    v15.p0 = v27;
    v15.p0 = v23;
    s0 v39 = v6;
    const std::vector<std::vector<double>> v61 = v6.p0;
    std::vector<std::vector<double>> v32 = v22;
    v2.p0 = v32;
    v15.p0 = v22;
    v6.p0 = v61;
    return v39;
  }
  s1 f14(const s1 &v0) {
    s1 v4 = v0;
    s1 v7 = v4;
    const double v2 = v4.p1;
    const s1 v6 = f27(v7);
    const s1 v3 = f27(v0);
    s1 v14 = v3;
    const std::vector<s0> v1 = v7.p0;
    const double v8 = v7.p1;
    const double v11 = v14.p1;
    v7.p1 = v2;
    const s0 v9 = v1[0];
    const double v15 = v11 / v8;
    double v13 = v2;
    const s0 v10 = v1[0];
    v7.p1 = v2;
    const std::vector<std::vector<double>> v16 = v10.p0;
    const std::vector<s0> v20 = v14.p0;
    const double v25 = v6.p1;
    std::vector<s0> v29 = v20;
    std::vector<std::vector<double>> v36 = v16;
    const std::vector<double> v30 = v36[0];
    v14.p1 = v13;
    v4.p0 = v1;
    const s0 v24 = v29[0];
    const double v23 = v30[0];
    v14.p1 = v23;
    const std::vector<double> v19 = v36[0];
    v7.p0 = v1;
    v29[0] = v24;
    const std::vector<double> v39 = v16[0];
    v36[0] = v39;
    const s0 v48 = f17(v9);
    v14.p0 = v29;
    v4.p0 = v1;
    v7.p1 = v25;
    v14.p0 = v1;
    const s1 v87 = f36(v14, v7);
    v7.p1 = v23;
    v36[0] = v19;
    v29[0] = v48;
    v4.p1 = v15;
    v4.p0 = v1;
    return v87;
  }
  std::vector<s0> f9(const s0 &v0, const std::vector<s0> &v1) {
    return v1;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v4 = v1.p0;
    double v6 = v2;
    const std::vector<s0> v5 = v0[0];
    const std::vector<double> v8 = v4[0];
    std::vector<double> v7 = v8;
    v7[0] = v2;
    v6 = v2;
    const double v14 = v7[0];
    const std::vector<s0> v3 = f9(v1, v5);
    const s0 v10 = f17(v1);
    const std::vector<s0> v12 = f9(v10, v5);
    const std::vector<s0> v24 = f9(v1, v3);
    v7[0] = v6;
    v7[0] = v2;
    const double v18 = v6 + v6;
    double v36 = v14;
    const double v33 = v18 + v18;
    const s0 v57 = v24[0];
    std::vector<s0> v31 = v5;
    v7[0] = v33;
    const double v60 = v8[0];
    const s1 v39(v12, v33);
    v31[0] = v1;
    const s1 v32 = f14(v39);
    const std::vector<s0> v48 = f9(v57, v5);
    const s0 v87 = v48[0];
    const double v52 = v32.p1;
    v31[0] = v10;
    const s1 v112(v31, v14);
    v7[0] = v60;
    const double v261 = v112.p1;
    const double v110 = v36 * v261;
    v31[0] = v87;
    v7[0] = v52;
    double v215 = v110;
    return v215;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } } } });
    s0 v1({ { { 9.0 } }, { { 10.0 }, { 11.0 } } });
    double v2(12.0);
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
