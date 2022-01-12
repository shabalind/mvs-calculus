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
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f24(const s0 &v0, const double &v1) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v2 = v7.p1;
    const std::vector<std::vector<double>> v9 = v7.p0;
    v7.p0 = v9;
    const std::vector<double> v22 = v2[0];
    const double v12 = v22[0];
    const std::vector<std::vector<double>> v11 = v0.p1;
    const std::vector<double> v29 = v2[0];
    v7.p0 = v11;
    double v21 = v12;
    const double v41 = v29[0];
    v21 = v41;
    v7.p1 = v11;
    return v21;
  }
  s0 f22(const s0 &v0) {
    const std::vector<std::vector<double>> v2 = v0.p0;
    std::vector<std::vector<double>> v5 = v2;
    const s0 v6(v2, v2);
    s0 v7 = v6;
    const std::vector<double> v4 = v2[0];
    const std::vector<std::vector<double>> v3 = v6.p1;
    const double v8 = v4[0];
    const std::vector<std::vector<double>> v11 = v0.p1;
    const std::vector<std::vector<std::vector<double>>> v17 { v11, v11, v2, v3 };
    const std::vector<std::vector<double>> v12 = v0.p1;
    const std::vector<double> v21 = v11[0];
    const double v15 = f24(v6, v8);
    v7.p1 = v5;
    v7.p1 = v12;
    s0 v26 = v6;
    std::vector<double> v18 = v21;
    const double v10 = f24(v6, v15);
    std::vector<std::vector<double>> v20 = v2;
    std::vector<std::vector<std::vector<double>>> v14 = v17;
    s0 v40 = v7;
    v7.p0 = v11;
    std::vector<std::vector<double>> v27 = v20;
    v7.p1 = v11;
    std::vector<std::vector<double>> v25 = v11;
    v40.p1 = v5;
    const std::vector<std::vector<double>> v22 = v17[2];
    const std::vector<std::vector<double>> v33 = v26.p0;
    const double v61 = f24(v6, v10);
    v14[1] = v5;
    v27[0] = v4;
    const double v28 = f24(v40, v61);
    const std::vector<std::vector<double>> v32 = v7.p0;
    const std::vector<double> v42 = v32[0];
    v14[0] = v32;
    v18[0] = v28;
    const std::vector<std::vector<double>> v69 = v17[3];
    v26.p1 = v20;
    v40.p0 = v3;
    v27 = v12;
    v7.p1 = v33;
    v27[0] = v21;
    v27[0] = v42;
    const std::vector<std::vector<double>> v114 = v26.p0;
    const std::vector<std::vector<double>> v54 = v14[3];
    v25[0] = v4;
    v20[0] = v4;
    v5[0] = v42;
    const std::vector<double> v51 = v22[0];
    v27[0] = v51;
    const std::vector<double> v135 = v54[0];
    std::vector<double> v132 = v135;
    v5[0] = v18;
    v20[0] = v18;
    const std::vector<std::vector<double>> v56 = v6.p0;
    const std::vector<std::vector<double>> v82 = v26.p1;
    v14[2] = v56;
    v40.p0 = v20;
    v5[0] = v132;
    v14[2] = v11;
    v7.p1 = v25;
    v7.p0 = v27;
    const std::vector<double> v190 = v82[0];
    v5[0] = v51;
    v7.p1 = v5;
    v5[0] = v190;
    v14[0] = v114;
    v5 = v69;
    return v40;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<s0> v4 = v0.p0;
    const s0 v7 = v4[1];
    const s0 v17 = f22(v7);
    const std::vector<std::vector<double>> v24 = v7.p0;
    const std::vector<double> v30 = v24[0];
    const double v81 = v30[0];
    const double v51 = f24(v17, v81);
    return v51;
  }
  int main() {
    s1 v0({ { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } }, { { { 4.0 } }, { { 5.0 } } } });
    double v1(6.0);
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
