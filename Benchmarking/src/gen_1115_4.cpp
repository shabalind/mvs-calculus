  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s1>> p0;
    std::vector<s1> p1;
    s1 p2;
    s1 p3;
    s0 p4;
    std::vector<s0> p5;
    s2(std::vector<std::vector<s1>> v0, std::vector<s1> v1, s1 v2, s1 v3, s0 v4, std::vector<s0> v5): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5) { }
  };
  struct s4 {
    s2 p0;
    std::vector<s0> p1;
    s4(s2 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f103(const s0 &v0) {
    return v0;
  }
  s2 f97(const s2 &v0) {
    s2 v2 = v0;
    const std::vector<s1> v4 = v0.p1;
    v2.p1 = v4;
    std::vector<s1> v8 = v4;
    s2 v3 = v2;
    const std::vector<std::vector<s1>> v7 = v2.p0;
    std::vector<s1> v9 = v4;
    const s1 v5 = v3.p3;
    v2.p0 = v7;
    const s1 v6 = v8[0];
    v2.p1 = v9;
    s2 v10 = v3;
    v9[0] = v6;
    std::vector<std::vector<s1>> v23 = v7;
    v3.p0 = v23;
    const s1 v20 = v8[0];
    std::vector<std::vector<s1>> v11 = v23;
    const s0 v14 = v5.p0;
    std::vector<std::vector<s1>> v25 = v11;
    const std::vector<s1> v26 = v23[0];
    v11[0] = v9;
    v3.p3 = v5;
    const s0 v28 = v10.p4;
    s0 v40 = v14;
    const s1 v16(v14, v40);
    v25[0] = v26;
    v9[0] = v6;
    const std::vector<s1> v32 = v25[0];
    const std::vector<s0> v27 = v3.p5;
    v9[0] = v5;
    const s2 v44(v25, v8, v5, v16, v28, v27);
    v9[0] = v20;
    v23[0] = v4;
    v23[0] = v32;
    return v44;
  }
  std::vector<s1> f89(const std::vector<s1> &v0) {
    std::vector<s1> v5 = v0;
    const std::vector<std::vector<s1>> v3 { v5, v5, v5, v5, v0, v0, v5 };
    std::vector<std::vector<s1>> v8 = v3;
    v8[0] = v5;
    std::vector<std::vector<s1>> v6 = v8;
    const std::vector<s1> v21 = v6[5];
    return v21;
  }
  s2 f81(const s2 &v0) {
    const s2 v2 = f97(v0);
    const s2 v3 = f97(v0);
    const s2 v10 = f97(v0);
    const s2 v17 = f97(v0);
    const std::vector<s2> v21 { v10, v10, v3, v2, v0, v2, v17 };
    std::vector<s2> v51 = v21;
    const s2 v53 = v51[5];
    const s2 v66 = f97(v53);
    return v66;
  }
  s2 f79(const s2 &v0, const s4 &v1) {
    s2 v2 = v0;
    const s1 v3 = v0.p3;
    const std::vector<s2> v4 { v0, v2 };
    std::vector<s2> v5 = v4;
    const s0 v11 = v3.p1;
    std::vector<s2> v7 = v4;
    v2.p4 = v11;
    v7[0] = v2;
    const s2 v8 = v5[1];
    v7[0] = v0;
    s1 v27 = v3;
    v2.p2 = v27;
    const s2 v118 = v7[0];
    v7[0] = v8;
    const s2 v50 = v4[1];
    v7[1] = v50;
    return v118;
  }
  s2 f77(const s1 &v0, const s2 &v1) {
    const s2 v18 = f97(v1);
    const s2 v20 = f97(v1);
    const std::vector<s0> v26 = v20.p5;
    s2 v47 = v18;
    v47.p5 = v26;
    return v47;
  }
  s0 f76(const s0 &v0) {
    const s0 v5 = f103(v0);
    const s0 v2 = f103(v0);
    const s0 v21 = f103(v2);
    const s0 v13 = f103(v0);
    const s0 v14 = f103(v5);
    const std::vector<std::vector<double>> v12 = v14.p0;
    const s0 v11 = f103(v21);
    const std::vector<std::vector<double>> v20 = v13.p0;
    const s1 v30(v2, v2);
    const s0 v41 = v30.p0;
    const s0 v26 = f103(v21);
    s0 v32 = v41;
    const s0 v25 = f103(v26);
    const s0 v31 = f103(v5);
    const std::vector<s1> v38 { v30, v30, v30, v30, v30 };
    const s1 v19 = v38[1];
    const std::vector<std::vector<double>> v45 = v31.p1;
    v32.p1 = v45;
    std::vector<std::vector<double>> v61 = v45;
    const std::vector<std::vector<std::vector<double>>> v46 { v61, v61, v61, v61, v45, v61, v45 };
    v32 = v25;
    const s0 v48 = v19.p0;
    const s0 v124 = f103(v32);
    v32.p0 = v12;
    v32.p1 = v45;
    const std::vector<std::vector<double>> v82 = v46[4];
    const s0 v57 = f103(v11);
    v32.p1 = v82;
    s1 v100 = v19;
    v100.p0 = v57;
    v100.p1 = v124;
    v100.p0 = v48;
    v32.p0 = v20;
    const s0 v151 = v100.p1;
    return v151;
  }
  s4 f74(const s4 &v0) {
    const std::vector<s0> v5 = v0.p1;
    const s0 v3 = v5[0];
    const s0 v8 = f103(v3);
    const std::vector<s0> v13 = v0.p1;
    std::vector<s0> v23 = v13;
    const s0 v40 = f76(v8);
    v23[1] = v40;
    v23[1] = v8;
    const s2 v126 = v0.p0;
    const s4 v101(v126, v23);
    return v101;
  }
  std::vector<s0> f69(const std::vector<s0> &v0) {
    const s0 v4 = v0[0];
    const s0 v5 = v0[0];
    s0 v7 = v4;
    std::vector<s0> v6 = v0;
    std::vector<s0> v1 = v6;
    s0 v2 = v7;
    const s0 v3 = f76(v4);
    const std::vector<std::vector<s0>> v10 { v6, v6 };
    v6[1] = v4;
    std::vector<std::vector<s0>> v14 = v10;
    const std::vector<std::vector<double>> v21 = v5.p0;
    const s0 v11 = v1[0];
    v6[1] = v2;
    v6[0] = v4;
    v14[0] = v6;
    v2.p0 = v21;
    v7.p0 = v21;
    const std::vector<s0> v16 = v14[0];
    const s0 v20 = v16[0];
    const s1 v27(v3, v20);
    v14[1] = v1;
    v14[0] = v1;
    const std::vector<std::vector<s0>> v28 { v0, v1, v16, v6, v0, v6 };
    const s0 v26 = v27.p0;
    const s0 v22 = f103(v11);
    v6[1] = v22;
    const std::vector<std::vector<double>> v41 = v20.p1;
    const s0 v46 = f103(v26);
    const std::vector<std::vector<double>> v55 = v46.p1;
    const std::vector<s0> v121 = v28[0];
    v2.p1 = v41;
    v2.p1 = v55;
    return v121;
  }
  s2 f65(const s2 &v0, const s0 &v1) {
    const s2 v4 = f97(v0);
    s2 v2 = v0;
    const std::vector<std::vector<s1>> v6 = v0.p0;
    v2.p4 = v1;
    std::vector<std::vector<s1>> v13 = v6;
    const std::vector<s1> v5 = v13[0];
    const std::vector<std::vector<s1>> v7 = v4.p0;
    const s1 v17 = v5[0];
    v2.p1 = v5;
    const s1 v8 = v5[0];
    const s2 v11 = f97(v2);
    const s1 v10 = v5[0];
    v2.p2 = v8;
    v13 = v6;
    const std::vector<s1> v9 = v6[0];
    const s1 v15 = v9[0];
    const std::vector<std::vector<std::vector<s1>>> v18 { v6, v7, v13, v7 };
    const std::vector<s1> v14 = f89(v5);
    std::vector<std::vector<std::vector<s1>>> v35 = v18;
    std::vector<std::vector<std::vector<s1>>> v43 = v35;
    const std::vector<std::vector<s1>> v26 = v43[1];
    v13[0] = v5;
    const s2 v82 = f77(v17, v11);
    std::vector<std::vector<std::vector<s1>>> v38 = v43;
    v2.p0 = v26;
    v2 = v4;
    v35[0] = v26;
    v35 = v38;
    const s2 v44 = f77(v17, v82);
    v2.p1 = v14;
    v43[3] = v13;
    v35[2] = v13;
    const std::vector<s1> v54 { v15, v15, v8, v10 };
    v35[0] = v7;
    const s1 v71 = v54[1];
    const s0 v97 = v71.p0;
    v2.p4 = v97;
    const s2 v157 = f97(v44);
    return v157;
  }
  s4 f57(const s4 &v0) {
    s4 v6 = v0;
    const s4 v1 = f74(v0);
    const std::vector<s0> v11 = v0.p1;
    const s0 v5 = v11[1];
    const s2 v2 = v1.p0;
    std::vector<s0> v10 = v11;
    const std::vector<s0> v3 = f69(v10);
    s2 v4 = v2;
    const s0 v8 = v3[0];
    std::vector<s0> v7 = v3;
    v10 = v11;
    const s1 v16(v5, v5);
    v4.p3 = v16;
    std::vector<s0> v13 = v10;
    const std::vector<s0> v14 = v4.p5;
    v6.p1 = v11;
    v7[1] = v8;
    v10[1] = v8;
    v6 = v0;
    v7 = v14;
    s4 v35 = v1;
    const s0 v24 = v13[1];
    v35.p1 = v3;
    v6 = v0;
    std::vector<s0> v22 = v3;
    const s2 v25 = f79(v4, v35);
    const s0 v26 = v16.p0;
    v6.p0 = v25;
    v35.p0 = v25;
    const std::vector<s0> v27 = f69(v11);
    v10[1] = v26;
    v35.p1 = v3;
    std::vector<s0> v19 = v11;
    v4.p5 = v19;
    const s0 v50 = v27[1];
    const s0 v45 = v7[1];
    const std::vector<s4> v78 { v6, v0, v1, v35, v1 };
    const s0 v42 = v22[0];
    const s1 v68(v45, v24);
    v7[0] = v8;
    v4.p3 = v68;
    const s4 v124 = v78[3];
    v6.p1 = v11;
    const s2 v72 = f65(v4, v42);
    v19[0] = v45;
    v7[0] = v8;
    s4 v167 = v124;
    const s2 v129 = v35.p0;
    v6.p0 = v72;
    v167.p0 = v129;
    v4.p4 = v50;
    return v167;
  }
  s0 f45(const s0 &v0) {
    s0 v7 = v0;
    s0 v2 = v7;
    const s0 v1 = f76(v2);
    s0 v4 = v1;
    const std::vector<std::vector<double>> v9 = v4.p0;
    const std::vector<std::vector<double>> v3 = v0.p1;
    v2.p0 = v9;
    std::vector<std::vector<double>> v15 = v9;
    v4.p1 = v3;
    v2.p0 = v15;
    const s0 v13(v15, v3);
    const s0 v17 = f76(v13);
    v4.p0 = v9;
    v2.p1 = v3;
    const std::vector<double> v42 = v9[0];
    v15[0] = v42;
    v4.p1 = v3;
    const std::vector<double> v20 = v9[0];
    const std::vector<double> v33 = v9[0];
    v15[0] = v20;
    const s0 v73 = f103(v17);
    v15[0] = v33;
    v4.p0 = v15;
    return v73;
  }
  s2 f40(const s0 &v0, const s2 &v1) {
    const s0 v2 = f45(v0);
    const s0 v6 = f103(v2);
    const s2 v9 = f65(v1, v6);
    const std::vector<s0> v8 = v9.p5;
    const std::vector<s0> v12 = v9.p5;
    const s0 v3 = v8[0];
    s2 v10 = v1;
    const s0 v17 = v8[1];
    const std::vector<s1> v19 = v9.p1;
    const s0 v15 = v12[0];
    std::vector<s1> v20 = v19;
    const std::vector<s0> v13 = f69(v12);
    v10.p1 = v20;
    s2 v29 = v1;
    v29 = v10;
    const s1 v47 = v29.p3;
    const std::vector<s1> v48 = f89(v19);
    const s1 v123 = v20[0];
    const s2 v49 = f65(v9, v17);
    std::vector<s1> v83 = v48;
    const std::vector<s0> v84 = f69(v13);
    v29 = v49;
    v10.p2 = v47;
    const s2 v67 = f97(v29);
    const std::vector<s1> v57 = v67.p1;
    s2 v115 = v49;
    const std::vector<std::vector<s1>> v295 = v9.p0;
    v29.p1 = v57;
    v83[0] = v47;
    s1 v134 = v123;
    v83[0] = v47;
    const s0 v151 = v9.p4;
    std::vector<std::vector<s1>> v99 = v295;
    v10.p1 = v83;
    const s1 v85 = v115.p2;
    s1 v64 = v85;
    const s4 v178(v115, v13);
    const s2 v314(v99, v57, v64, v134, v151, v84);
    v29.p1 = v48;
    v29.p4 = v15;
    const s2 v131 = f65(v29, v3);
    v64.p1 = v151;
    v29.p1 = v83;
    const s1 v180 = v314.p3;
    const s2 v210 = f79(v131, v178);
    v10.p3 = v180;
    return v210;
  }
  s0 f22(const s2 &v0, const s0 &v1, const s2 &v2) {
    const std::vector<std::vector<double>> v7 = v1.p0;
    s2 v9 = v2;
    v9.p4 = v1;
    const s0 v5 = f103(v1);
    const s2 v3 = f40(v1, v0);
    v9.p4 = v5;
    const s0 v12 = f76(v1);
    const std::vector<s0> v16 = v9.p5;
    const s2 v18 = f65(v3, v12);
    const s4 v34(v2, v16);
    const s1 v24 = v18.p2;
    const s0 v27 = v24.p1;
    const s2 v40 = v34.p0;
    s1 v38 = v24;
    const s0 v21 = v38.p0;
    s1 v37 = v24;
    s0 v23 = v27;
    const s4 v56 = f57(v34);
    const s2 v47 = f65(v2, v21);
    v38.p1 = v5;
    const s2 v68 = f79(v0, v56);
    const s0 v35 = v2.p4;
    const s2 v94 = v34.p0;
    const std::vector<s2> v107 { v0, v40, v94, v68 };
    v37.p0 = v23;
    const s2 v103 = f40(v21, v47);
    const s2 v81 = v107[0];
    s0 v42 = v35;
    v37.p1 = v1;
    v23.p0 = v7;
    const s1 v99 = v103.p3;
    const std::vector<s0> v89 = v81.p5;
    s0 v146 = v35;
    const s0 v98 = v99.p0;
    const s0 v160 = v89[1];
    v38.p0 = v42;
    v9.p3 = v37;
    v37.p0 = v146;
    v37.p0 = v98;
    const s0 v221 = f103(v160);
    v23.p0 = v7;
    return v221;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const double &v1) {
    const s4 v2 = v0[0];
    const std::vector<s0> v5 = v2.p1;
    std::vector<s4> v11 = v0;
    const s0 v3 = v5[1];
    v11[0] = v2;
    const s0 v9 = f103(v3);
    const s4 v12 = v11[0];
    s0 v22 = v9;
    const std::vector<s0> v20 = f69(v5);
    const std::vector<std::vector<double>> v51 = v22.p0;
    const s2 v65 = v12.p0;
    const s2 v47 = f81(v65);
    std::vector<std::vector<double>> v23 = v51;
    const s0 v37 = f76(v9);
    s0 v40 = v37;
    const s0 v26 = v20[0];
    v22.p0 = v23;
    const s0 v64 = f22(v65, v26, v47);
    v22 = v40;
    const std::vector<double> v252 = v23[0];
    const std::vector<std::vector<double>> v52 = v64.p1;
    v22.p0 = v23;
    const double v155 = v252[0];
    v40.p1 = v52;
    return v155;
  }
  int main() {
    std::vector<s4> v0({ { { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } } } }, { { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } } } }, { { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } } } });
    double v1(52.0);
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
