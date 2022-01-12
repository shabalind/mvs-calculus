  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s1> p0;
    std::vector<std::vector<s0>> p1;
    s5(std::vector<s1> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s1 p0;
    s9(s1 v0): p0(v0) { }
  };
  struct s11 {
    s9 p0;
    s9 p1;
    s11(s9 v0, s9 v1): p0(v0), p1(v1) { }
  };
  double f86(const s9 &v0, const double &v1) {
    s9 v5 = v0;
    const s1 v3 = v5.p0;
    s9 v9 = v5;
    const s0 v8 = v3.p1;
    s9 v14 = v0;
    s0 v7 = v8;
    s0 v4 = v7;
    s1 v12 = v3;
    const std::vector<s0> v11 = v3.p0;
    v5.p0 = v12;
    s9 v18 = v9;
    const s11 v40(v9, v14);
    v5 = v9;
    const std::vector<std::vector<double>> v27 = v7.p1;
    const std::vector<std::vector<double>> v15 = v7.p0;
    v12.p0 = v11;
    v7.p0 = v15;
    double v16 = v1;
    v4.p0 = v15;
    v7.p0 = v15;
    const s1 v25 = v18.p0;
    const std::vector<double> v48 = v15[0];
    v9.p0 = v3;
    v4.p1 = v27;
    v4.p0 = v15;
    v7.p0 = v15;
    v14.p0 = v3;
    const std::vector<std::vector<double>> v110 = v4.p0;
    v7.p0 = v110;
    const double v49 = v48[0];
    v9.p0 = v25;
    const s9 v56 = v40.p1;
    v9.p0 = v12;
    v12.p1 = v7;
    v18 = v56;
    v9.p0 = v12;
    const double v60 = v16 - v49;
    return v60;
  }
  s9 f74(const s9 &v0) {
    s9 v7 = v0;
    s9 v2 = v7;
    s9 v5 = v2;
    s9 v136 = v5;
    return v136;
  }
  s5 f73(const s5 &v0) {
    s5 v8 = v0;
    s5 v7 = v0;
    const std::vector<std::vector<s0>> v3 = v0.p1;
    v8.p1 = v3;
    v8.p1 = v3;
    const std::vector<std::vector<s0>> v1 = v0.p1;
    const std::vector<s1> v5 = v8.p0;
    std::vector<std::vector<s0>> v13 = v1;
    std::vector<s1> v2 = v5;
    const std::vector<s1> v4 = v0.p0;
    s5 v11 = v7;
    v7.p1 = v13;
    v11.p1 = v1;
    const std::vector<std::vector<s0>> v12 = v7.p1;
    std::vector<std::vector<s0>> v9 = v12;
    s5 v14 = v11;
    const std::vector<s1> v10 = v8.p0;
    std::vector<s1> v17 = v2;
    const s1 v49 = v4[1];
    const std::vector<s0> v23 = v1[1];
    v2[0] = v49;
    const s0 v18 = v23[0];
    s0 v33 = v18;
    s5 v25 = v8;
    const std::vector<s0> v21 = v3[2];
    std::vector<s0> v22 = v23;
    const std::vector<s0> v30 = v3[1];
    v14.p1 = v3;
    v14.p0 = v17;
    std::vector<s1> v20 = v4;
    v22[0] = v33;
    v2[2] = v49;
    v2 = v20;
    const std::vector<s0> v59 = v1[2];
    v2[2] = v49;
    v11 = v0;
    const s1 v52 = v5[0];
    v14.p1 = v13;
    const s0 v28 = v23[0];
    const std::vector<std::vector<double>> v53 = v33.p0;
    const std::vector<std::vector<double>> v103 = v28.p1;
    v13[1] = v30;
    std::vector<std::vector<double>> v73 = v53;
    v7 = v14;
    const s1 v87 = v2[1];
    const s0 v50 = v21[0];
    std::vector<std::vector<s0>> v38 = v12;
    v20[2] = v87;
    v38[0] = v30;
    v25.p1 = v9;
    std::vector<s1> v47 = v2;
    const s1 v84 = v4[0];
    v47[1] = v87;
    v2[0] = v87;
    const s1 v65 = v47[1];
    const std::vector<std::vector<s0>> v85 = v7.p1;
    s1 v97 = v52;
    v97.p1 = v50;
    v20[1] = v65;
    v33.p1 = v103;
    v11.p1 = v85;
    v9[2] = v22;
    const std::vector<std::vector<s0>> v113 = v11.p1;
    s1 v115 = v97;
    v33.p0 = v73;
    v11.p1 = v38;
    v38[2] = v59;
    v2[2] = v115;
    v38[1] = v21;
    v8.p1 = v113;
    v2[0] = v84;
    v7.p0 = v17;
    v14.p0 = v10;
    v11.p0 = v20;
    v25.p1 = v9;
    return v25;
  }
  s0 f69(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v8 = v0.p1;
    const std::vector<std::vector<std::vector<double>>> v5 { v8, v8, v8, v8, v8, v8, v8 };
    s0 v9 = v0;
    const std::vector<std::vector<double>> v2 = v9.p0;
    v9.p0 = v2;
    v9.p0 = v2;
    v9.p0 = v2;
    const std::vector<std::vector<double>> v20 = v0.p1;
    v9.p1 = v20;
    const std::vector<std::vector<double>> v38 = v0.p0;
    const std::vector<std::vector<double>> v28 = v9.p0;
    s0 v70 = v9;
    const std::vector<std::vector<double>> v36 = v5[6];
    v9.p0 = v2;
    v70.p0 = v2;
    v9.p1 = v20;
    v9.p1 = v8;
    v9.p0 = v38;
    v70.p0 = v38;
    s0 v121 = v70;
    const std::vector<s0> v78 { v121, v9, v0, v70 };
    const std::vector<std::vector<double>> v52 = v9.p1;
    const std::vector<std::vector<double>> v46 = v9.p0;
    v70 = v0;
    v9.p1 = v52;
    v121.p0 = v46;
    v70.p0 = v28;
    v70.p1 = v36;
    const s0 v119 = v78[2];
    return v119;
  }
  s1 f60(const s1 &v0) {
    s1 v7 = v0;
    s1 v2 = v0;
    s1 v3 = v2;
    s1 v5 = v7;
    const std::vector<s0> v10 = v0.p0;
    const s9 v9(v0);
    const s0 v14 = v10[0];
    const s0 v12 = f69(v14, v14);
    std::vector<s0> v8 = v10;
    v8[0] = v12;
    s9 v40 = v9;
    s0 v21 = v12;
    const std::vector<s9> v30 { v9, v40 };
    v8[0] = v21;
    const s9 v36 = v30[0];
    const s9 v31 = f74(v40);
    const s1 v43 = v31.p0;
    const s9 v32 = v30[1];
    const s11 v55(v36, v32);
    s9 v54 = v31;
    v54.p0 = v5;
    const s1 v64 = v54.p0;
    v40.p0 = v43;
    s11 v103 = v55;
    v103.p0 = v40;
    v5.p0 = v10;
    const s9 v81 = v103.p1;
    v7.p0 = v8;
    v40.p0 = v3;
    const s1 v169 = v81.p0;
    const s1 v131 = v54.p0;
    v40.p0 = v64;
    v40.p0 = v131;
    return v169;
  }
  s11 f47(const s11 &v0) {
    const s9 v2 = v0.p1;
    const s9 v7 = f74(v2);
    const s11 v5(v2, v2);
    const s9 v3 = v5.p0;
    s9 v12 = v3;
    const s9 v4 = f74(v7);
    s9 v13 = v12;
    s11 v9 = v0;
    v9.p0 = v7;
    v9.p0 = v3;
    const s9 v18 = f74(v13);
    const s1 v20 = v18.p0;
    const s9 v36 = f74(v13);
    v9.p1 = v4;
    v9.p1 = v36;
    v9.p1 = v3;
    v13.p0 = v20;
    return v9;
  }
  s5 f16(const s5 &v0) {
    const s5 v7 = f73(v0);
    s5 v1 = v0;
    const std::vector<s1> v4 = v1.p0;
    v1.p0 = v4;
    const std::vector<std::vector<s0>> v2 = v0.p1;
    s5 v11 = v7;
    v11.p0 = v4;
    v1.p1 = v2;
    const std::vector<s1> v5 = v0.p0;
    s5 v14 = v11;
    v14.p0 = v5;
    v11 = v0;
    v14.p1 = v2;
    return v14;
  }
  s5 f11(const s5 &v0) {
    s5 v6 = v0;
    const std::vector<std::vector<s0>> v4 = v0.p1;
    std::vector<std::vector<s0>> v3 = v4;
    const std::vector<s0> v2 = v4[2];
    v6.p1 = v4;
    const std::vector<s0> v13 = v3[1];
    v3[2] = v13;
    const std::vector<std::vector<s0>> v7 = v0.p1;
    v3 = v7;
    s5 v9 = v6;
    const std::vector<s1> v10 = v0.p0;
    v6.p1 = v4;
    v9.p0 = v10;
    const std::vector<s0> v26 = v4[1];
    v3[2] = v26;
    v3[2] = v13;
    v9.p1 = v3;
    v3[1] = v2;
    return v9;
  }
  s11 f5(const s11 &v0) {
    const s11 v3 = f47(v0);
    const s9 v6 = v3.p0;
    s9 v1 = v6;
    const s9 v2 = v3.p1;
    const s9 v5 = v0.p0;
    const s9 v9 = f74(v2);
    const s9 v4 = f74(v9);
    const s9 v21 = f74(v1);
    const s1 v52 = v5.p0;
    const s1 v33 = f60(v52);
    const s1 v63 = v4.p0;
    s9 v27 = v21;
    const std::vector<s9> v70 { v2, v1, v27 };
    const s9 v43 = v70[1];
    v27.p0 = v33;
    const s1 v55 = f60(v63);
    v27.p0 = v33;
    const s9 v179 = v70[2];
    v1.p0 = v55;
    const s11 v86(v43, v179);
    return v86;
  }
  __attribute__((noinline))
  double f0(const s5 &v0, const s0 &v1, const double &v2) {
    const s5 v6 = f11(v0);
    const s5 v7 = f16(v6);
    const std::vector<s1> v8 = v7.p0;
    const s0 v4 = f69(v1, v1);
    const s0 v11 = f69(v1, v4);
    const std::vector<std::vector<double>> v12 = v11.p0;
    const s1 v14 = v8[1];
    const s1 v39 = f60(v14);
    const s9 v47(v39);
    const s1 v57 = v47.p0;
    const s9 v71 = f74(v47);
    const std::vector<double> v49 = v12[0];
    s9 v107 = v71;
    const double v175 = v49[0];
    const s11 v116(v107, v47);
    const s11 v172 = f5(v116);
    const s9 v292 = v172.p0;
    const double v65 = f86(v292, v175);
    v107.p0 = v57;
    return v65;
  }
  int main() {
    s5 v0({ { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } }, { { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } } }, { { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } } });
    s0 v1({ { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } });
    double v2(52.0);
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
