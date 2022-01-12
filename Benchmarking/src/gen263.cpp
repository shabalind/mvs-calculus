  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s2(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s2 p1;
    s3(s1 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s0>> p0;
    std::vector<s1> p1;
    s4(std::vector<std::vector<s0>> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s4 p0;
    s4 p1;
    s7(s4 v0, s4 v1): p0(v0), p1(v1) { }
  };
  s3 f89(const s3 &v0) {
    s3 v1 = v0;
    s3 v3 = v1;
    s3 v7 = v0;
    const s2 v2 = v7.p1;
    v7.p1 = v2;
    v1.p1 = v2;
    v1.p1 = v2;
    s3 v19 = v3;
    return v19;
  }
  s3 f88(const s3 &v0) {
    s3 v4 = v0;
    const s3 v5 = f89(v4);
    const s1 v1 = v4.p0;
    v4.p0 = v1;
    s3 v2 = v5;
    const s3 v8 = f89(v0);
    v2 = v8;
    v4 = v0;
    const s2 v3 = v8.p1;
    s3 v9 = v2;
    v9.p0 = v1;
    const std::vector<std::vector<s0>> v18 = v3.p1;
    v4.p1 = v3;
    s2 v21 = v3;
    const s3 v16 = f89(v9);
    const std::vector<std::vector<std::vector<s0>>> v45 { v18, v18, v18, v18, v18 };
    v2.p0 = v1;
    v4.p0 = v1;
    const std::vector<std::vector<s0>> v48 = v45[3];
    v9.p1 = v21;
    v21.p1 = v48;
    const s3 v156 = f89(v16);
    v9.p0 = v1;
    return v156;
  }
  s2 f87(const s2 &v0) {
    s2 v6 = v0;
    const std::vector<std::vector<s0>> v8 = v6.p1;
    s2 v7 = v0;
    v7.p1 = v8;
    const std::vector<s0> v2 = v0.p0;
    const std::vector<s0> v10 = v7.p0;
    const std::vector<s0> v1 = v7.p0;
    std::vector<std::vector<s0>> v14 = v8;
    v14[0] = v1;
    v14[0] = v2;
    v7.p1 = v8;
    const std::vector<s0> v11 = v14[0];
    v6.p0 = v1;
    v14[0] = v10;
    v14[0] = v10;
    std::vector<std::vector<s0>> v18 = v8;
    const std::vector<s0> v15 = v8[0];
    const s2 v20(v11, v8);
    const std::vector<s0> v23 = v0.p0;
    s2 v31 = v6;
    const std::vector<s0> v35 = v31.p0;
    v6.p1 = v8;
    v18[0] = v15;
    s2 v28 = v31;
    v18[0] = v23;
    v18[0] = v11;
    v28.p0 = v1;
    v6.p1 = v14;
    const std::vector<s2> v51 { v6, v28, v7, v7 };
    v6.p0 = v35;
    const std::vector<s0> v141 = v20.p0;
    std::vector<s2> v104 = v51;
    v7.p0 = v35;
    v14[0] = v1;
    std::vector<s0> v106 = v141;
    std::vector<s2> v163 = v104;
    v28.p1 = v18;
    v163[3] = v20;
    v6.p0 = v11;
    v28.p0 = v106;
    const s2 v365 = v163[0];
    return v365;
  }
  s2 f85(const s2 &v0) {
    const std::vector<std::vector<s0>> v7 = v0.p1;
    const std::vector<s0> v1 = v0.p0;
    const std::vector<s0> v3 = v0.p0;
    s2 v9 = v0;
    s2 v5 = v0;
    const s2 v6 = f87(v5);
    const s2 v4 = f87(v9);
    v9 = v6;
    const s2 v2 = f87(v9);
    const s2 v18 = f87(v2);
    v5.p0 = v1;
    const s0 v17 = v3[0];
    const s2 v15 = f87(v4);
    const s2 v38 = f87(v18);
    const std::vector<s0> v43 = v38.p0;
    v9.p1 = v7;
    s2 v25 = v38;
    const s1 v39(v7, v17);
    const s2 v50 = f87(v15);
    v25 = v50;
    const std::vector<std::vector<s0>> v124 = v39.p0;
    v5.p1 = v124;
    v25.p0 = v43;
    return v25;
  }
  double f84(const s4 &v0, const double &v1) {
    const std::vector<s1> v7 = v0.p1;
    const std::vector<s1> v9 = v0.p1;
    const s1 v5 = v9[0];
    const std::vector<s1> v6 = v0.p1;
    const std::vector<s1> v11 = v0.p1;
    const s0 v13 = v5.p1;
    s4 v30 = v0;
    const s7 v20(v0, v30);
    const s1 v27 = v11[0];
    v30.p1 = v7;
    v30.p1 = v7;
    v30.p1 = v6;
    v30.p1 = v11;
    s1 v23 = v27;
    s7 v19 = v20;
    const std::vector<std::vector<s0>> v18 = v30.p0;
    v30.p1 = v9;
    const std::vector<s0> v24 = v18[2];
    std::vector<std::vector<s0>> v42 = v18;
    v42 = v18;
    const s0 v33 = v24[0];
    v30.p0 = v42;
    std::vector<s1> v21 = v11;
    v19.p0 = v30;
    std::vector<s1> v41 = v11;
    const s0 v22 = v24[0];
    std::vector<s0> v29 = v24;
    s0 v48 = v13;
    std::vector<s1> v31 = v21;
    std::vector<s0> v65 = v24;
    const s4 v34 = v19.p0;
    v30.p1 = v31;
    const s0 v85 = v29[0];
    v41[0] = v23;
    v65[0] = v48;
    v23.p1 = v33;
    const std::vector<std::vector<s0>> v57 = v34.p0;
    v30.p1 = v7;
    v23.p1 = v22;
    const std::vector<double> v61 = v85.p0;
    v23.p1 = v85;
    const s4 v44 = v19.p1;
    v19.p1 = v44;
    std::vector<std::vector<s0>> v100 = v42;
    std::vector<s1> v81 = v31;
    v21[0] = v5;
    v23.p1 = v22;
    v23.p1 = v22;
    const s0 v86 = v65[0];
    v48.p0 = v61;
    const s1 v188 = v41[0];
    const std::vector<s0> v141 = v57[1];
    v42[0] = v29;
    v81[0] = v23;
    v30.p1 = v81;
    v29 = v141;
    v100[2] = v65;
    const std::vector<double> v121 = v86.p0;
    v41 = v31;
    const std::vector<s0> v110 = v100[0];
    v42[0] = v110;
    v31[0] = v188;
    const double v146 = v121[0];
    return v146;
  }
  s1 f83(const s1 &v0) {
    s1 v3 = v0;
    const s0 v4 = v0.p1;
    v3.p1 = v4;
    const std::vector<std::vector<s0>> v2 = v3.p0;
    s1 v9 = v3;
    const std::vector<s1> v1 { v3, v0, v3, v3, v9, v3 };
    std::vector<s1> v7 = v1;
    const std::vector<double> v8 = v4.p0;
    v7[2] = v3;
    const s0 v15 = v0.p1;
    v7[5] = v3;
    const s1 v5(v2, v15);
    const s1 v17 = v7[0];
    std::vector<std::vector<s0>> v20 = v2;
    const s1 v32(v2, v15);
    v9.p1 = v4;
    std::vector<std::vector<s0>> v18 = v20;
    s1 v12 = v0;
    const std::vector<std::vector<s1>> v25 { v7, v7, v1, v1 };
    const s0 v14 = v5.p1;
    const s0 v43 = v17.p1;
    const std::vector<std::vector<s0>> v29 = v12.p0;
    const std::vector<s1> v37 = v25[0];
    v12.p0 = v18;
    const s0 v35 = v0.p1;
    std::vector<std::vector<s0>> v54 = v20;
    const std::vector<std::vector<double>> v23 = v35.p1;
    std::vector<std::vector<double>> v22 = v23;
    const s0 v46 = v3.p1;
    const std::vector<s0> v112 = v29[0];
    const std::vector<double> v57 = v46.p0;
    v9.p1 = v43;
    const s1 v68 = v1[2];
    v12.p0 = v18;
    v12.p1 = v35;
    v7[0] = v17;
    v12.p0 = v29;
    v12.p1 = v4;
    v12.p0 = v18;
    const s1 v45 = v37[0];
    v12.p0 = v29;
    s0 v99 = v46;
    v99.p0 = v8;
    v3.p1 = v43;
    v9.p0 = v54;
    v7[1] = v3;
    const std::vector<std::vector<double>> v58 = v46.p2;
    v3.p0 = v2;
    const s0 v67 = v68.p1;
    v9.p1 = v67;
    v99.p2 = v58;
    v3.p1 = v14;
    const std::vector<std::vector<s0>> v87 = v17.p0;
    v54[0] = v112;
    v9.p1 = v99;
    v22[0] = v57;
    v12.p0 = v87;
    v99.p1 = v22;
    v12.p1 = v15;
    v7[2] = v32;
    const s2 v52(v112, v29);
    const s2 v166 = f85(v52);
    const s2 v132 = f85(v166);
    const s2 v148 = f85(v132);
    const s3 v216(v45, v148);
    const s3 v268 = f88(v216);
    const s3 v133 = f88(v268);
    const s3 v126 = f89(v133);
    const s1 v141 = v126.p0;
    return v141;
  }
  s7 f64(const s7 &v0, const s7 &v1, const s4 &v2) {
    s7 v33 = v0;
    s7 v25 = v33;
    s7 v23 = v1;
    const s4 v28 = v23.p0;
    const s4 v42 = v25.p1;
    v25.p1 = v42;
    v33.p0 = v28;
    return v25;
  }
  std::vector<std::vector<s0>> f44(const std::vector<std::vector<s0>> &v0) {
    const std::vector<s0> v3 = v0[0];
    const std::vector<s0> v10 = v0[1];
    const std::vector<std::vector<s0>> v23 { v3, v3, v10 };
    return v23;
  }
  std::vector<std::vector<s0>> f37(const std::vector<std::vector<s0>> &v0) {
    const std::vector<std::vector<s0>> v4 = f44(v0);
    const std::vector<std::vector<s0>> v2 = f44(v4);
    const std::vector<s0> v13 = v2[2];
    std::vector<std::vector<s0>> v30 = v2;
    v30[2] = v13;
    v30[1] = v13;
    std::vector<s0> v49 = v13;
    const std::vector<std::vector<s0>> v143 = f44(v30);
    const std::vector<std::vector<s0>> v136 = f44(v143);
    v30[0] = v49;
    v30[0] = v13;
    return v136;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const double &v1) {
    const s4 v5 = v0.p0;
    const s7 v6 = f64(v0, v0, v5);
    const s7 v3 = f64(v0, v0, v5);
    const s4 v7 = v6.p0;
    const double v2 = v1 - v1;
    s4 v4 = v7;
    const s4 v18 = v0.p1;
    const s7 v9 = f64(v3, v0, v4);
    const std::vector<std::vector<s0>> v13 = v5.p0;
    const std::vector<std::vector<s0>> v21 = f44(v13);
    double v10 = v1;
    const std::vector<std::vector<s0>> v27 = f37(v21);
    v4.p0 = v21;
    const std::vector<std::vector<s0>> v42 = v5.p0;
    const std::vector<std::vector<s0>> v26 = f44(v42);
    const std::vector<std::vector<s0>> v33 = f37(v21);
    const std::vector<double> v45 { v1, v10, v1 };
    std::vector<std::vector<s0>> v41 = v27;
    std::vector<std::vector<s0>> v65 = v26;
    const double v23 = f84(v18, v10);
    const double v37 = v45[1];
    const std::vector<s0> v87 = v41[2];
    const double v32 = v2 * v23;
    const s4 v83 = v9.p1;
    v4.p0 = v65;
    const s7 v55 = f64(v0, v9, v83);
    const std::vector<s1> v107 = v7.p1;
    std::vector<s1> v96 = v107;
    std::vector<s1> v92 = v96;
    const std::vector<std::vector<s0>> v163 = v5.p0;
    std::vector<s1> v143 = v92;
    v4.p0 = v163;
    v10 = v32;
    const s1 v91 = v107[0];
    v96[0] = v91;
    v4.p0 = v33;
    const s1 v90 = f83(v91);
    v92[0] = v90;
    v65[2] = v87;
    v4.p1 = v143;
    v4.p1 = v92;
    const s4 v226 = v55.p0;
    const double v446 = f84(v226, v37);
    return v446;
  }
  int main() {
    s7 v0({ { { { { { 0.0 }, { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { 6.0 }, { { 7.0 }, { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { 12.0 }, { { 13.0 }, { 14.0 }, { 15.0 } }, { { 16.0 }, { 17.0 } } } } }, { { { { { { 18.0 }, { { 19.0 }, { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } } }, { { 24.0 }, { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } } } }, { { { { { 30.0 }, { { 31.0 }, { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { 36.0 }, { { 37.0 }, { 38.0 }, { 39.0 } }, { { 40.0 }, { 41.0 } } } }, { { { 42.0 }, { { 43.0 }, { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } } } }, { { { { { { 48.0 }, { { 49.0 }, { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 } } } } }, { { 54.0 }, { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } } } } });
    double v1(60.0);
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
