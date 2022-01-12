  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    std::vector<s0> p2;
    s0 p3;
    s0 p4;
    s1(s0 v0, std::vector<std::vector<s0>> v1, std::vector<s0> v2, s0 v3, s0 v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s2(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s1 f43(const s1 &v0) {
    const std::vector<s0> v7 = v0.p2;
    const s0 v6 = v0.p3;
    std::vector<s0> v5 = v7;
    s1 v16 = v0;
    std::vector<s0> v13 = v7;
    const std::vector<std::vector<double>> v10 = v6.p0;
    const s0 v18 = v13[0];
    v13[0] = v18;
    v5[0] = v18;
    v16.p4 = v18;
    v16.p4 = v18;
    v5[0] = v6;
    s1 v17 = v16;
    v16.p4 = v6;
    const std::vector<std::vector<double>> v36 = v18.p0;
    std::vector<s0> v27 = v7;
    const std::vector<std::vector<s0>> v40 = v17.p1;
    const s0 v88 = v5[0];
    const s0 v57 = v7[0];
    const std::vector<std::vector<double>> v37 = v18.p0;
    v13[0] = v57;
    const s0 v44 = v17.p3;
    std::vector<std::vector<s0>> v38 = v40;
    v17.p2 = v13;
    const std::vector<s0> v54 = v38[0];
    v17.p4 = v44;
    v5[0] = v57;
    v13[0] = v44;
    std::vector<std::vector<s0>> v39 = v38;
    s0 v75 = v88;
    v16.p0 = v88;
    v39[1] = v54;
    s0 v31 = v44;
    v31.p0 = v10;
    v31.p0 = v37;
    v75.p0 = v36;
    const s0 v74 = v13[0];
    const std::vector<std::vector<double>> v66 = v6.p0;
    const s0 v131 = v5[0];
    v13[0] = v75;
    const s1 v71(v88, v39, v5, v31, v74);
    v31.p0 = v66;
    v13[0] = v131;
    v38[1] = v27;
    v17.p2 = v54;
    v17 = v16;
    return v71;
  }
  s1 f41(const s1 &v0) {
    const s0 v1 = v0.p4;
    const std::vector<s0> v2 = v0.p2;
    s1 v4 = v0;
    v4.p0 = v1;
    s0 v8 = v1;
    v4.p3 = v8;
    v4.p0 = v8;
    const s0 v11 = v2[0];
    v8 = v11;
    const s1 v17 = f43(v4);
    return v17;
  }
  s1 f35(const s1 &v0) {
    const s1 v6 = f43(v0);
    const s1 v1 = f41(v0);
    const s1 v8 = f41(v0);
    const s1 v7 = f41(v0);
    const s1 v9 = f41(v8);
    const s1 v15 = f43(v8);
    const s1 v26 = f43(v9);
    const s1 v31 = f43(v9);
    const s1 v19 = f41(v26);
    const s1 v96 = f41(v19);
    const std::vector<s1> v22 { v0, v96, v31, v6, v7, v15, v1 };
    const s1 v63 = v22[3];
    return v63;
  }
  s0 f31(const s0 &v0) {
    s0 v5 = v0;
    s0 v7 = v5;
    const std::vector<std::vector<double>> v4 = v7.p0;
    const std::vector<std::vector<double>> v2 = v5.p0;
    v7.p0 = v2;
    v5.p0 = v2;
    v5.p0 = v2;
    v7.p0 = v4;
    const std::vector<std::vector<double>> v14 = v5.p0;
    s0 v11 = v7;
    v5.p0 = v2;
    v11.p0 = v14;
    const std::vector<std::vector<double>> v22 = v11.p0;
    s0 v17 = v11;
    v7.p0 = v14;
    v17.p0 = v22;
    return v17;
  }
  std::vector<s0> f30(const std::vector<s0> &v0) {
    const s0 v4 = v0[0];
    const std::vector<std::vector<double>> v7 = v4.p0;
    const std::vector<std::vector<double>> v1 = v4.p0;
    const std::vector<std::vector<double>> v6 = v4.p0;
    const std::vector<std::vector<double>> v3 = v4.p0;
    const std::vector<std::vector<double>> v20 = v4.p0;
    const s0 v11 = f31(v4);
    const std::vector<std::vector<double>> v16 = v11.p0;
    s0 v22 = v11;
    v22 = v4;
    const s0 v18 = f31(v4);
    v22.p0 = v3;
    v22.p0 = v6;
    const s0 v25 = v0[0];
    v22.p0 = v1;
    v22.p0 = v16;
    const s0 v15 = f31(v25);
    const std::vector<std::vector<double>> v36 = v22.p0;
    v22.p0 = v20;
    const s0 v27 = v0[0];
    const std::vector<std::vector<double>> v39 = v22.p0;
    const std::vector<std::vector<double>> v35 = v25.p0;
    v22.p0 = v7;
    const s0 v50 = f31(v15);
    v22.p0 = v6;
    const s0 v38 = f31(v50);
    const std::vector<std::vector<double>> v47 = v38.p0;
    v22 = v18;
    v22.p0 = v47;
    const s0 v49 = f31(v27);
    const s0 v61 = f31(v49);
    v22.p0 = v1;
    s0 v135 = v61;
    std::vector<std::vector<double>> v183 = v36;
    v135.p0 = v39;
    v22.p0 = v183;
    std::vector<s0> v62 = v0;
    v135.p0 = v35;
    std::vector<s0> v283 = v62;
    v62[0] = v135;
    return v283;
  }
  s1 f26(const s1 &v0) {
    const s0 v5 = v0.p4;
    s1 v8 = v0;
    const std::vector<s0> v1 = v8.p2;
    const s0 v6 = f31(v5);
    s1 v4 = v0;
    const std::vector<s0> v2 = f30(v1);
    v4.p3 = v6;
    const s0 v7 = v1[0];
    v8.p0 = v5;
    const s1 v19 = f43(v0);
    const std::vector<s1> v45 { v19, v19, v8, v0, v0, v8, v8 };
    v4.p0 = v5;
    const s0 v30 = v2[0];
    v8.p4 = v30;
    std::vector<s1> v29 = v45;
    v8.p4 = v7;
    const s1 v17 = f41(v4);
    const s1 v42 = f41(v17);
    v4.p0 = v5;
    v29[2] = v42;
    v29 = v45;
    const s1 v68 = v29[0];
    const s1 v52 = f43(v68);
    return v52;
  }
  s0 f18(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v1 = v0.p0;
    v7.p0 = v1;
    const s0 v6 = f31(v0);
    v7 = v6;
    const std::vector<std::vector<double>> v17 = v6.p0;
    v7.p0 = v17;
    return v7;
  }
  s1 f8(const s1 &v0) {
    const s1 v6 = f26(v0);
    const s0 v3 = v6.p0;
    const s1 v8 = f35(v6);
    s1 v52 = v8;
    v52.p0 = v3;
    s1 v104 = v52;
    const s1 v124 = f35(v104);
    return v124;
  }
  s1 f7(const s1 &v0) {
    const std::vector<std::vector<s0>> v6 = v0.p1;
    const std::vector<s0> v7 = v6[0];
    const s0 v2 = v0.p0;
    const s0 v5 = f18(v2);
    const s1 v3(v5, v6, v7, v5, v5);
    const std::vector<s0> v11 = v0.p2;
    const s1 v25 = f35(v3);
    s1 v23 = v25;
    v23.p3 = v2;
    const s1 v41 = f26(v23);
    const s1 v50 = f8(v23);
    const s0 v74 = v7[0];
    v23.p2 = v11;
    v23.p0 = v74;
    const std::vector<s1> v52 { v41, v23, v50, v25 };
    const s1 v117 = v52[3];
    return v117;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const s1 &v1, const s1 &v2, const double &v3) {
    const s1 v9 = f7(v2);
    const s0 v12 = v9.p3;
    const std::vector<std::vector<double>> v5 = v12.p0;
    std::vector<std::vector<double>> v15 = v5;
    const std::vector<double> v23 = v15[1];
    v15[0] = v23;
    std::vector<double> v20 = v23;
    v15[0] = v20;
    const double v74 = v20[0];
    return v74;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { { { { 0.0 }, { 1.0 } } }, { { { 2.0 }, { 3.0 } } } }, { { { { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 } } } } } }, { { { { { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } } }, { { { 14.0 }, { 15.0 } } } } } } });
    s1 v1({ { { { 16.0 }, { 17.0 } } }, { { { { { 18.0 }, { 19.0 } } } }, { { { { 20.0 }, { 21.0 } } } } }, { { { { 22.0 }, { 23.0 } } } }, { { { 24.0 }, { 25.0 } } }, { { { 26.0 }, { 27.0 } } } });
    s1 v2({ { { { 28.0 }, { 29.0 } } }, { { { { { 30.0 }, { 31.0 } } } }, { { { { 32.0 }, { 33.0 } } } } }, { { { { 34.0 }, { 35.0 } } } }, { { { 36.0 }, { 37.0 } } }, { { { 38.0 }, { 39.0 } } } });
    double v3(40.0);
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
