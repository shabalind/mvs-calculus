  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    double p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    std::vector<std::vector<double>> p5;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1, double v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4, std::vector<std::vector<double>> v5): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5) { }
  };
  std::vector<double> f87(const std::vector<double> &v0) {
    std::vector<double> v4 = v0;
    std::vector<double> v6 = v0;
    const double v2 = v4[0];
    std::vector<double> v3 = v4;
    const std::vector<std::vector<double>> v1 { v3, v3, v6, v6 };
    v3[1] = v2;
    const double v9 = v3[1];
    v4[1] = v9;
    v4[1] = v2;
    v4 = v0;
    const std::vector<double> v13 = v1[1];
    const double v14 = v4[0];
    const double v26 = v13[0];
    const double v15 = v3[1];
    std::vector<std::vector<double>> v29 = v1;
    v29[3] = v0;
    std::vector<std::vector<double>> v18 = v29;
    double v25 = v26;
    std::vector<std::vector<double>> v23 = v1;
    const double v27 = v4[1];
    double v59 = v15;
    double v22 = v25;
    v4[0] = v22;
    const std::vector<double> v42 = v23[2];
    const double v54 = v42[1];
    const std::vector<double> v56 = v18[0];
    const double v45 = v14 / v26;
    v6[0] = v59;
    std::vector<double> v50 = v56;
    std::vector<double> v177 = v4;
    std::vector<double> v53 = v177;
    const double v88 = v14 * v27;
    v177[0] = v88;
    v50[1] = v54;
    v53[1] = v45;
    v18[2] = v53;
    return v50;
  }
  s0 f24(const s0 &v0) {
    s0 v1 = v0;
    s0 v7 = v1;
    s0 v4 = v1;
    s0 v6 = v0;
    s0 v2 = v7;
    s0 v3 = v0;
    const double v9 = v3.p2;
    double v10 = v9;
    const std::vector<std::vector<double>> v18 = v2.p5;
    const std::vector<std::vector<double>> v14 = v4.p3;
    v4.p3 = v14;
    const std::vector<double> v21 = v6.p1;
    const double v15 = v21[1];
    std::vector<std::vector<double>> v24 = v14;
    v6.p4 = v18;
    const std::vector<std::vector<double>> v17 = v6.p0;
    const std::vector<std::vector<double>> v16 = v7.p5;
    std::vector<double> v13 = v21;
    std::vector<std::vector<double>> v33 = v17;
    const std::vector<double> v27 = v17[0];
    v7.p3 = v24;
    const std::vector<std::vector<double>> v25 = v6.p4;
    const std::vector<std::vector<double>> v19 = v1.p0;
    std::vector<std::vector<double>> v26 = v24;
    v24[0] = v27;
    v3.p0 = v19;
    s0 v30 = v6;
    v7.p4 = v16;
    v13 = v21;
    const std::vector<double> v35 = f87(v13);
    std::vector<std::vector<double>> v34 = v18;
    v4.p2 = v10;
    const std::vector<double> v23 = v25[2];
    const double v39 = v7.p2;
    const std::vector<double> v116 = f87(v35);
    v13[1] = v10;
    const double v32 = v23[0];
    std::vector<double> v22 = v21;
    v34 = v18;
    std::vector<std::vector<double>> v55 = v25;
    const s0 v72(v26, v116, v15, v26, v34, v18);
    const double v51 = v30.p2;
    v3.p3 = v19;
    const std::vector<double> v50 = v24[0];
    const std::vector<double> v20 = f87(v116);
    v30.p0 = v33;
    v55[1] = v50;
    const double v36 = v39 + v32;
    const std::vector<double> v37 = v55[0];
    v7.p4 = v25;
    const std::vector<std::vector<double>> v79 = v1.p0;
    v4.p3 = v33;
    v1.p5 = v55;
    v2.p0 = v24;
    v1.p0 = v17;
    const std::vector<double> v137 = f87(v20);
    v30.p4 = v16;
    v22[0] = v36;
    double v78 = v51;
    v6.p5 = v16;
    s0 v102 = v72;
    const double v198 = v20[1];
    v4.p1 = v22;
    v1.p3 = v79;
    v3.p2 = v198;
    v33[0] = v37;
    std::vector<double> v66 = v137;
    v102.p1 = v66;
    s0 v234 = v102;
    v13[0] = v78;
    return v234;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v3 = v0[2];
    const s0 v4 = f24(v3);
    const std::vector<double> v9 = v3.p1;
    s0 v7 = v4;
    v7.p2 = v1;
    const double v23 = v7.p2;
    std::vector<double> v12 = v9;
    const std::vector<std::vector<double>> v14 = v4.p5;
    const std::vector<double> v13 = f87(v12);
    v12[0] = v23;
    const double v16 = v13[1];
    v7.p4 = v14;
    v7.p2 = v16;
    return v16;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { 1.0, 2.0 }, 3.0, { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 }, { 10.0 } } }, { { { 11.0 } }, { 12.0, 13.0 }, 14.0, { { 15.0 } }, { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 }, { 21.0 } } }, { { { 22.0 } }, { 23.0, 24.0 }, 25.0, { { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 }, { 32.0 } } } });
    double v1(33.0);
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
