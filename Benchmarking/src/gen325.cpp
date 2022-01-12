  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f18(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p1;
    const std::vector<std::vector<double>> v5 = v0.p0;
    const std::vector<std::vector<double>> v15 = v0.p1;
    const std::vector<std::vector<double>> v18 = v0.p1;
    const std::vector<std::vector<double>> v23 = v0.p1;
    s0 v26 = v0;
    v26.p1 = v23;
    const std::vector<std::vector<double>> v29 = v0.p1;
    const std::vector<std::vector<double>> v36 = v0.p0;
    const std::vector<std::vector<double>> v49 = v0.p0;
    v26.p1 = v5;
    s0 v41 = v26;
    std::vector<std::vector<double>> v22 = v15;
    v41.p0 = v18;
    const std::vector<double> v40 = v7[0];
    v41.p0 = v23;
    const std::vector<std::vector<double>> v52 = v41.p1;
    s0 v38 = v0;
    v41.p1 = v36;
    v26.p1 = v22;
    const std::vector<std::vector<double>> v48 = v0.p0;
    const std::vector<s0> v63 { v38, v41, v26, v0, v38, v26, v41 };
    v26.p1 = v48;
    const std::vector<std::vector<double>> v119 = v41.p0;
    const s0 v66 = v63[1];
    v26.p0 = v119;
    std::vector<std::vector<double>> v126 = v52;
    v26.p0 = v29;
    v38.p0 = v5;
    v38.p0 = v126;
    v22[1] = v40;
    v41.p0 = v49;
    return v66;
  }
  s0 f14(const s0 &v0, const s0 &v1) {
    s0 v7 = v0;
    const s0 v2 = f18(v7);
    const s0 v13 = f18(v7);
    s0 v5 = v2;
    const std::vector<std::vector<double>> v6 = v1.p0;
    v5.p1 = v6;
    v5.p1 = v6;
    v5.p0 = v6;
    const std::vector<std::vector<double>> v36 = v13.p1;
    v5.p1 = v36;
    const s0 v40 = f18(v5);
    return v40;
  }
  s0 f5(const std::vector<s0> &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v5 = v1.p0;
    const std::vector<std::vector<std::vector<double>>> v8 { v5, v5, v5, v5 };
    const s0 v4 = v0[0];
    const s0 v7 = f18(v1);
    const std::vector<std::vector<double>> v2 = v4.p0;
    const std::vector<std::vector<double>> v3 = v8[3];
    const s0 v11 = f14(v1, v4);
    const s0 v10(v3, v2);
    std::vector<s0> v20 = v0;
    v20[1] = v1;
    const s0 v38 = v20[0];
    v20[1] = v7;
    const s0 v73 = f14(v10, v38);
    const s0 v92 = f18(v73);
    const s0 v45 = f14(v11, v92);
    return v45;
  }
  s0 f3(const s0 &v0) {
    const s0 v5 = f18(v0);
    const s0 v2 = f14(v0, v5);
    s0 v6 = v5;
    s0 v4 = v6;
    const std::vector<s0> v8 { v2, v5 };
    const s0 v10 = v8[0];
    s0 v12 = v10;
    const s0 v3 = v8[0];
    const std::vector<s0> v9 { v6, v6, v2, v3 };
    const s0 v7 = v8[0];
    s0 v13 = v10;
    std::vector<s0> v21 = v9;
    std::vector<s0> v14 = v8;
    std::vector<s0> v27 = v8;
    const std::vector<std::vector<double>> v22 = v0.p0;
    const s0 v11 = v27[0];
    const s0 v18 = f14(v6, v6);
    const s0 v20 = f5(v27, v11);
    const s0 v19 = f5(v14, v18);
    const std::vector<std::vector<double>> v17 = v4.p1;
    v27[1] = v12;
    const std::vector<std::vector<double>> v26 = v0.p0;
    const s0 v16 = f14(v4, v5);
    v27[1] = v16;
    const std::vector<std::vector<double>> v50 = v7.p0;
    const s0 v71 = v21[2];
    v14[1] = v16;
    const s0 v46 = f5(v14, v20);
    v27[1] = v5;
    v4.p1 = v26;
    const s0 v30 = f14(v12, v71);
    v21[3] = v4;
    const s0 v54 = f14(v10, v20);
    const s0 v58 = f18(v30);
    v14[0] = v2;
    const std::vector<std::vector<double>> v51 = v58.p1;
    v4.p0 = v22;
    v4.p0 = v50;
    v6.p1 = v51;
    const std::vector<std::vector<double>> v44 = v46.p1;
    v12.p1 = v51;
    v13.p0 = v17;
    const std::vector<std::vector<double>> v105 = v19.p0;
    v6 = v18;
    std::vector<std::vector<double>> v92 = v44;
    v12.p1 = v92;
    v21[3] = v13;
    const s0 v108 = f14(v54, v30);
    v6.p1 = v105;
    return v108;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const double &v2) {
    const s0 v5 = f14(v1, v0);
    const std::vector<std::vector<double>> v7 = v5.p0;
    const std::vector<std::vector<double>> v4 = v1.p0;
    const s0 v15 = f3(v5);
    s0 v12 = v1;
    const std::vector<std::vector<double>> v14 = v1.p0;
    const std::vector<std::vector<double>> v19 = v15.p1;
    const s0 v18 = f3(v12);
    const std::vector<std::vector<double>> v23 = v18.p0;
    const std::vector<double> v17 = v23[0];
    v12.p0 = v14;
    v12.p1 = v19;
    v12.p0 = v7;
    const double v91 = v17[0];
    v12.p0 = v4;
    return v91;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } });
    s0 v1({ { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } });
    double v2(8.0);
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
