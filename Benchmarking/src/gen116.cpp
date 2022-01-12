  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  std::vector<std::vector<double>> f21(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v5 = v0;
    const std::vector<double> v7 = v5[0];
    const std::vector<double> v1 = v5[0];
    std::vector<double> v3 = v7;
    const std::vector<double> v6 = v5[0];
    v5[0] = v3;
    const double v4 = v3[0];
    double v8 = v4;
    const std::vector<double> v12 = v5[0];
    v5[0] = v7;
    const std::vector<double> v9 = v0[0];
    v5[0] = v12;
    const std::vector<double> v11 = v5[0];
    const std::vector<double> v16 = v0[0];
    const double v17 = v16[0];
    const double v13 = v9[0];
    const double v23 = v12[0];
    double v18 = v17;
    v5[0] = v1;
    std::vector<double> v33 = v6;
    v3[0] = v13;
    std::vector<double> v30 = v11;
    const double v31 = v23 / v13;
    std::vector<std::vector<double>> v46 = v5;
    const double v34 = v7[0];
    v46 = v5;
    v30[0] = v34;
    v3[0] = v18;
    v46[0] = v30;
    v5[0] = v33;
    v33[0] = v31;
    std::vector<std::vector<double>> v50 = v46;
    v33[0] = v8;
    return v50;
  }
  s0 f20(const s0 &v0, const s1 &v1) {
    const std::vector<std::vector<double>> v3 = v0.p1;
    const s0 v2 = v1.p1;
    std::vector<std::vector<double>> v5 = v3;
    const s0 v4 = v1.p0;
    const std::vector<double> v7 = v3[0];
    const std::vector<std::vector<double>> v10 = v4.p1;
    std::vector<std::vector<double>> v6 = v10;
    const s0 v8 = v1.p1;
    const std::vector<double> v9 = v6[0];
    v6[0] = v7;
    std::vector<std::vector<double>> v14 = v5;
    v6 = v10;
    const std::vector<double> v12 = v14[0];
    s1 v19 = v1;
    v6[1] = v9;
    const s0 v15 = v19.p0;
    v5[0] = v9;
    s0 v16 = v2;
    v19.p0 = v16;
    v6[1] = v9;
    v6[0] = v12;
    s0 v28 = v0;
    v16.p1 = v14;
    v19.p0 = v4;
    s1 v35 = v19;
    const std::vector<std::vector<double>> v33 = v8.p2;
    v19.p0 = v0;
    const std::vector<std::vector<double>> v51 = f21(v33);
    v6[1] = v9;
    const s0 v46 = v35.p1;
    const std::vector<std::vector<double>> v43 = v46.p2;
    const std::vector<std::vector<double>> v106 = f21(v43);
    const s0 v89 = v35.p1;
    const std::vector<double> v37 = v5[0];
    const std::vector<std::vector<double>> v146 = f21(v51);
    const std::vector<std::vector<double>> v98 = v15.p1;
    const std::vector<std::vector<double>> v77 = f21(v146);
    v14[0] = v37;
    v35.p0 = v15;
    v16.p2 = v77;
    s1 v109 = v35;
    v16.p2 = v106;
    const s0 v80 = v109.p0;
    v109.p1 = v89;
    std::vector<std::vector<double>> v113 = v98;
    v28.p1 = v113;
    v109.p0 = v8;
    v19.p1 = v28;
    return v80;
  }
  s0 f19(const s0 &v0) {
    const s1 v1(v0, v0);
    const s0 v2 = f20(v0, v1);
    const s0 v11 = f20(v2, v1);
    const s0 v13 = f20(v11, v1);
    const s0 v14 = f20(v13, v1);
    return v14;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s0 &v1, const double &v2) {
    const s0 v7 = v0.p0;
    const s0 v10 = f19(v1);
    const s0 v3 = f20(v10, v0);
    const std::vector<s0> v6 { v3, v1, v7, v1 };
    double v39 = v2;
    const s0 v26 = v6[0];
    const std::vector<std::vector<double>> v21 = v26.p0;
    std::vector<std::vector<double>> v34 = v21;
    const std::vector<double> v58 = v34[1];
    std::vector<double> v33 = v58;
    v34[2] = v58;
    const double v75 = v33[0];
    const double v244 = v75 / v39;
    return v244;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 } }, { { 11.0 } } } });
    s0 v1({ { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 } }, { { 17.0 } } });
    double v2(18.0);
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
