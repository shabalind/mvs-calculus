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
  s1 f14(const s1 &v0, const s0 &v1) {
    s0 v2 = v1;
    const s0 v3 = v0.p0;
    const s0 v6 = v0.p0;
    s0 v7 = v3;
    s0 v5 = v6;
    const std::vector<std::vector<double>> v11 = v5.p2;
    v7.p0 = v11;
    const std::vector<double> v12 = v11[0];
    const s0 v13 = v0.p0;
    const s1 v19(v7, v6);
    std::vector<std::vector<double>> v16 = v11;
    const std::vector<std::vector<double>> v17 = v3.p1;
    const std::vector<std::vector<double>> v48 = v13.p2;
    v5 = v2;
    std::vector<std::vector<double>> v35 = v48;
    std::vector<std::vector<double>> v24 = v17;
    const std::vector<s1> v39 { v0 };
    v5.p2 = v16;
    const std::vector<std::vector<double>> v37 = v7.p0;
    const s1 v44 = v39[0];
    s1 v38 = v19;
    const std::vector<double> v29 = v24[2];
    v7.p2 = v11;
    std::vector<std::vector<double>> v81 = v17;
    v81[1] = v29;
    const s0 v23 = v38.p0;
    v35[0] = v29;
    const s0 v137 = v44.p1;
    const std::vector<std::vector<double>> v70 = v23.p1;
    v5.p1 = v70;
    v24[0] = v29;
    v81[2] = v12;
    v5.p0 = v48;
    const std::vector<double> v73 = v70[1];
    v2.p2 = v35;
    const std::vector<std::vector<double>> v64 = v7.p2;
    std::vector<std::vector<double>> v75 = v64;
    v2.p2 = v37;
    s0 v61 = v23;
    v7.p0 = v75;
    v7.p1 = v81;
    const std::vector<std::vector<double>> v136 = v137.p2;
    v75[0] = v73;
    const s0 v128 = v44.p1;
    const std::vector<double> v96 = v24[1];
    v75[0] = v96;
    v61.p2 = v136;
    const s1 v134(v128, v61);
    return v134;
  }
  s0 f13(const s1 &v0, const s0 &v1, const std::vector<s1> &v2, const s1 &v3) {
    const s0 v4 = v0.p0;
    const std::vector<std::vector<double>> v12 = v1.p1;
    s0 v5 = v1;
    v5 = v4;
    v5.p1 = v12;
    const s0 v9 = v0.p0;
    const s1 v18 = f14(v0, v5);
    const s1 v33 = f14(v18, v9);
    v5 = v1;
    const std::vector<std::vector<double>> v30 = v1.p0;
    const s0 v20 = v18.p0;
    const s1 v73 = f14(v33, v4);
    const s1 v85 = f14(v73, v20);
    const s1 v140 = f14(v85, v5);
    const s0 v108 = v140.p1;
    v5.p0 = v30;
    return v108;
  }
  s0 f6(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v8 = v0.p0;
    const std::vector<std::vector<double>> v6 = v1.p2;
    s0 v18 = v0;
    v18.p2 = v6;
    v18 = v1;
    s0 v11 = v18;
    const std::vector<std::vector<double>> v15 = v1.p1;
    std::vector<std::vector<double>> v45 = v15;
    std::vector<std::vector<double>> v19 = v8;
    const s1 v25(v11, v1);
    const std::vector<std::vector<double>> v29 = v1.p0;
    v18.p1 = v45;
    s0 v30 = v11;
    s0 v36 = v18;
    v36.p0 = v19;
    const s1 v41 = f14(v25, v30);
    const std::vector<double> v24 = v15[1];
    v19[0] = v24;
    const s1 v33 = f14(v41, v18);
    v11 = v18;
    std::vector<std::vector<double>> v86 = v19;
    const s1 v47 = f14(v33, v36);
    v18.p2 = v86;
    v18.p2 = v29;
    std::vector<std::vector<double>> v58 = v15;
    v45 = v58;
    v11.p2 = v29;
    v11.p2 = v6;
    const s0 v66 = v47.p1;
    v19 = v8;
    return v66;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const s1 &v1, const double &v2) {
    const std::vector<s1> v4 = v0[1];
    const std::vector<s1> v6 = v0[0];
    const s0 v14 = v1.p0;
    const s1 v12 = v6[0];
    const s1 v24 = f14(v12, v14);
    s1 v28 = v24;
    const s1 v13 = f14(v28, v14);
    const s0 v19 = f6(v14, v14);
    const s1 v23 = f14(v12, v19);
    const s0 v41 = v28.p1;
    const s0 v11 = v23.p0;
    v28.p1 = v11;
    v28.p0 = v14;
    const std::vector<std::vector<double>> v63 = v41.p2;
    const s0 v54 = f13(v13, v11, v4, v13);
    v28.p1 = v14;
    v28.p1 = v54;
    const std::vector<double> v170 = v63[0];
    const double v128 = v170[0];
    return v128;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 } } }, { { { 5.0 } }, { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 } } } } }, { { { { { 10.0 } }, { { 11.0 }, { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } } } });
    s1 v1({ { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } }, { { 24.0 } } }, { { { 25.0 } }, { { 26.0 }, { 27.0 }, { 28.0 } }, { { 29.0 } } } });
    double v2(30.0);
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
