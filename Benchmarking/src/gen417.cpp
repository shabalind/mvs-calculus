  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f29(const s0 &v0) {
    const std::vector<std::vector<double>> v2 = v0.p0;
    s0 v9 = v0;
    const std::vector<std::vector<double>> v7 = v0.p1;
    v9.p1 = v7;
    const std::vector<std::vector<double>> v3 = v9.p0;
    std::vector<std::vector<double>> v4 = v2;
    const std::vector<std::vector<double>> v5 = v0.p1;
    std::vector<std::vector<double>> v6 = v3;
    const s0 v8(v2, v5);
    v9.p0 = v3;
    const std::vector<double> v12 = v2[0];
    const std::vector<std::vector<double>> v11 = v0.p0;
    const std::vector<std::vector<double>> v22 = v8.p0;
    const std::vector<double> v13 = v11[0];
    std::vector<double> v15 = v13;
    const s0 v41(v2, v7);
    const std::vector<double> v30 = v5[0];
    v9.p0 = v4;
    v4[0] = v12;
    std::vector<std::vector<double>> v23 = v7;
    v6[1] = v15;
    std::vector<std::vector<double>> v32 = v7;
    const std::vector<std::vector<double>> v33 = v41.p0;
    const s0 v36(v2, v7);
    const std::vector<std::vector<double>> v42 = v0.p1;
    const std::vector<std::vector<double>> v51 = v41.p1;
    const std::vector<double> v58 = v32[1];
    s0 v50 = v9;
    v9.p1 = v5;
    v6[0] = v30;
    v9.p0 = v11;
    v23[1] = v12;
    const std::vector<std::vector<double>> v59 = v36.p1;
    v9.p0 = v6;
    v50.p0 = v6;
    const std::vector<double> v107 = v22[1];
    const s0 v70(v22, v32);
    v50.p0 = v3;
    v9.p1 = v59;
    v9.p1 = v42;
    const std::vector<std::vector<double>> v119 = v70.p1;
    v23[1] = v107;
    v9.p0 = v33;
    v50.p1 = v23;
    const std::vector<double> v71 = v119[0];
    v9.p0 = v33;
    v9.p1 = v7;
    v9.p1 = v51;
    v9.p0 = v33;
    v4[1] = v58;
    v23[2] = v71;
    v9.p1 = v59;
    return v50;
  }
  double f16(const double &v0) {
    double v3 = v0;
    double v1 = v0;
    double v4 = v1;
    double v2 = v3;
    const std::vector<double> v7 { v2, v0, v1, v3, v3 };
    const double v9 = v7[3];
    std::vector<double> v6 = v7;
    double v8 = v2;
    std::vector<double> v5 = v7;
    const double v15 = v5[4];
    const double v11 = v6[4];
    std::vector<double> v18 = v5;
    v6[1] = v9;
    std::vector<double> v16 = v18;
    const double v14 = v16[3];
    std::vector<double> v13 = v6;
    const double v20 = v7[1];
    const double v48 = v6[1];
    v6[4] = v20;
    const double v19 = v18[4];
    const double v28 = v18[0];
    const double v33 = v13[2];
    std::vector<double> v34 = v13;
    double v29 = v15;
    std::vector<double> v55 = v34;
    const std::vector<double> v38 { v0, v14, v11, v33, v4, v19, v14 };
    std::vector<double> v43 = v38;
    v6[1] = v8;
    const double v56 = v55[4];
    v34[4] = v48;
    v55[4] = v29;
    std::vector<double> v47 = v43;
    v47[2] = v56;
    v34[2] = v28;
    const double v91 = v47[6];
    v5[1] = v28;
    return v91;
  }
  s0 f6(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p1;
    const s0 v4 = f29(v0);
    const s0 v2 = f29(v4);
    const std::vector<std::vector<double>> v3 = v2.p1;
    const std::vector<std::vector<double>> v24 = v4.p1;
    s0 v21 = v4;
    const std::vector<std::vector<double>> v34 = v21.p0;
    const std::vector<std::vector<double>> v19 = v2.p0;
    const s0 v47(v19, v24);
    v21.p1 = v3;
    const std::vector<std::vector<double>> v46 = v47.p0;
    const s0 v26 = f29(v47);
    v21.p0 = v46;
    v21.p1 = v5;
    v21 = v26;
    s0 v40 = v0;
    const std::vector<std::vector<double>> v32 = v26.p1;
    v40.p1 = v5;
    s0 v61 = v40;
    v61.p1 = v32;
    v40.p0 = v34;
    return v61;
  }
  double f5(const double &v0) {
    const double v4 = f16(v0);
    const double v1 = f16(v0);
    const double v7 = f16(v1);
    const double v2 = f16(v0);
    const double v5 = f16(v0);
    double v9 = v1;
    const double v6 = f16(v9);
    const double v11 = v4 - v4;
    double v10 = v7;
    const double v8 = v1 + v0;
    const double v14 = v9 - v7;
    double v16 = v5;
    double v12 = v9;
    double v18 = v8;
    double v21 = v5;
    const double v23 = f16(v6);
    const double v24 = f16(v12);
    const double v40 = v10 * v21;
    const std::vector<double> v17 { v14, v9, v0 };
    v16 = v11;
    v18 = v2;
    const double v63 = f16(v18);
    const std::vector<double> v47 { v1, v63, v16, v40, v23 };
    std::vector<double> v46 = v47;
    const double v66 = v46[1];
    std::vector<double> v39 = v17;
    const double v80 = v39[2];
    v18 = v24;
    double v78 = v66;
    v16 = v80;
    return v78;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const std::vector<s0> v3 = v0[1];
    const s0 v7 = v3[0];
    const s0 v17 = f6(v7);
    const std::vector<std::vector<double>> v61 = v17.p1;
    const std::vector<double> v36 = v61[2];
    const double v43 = v36[0];
    const double v139 = f5(v43);
    return v139;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } } });
    double v1(15.0);
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
