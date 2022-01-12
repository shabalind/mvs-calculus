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
    s0 p2;
    s2(std::vector<s0> v0, std::vector<s0> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s4 {
    s2 p0;
    std::vector<double> p1;
    s4(s2 v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s4 p0;
    s2 p1;
    s5(s4 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s2> p0;
    s5 p1;
    s7(std::vector<s2> v0, s5 v1): p0(v0), p1(v1) { }
  };
  s4 f46(const s1 &v0, const s4 &v1) {
    s4 v12 = v1;
    const s2 v31 = v12.p0;
    v12.p0 = v31;
    return v12;
  }
  std::vector<s2> f41(const std::vector<s2> &v0) {
    const s2 v5 = v0[2];
    std::vector<s2> v3 = v0;
    const s2 v6 = v3[0];
    v3[2] = v6;
    std::vector<s2> v8 = v3;
    v3[0] = v5;
    v8[2] = v6;
    return v8;
  }
  s2 f39(const s2 &v0) {
    s2 v4 = v0;
    s2 v1 = v4;
    const std::vector<s2> v3 { v1 };
    const s2 v5 = v3[0];
    std::vector<s2> v7 = v3;
    const s2 v2 = v7[0];
    const s2 v6 = v7[0];
    const std::vector<s0> v9 = v6.p0;
    v7[0] = v1;
    const std::vector<s0> v13 = v4.p1;
    const s0 v10 = v4.p2;
    v1 = v0;
    std::vector<s0> v8 = v13;
    const std::vector<s0> v15 = v5.p1;
    const s0 v14 = v9[0];
    const std::vector<s2> v20 { v5, v0, v1, v1, v1 };
    v8[0] = v14;
    std::vector<s0> v18 = v9;
    v4 = v0;
    const std::vector<s2> v11 { v1, v1, v4 };
    v7[0] = v0;
    v7[0] = v0;
    v7[0] = v0;
    s2 v19 = v2;
    std::vector<s0> v37 = v18;
    v18[0] = v10;
    const s0 v57 = v0.p2;
    v7[0] = v19;
    const std::vector<s2> v39 = f41(v11);
    std::vector<s2> v49 = v39;
    const std::vector<s0> v35 = v1.p0;
    v19.p0 = v9;
    v4.p0 = v35;
    const std::vector<s2> v53 = f41(v11);
    const s0 v81 = v13[1];
    v8[0] = v57;
    const std::vector<s0> v51 = v6.p0;
    const s2 v65 = v53[1];
    const s2 v143 = v49[1];
    v37[0] = v81;
    v7[0] = v143;
    const std::vector<std::vector<s2>> v76 { v20, v20, v20, v20 };
    v1.p0 = v51;
    const std::vector<s2> v149 = v76[2];
    v19.p0 = v35;
    const s2 v136 = v149[2];
    std::vector<s0> v87 = v15;
    v19.p1 = v87;
    v4.p1 = v8;
    v49[0] = v65;
    v4.p0 = v37;
    v19.p2 = v57;
    v19.p1 = v13;
    return v136;
  }
  s2 f33(const s0 &v0, const s2 &v1) {
    s2 v4 = v1;
    const s2 v5 = f39(v4);
    v4.p2 = v0;
    v4.p2 = v0;
    return v5;
  }
  s2 f23(const s2 &v0) {
    const s2 v6 = f39(v0);
    const std::vector<s0> v3 = v6.p0;
    s2 v5 = v0;
    v5.p0 = v3;
    v5.p0 = v3;
    std::vector<s0> v4 = v3;
    const std::vector<s0> v1 = v0.p1;
    s2 v13 = v5;
    const s0 v11 = v3[0];
    const s0 v17 = v1[1];
    v4[0] = v17;
    v13.p1 = v1;
    const std::vector<std::vector<double>> v60 = v11.p0;
    std::vector<std::vector<double>> v25 = v60;
    v5.p2 = v17;
    const s0 v23 = v1[0];
    s0 v18 = v17;
    const s2 v10 = f33(v18, v13);
    v13.p1 = v1;
    v13.p0 = v4;
    v25 = v60;
    const s2 v38 = f33(v23, v10);
    v18.p0 = v25;
    v13.p0 = v3;
    v25 = v60;
    v4[0] = v23;
    const s2 v94 = f33(v23, v38);
    return v94;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const double &v1) {
    const std::vector<s7> v3 { v0, v0, v0, v0 };
    const s7 v13 = v3[3];
    const s5 v11 = v13.p1;
    const s4 v9 = v11.p0;
    const s2 v15 = v11.p1;
    s4 v23 = v9;
    const s2 v28 = f23(v15);
    v23.p0 = v15;
    s4 v29 = v23;
    const s2 v38 = f23(v28);
    v23.p0 = v38;
    const s2 v31 = f23(v28);
    const std::vector<s0> v32 = v15.p1;
    const s2 v60 = f23(v15);
    const s2 v22 = f23(v60);
    const s2 v50 = f23(v31);
    v29.p0 = v22;
    const s0 v155 = v32[0];
    const s1 v39(v155, v155);
    const s4 v94 = f46(v39, v29);
    v29.p0 = v22;
    const s2 v85 = v23.p0;
    const s2 v117 = f33(v155, v50);
    v23 = v94;
    const s2 v79 = f39(v85);
    const s0 v103 = v79.p2;
    const std::vector<std::vector<double>> v70 = v103.p0;
    const s2 v72 = f23(v117);
    v29.p0 = v72;
    v29 = v9;
    const std::vector<double> v224 = v70[0];
    std::vector<double> v161 = v224;
    const double v286 = v161[0];
    return v286;
  }
  int main() {
    s7 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { 24.0, 25.0 } }, { { { { { 26.0 }, { 27.0 } }, { { 28.0 } } } }, { { { { 29.0 }, { 30.0 } }, { { 31.0 } } }, { { { 32.0 }, { 33.0 } }, { { 34.0 } } } }, { { { 35.0 }, { 36.0 } }, { { 37.0 } } } } } });
    double v1(38.0);
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
