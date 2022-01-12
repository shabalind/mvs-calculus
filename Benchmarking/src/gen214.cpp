  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f31(const std::vector<s0> &v0) {
    const s0 v2 = v0[2];
    std::vector<s0> v1 = v0;
    v1[2] = v2;
    const s0 v28 = v1[1];
    v1[0] = v28;
    const std::vector<std::vector<s0>> v7 { v1, v0, v0 };
    const std::vector<s0> v30 = v7[2];
    return v30;
  }
  s0 f20(const s0 &v0) {
    s0 v7 = v0;
    s0 v3 = v7;
    s0 v4 = v7;
    const std::vector<s0> v8 { v3 };
    const s0 v2 = v8[0];
    const s0 v5 = v8[0];
    const s0 v6 = v8[0];
    v7 = v5;
    const std::vector<std::vector<double>> v1 = v4.p1;
    std::vector<std::vector<double>> v17 = v1;
    v3.p1 = v17;
    std::vector<std::vector<double>> v9 = v17;
    const s0 v13 = v8[0];
    const std::vector<double> v15 = v1[0];
    v17[2] = v15;
    std::vector<double> v10 = v15;
    const std::vector<std::vector<double>> v24 = v3.p0;
    v9[0] = v10;
    v4 = v13;
    const std::vector<s0> v29 { v5, v4, v13, v2, v4, v0, v3 };
    const std::vector<double> v28 = v24[0];
    const std::vector<std::vector<double>> v41 = v6.p1;
    v4.p1 = v41;
    s0 v20 = v3;
    v20.p1 = v9;
    const std::vector<std::vector<double>> v42 = v20.p0;
    v7.p0 = v42;
    const s0 v70 = v29[1];
    v3.p1 = v1;
    v3.p0 = v24;
    v9[2] = v28;
    v4.p0 = v42;
    v20.p1 = v9;
    const std::vector<std::vector<double>> v53 = v70.p1;
    const s0 v55(v24, v53);
    return v55;
  }
  s0 f18(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p0;
    const s0 v7 = f20(v0);
    std::vector<std::vector<double>> v2 = v3;
    std::vector<std::vector<double>> v5 = v2;
    s0 v1 = v7;
    const s0 v6 = f20(v1);
    v1.p0 = v3;
    s0 v10 = v6;
    const std::vector<std::vector<double>> v8 = v1.p1;
    v10.p1 = v8;
    const s0 v11 = f20(v0);
    std::vector<std::vector<double>> v18 = v8;
    const s0 v40 = f20(v11);
    std::vector<std::vector<double>> v22 = v5;
    v10 = v1;
    v10.p0 = v22;
    v1.p0 = v2;
    const std::vector<std::vector<double>> v20 = v7.p1;
    v1.p1 = v20;
    std::vector<std::vector<double>> v34 = v20;
    const std::vector<std::vector<double>> v21 = v10.p0;
    const s0 v45 = f20(v1);
    const std::vector<std::vector<double>> v50 = v45.p1;
    const s0 v36(v22, v18);
    std::vector<std::vector<double>> v53 = v22;
    const s0 v48 = f20(v40);
    s0 v31 = v1;
    std::vector<std::vector<double>> v49 = v34;
    const std::vector<s0> v58 { v40, v7, v31, v48, v36 };
    const s0 v57 = v58[0];
    const std::vector<double> v64 = v5[0];
    v18[1] = v64;
    const std::vector<double> v47 = v21[0];
    v10.p1 = v34;
    const std::vector<std::vector<double>> v26 = v31.p0;
    const std::vector<double> v59 = v21[0];
    const s0 v70 = v58[1];
    const std::vector<double> v83 = v34[1];
    const std::vector<std::vector<double>> v62 = v57.p0;
    const std::vector<double> v87 = v53[0];
    v31.p1 = v49;
    const std::vector<std::vector<double>> v86 = v11.p1;
    std::vector<std::vector<double>> v120 = v21;
    v31.p1 = v86;
    v18[0] = v87;
    const s0 v78(v26, v50);
    v2[0] = v64;
    v31.p1 = v34;
    s0 v255 = v78;
    v31.p0 = v120;
    v18[0] = v47;
    const std::vector<std::vector<double>> v149 = v70.p1;
    v49 = v149;
    v255.p1 = v50;
    v5 = v53;
    v255.p0 = v62;
    v22[0] = v59;
    v5 = v62;
    v53[0] = v83;
    const s0 v214 = f20(v255);
    return v214;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    std::vector<s0> v7 = v0;
    const s0 v5 = v0[0];
    const s0 v4 = v7[2];
    const std::vector<s0> v9 = f31(v7);
    const s0 v2 = v7[2];
    const std::vector<std::vector<double>> v13 = v4.p0;
    const s0 v3 = f18(v2);
    const s0 v11 = v9[1];
    const s0 v12 = v0[0];
    const std::vector<std::vector<double>> v10 = v4.p1;
    const s0 v23 = f18(v3);
    v7[2] = v5;
    const std::vector<double> v17 = v10[2];
    const std::vector<double> v29 = v13[0];
    std::vector<double> v33 = v17;
    const std::vector<std::vector<double>> v14 = v12.p0;
    v7[2] = v23;
    std::vector<std::vector<double>> v21 = v10;
    const std::vector<double> v34 = v13[0];
    const s0 v42(v14, v21);
    const s0 v52 = f18(v42);
    const double v57 = v34[0];
    v21[1] = v17;
    const s0 v127 = f20(v52);
    const double v111 = v29[0];
    const double v61 = v111 * v57;
    v7[0] = v127;
    v7[0] = v11;
    v21[2] = v33;
    return v61;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } });
    double v1(12.0);
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
