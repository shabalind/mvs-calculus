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
    std::vector<s0> p1;
    s2(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s1 f38(const s1 &v0) {
    const s0 v4 = v0.p1;
    const s0 v1 = v0.p0;
    const s0 v11 = v0.p1;
    const s0 v6 = v0.p0;
    const std::vector<std::vector<double>> v7 = v1.p0;
    std::vector<std::vector<double>> v12 = v7;
    const std::vector<double> v15 = v7[0];
    const std::vector<std::vector<double>> v10 = v4.p0;
    const s0 v3 = v0.p0;
    const std::vector<std::vector<double>> v8 = v6.p1;
    const std::vector<std::vector<double>> v17 = v11.p1;
    v12[0] = v15;
    v12[0] = v15;
    std::vector<std::vector<double>> v9 = v7;
    const std::vector<double> v19 = v8[0];
    const std::vector<double> v18 = v8[1];
    const std::vector<double> v26 = v17[2];
    const s0 v16 = v0.p1;
    const std::vector<std::vector<double>> v21 = v3.p1;
    v12[0] = v19;
    std::vector<std::vector<double>> v40 = v10;
    v40 = v9;
    v40[0] = v26;
    const std::vector<double> v24 = v7[0];
    v40 = v12;
    const std::vector<double> v20 = v21[0];
    v12[0] = v24;
    v40[0] = v15;
    const std::vector<double> v38 = v17[1];
    v9[0] = v18;
    const std::vector<double> v33 = v9[0];
    v9[0] = v20;
    s0 v34 = v16;
    v40[0] = v38;
    const s1 v59(v4, v34);
    v34.p1 = v8;
    v9[0] = v33;
    v34.p0 = v40;
    return v59;
  }
  s2 f16(const s2 &v0) {
    s2 v13 = v0;
    return v13;
  }
  s0 f6(const s0 &v0) {
    s0 v5 = v0;
    const s1 v1(v0, v0);
    const std::vector<std::vector<double>> v4 = v5.p0;
    std::vector<std::vector<double>> v7 = v4;
    const std::vector<double> v3 = v4[0];
    const std::vector<double> v12 = v7[0];
    const s0 v17 = v1.p1;
    v7[0] = v3;
    const s1 v6 = f38(v1);
    const s1 v13 = f38(v1);
    const s1 v11 = f38(v13);
    const std::vector<std::vector<double>> v19 = v0.p1;
    v7[0] = v3;
    const s1 v25 = f38(v11);
    v5.p0 = v4;
    v5.p0 = v4;
    const std::vector<double> v34 = v19[2];
    std::vector<std::vector<double>> v27 = v4;
    std::vector<std::vector<double>> v33 = v19;
    v5.p0 = v27;
    std::vector<std::vector<double>> v40 = v33;
    v33 = v40;
    const s0 v44 = v25.p1;
    const s0 v22(v7, v40);
    const std::vector<std::vector<double>> v35 = v44.p0;
    const std::vector<double> v26 = v7[0];
    v27[0] = v34;
    const std::vector<double> v15 = v40[0];
    v40[0] = v12;
    const std::vector<std::vector<double>> v51 = v17.p0;
    const std::vector<double> v70 = v40[2];
    v5.p0 = v51;
    v7[0] = v15;
    v7[0] = v70;
    v5.p1 = v19;
    const s0 v112 = v6.p1;
    s0 v121 = v22;
    v5.p0 = v35;
    const std::vector<std::vector<double>> v83 = v112.p0;
    v7[0] = v26;
    v5.p0 = v83;
    v27 = v83;
    return v121;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    const s2 v3 = v0[1];
    const s2 v6 = f16(v3);
    const std::vector<s0> v19 = v6.p0;
    const s0 v23 = v19[0];
    const s0 v24 = f6(v23);
    const std::vector<std::vector<double>> v52 = v24.p0;
    std::vector<std::vector<double>> v56 = v52;
    const std::vector<double> v86 = v56[0];
    std::vector<double> v96 = v86;
    const double v113 = v86[0];
    double v210 = v113;
    v56[0] = v96;
    return v210;
  }
  int main() {
    std::vector<s2> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } } }, { { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } }, { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } });
    double v1(24.0);
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
