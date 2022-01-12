  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f29(const s0 &v0) {
    const std::vector<std::vector<double>> v1 = v0.p0;
    const std::vector<std::vector<double>> v3 = v0.p0;
    const s0 v7(v1);
    s0 v6 = v0;
    const std::vector<std::vector<double>> v2 = v6.p0;
    std::vector<std::vector<double>> v4 = v1;
    const std::vector<std::vector<double>> v9 = v6.p0;
    std::vector<std::vector<double>> v8 = v1;
    v6.p0 = v8;
    const std::vector<double> v12 = v4[0];
    v4[0] = v12;
    const std::vector<double> v5 = v9[0];
    const double v13 = v5[0];
    const std::vector<double> v30 = v1[0];
    s0 v11 = v0;
    const std::vector<double> v10 = v8[0];
    const std::vector<std::vector<double>> v23 = v6.p0;
    v11.p0 = v4;
    const double v18 = v5[0];
    const std::vector<std::vector<double>> v16 = v6.p0;
    v4[0] = v5;
    const std::vector<std::vector<double>> v17 = v0.p0;
    v6.p0 = v2;
    v11.p0 = v1;
    v6.p0 = v16;
    const std::vector<std::vector<double>> v15 = v7.p0;
    const double v25 = v18 / v18;
    std::vector<std::vector<double>> v21 = v15;
    std::vector<double> v29 = v30;
    const std::vector<double> v34 = v23[0];
    const std::vector<double> v20 = v16[0];
    s0 v24 = v0;
    std::vector<double> v28 = v10;
    v11.p0 = v8;
    v24.p0 = v17;
    const std::vector<std::vector<double>> v22 = v24.p0;
    v4 = v9;
    v4 = v21;
    std::vector<double> v27 = v29;
    std::vector<std::vector<double>> v85 = v17;
    const double v73 = v29[0];
    const std::vector<std::vector<double>> v36 = v7.p0;
    v28[0] = v25;
    const std::vector<double> v42 = v4[0];
    const std::vector<std::vector<double>> v53 = v6.p0;
    v24.p0 = v22;
    const std::vector<double> v19 = v2[0];
    std::vector<std::vector<double>> v52 = v1;
    std::vector<std::vector<double>> v64 = v52;
    v4[0] = v19;
    const std::vector<std::vector<double>> v32 = v24.p0;
    const double v35 = v34[0];
    v11.p0 = v21;
    v27[0] = v18;
    const std::vector<std::vector<double>> v49 = v7.p0;
    const double v122 = v28[0];
    v11.p0 = v32;
    v28[0] = v122;
    const std::vector<double> v60 = v3[0];
    v64[0] = v34;
    const double v97 = v73 - v13;
    v11.p0 = v21;
    const std::vector<std::vector<double>> v55 { v60 };
    v6.p0 = v2;
    v6.p0 = v36;
    v11.p0 = v49;
    const std::vector<std::vector<double>> v74 = v6.p0;
    const s1 v71(v24, v11);
    std::vector<std::vector<double>> v125 = v2;
    v6.p0 = v125;
    const double v90 = v10[0];
    const s0 v67 = v71.p0;
    v125[0] = v42;
    const s1 v39(v24, v7);
    const std::vector<std::vector<double>> v46 = v6.p0;
    v4[0] = v20;
    v24.p0 = v125;
    v8[0] = v28;
    v6.p0 = v85;
    v29[0] = v18;
    v85 = v46;
    v6.p0 = v55;
    v24.p0 = v4;
    s1 v57 = v39;
    const std::vector<std::vector<std::vector<double>>> v66 { v64, v53, v74, v53, v125, v36, v46 };
    v57.p1 = v67;
    v57.p1 = v11;
    v24.p0 = v4;
    const std::vector<std::vector<double>> v69 = v66[4];
    v85[0] = v27;
    const std::vector<double> v151 = v22[0];
    v29 = v30;
    const double v96 = v90 + v97;
    v64[0] = v19;
    const s0 v144 = v57.p0;
    v52[0] = v151;
    v28[0] = v18;
    v6.p0 = v69;
    v29[0] = v35;
    v24.p0 = v36;
    v125[0] = v34;
    v28[0] = v96;
    v57.p0 = v67;
    v29[0] = v13;
    return v144;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const std::vector<double> v9 { v1, v1 };
    std::vector<double> v4 = v9;
    std::vector<double> v7 = v4;
    const s0 v6 = v0[2];
    v4[1] = v1;
    const s0 v11 = f29(v6);
    const double v5 = v7[0];
    v4 = v7;
    const std::vector<std::vector<double>> v2 = v11.p0;
    const std::vector<double> v39 = v2[0];
    v7[1] = v5;
    std::vector<double> v18 = v39;
    const double v57 = v18[0];
    v7[0] = v57;
    return v5;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } } }, { { { 1.0 } } }, { { { 2.0 } } } });
    double v1(3.0);
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
