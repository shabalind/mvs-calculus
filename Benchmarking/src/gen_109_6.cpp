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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s1> p0;
    s0 p1;
    s4(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s2 f26(const s2 &v0, const s0 &v1) {
    s2 v5 = v0;
    s0 v4 = v1;
    s0 v8 = v1;
    s2 v26 = v5;
    const std::vector<s0> v28 = v0.p0;
    const std::vector<std::vector<double>> v20 = v4.p1;
    std::vector<s0> v23 = v28;
    const s0 v38 = v23[1];
    v26.p1 = v8;
    s2 v49 = v26;
    v8.p1 = v20;
    v26.p0 = v28;
    v5.p1 = v38;
    return v49;
  }
  s0 f24(const s0 &v0) {
    const std::vector<s0> v1 { v0, v0, v0 };
    s0 v3 = v0;
    std::vector<s0> v5 = v1;
    v5[1] = v3;
    const std::vector<std::vector<double>> v6 = v0.p1;
    std::vector<std::vector<double>> v12 = v6;
    const std::vector<std::vector<double>> v7 = v0.p1;
    const std::vector<std::vector<double>> v4 = v0.p1;
    v3 = v0;
    v3.p1 = v12;
    const std::vector<std::vector<std::vector<double>>> v10 { v4, v6, v6, v6, v4, v4, v12 };
    const std::vector<std::vector<double>> v15 = v10[3];
    v3.p1 = v6;
    const std::vector<std::vector<double>> v9 = v0.p1;
    v3 = v0;
    const s2 v11(v5, v0);
    const std::vector<std::vector<double>> v40 = v3.p0;
    const std::vector<double> v23 = v6[2];
    std::vector<std::vector<double>> v28 = v6;
    v12 = v9;
    v12[2] = v23;
    const s2 v20 = f26(v11, v0);
    v3.p0 = v40;
    v3.p0 = v40;
    const std::vector<std::vector<double>> v27 = v0.p0;
    v3.p1 = v28;
    const std::vector<std::vector<std::vector<double>>> v24 { v15, v12, v7 };
    v28[2] = v23;
    v5[2] = v3;
    v5[0] = v0;
    const std::vector<s0> v38 = v11.p0;
    v3.p0 = v40;
    v3.p0 = v40;
    const std::vector<std::vector<double>> v77 = v24[0];
    const std::vector<std::vector<double>> v70 = v3.p0;
    v3.p0 = v70;
    const s0 v63 = v20.p1;
    v5 = v38;
    v3.p0 = v27;
    v3.p0 = v70;
    v3.p1 = v77;
    v3.p0 = v70;
    v3.p0 = v27;
    return v63;
  }
  s0 f22(const s0 &v0) {
    s0 v2 = v0;
    v2 = v0;
    const s0 v12 = f24(v2);
    const s0 v40 = f24(v12);
    return v40;
  }
  s0 f6(const s0 &v0) {
    const s0 v6 = f24(v0);
    const s0 v44 = f22(v6);
    return v44;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s4>> &v0, const double &v1) {
    const std::vector<s4> v2 = v0[0];
    double v5 = v1;
    const s4 v7 = v2[0];
    s4 v6 = v7;
    const s0 v11 = v7.p1;
    const s0 v9 = f24(v11);
    const std::vector<s1> v8 = v6.p0;
    v6.p1 = v9;
    v6.p0 = v8;
    v6.p0 = v8;
    v6.p1 = v11;
    s4 v29 = v6;
    const s0 v13 = v29.p1;
    const s0 v24 = f6(v13);
    v29.p0 = v8;
    std::vector<s1> v17 = v8;
    const std::vector<std::vector<double>> v26 = v24.p1;
    v6.p0 = v17;
    const s0 v23 = f6(v11);
    const std::vector<s4> v59 = v0[0];
    s4 v28 = v6;
    std::vector<s1> v31 = v8;
    s4 v60 = v28;
    const std::vector<double> v57 = v26[2];
    const s4 v80 = v59[0];
    const double v93 = v57[0];
    v29.p1 = v24;
    const double v113 = v93 - v5;
    const std::vector<s1> v62 = v80.p0;
    v28.p0 = v17;
    v29.p0 = v8;
    v29.p0 = v31;
    v60.p1 = v23;
    std::vector<double> v85 = v57;
    const std::vector<s1> v77 = v60.p0;
    std::vector<double> v106 = v85;
    const double v108 = v106[0];
    v31 = v77;
    v28.p0 = v62;
    const double v324 = v108 / v113;
    return v324;
  }
  int main() {
    std::vector<std::vector<s4>> v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } } } } });
    double v1(35.0);
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
