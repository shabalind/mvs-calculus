  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f33(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    s0 v5 = v0;
    const std::vector<double> v3 = v4[0];
    const std::vector<std::vector<double>> v8 = v5.p1;
    v5.p1 = v4;
    const std::vector<double> v1 = v5.p0;
    const std::vector<double> v9 = v5.p0;
    v5.p0 = v1;
    const std::vector<double> v11 = v0.p0;
    const std::vector<double> v12 = v5.p0;
    const std::vector<std::vector<double>> v20 = v0.p1;
    const std::vector<std::vector<double>> v30 = v0.p1;
    v5.p1 = v30;
    const double v21 = v12[1];
    v5 = v0;
    const double v48 = v3[0];
    v5.p0 = v9;
    const std::vector<std::vector<double>> v23 = v0.p1;
    v5.p0 = v11;
    v5.p1 = v23;
    const s0 v22(v12, v8);
    const std::vector<std::vector<double>> v25 = v0.p1;
    std::vector<std::vector<double>> v26 = v8;
    const std::vector<double> v34 = v22.p0;
    v26 = v8;
    v26[1] = v3;
    v5.p0 = v9;
    const std::vector<std::vector<std::vector<double>>> v27 { v23, v8, v25, v8, v25, v26, v23 };
    std::vector<double> v32 = v1;
    const std::vector<double> v24 = v0.p0;
    v5.p1 = v8;
    const std::vector<double> v15 = v5.p0;
    v5.p0 = v32;
    v32[0] = v21;
    const std::vector<double> v49 = v5.p0;
    v5.p0 = v15;
    const std::vector<std::vector<double>> v56 = v0.p1;
    v32[1] = v48;
    const s0 v35(v49, v8);
    std::vector<std::vector<double>> v71 = v4;
    const s0 v28(v12, v20);
    const std::vector<double> v42 = v5.p0;
    v5.p1 = v56;
    v5.p1 = v23;
    const std::vector<std::vector<double>> v33 = v28.p1;
    const double v47 = v24[1];
    v32 = v1;
    v5.p0 = v1;
    const std::vector<double> v94 = v28.p0;
    const std::vector<double> v37 = v5.p0;
    s0 v64 = v22;
    v64.p1 = v20;
    v5.p0 = v24;
    v5.p0 = v11;
    const std::vector<double> v110 = v35.p0;
    const std::vector<std::vector<double>> v96 = v0.p1;
    v32[0] = v47;
    v64.p0 = v15;
    v64.p0 = v34;
    const std::vector<std::vector<double>> v92 = v64.p1;
    const s0 v79(v110, v96);
    const std::vector<std::vector<double>> v52 = v27[5];
    v5.p1 = v92;
    const std::vector<std::vector<double>> v66 = v79.p1;
    v5.p1 = v26;
    v5.p1 = v8;
    v5.p1 = v33;
    v5.p1 = v52;
    v5.p0 = v42;
    v64.p1 = v71;
    v5.p0 = v94;
    const s0 v89(v24, v66);
    v64.p0 = v37;
    v5.p0 = v1;
    return v89;
  }
  s0 f8(const s0 &v0) {
    s0 v6 = v0;
    const std::vector<s0> v5 { v0, v0, v6, v6, v6, v0 };
    std::vector<s0> v4 = v5;
    const s0 v7 = v4[5];
    const std::vector<std::vector<double>> v1 = v7.p1;
    const std::vector<double> v2 = v0.p0;
    const s0 v13 = v5[5];
    const s0 v12 = f33(v13);
    std::vector<s0> v23 = v4;
    v23[3] = v6;
    const double v17 = v2[0];
    const s0 v21 = f33(v7);
    v4[0] = v21;
    const std::vector<double> v14 = v7.p0;
    v6.p1 = v1;
    std::vector<double> v41 = v2;
    const s0 v20 = f33(v0);
    v6.p0 = v41;
    v41[1] = v17;
    const s0 v37 = f33(v13);
    v6.p0 = v41;
    const s0 v87 = v23[3];
    v23[3] = v20;
    const std::vector<std::vector<double>> v78 = v87.p1;
    s0 v93 = v37;
    const std::vector<std::vector<double>> v197 = v12.p1;
    v93.p1 = v78;
    v6.p0 = v14;
    v6.p1 = v197;
    return v93;
  }
  double f4(const s0 &v0, const double &v1) {
    const s0 v6 = f8(v0);
    const std::vector<s0> v9 { v6, v6, v0 };
    const s0 v11 = v9[1];
    const s0 v25 = f33(v11);
    const std::vector<double> v14 = v25.p0;
    std::vector<double> v30 = v14;
    double v56 = v1;
    v30[0] = v56;
    const double v80 = v30[1];
    return v80;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const s0 v2 = f33(v0);
    s0 v8 = v2;
    const std::vector<double> v3 = v2.p0;
    const std::vector<double> v6 = v2.p0;
    const std::vector<double> v10 = v2.p0;
    const s0 v11 = f8(v8);
    const double v12 = v10[1];
    const std::vector<std::vector<double>> v29 = v11.p1;
    const std::vector<double> v15 = v29[1];
    const std::vector<double> v25 = v2.p0;
    std::vector<double> v27 = v3;
    const s0 v18 = f33(v8);
    const double v17 = v15[0];
    v8.p0 = v10;
    const std::vector<double> v79 = v0.p0;
    const s0 v34 = f33(v18);
    const s0 v16 = f33(v34);
    const s0 v61 = f8(v18);
    v27[1] = v17;
    const double v51 = v25[1];
    std::vector<double> v35 = v10;
    v8.p0 = v3;
    v8.p0 = v35;
    const std::vector<s0> v31 { v8, v16, v16, v8, v61, v2 };
    const s0 v73 = v31[5];
    v27[0] = v12;
    v8.p0 = v27;
    v8.p0 = v6;
    v8.p0 = v79;
    const s0 v59 = f8(v73);
    const double v93 = f4(v59, v1);
    v35[1] = v51;
    v27[1] = v93;
    v8.p0 = v25;
    v8.p0 = v3;
    return v93;
  }
  int main() {
    s0 v0({ { 0.0, 1.0 }, { { 2.0 }, { 3.0 } } });
    double v1(4.0);
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
