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
  struct s4 {
    s1 p0;
    s1 p1;
    s4(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s0 f29(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v2 = v1.p0;
    const std::vector<s0> v3 { v0, v1, v0, v1, v1 };
    const s0 v4 = v3[3];
    const std::vector<double> v8 = v2[0];
    const s0 v10 = v3[3];
    const std::vector<std::vector<double>> v5 = v1.p0;
    const s0 v11 = v3[1];
    const std::vector<std::vector<double>> v12 = v10.p1;
    const std::vector<std::vector<double>> v21 = v4.p1;
    s0 v23 = v0;
    std::vector<std::vector<double>> v15 = v2;
    s0 v28 = v1;
    v23.p0 = v5;
    v28.p1 = v12;
    const std::vector<std::vector<double>> v25 = v11.p1;
    v28.p0 = v5;
    v15[2] = v8;
    v23.p1 = v25;
    const std::vector<std::vector<double>> v16 = v28.p0;
    v28.p0 = v5;
    const std::vector<double> v38 = v15[2];
    v23.p1 = v21;
    v28.p1 = v21;
    v28.p1 = v12;
    const std::vector<std::vector<double>> v52 = v10.p0;
    const s0 v41 = v3[3];
    v28.p1 = v25;
    const std::vector<std::vector<double>> v78 = v10.p1;
    const std::vector<std::vector<double>> v32 = v11.p0;
    std::vector<std::vector<double>> v70 = v32;
    std::vector<std::vector<double>> v85 = v70;
    std::vector<s0> v51 = v3;
    v23.p1 = v12;
    v15 = v16;
    const std::vector<std::vector<double>> v66 = v28.p0;
    std::vector<s0> v93 = v51;
    v28.p0 = v15;
    v85[2] = v38;
    v93[1] = v28;
    const std::vector<std::vector<double>> v86 = v41.p0;
    const std::vector<double> v74 = v78[0];
    v28.p0 = v52;
    v23.p0 = v66;
    const s0 v176 = v93[1];
    v28.p0 = v2;
    v51[4] = v28;
    v28.p1 = v21;
    v23.p0 = v86;
    const std::vector<double> v109 = v85[1];
    v15[1] = v109;
    v85[0] = v74;
    v93[3] = v23;
    v23.p0 = v70;
    return v176;
  }
  s0 f28(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v1 = v7.p1;
    const s0 v6 = f29(v0, v7);
    const std::vector<double> v11 = v1[0];
    std::vector<std::vector<double>> v9 = v1;
    std::vector<double> v8 = v11;
    std::vector<double> v16 = v8;
    v7.p1 = v1;
    std::vector<double> v31 = v16;
    const double v21 = v16[0];
    v8 = v31;
    v7.p1 = v9;
    const double v15 = v16[0];
    const std::vector<std::vector<double>> v17 = v7.p0;
    v9[0] = v31;
    v8[0] = v15;
    v16[0] = v21;
    const s0 v27(v17, v9);
    const s0 v55 = f29(v6, v27);
    v9[0] = v31;
    const s0 v43 = f29(v55, v7);
    return v43;
  }
  s1 f24(const s1 &v0) {
    const s0 v7 = v0.p0;
    s1 v2 = v0;
    v2 = v0;
    v2.p0 = v7;
    v2.p0 = v7;
    return v2;
  }
  s4 f19(const s4 &v0) {
    s4 v5 = v0;
    const s1 v6 = v0.p1;
    v5.p1 = v6;
    return v5;
  }
  s0 f11(const s0 &v0) {
    s0 v2 = v0;
    const std::vector<std::vector<double>> v6 = v2.p1;
    const std::vector<std::vector<double>> v1 = v2.p1;
    v2.p1 = v1;
    const s0 v4 = f28(v0);
    v2.p1 = v1;
    v2.p1 = v1;
    s0 v5 = v0;
    const std::vector<std::vector<double>> v14 = v0.p0;
    const s0 v20 = f29(v4, v5);
    v2.p0 = v14;
    const std::vector<std::vector<double>> v15 = v20.p0;
    v5.p0 = v15;
    const s0 v26 = f28(v0);
    v2.p1 = v1;
    const std::vector<s0> v30 { v20, v26 };
    const s0 v38 = v30[0];
    const std::vector<std::vector<double>> v46 = v2.p0;
    s0 v125 = v38;
    v125.p1 = v6;
    v5.p0 = v46;
    return v125;
  }
  double f6(const s1 &v0, const double &v1, const s4 &v2) {
    const s0 v5 = v0.p0;
    const std::vector<std::vector<double>> v8 = v5.p0;
    const std::vector<double> v12 = v8[1];
    const double v58 = v12[0];
    const double v45 = v1 + v58;
    double v63 = v45;
    return v63;
  }
  s0 f1(const s0 &v0) {
    s0 v6 = v0;
    const s0 v8 = f11(v6);
    const std::vector<s0> v4 { v8, v0, v6, v8 };
    const s0 v1 = v4[0];
    const s0 v7 = v4[3];
    const s0 v5 = v4[3];
    const std::vector<std::vector<double>> v2 = v7.p0;
    v6.p0 = v2;
    const std::vector<std::vector<double>> v12 = v5.p1;
    std::vector<std::vector<double>> v10 = v2;
    s0 v21 = v7;
    const std::vector<double> v3 = v12[0];
    v10[1] = v3;
    const std::vector<double> v13 = v2[0];
    v6.p0 = v2;
    v10[0] = v3;
    v10[1] = v13;
    v21.p0 = v10;
    v21.p1 = v12;
    v21.p1 = v12;
    const s0 v25 = f11(v21);
    const s0 v43 = f29(v1, v25);
    return v43;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s1 &v1, const s0 &v2, const double &v3) {
    const s0 v5 = f1(v2);
    const s0 v9 = f29(v5, v5);
    const s0 v13 = f28(v9);
    const std::vector<std::vector<double>> v8 = v13.p0;
    const std::vector<double> v10 = v8[0];
    double v21 = v3;
    const double v15 = v10[0];
    const s1 v31 = f24(v0);
    const std::vector<s1> v76 { v1, v0, v0 };
    const s1 v71 = v76[1];
    const s4 v64(v1, v31);
    const s4 v125 = f19(v64);
    const double v104 = v15 * v21;
    const double v205 = f6(v71, v104, v125);
    return v205;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } });
    s1 v1({ { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } } });
    s0 v2({ { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } });
    double v3(36.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
