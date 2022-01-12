  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    double p1;
    s1(std::vector<std::vector<s0>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<std::vector<s1>> p1;
    s2(std::vector<s1> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    s1 p1;
    s4(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s2 p0;
    s4 p1;
    s7(s2 v0, s4 v1): p0(v0), p1(v1) { }
  };
  s4 f118(const s4 &v0) {
    s4 v3 = v0;
    const s1 v1 = v3.p0;
    const double v2 = v1.p1;
    s4 v7 = v0;
    const std::vector<std::vector<s0>> v6 = v1.p0;
    v7.p1 = v1;
    v3 = v0;
    s4 v12 = v7;
    const s1 v11(v6, v2);
    const s1 v10 = v0.p1;
    const s1 v14 = v12.p1;
    v7.p0 = v11;
    v3.p1 = v10;
    v3.p0 = v14;
    v7.p0 = v1;
    return v12;
  }
  std::vector<s1> f114(const s7 &v0, const std::vector<s1> &v1) {
    const s4 v8 = v0.p1;
    s7 v3 = v0;
    std::vector<s1> v7 = v1;
    s7 v2 = v3;
    const s1 v6 = v7[1];
    s1 v13 = v6;
    s7 v11 = v3;
    const s2 v12 = v3.p0;
    const std::vector<std::vector<s1>> v15 = v12.p1;
    v11 = v2;
    v11.p1 = v8;
    const s4 v26 = f118(v8);
    v11.p0 = v12;
    const s1 v10 = v1[1];
    const s1 v18 = v1[1];
    v2.p0 = v12;
    const s4 v32 = v2.p1;
    const std::vector<s1> v19 = v15[0];
    const s4 v28 = v11.p1;
    const s4 v24 = f118(v28);
    s4 v25 = v26;
    v3.p1 = v25;
    const s1 v57 = v19[0];
    const std::vector<std::vector<s0>> v14 = v57.p0;
    v7[1] = v18;
    const s1 v66 = v24.p1;
    v2.p0 = v12;
    v2 = v0;
    s2 v48 = v12;
    v7[2] = v13;
    v11.p0 = v48;
    const s1 v78 = v32.p0;
    const s2 v94 = v11.p0;
    v48.p0 = v7;
    v13.p0 = v14;
    v7[2] = v10;
    v25.p1 = v78;
    v25.p0 = v6;
    const std::vector<s1> v147 = v94.p0;
    v13 = v66;
    return v147;
  }
  s1 f102(const s1 &v0) {
    const double v2 = v0.p1;
    const std::vector<std::vector<s0>> v1 = v0.p0;
    const std::vector<std::vector<s0>> v3 = v0.p0;
    const std::vector<s0> v5 = v3[0];
    const std::vector<s0> v6 = v1[0];
    std::vector<std::vector<s0>> v4 = v1;
    const double v10 = v0.p1;
    v4 = v1;
    const std::vector<std::vector<s0>> v9 = v0.p0;
    v4[0] = v6;
    const double v11 = v0.p1;
    const s0 v17 = v6[0];
    const std::vector<std::vector<s0>> v12 = v0.p0;
    const std::vector<s0> v13 = v3[0];
    const s1 v19(v12, v10);
    const double v36 = v19.p1;
    std::vector<s0> v28 = v5;
    v4[0] = v5;
    std::vector<s0> v47 = v13;
    const s1 v27(v9, v11);
    s1 v46 = v0;
    v4[0] = v28;
    const std::vector<s1> v70 { v0, v46, v27, v46 };
    v46.p1 = v2;
    const double v52 = v19.p1;
    v46.p1 = v36;
    std::vector<s0> v34 = v47;
    v46.p0 = v12;
    v34[0] = v17;
    const s0 v74 = v34[0];
    const std::vector<std::vector<double>> v78 = v17.p1;
    const std::vector<std::vector<double>> v87 = v74.p1;
    const s1 v159 = v70[3];
    v4 = v9;
    s0 v71 = v17;
    v46.p0 = v4;
    const std::vector<double> v84 = v87[0];
    v46.p1 = v52;
    std::vector<std::vector<double>> v51 = v78;
    v51[0] = v84;
    v4[0] = v5;
    v34 = v6;
    v71.p1 = v51;
    v47 = v13;
    v28[0] = v71;
    return v159;
  }
  s2 f94(const s2 &v0, const s4 &v1) {
    s2 v6 = v0;
    const std::vector<std::vector<s1>> v11 = v6.p1;
    const std::vector<s1> v10 = v0.p0;
    v6.p1 = v11;
    v6.p0 = v10;
    return v6;
  }
  s4 f92(const s4 &v0) {
    const s1 v1 = v0.p0;
    const s1 v6 = f102(v1);
    const s4 v2 = f118(v0);
    s1 v8 = v1;
    const double v17 = v1.p1;
    const s4 v15 = f118(v2);
    const std::vector<std::vector<s0>> v27 = v6.p0;
    const s4 v43 = f118(v15);
    const s1 v31 = v43.p1;
    v8.p0 = v27;
    v8.p1 = v17;
    v8.p1 = v17;
    const s4 v105(v8, v31);
    return v105;
  }
  s1 f50(const s1 &v0) {
    const double v2 = v0.p1;
    double v12 = v2;
    s1 v5 = v0;
    const double v9 = v2 + v2;
    v5.p1 = v12;
    v5.p1 = v2;
    v5.p1 = v9;
    return v5;
  }
  s2 f35(const s2 &v0) {
    const std::vector<s1> v6 = v0.p0;
    const s1 v7 = v6[0];
    s2 v4 = v0;
    const s1 v3 = v6[1];
    v4.p0 = v6;
    const std::vector<std::vector<s1>> v5 { v6, v6, v6, v6, v6 };
    v4.p0 = v6;
    const s1 v2 = v6[0];
    v4.p0 = v6;
    const s1 v8 = f102(v7);
    std::vector<std::vector<s1>> v1 = v5;
    const s4 v10(v2, v2);
    const s4 v9 = f92(v10);
    s4 v13 = v9;
    v13.p0 = v3;
    std::vector<std::vector<s1>> v12 = v1;
    const s1 v21 = v6[1];
    s2 v20 = v0;
    const s1 v17 = f50(v8);
    v13.p0 = v17;
    const std::vector<s1> v18 = v4.p0;
    const std::vector<s1> v19 = v20.p0;
    const s2 v31 = f94(v20, v13);
    const s4 v28 = f118(v13);
    const std::vector<s1> v32 = v12[2];
    const std::vector<s1> v27 = v12[0];
    const s4 v46 = f118(v28);
    const std::vector<s1> v25 = v12[1];
    v4.p0 = v25;
    const std::vector<std::vector<s1>> v47 = v31.p1;
    const s7 v29(v31, v28);
    s2 v33 = v4;
    const std::vector<s1> v70 = f114(v29, v27);
    const s1 v58 = f50(v3);
    s1 v61 = v58;
    v1[0] = v18;
    const s1 v52 = v6[1];
    v12[0] = v18;
    v20.p0 = v19;
    v1[3] = v27;
    s2 v67 = v33;
    v13.p0 = v61;
    const std::vector<s1> v81 = v67.p0;
    v13.p1 = v21;
    v12[2] = v27;
    const std::vector<s1> v179 = v31.p0;
    v20.p0 = v179;
    v1[0] = v32;
    v4.p1 = v47;
    v67.p1 = v47;
    const s2 v126 = f94(v31, v46);
    v12[3] = v81;
    v20.p0 = v70;
    v13.p0 = v52;
    return v126;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const std::vector<s1> v4 = v0.p0;
    const s1 v3 = v4[2];
    const s1 v10 = f50(v3);
    const s2 v6 = f35(v0);
    const std::vector<double> v30 { v1, v1, v1 };
    const s2 v14 = f35(v6);
    s1 v31 = v10;
    s2 v28 = v14;
    const double v51 = v30[1];
    const double v49 = v31.p1;
    double v48 = v49;
    const std::vector<std::vector<s1>> v82 = v28.p1;
    const std::vector<s1> v180 = v82[1];
    const double v131 = v51 - v48;
    const s1 v116 = v180[0];
    const std::vector<std::vector<s0>> v70 = v116.p0;
    v31.p0 = v70;
    return v131;
  }
  int main() {
    s2 v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } } }, 3.0 }, { { { { { { 4.0 }, { 5.0 } }, { { 6.0 } } } } }, 7.0 }, { { { { { { 8.0 }, { 9.0 } }, { { 10.0 } } } } }, 11.0 } }, { { { { { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } }, 15.0 } }, { { { { { { { 16.0 }, { 17.0 } }, { { 18.0 } } } } }, 19.0 } } } });
    double v1(20.0);
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
