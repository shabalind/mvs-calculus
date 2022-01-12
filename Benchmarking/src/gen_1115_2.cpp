  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    std::vector<s0> p2;
    s1(std::vector<s0> v0, std::vector<s0> v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  s0 f40(const s0 &v0) {
    s0 v1 = v0;
    s0 v3 = v0;
    const std::vector<s0> v8 { v3, v3 };
    const std::vector<double> v6 = v1.p0;
    const double v4 = v6[0];
    std::vector<s0> v5 = v8;
    v5[0] = v1;
    const s0 v7 = v8[0];
    v5[1] = v1;
    v3.p0 = v6;
    v1.p0 = v6;
    double v2 = v4;
    const std::vector<std::vector<double>> v9 = v3.p1;
    std::vector<double> v15 = v6;
    v3.p1 = v9;
    v15[0] = v2;
    const std::vector<std::vector<double>> v12 = v1.p1;
    const double v13 = v15[1];
    const std::vector<double> v14 = v0.p0;
    const std::vector<double> v10 = v3.p0;
    const std::vector<double> v17 = v9[0];
    const double v22 = v17[0];
    v5[0] = v3;
    const std::vector<double> v35 = v1.p0;
    v1.p1 = v12;
    v3.p0 = v15;
    v1.p0 = v10;
    v1.p1 = v12;
    v15[0] = v22;
    v3.p0 = v35;
    v15[0] = v13;
    const std::vector<std::vector<double>> v25 = v3.p1;
    v1.p0 = v15;
    const s0 v33 = v5[1];
    v3.p0 = v14;
    const std::vector<std::vector<double>> v26 = v0.p1;
    std::vector<std::vector<double>> v36 = v25;
    const std::vector<double> v30 = v3.p0;
    std::vector<std::vector<double>> v42 = v26;
    v3.p0 = v14;
    v3.p1 = v9;
    v5[1] = v3;
    v1.p1 = v12;
    v3.p1 = v36;
    v5[1] = v7;
    const std::vector<double> v43 = v25[1];
    v36[1] = v43;
    v1.p1 = v42;
    v1.p0 = v30;
    v3.p0 = v10;
    v5[1] = v7;
    return v33;
  }
  s0 f36(const s0 &v0) {
    const std::vector<s0> v4 { v0, v0 };
    const std::vector<std::vector<double>> v3 = v0.p1;
    const s0 v7 = f40(v0);
    const std::vector<double> v9 = v3[2];
    const s0 v8 = f40(v7);
    const s0 v5 = f40(v0);
    std::vector<std::vector<double>> v12 = v3;
    std::vector<std::vector<double>> v18 = v12;
    std::vector<s0> v10 = v4;
    const std::vector<double> v14 = v8.p0;
    const s0 v17(v14, v18);
    const s0 v28 = v10[1];
    const s0 v15 = f40(v28);
    const s0 v23 = f40(v15);
    std::vector<double> v22 = v9;
    const std::vector<double> v36 = v17.p0;
    const double v37 = v36[0];
    v22[0] = v37;
    std::vector<double> v66 = v9;
    const s0 v40 = f40(v17);
    const std::vector<std::vector<double>> v48 = v23.p1;
    v18 = v3;
    const s0 v67 = f40(v5);
    v66 = v22;
    const std::vector<double> v89 = v48[2];
    const double v86 = v66[0];
    v22[0] = v86;
    s0 v306 = v40;
    v12[1] = v66;
    v12[0] = v89;
    v10[0] = v67;
    return v306;
  }
  s0 f35(const s0 &v0) {
    s0 v8 = v0;
    const std::vector<double> v7 = v0.p0;
    const s0 v1 = f36(v8);
    const std::vector<double> v4 = v1.p0;
    v8 = v0;
    const double v2 = v4[0];
    const std::vector<std::vector<double>> v3 = v1.p1;
    const s0 v6 = f36(v1);
    double v11 = v2;
    std::vector<std::vector<double>> v9 = v3;
    const std::vector<double> v5 = v9[0];
    const s0 v12 = f40(v6);
    const std::vector<std::vector<double>> v16 = v12.p1;
    const std::vector<std::vector<double>> v10 = v12.p1;
    v9[2] = v5;
    v8.p1 = v10;
    std::vector<double> v18 = v7;
    v18[1] = v11;
    const s0 v26 = f36(v12);
    const std::vector<std::vector<double>> v32 = v26.p1;
    const double v40 = v7[0];
    s0 v34 = v0;
    const s0 v36 = f40(v6);
    v8.p1 = v32;
    v8.p1 = v10;
    v34.p1 = v3;
    const std::vector<double> v51 = v34.p0;
    const std::vector<double> v45 = v0.p0;
    v34.p0 = v18;
    const std::vector<std::vector<double>> v73 = v36.p1;
    std::vector<std::vector<double>> v67 = v32;
    const s0 v60(v45, v67);
    const s0 v78 = f36(v6);
    const std::vector<double> v49 = v26.p0;
    const std::vector<double> v58 = v36.p0;
    std::vector<std::vector<double>> v130 = v67;
    const std::vector<std::vector<double>> v115 = v26.p1;
    v8.p0 = v58;
    const s0 v120 = f40(v60);
    const std::vector<double> v107 = v73[1];
    s0 v85 = v78;
    const double v259 = v11 / v40;
    v34.p1 = v130;
    v34.p0 = v49;
    std::vector<double> v122 = v107;
    v11 = v259;
    v85.p0 = v45;
    v34.p1 = v115;
    const std::vector<double> v63 = v120.p0;
    const std::vector<double> v198 = v16[2];
    v85.p0 = v51;
    std::vector<double> v125 = v63;
    v85.p1 = v9;
    v8.p0 = v125;
    v9[2] = v122;
    v67[1] = v198;
    return v85;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<s0> v2 = v0.p0;
    const s0 v5 = v2[0];
    const s0 v8 = f35(v5);
    const std::vector<double> v11 = v8.p0;
    const s0 v12 = f40(v5);
    const std::vector<double> v7 { v1, v1 };
    const std::vector<double> v14 = v12.p0;
    const std::vector<s0> v10 = v0.p2;
    std::vector<double> v36 = v11;
    v36 = v7;
    const s0 v18 = v10[0];
    const double v17 = v36[1];
    v36[1] = v17;
    const std::vector<double> v26 = v18.p0;
    const double v41 = v26[0];
    v36[1] = v41;
    const double v38 = v17 - v17;
    const double v70 = v38 + v1;
    v36[1] = v41;
    v36 = v14;
    return v70;
  }
  int main() {
    s1 v0({ { { { 0.0, 1.0 }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { 5.0, 6.0 }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { 10.0, 11.0 }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { 15.0, 16.0 }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { 20.0, 21.0 }, { { 22.0 }, { 23.0 }, { 24.0 } } } }, { { { 25.0, 26.0 }, { { 27.0 }, { 28.0 }, { 29.0 } } } } });
    double v1(30.0);
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
