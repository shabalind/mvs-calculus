  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s2(s1 v0): p0(v0) { }
  };
  struct s3 {
    s1 p0;
    s0 p1;
    s3(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f90(const s0 &v0) {
    s0 v6 = v0;
    s0 v1 = v0;
    const std::vector<std::vector<double>> v4 = v6.p0;
    const std::vector<std::vector<double>> v2 = v1.p0;
    std::vector<std::vector<double>> v3 = v2;
    v1.p0 = v3;
    v6.p0 = v4;
    const std::vector<std::vector<double>> v11 = v0.p0;
    v1.p0 = v2;
    v6.p0 = v2;
    const std::vector<std::vector<double>> v39 = v6.p0;
    v1 = v6;
    const std::vector<std::vector<double>> v29 = v1.p0;
    v1.p0 = v11;
    const std::vector<std::vector<double>> v35 = v6.p0;
    s0 v43 = v1;
    s0 v30 = v43;
    const std::vector<s0> v47 { v30, v30, v43, v6, v0, v43, v43 };
    const s0 v66 = v47[2];
    const s0 v61 = v47[0];
    v6.p0 = v4;
    std::vector<s0> v46 = v47;
    std::vector<s0> v70 = v46;
    const std::vector<std::vector<double>> v60 = v66.p0;
    v6.p0 = v29;
    const s0 v63 = v70[4];
    v6 = v30;
    s0 v52 = v43;
    const std::vector<std::vector<double>> v62 = v52.p0;
    v30.p0 = v4;
    const std::vector<std::vector<double>> v201 = v1.p0;
    v30.p0 = v62;
    const std::vector<std::vector<double>> v128 = v63.p0;
    v52.p0 = v39;
    s0 v99 = v61;
    v99.p0 = v60;
    v6.p0 = v201;
    v43.p0 = v35;
    v1.p0 = v128;
    return v99;
  }
  std::vector<s0> f53(const std::vector<s0> &v0) {
    const std::vector<std::vector<s0>> v5 { v0, v0, v0, v0, v0, v0 };
    const std::vector<std::vector<std::vector<s0>>> v3 { v5 };
    const s0 v7 = v0[0];
    const s0 v2 = v0[1];
    const s0 v9 = f90(v7);
    const s0 v8 = v0[1];
    std::vector<s0> v6 = v0;
    v6[1] = v9;
    std::vector<s0> v17 = v0;
    const std::vector<std::vector<s0>> v10 = v3[0];
    const std::vector<s0> v20 = v10[2];
    v6[0] = v8;
    std::vector<s0> v24 = v20;
    v24[1] = v2;
    std::vector<s0> v32 = v20;
    const s0 v33 = v6[1];
    const std::vector<std::vector<s0>> v40 { v24, v0, v32, v20 };
    const s0 v79 = v17[1];
    std::vector<std::vector<s0>> v51 = v40;
    const std::vector<s0> v41 = v51[3];
    v32[0] = v33;
    v24[1] = v79;
    return v41;
  }
  s0 f49(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    const s0 v8 = f90(v0);
    const s0 v18 = f90(v0);
    const s0 v12 = f90(v8);
    const s0 v67 = f90(v18);
    s0 v45 = v12;
    const s0 v81 = f90(v45);
    v45.p0 = v6;
    const std::vector<std::vector<double>> v87 = v81.p0;
    v45.p0 = v87;
    v45 = v67;
    return v45;
  }
  s0 f18(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<std::vector<double>> v1 = v5.p0;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<std::vector<double>> v6 = v0.p0;
    v5.p0 = v1;
    const s0 v12 = f49(v0);
    const std::vector<double> v7 = v6[0];
    const std::vector<double> v9 = v1[0];
    const s0 v13 = f90(v0);
    std::vector<std::vector<double>> v11 = v6;
    const std::vector<std::vector<double>> v8 = v13.p0;
    v5 = v12;
    const std::vector<std::vector<double>> v15 = v13.p0;
    const std::vector<std::vector<double>> v10 = v13.p0;
    v5.p0 = v4;
    v5.p0 = v11;
    const std::vector<std::vector<double>> v23 = v13.p0;
    const s0 v30(v15);
    v11[0] = v9;
    const std::vector<double> v29 = v6[0];
    std::vector<std::vector<double>> v24 = v8;
    std::vector<std::vector<double>> v39 = v8;
    const std::vector<double> v16 = v1[0];
    const std::vector<std::vector<std::vector<double>>> v38 { v24, v8, v11, v4, v11, v10 };
    v24[0] = v9;
    const std::vector<std::vector<double>> v48 = v30.p0;
    const std::vector<std::vector<double>> v27 = v5.p0;
    const std::vector<double> v73 = v11[0];
    v24[0] = v29;
    v11[0] = v73;
    v5.p0 = v39;
    std::vector<std::vector<std::vector<double>>> v41 = v38;
    std::vector<std::vector<double>> v43 = v23;
    std::vector<std::vector<double>> v63 = v43;
    const std::vector<std::vector<double>> v53 { v16, v29, v9, v73, v73, v7 };
    v41 = v38;
    std::vector<std::vector<double>> v67 = v53;
    const std::vector<double> v70 = v67[5];
    std::vector<std::vector<double>> v113 = v27;
    const std::vector<double> v110 = v63[0];
    v113[0] = v29;
    const s0 v85 = f90(v0);
    v24[0] = v110;
    std::vector<std::vector<double>> v111 = v67;
    v43[0] = v73;
    v43[0] = v7;
    v41[5] = v113;
    const std::vector<std::vector<double>> v211 = v41[4];
    std::vector<double> v112 = v16;
    const std::vector<std::vector<double>> v248 = v85.p0;
    v111[3] = v70;
    v41[3] = v48;
    v43[0] = v7;
    const s0 v88(v211);
    v111 = v53;
    const std::vector<double> v170 = v111[2];
    v111[2] = v112;
    v24 = v248;
    v11[0] = v170;
    return v88;
  }
  std::vector<s0> f5(const std::vector<s0> &v0) {
    const std::vector<s0> v3 = f53(v0);
    const std::vector<s0> v4 = f53(v0);
    const s0 v5 = v3[0];
    std::vector<s0> v15 = v0;
    std::vector<s0> v20 = v15;
    const s0 v18 = f18(v5);
    std::vector<s0> v13 = v20;
    const s0 v42 = f18(v18);
    const std::vector<std::vector<s0>> v35 { v0, v3, v20, v13, v0 };
    const std::vector<s0> v29 = v35[3];
    const s0 v51 = f49(v18);
    const s0 v44 = v4[1];
    v20[0] = v44;
    v13[1] = v42;
    v15[0] = v51;
    return v29;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s2 &v1, const double &v2) {
    double v3 = v2;
    const double v6 = v3 / v3;
    std::vector<s0> v5 = v0;
    double v4 = v6;
    const s0 v9 = v5[1];
    const std::vector<s0> v10 = f5(v0);
    const s1 v7 = v1.p0;
    v5[0] = v9;
    const s3 v12(v7, v9);
    const s0 v18 = v12.p1;
    v5[1] = v9;
    const std::vector<std::vector<double>> v16 = v18.p0;
    v3 = v4;
    const s0 v69 = v10[0];
    const s0 v61 = f90(v69);
    const std::vector<double> v46 = v16[0];
    v5[1] = v18;
    const std::vector<double> v43 = v16[0];
    const double v45 = v46[0];
    std::vector<double> v59 = v43;
    const double v37 = v59[0];
    v5[1] = v61;
    double v109 = v3;
    v109 = v37;
    v3 = v4;
    const double v152 = v3 + v45;
    const double v179 = v109 + v152;
    return v179;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } } }, { { { 1.0 } } } });
    s2 v1({ { { { { { 2.0 } } }, { { { 3.0 } } }, { { { 4.0 } } } }, { { { { { 5.0 } } } }, { { { { 6.0 } } } }, { { { { 7.0 } } } } } } });
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
