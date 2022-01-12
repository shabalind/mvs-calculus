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
    s0 p2;
    s0 p3;
    s0 p4;
    s0 p5;
    s1(s0 v0, s0 v1, s0 v2, s0 v3, s0 v4, s0 v5): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5) { }
  };
  s1 f20(const s1 &v0) {
    const s0 v5 = v0.p0;
    s0 v3 = v5;
    const std::vector<std::vector<double>> v2 = v5.p0;
    const s0 v15 = v0.p0;
    v3.p0 = v2;
    const std::vector<s1> v6 { v0, v0, v0, v0, v0, v0 };
    const std::vector<std::vector<double>> v9 = v3.p0;
    v3.p0 = v2;
    const s1 v13 = v6[5];
    const std::vector<std::vector<double>> v34 = v15.p0;
    v3.p0 = v34;
    const s1 v22 = v6[0];
    const std::vector<std::vector<double>> v38 = v3.p0;
    v3.p0 = v38;
    const s0 v29 = v13.p5;
    std::vector<std::vector<double>> v42 = v38;
    v3.p0 = v9;
    s0 v43 = v29;
    s1 v63 = v22;
    s1 v82 = v63;
    v43.p0 = v42;
    v63.p3 = v43;
    return v82;
  }
  std::vector<double> f14(const std::vector<double> &v0) {
    const double v2 = v0[0];
    double v7 = v2;
    std::vector<double> v4 = v0;
    const double v6 = v4[0];
    v4[0] = v6;
    std::vector<double> v1 = v0;
    v4[0] = v7;
    const double v15 = v4[0];
    v1[0] = v7;
    const std::vector<std::vector<double>> v3 { v0, v1 };
    const std::vector<double> v20 = v3[0];
    const double v13 = v20[0];
    v4[0] = v15;
    std::vector<double> v11 = v4;
    const std::vector<std::vector<double>> v9 { v0, v4, v0 };
    v4 = v1;
    double v17 = v13;
    v4[0] = v2;
    std::vector<std::vector<double>> v14 = v9;
    const std::vector<double> v25 = v14[1];
    std::vector<std::vector<double>> v19 = v9;
    v19[0] = v11;
    const std::vector<double> v26 = v19[0];
    std::vector<double> v43 = v25;
    v43[0] = v17;
    v14[0] = v4;
    v14 = v19;
    v19[2] = v26;
    return v43;
  }
  s0 f13(const s0 &v0, const s1 &v1, const s1 &v2) {
    const s0 v3 = v1.p5;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<double> v6 = v4[0];
    const std::vector<double> v7 = v4[0];
    s0 v9 = v3;
    const std::vector<double> v5 = v4[1];
    const s0 v14 = v1.p5;
    v9.p0 = v4;
    const s0 v13 = v1.p5;
    const std::vector<std::vector<double>> v35 = v3.p0;
    std::vector<std::vector<double>> v11 = v35;
    const std::vector<double> v10 = v4[1];
    const s0 v12(v35);
    const s1 v15 = f20(v1);
    v9.p0 = v35;
    v9 = v13;
    v11[0] = v5;
    const std::vector<std::vector<double>> v32 = v3.p0;
    const std::vector<double> v39 = v11[1];
    v11[0] = v7;
    v9.p0 = v32;
    v9.p0 = v35;
    v9.p0 = v35;
    s1 v23 = v2;
    const double v26 = v39[0];
    const std::vector<std::vector<double>> v54 = v9.p0;
    v23.p5 = v9;
    v23.p0 = v12;
    v11[1] = v7;
    const std::vector<std::vector<double>> v33 = v3.p0;
    const std::vector<double> v34 = f14(v10);
    v9.p0 = v33;
    v11[0] = v34;
    const std::vector<std::vector<double>> v56 = v3.p0;
    v11[1] = v39;
    v9.p0 = v54;
    v23.p3 = v3;
    std::vector<double> v49 = v34;
    const std::vector<double> v21 = v56[0];
    const s0 v50 = v2.p4;
    v23.p2 = v0;
    v9.p0 = v33;
    v23.p2 = v3;
    const double v46 = v10[0];
    std::vector<std::vector<double>> v37 = v35;
    std::vector<double> v101 = v6;
    v37[0] = v49;
    v37[1] = v101;
    v23.p2 = v50;
    v37[0] = v6;
    v37[0] = v49;
    v9.p0 = v37;
    v9.p0 = v35;
    s1 v62 = v15;
    std::vector<double> v63 = v21;
    double v85 = v46;
    v37[1] = v63;
    const s1 v243 = f20(v23);
    const s0 v113 = v62.p4;
    v23.p5 = v14;
    const s0 v171 = v243.p0;
    const double v91 = v5[0];
    v62.p5 = v9;
    v23.p1 = v113;
    v101[0] = v85;
    v101[0] = v91;
    s0 v187 = v171;
    v63[0] = v26;
    return v187;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const std::vector<s1> v6 = v0[0];
    const std::vector<s1> v2 = v0[0];
    const s1 v3 = v6[0];
    const s1 v9 = v2[0];
    const s1 v10 = v6[0];
    const s0 v4 = v10.p5;
    s1 v11 = v9;
    s1 v19 = v9;
    v19.p2 = v4;
    const s0 v13 = f13(v4, v11, v3);
    const s0 v30 = f13(v13, v19, v10);
    const s0 v31 = v11.p1;
    const s1 v28 = v6[0];
    v19.p4 = v31;
    const std::vector<std::vector<double>> v41 = v30.p0;
    const s0 v50 = v28.p1;
    const double v42 = v1 + v1;
    const std::vector<double> v79 { v1, v1, v1, v42 };
    const double v43 = v79[0];
    v19.p4 = v13;
    const std::vector<double> v60 = v41[1];
    const double v93 = v60[0];
    v19.p2 = v50;
    const double v142 = v93 * v43;
    return v142;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 }, { 1.0 } } }, { { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 } } }, { { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 } } } } }, { { { { { 12.0 }, { 13.0 } } }, { { { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } } }, { { { 22.0 }, { 23.0 } } } } } });
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
